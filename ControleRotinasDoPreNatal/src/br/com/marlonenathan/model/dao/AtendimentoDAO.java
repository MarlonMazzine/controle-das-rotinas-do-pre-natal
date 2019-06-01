package br.com.marlonenathan.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import br.com.marlonenathan.connection.ConnectionFactory;
import br.com.marlonenathan.model.bean.Atendimento;

public class AtendimentoDAO {

	public void createAtendimento(Atendimento a) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"INSERT INTO cadastro.atendimento (nome, documento, qtdFilhos, qtdGravidez, qtdPartos, qtdAbortos, doencaPrevia, dtUltimoPreventivo,"
							+ " exameBHCG, igUSGDias, igUSGSemanas, ultimaUSG, ultimaMenstruacao, numDeConsultas, observacoes)"
							+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getDocumento());
			stmt.setInt(3, a.getQtdFilhos());
			stmt.setInt(4, a.getQtdGravidez());
			stmt.setInt(5, a.getQtdPartos());
			stmt.setInt(6, a.getQtdAbortos());
			stmt.setBoolean(7, a.isDoencaPrevia());
			stmt.setString(8, a.getDtUltimoPreventivo());
			stmt.setString(9, a.getExameBHCG());
			stmt.setInt(10, a.getIgUSGDias());
			stmt.setInt(11, a.getIgUSGSemanas());
			stmt.setString(12, a.getUltimaUSG());
			stmt.setString(13, a.getUltimaMenstruacao());
			stmt.setInt(14, a.getNumDeConsultas());
			stmt.setString(15, a.getObservacoes());

			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	public List<Atendimento> readAtendimentos() {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Atendimento> atendimentos = new ArrayList<>();

		try {
			stmt = con.prepareStatement("SELECT nome, documento, numDeConsultas FROM cadastro.atendimento");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Atendimento atendimento = new Atendimento();

				atendimento.setNome(rs.getString("nome"));
				atendimento.setDocumento(rs.getString("documento"));
				atendimento.setNumDeConsultas(rs.getInt("numDeConsultas"));

				atendimentos.add(atendimento);
			}
		} catch (SQLException ex) {
			Logger.getLogger(AtendimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return atendimentos;
	}

	public List<Atendimento> buscarAtendimento(String nome) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Atendimento> atendimentos = new ArrayList<>();

		try {
			stmt = con.prepareStatement("SELECT * FROM cadastro.atendimento WHERE nome LIKE ?");
			stmt.setString(1, "%" + nome + "%");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Atendimento a = new Atendimento();

				a.setNome(rs.getString("nome"));
				a.setDocumento(rs.getString("documento"));
				a.setNumDeConsultas(rs.getInt("numDeConsultas"));

				atendimentos.add(a);
			}
		} catch (SQLException ex) {
			Logger.getLogger(AtendimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return atendimentos;
	}
}
