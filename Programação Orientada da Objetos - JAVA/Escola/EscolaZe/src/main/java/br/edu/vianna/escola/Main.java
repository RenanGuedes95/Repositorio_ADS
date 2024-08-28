package br.edu.vianna.escola;


import br.edu.vianna.escola.Utils.CryptoUtils;
import br.edu.vianna.escola.dao.impl.AlunoDAO;
import br.edu.vianna.escola.dao.impl.DisciplinaDAO;
import br.edu.vianna.escola.dao.impl.MatriculaDAO;
import br.edu.vianna.escola.dao.impl.ProfessorDAO;
import br.edu.vianna.escola.model.Aluno;
import br.edu.vianna.escola.model.Professor;
import br.edu.vianna.escola.model.escola.Disciplina;
import br.edu.vianna.escola.model.escola.Matricula;
import br.edu.vianna.escola.model.esp.EEspecializacao;

import java.sql.Array;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno(1, "Zezin das Coves", "ze@ze.com", "ze",
                "123", null, "123456",
                1500);

        Professor p = new Professor(1, "Gabriel", "gabriel@mail.com", "gabriel",
                "123", null, EEspecializacao.MESTRADO, 1,
                60);

        Professor p2 = new Professor(2, "João", "joao@mail.com", "joao",
                "321", null, EEspecializacao.DOUTORADO, 5,
                100);

        Disciplina d = new Disciplina(1, "Programação Orientada a Objetos", 80, 2024, 2, p2);

        Matricula m = new Matricula(a, d, 10, 3);

        try {
            new AlunoDAO().inserir(a);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Não conseguiu salvar no banco " + e.getMessage());
        }

        try {
            new ProfessorDAO().inserir(p);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Não foi possível salvar o Professor no banco\n" + e.getMessage());
        }

        try {
            new ProfessorDAO().inserir(p2);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Não foi possível salvar o Professor no banco\n" + e.getMessage());
        }

        try {
            new DisciplinaDAO().inserir(d);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Não foi possível salvar a Disciplina no banco\n" + e.getMessage());
        }

        try{
            new MatriculaDAO().inserir(m);
        }catch (SQLException | ClassNotFoundException e){
            System.out.println("Não foi possivel salvar a matricula no banco\n" + e.getMessage());
        }
        //Teste Professor
        ProfessorDAO buscarProf = new ProfessorDAO();
        try {
            Professor prof = buscarProf.buscarUm(2);
            System.out.println(prof.getNome());
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Resultado não encontrado!!");
        }
        try{
            Professor prof = buscarProf.buscarProfessorByLoginAndSenha("gabriel", "123");
            System.out.println(prof.getNome());
        }catch (SQLException | ClassNotFoundException e){
            System.out.println("Professor não encontrado.");
        }
        try{
            ArrayList<Professor> listaProfessores = buscarProf.buscarTodos();
            for(Professor prof : listaProfessores){
                System.out.println(prof.getNome());
            }
        }catch (SQLException | ClassNotFoundException e){
            System.out.println("Lista vazia");
        }
        try{
            int quantidade = buscarProf.count();
            System.out.println(quantidade);
        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Contagem = 0");
        }
        //Teste Disciplina
        try {
            DisciplinaDAO discDAO = new DisciplinaDAO();
            int qtde = discDAO.count();
            System.out.println(qtde);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Não foi possível salvar o Professor no banco\n" + e.getMessage());
        }

        DisciplinaDAO disc = new DisciplinaDAO();
        try {
            Disciplina disciplina = disc.buscarUm(1);
            System.out.println(disciplina.getNome());
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Resultado não encontrado!!");
        }

        try{
            ArrayList<Disciplina> listaDisciplina = disc.buscarTodos();
            for(Disciplina disciplina : listaDisciplina){
                System.out.println(disciplina.getNome() + " " + disciplina.getProfessor().getNome());
            }
        }catch (SQLException | ClassNotFoundException e){
            System.out.println("Lista vazia");
        }
        try{
            int quantidade = disc.count();
            System.out.println(quantidade);
        }catch(SQLException | ClassNotFoundException e) {
            System.out.println("Contagem = 0");
        }

        //Teste Matricula

        MatriculaDAO mat = new MatriculaDAO();
        try {
            Matricula matricula = mat.buscarUm(1);
            System.out.println(matricula.getAluno().getNome() + " " + matricula.getDisciplina().getNome());
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Resultado não encontrado!!");
        }

        try{
            ArrayList<Matricula> listaMatriculas = mat.buscarTodos();
            for(Matricula matricula : listaMatriculas){
                System.out.println(matricula.getAluno().getNome() + " " + matricula.getDisciplina().getNome());
            }
        }catch (SQLException | ClassNotFoundException e){
            System.out.println("Lista vazia");
        }
        try{
            int quantidade = mat.count();
            System.out.println(quantidade);
        }catch(SQLException | ClassNotFoundException e) {
            System.out.println("Contagem = 0");
        }
    }
}