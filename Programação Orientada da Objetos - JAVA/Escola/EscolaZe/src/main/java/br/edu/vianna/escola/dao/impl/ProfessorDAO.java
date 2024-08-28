package br.edu.vianna.escola.dao.impl;

import br.edu.vianna.escola.Utils.CryptoUtils;
import br.edu.vianna.escola.dao.GenericsDAO;
import br.edu.vianna.escola.dao._con.ConnectionFactory;
import br.edu.vianna.escola.model.Aluno;
import br.edu.vianna.escola.model.Professor;
import br.edu.vianna.escola.model.esp.EEspecializacao;

import java.net.ConnectException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProfessorDAO implements GenericsDAO<Professor, Integer> {
    private Connection c;
    @Override
    public void inserir(Professor professor) throws SQLException, ClassNotFoundException {
        c= ConnectionFactory.getConnection();
        String sql = "INSERT INTO fpoo.professor \n" +
                     "(nome, email, login, senha, data_ultimo_acesso, especializacao, tempo_casa, valor_hora_aula) \n" +
                     " VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, professor.getNome());
        pst.setString(2, professor.getEmail());
        pst.setString(3, professor.getLogin());
        try {
            pst.setString(4, CryptoUtils.md5(professor.getSenha() ) );
        } catch (NoSuchAlgorithmException e) {
            throw new SQLException("Erro ao gerar senha!!");
        }
        pst.setObject(5, professor.getDataUltimoAcesso());
        pst.setString(6, professor.getEspecializacao().toString());
        pst.setInt(7, professor.getTempoCasa());
        pst.setDouble(8, professor.getValorHoraAula());

        pst.execute();
    }

    @Override
    public void alterar(Professor professor) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "UPDATE fpoo.professor\n" +
                "SET\n" +
                "nome = ?,\n" +
                "email = ?,\n" +
                "login = ?,\n" +
                "senha = ?,\n" +
                "data_ultimo_acesso = ?,\n" +
                "especializacao = ?,\n" +
                "tempo_casa = ?,\n" +
                "valor_hora_aula = ?\n" +
                "WHERE idprofessor = ?;";

        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, professor.getNome());
        pst.setString(2, professor.getEmail());
        pst.setString(3, professor.getLogin());
        try {
            pst.setString(4, CryptoUtils.md5(professor.getSenha() ) );
        } catch (NoSuchAlgorithmException e) {
            throw new SQLException("Erro ao gerar senha!!");
        }
        pst.setString(5, professor.getDataUltimoAcesso().toString());
        pst.setString(6, professor.getEspecializacao().toString());
        pst.setInt(7, professor.getTempoCasa());
        pst.setDouble(8, professor.getValorHoraAula());
        pst.setInt(9, professor.getId());

        pst.execute();
    }

    @Override
    public void apagar(Professor professor) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM fpoo.professor \n" +
                     "WHERE idprofessor = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, professor.getId());

        pst.execute();
    }

    @Override
    public Professor buscarUm(Integer id) throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT professor.idprofessor, \n" +
                     "nome, email, login, senha, \n" +
                     "data_ultimo_acesso, especializacao, tempo_casa, \n" +
                     "valor_hora_aula \n" +
                     "FROM fpoo.professor \n" +
                     "WHERE idprofessor=?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet result = pst.executeQuery();
        Professor p = null;
        if(result.next()){
            p = new Professor();
            p.setId(result.getInt("idprofessor"));
            p.setNome(result.getString("nome"));
            p.setEmail(result.getString("email"));
            p.setLogin(result.getString("login"));
            p.setSenha(result.getString("senha"));
            String dt = result.getString("data_ultimo_acesso");
            if (dt != null && !dt.isEmpty() && !dt.isBlank()) {
                    //System.out.println(dt.substring(0,16));
                    LocalDateTime dt1 = LocalDateTime.parse(dt.substring(0,16),
                            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    p.setDataUltimoAcesso(dt1);
                }
            p.setEspecializacao(EEspecializacao.valueOf(result.getString("especializacao")));
            p.setTempoCasa(result.getInt("tempo_casa"));
        }
        return p;
    }

    public Professor buscarProfessorByLoginAndSenha(String login, String senha) throws SQLException, ClassNotFoundException{
        c = ConnectionFactory.getConnection();

        String sql = "SELECT professor.idprofessor, \n" +
                     "nome, email, login, senha, \n" +
                     "data_ultimo_acesso, especializacao, tempo_casa, \n" +
                     "valor_hora_aula \n" +
                     "FROM fpoo.professor \n" +
                     "WHERE login=? and senha=?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, login);
        try {
            pst.setString(2, CryptoUtils.md5(senha) );
        } catch (NoSuchAlgorithmException e) {
            throw new SQLException("Erro na Criptografia");
        }

        ResultSet result = pst.executeQuery();

        Professor p = null;
        if(result.next()){
            p = new Professor();
            p.setId(result.getInt("idprofessor"));
            p.setNome(result.getString("nome"));
            p.setEmail(result.getString("email"));
            p.setLogin(result.getString("login"));
            p.setSenha(result.getString("senha"));
            String dt = result.getString("data_ultimo_acesso");
            if (dt != null && !dt.isEmpty() && !dt.isBlank()) {
                //System.out.println(dt.substring(0,16));
                LocalDateTime dt1 = LocalDateTime.parse(dt.substring(0,16),
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                p.setDataUltimoAcesso(dt1);
            }
            p.setEspecializacao(EEspecializacao.valueOf(result.getString("especializacao")));
            p.setTempoCasa(result.getInt("tempo_casa"));
        }
        return p;
    }
    @Override
    public ArrayList<Professor> buscarTodos() throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT professor.idprofessor, \n" +
                "nome, email, login, senha, \n" +
                "data_ultimo_acesso, especializacao, tempo_casa, \n" +
                "valor_hora_aula \n" +
                "FROM fpoo.professor;";

        PreparedStatement pst = c.prepareStatement(sql);
        ResultSet result = pst.executeQuery();

        ArrayList<Professor> listaProfessores = new ArrayList<>();

        while(result.next()){
            Professor p = new Professor();
            p.setId(result.getInt("idprofessor"));
            p.setNome(result.getString("nome"));
            p.setEmail(result.getString("email"));
            p.setLogin(result.getString("login"));
            p.setSenha(result.getString("senha"));
            String dt = result.getString("data_ultimo_acesso");
            if (dt != null && !dt.isEmpty() && !dt.isBlank()) {
                //System.out.println(dt.substring(0,16));
                LocalDateTime dt1 = LocalDateTime.parse(dt.substring(0,16),
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                p.setDataUltimoAcesso(dt1);
            }
            p.setEspecializacao(EEspecializacao.valueOf(result.getString("especializacao")));
            p.setTempoCasa(result.getInt("tempo_casa"));
            listaProfessores.add(p);
        }

        return listaProfessores;
    }

    @Override
    public int count() throws SQLException, ClassNotFoundException {
        c = ConnectionFactory.getConnection();

        String sql = "SELECT count(*) qtde \n" +
                     " FROM fpoo.professor";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet result = pst.executeQuery();

        result.next();

        return result.getInt("qtde");
    }
}
