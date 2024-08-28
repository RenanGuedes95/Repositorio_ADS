package br.edu.vianna.escola.dao.impl;

import br.edu.vianna.escola.Utils.CryptoUtils;
import br.edu.vianna.escola.dao.GenericsDAO;
import br.edu.vianna.escola.dao._con.ConnectionFactory;
import br.edu.vianna.escola.model.Professor;
import br.edu.vianna.escola.model.escola.Disciplina;
import br.edu.vianna.escola.model.esp.EEspecializacao;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DisciplinaDAO implements GenericsDAO<Disciplina, Integer> {
    private Connection c;
    @Override
    public void inserir(Disciplina disciplina) throws SQLException, ClassNotFoundException {
        c= ConnectionFactory.getConnection();
        String sql = "INSERT INTO fpoo.disciplina \n" +
                "(nome, carga_horaria, \n" +
                "ano, semestre, \n" +
                "id_professor) \n" +
                "VALUES \n" +
                "(?, ?, ?, ?, ?);";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, disciplina.getNome());
        pst.setInt(2, disciplina.getCargaHoraria());
        pst.setInt(3, disciplina.getAno());
        pst.setInt(4, disciplina.getSemestre());
        pst.setInt(5, disciplina.getProfessor().getId());

        pst.execute();
    }

    @Override
    public void alterar(Disciplina disciplina) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "UPDATE fpoo.disciplina\n" +
                "SET\n" +
                "nome = ?, \n" +
                "carga_horaria = ?, \n" +
                "ano = ?, \n" +
                "semestre = ?, \n" +
                "id_professor = ? \n" +
                "WHERE iddisciplina = ?;";

        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, disciplina.getNome());
        pst.setInt(2, disciplina.getCargaHoraria());
        pst.setInt(3, disciplina.getAno());
        pst.setInt(4, disciplina.getSemestre());
        pst.setInt(5, disciplina.getProfessor().getId());
        pst.setInt(6, disciplina.getId());

        pst.execute();
    }

    @Override
    public void apagar(Disciplina disciplina) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM fpoo.disciplina \n" +
                     "WHERE iddisciplina = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, disciplina.getId());

        pst.execute();
    }

    @Override
    public Disciplina buscarUm(Integer id) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT iddisciplina, \n" +
                     "nome, carga_horaria, ano, \n" +
                     "semestre, id_professor \n" +
                     "FROM fpoo.disciplina \n" +
                     "WHERE iddisciplina=?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet result = pst.executeQuery();
        Disciplina d = null;
        if(result.next()){
            d = new Disciplina();
            d.setId(result.getInt("iddisciplina"));
            d.setNome(result.getString("nome"));
            d.setCargaHoraria(result.getInt("carga_horaria"));
            d.setAno(result.getInt("ano"));
            d.setSemestre(result.getInt("semestre"));
            Professor professor = new ProfessorDAO().buscarUm(result.getInt("id_professor"));
            d.setProfessor(professor);
        }
        return d;
    }

    @Override
    public ArrayList<Disciplina> buscarTodos() throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT iddisciplina, \n" +
                     "nome, carga_horaria, ano, \n" +
                     "semestre, id_professor \n" +
                     "FROM fpoo.disciplina;";

        PreparedStatement pst = c.prepareStatement(sql);
        ResultSet result = pst.executeQuery();

        ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

        while(result.next()){
            Disciplina d = new Disciplina();
            d.setId(result.getInt("iddisciplina"));
            d.setNome(result.getString("nome"));
            d.setCargaHoraria(result.getInt("carga_horaria"));
            d.setAno(result.getInt("ano"));
            d.setSemestre(result.getInt("semestre"));
            Professor professor = new ProfessorDAO().buscarUm(result.getInt("id_professor"));
            d.setProfessor(professor);
            listaDisciplinas.add(d);
        }

        return listaDisciplinas;
    }

    @Override
    public int count() throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT count(*) qtde \n" +
                     " FROM fpoo.disciplina;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet result = pst.executeQuery();

        result.next();

        return result.getInt("qtde");
    }
}
