package br.edu.vianna.escola.dao.impl;

import br.edu.vianna.escola.dao.GenericsDAO;
import br.edu.vianna.escola.dao._con.ConnectionFactory;
import br.edu.vianna.escola.model.Aluno;
import br.edu.vianna.escola.model.Professor;
import br.edu.vianna.escola.model.escola.Disciplina;
import br.edu.vianna.escola.model.escola.Matricula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MatriculaDAO implements GenericsDAO<Matricula, Integer> {

    private Connection c;
    @Override
    public void inserir(Matricula matricula) throws SQLException, ClassNotFoundException {
        c= ConnectionFactory.getConnection();
        String sql = "INSERT INTO fpoo.matricula \n" +
                "(id_aluno, \n" +
                "id_disciplina, \n" +
                "nota, \n" +
                "numeroFaltas) \n" +
                "VALUES(?, ?, ?, ?);";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, matricula.getAluno().getId());
        pst.setInt(2, matricula.getDisciplina().getId());
        pst.setDouble(3, matricula.getNota());
        pst.setInt(4, matricula.getNumeroFaltas());

        pst.execute();
    }

    @Override
    public void alterar(Matricula matricula) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "UPDATE fpoo.matricula \n" +
                "SET \n" +
                "id_aluno = ?, \n" +
                "id_disciplina = ?, \n" +
                "nota = ?, \n" +
                "numeroFaltas = ? \n" +
                "WHERE id_aluno = ? AND id_disciplina = ?;";

        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, matricula.getAluno().getId());
        pst.setInt(2, matricula.getDisciplina().getId());
        pst.setDouble(3, matricula.getNota());
        pst.setInt(4, matricula.getNumeroFaltas());
        pst.setInt(5, matricula.getAluno().getId());
        pst.setInt(6, matricula.getDisciplina().getId());

        pst.execute();
    }

    @Override
    public void apagar(Matricula matricula) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM fpoo.matricula\n" +
                     "WHERE id_aluno = ? AND id_disciplina = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, matricula.getAluno().getId());
        pst.setInt(2, matricula.getDisciplina().getId());

        pst.execute();
    }

    @Override
    public Matricula buscarUm(Integer id) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT id_aluno, \n" +
                     "id_disciplina, \n" +
                     "nota, \n" +
                     "numeroFaltas \n" +
                     "FROM fpoo.matricula \n" +
                     "WHERE id_aluno = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet result = pst.executeQuery();
        Matricula m = null;
        if(result.next()){
            m = new Matricula();
            Aluno aluno = new AlunoDAO().buscarUm(result.getInt("id_aluno"));
            m.setAluno(aluno);
            Disciplina disciplina = new DisciplinaDAO().buscarUm(result.getInt("id_disciplina"));
            m.setDisciplina(disciplina);
            m.setNota(result.getDouble("nota"));
            m.setNumeroFaltas(result.getInt("numeroFaltas"));

        }
        return m;
    }

    public Matricula buscarPorAlunoEDisciplina(Integer id_aluno, Integer id_disciplina) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT id_aluno, \n" +
                "id_disciplina, \n" +
                "nota, \n" +
                "numeroFaltas \n" +
                "FROM fpoo.matricula \n" +
                "WHERE id_aluno = ? AND id_disciplina = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id_aluno);
        pst.setInt(1, id_disciplina);

        ResultSet result = pst.executeQuery();
        Matricula m = null;
        if(result.next()){
            m = new Matricula();
            Aluno aluno = new AlunoDAO().buscarUm(result.getInt("id_aluno"));
            m.setAluno(aluno);
            Disciplina disciplina = new DisciplinaDAO().buscarUm(result.getInt("id_disciplina"));
            m.setDisciplina(disciplina);
            m.setNota(result.getDouble("nota"));
            m.setNumeroFaltas(result.getInt("numeroFaltas"));

        }
        return m;
    }

    @Override
    public ArrayList<Matricula> buscarTodos() throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT id_aluno, \n" +
                "id_disciplina, \n" +
                "nota, \n" +
                "numeroFaltas \n" +
                "FROM fpoo.matricula;";

        PreparedStatement pst = c.prepareStatement(sql);
        ResultSet result = pst.executeQuery();

        ArrayList<Matricula> listaMatriculas = new ArrayList<>();

        while(result.next()){
            Matricula m = new Matricula();
            Aluno aluno = new AlunoDAO().buscarUm(result.getInt("id_aluno"));
            m.setAluno(aluno);
            Disciplina disciplina = new DisciplinaDAO().buscarUm(result.getInt("id_disciplina"));
            m.setDisciplina(disciplina);
            m.setNota(result.getDouble("nota"));
            m.setNumeroFaltas(result.getInt("numeroFaltas"));
            listaMatriculas.add(m);
        }

        return listaMatriculas;
    }

    @Override
    public int count() throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT count(*) qtde \n" +
                     " FROM fpoo.matricula;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet result = pst.executeQuery();

        result.next();

        return result.getInt("qtde");
    }
}
