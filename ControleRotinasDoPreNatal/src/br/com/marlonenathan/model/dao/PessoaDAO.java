/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import br.com.marlonenathan.model.bean.Funcionario;
import br.com.marlonenathan.model.bean.Paciente;

/**
 *
 * @author marlonmazzine
 */
public class PessoaDAO {

	public void createFuncionario(Funcionario f) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"INSERT INTO funcionario (nome, documento, telefone, nascimento, usuario, senha)VALUES(?, ?, ?, ?, ?, ?)");
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getDocumento());
			stmt.setString(3, f.getTelefone());
			stmt.setString(4, f.getNascimento());
			stmt.setString(5, f.getUsuario());
			stmt.setString(6, f.getSenha());

			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public List<Funcionario> readFuncionario() {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Funcionario> funcionarios = new ArrayList<>();

		try {
			stmt = con.prepareStatement("SELECT * FROM cadastro.funcionario");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Funcionario funcionario = new Funcionario();

				funcionario.setNome(rs.getString("nome"));
				funcionario.setDocumento(rs.getString("documento"));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setNascimento(rs.getString("nascimento"));

				funcionarios.add(funcionario);
			}
		} catch (SQLException ex) {
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return funcionarios;
	}

	public void updateFuncionario(Funcionario f) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"UPDATE cadastro.funcionario SET nome = ?, documento = ?, telefone = ?, nascimento = ?, usuario = ?, senha = ? WHERE documento = ?");
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getDocumento());
			stmt.setString(3, f.getTelefone());
			stmt.setString(4, f.getNascimento());
			stmt.setString(5, f.getUsuario());
			stmt.setString(6, f.getSenha());
			stmt.setString(7, f.getDocumento());

			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public void deleteFuncionario(Funcionario f) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement("DELETE FROM cadastro.funcionario WHERE documento = ?");
			stmt.setString(1, f.getDocumento());

			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Excluído com sucesso");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public List<Funcionario> buscarFuncionario(String nome) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Funcionario> funcionarios = new ArrayList<>();

		try {
			stmt = con.prepareStatement("SELECT * FROM cadastro.funcionario WHERE nome LIKE ?");
			stmt.setString(1, "%" + nome + "%");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Funcionario funcionario = new Funcionario();

				funcionario.setNome(rs.getString("nome"));
				funcionario.setDocumento(rs.getString("documento"));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setNascimento(rs.getString("nascimento"));

				funcionarios.add(funcionario);
			}
		} catch (SQLException ex) {
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return funcionarios;
	}
	// termina o funcionario
	
	// começa o paciente
	public void createPaciente(Paciente p) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"INSERT INTO cadastro.paciente (nome, documento, telefone, nascimento) VALUES (?, ?, ?, ?)");
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getDocumento());
			stmt.setString(3, p.getTelefone());
			stmt.setString(4, p.getNascimento());

			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	public List<Paciente> readPaciente() {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Paciente> pacientes = new ArrayList<>();

		try {
			stmt = con.prepareStatement("SELECT * FROM cadastro.paciente");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Paciente paciente = new Paciente();

				paciente.setNome(rs.getString("nome"));
				paciente.setDocumento(rs.getString("documento"));
				paciente.setTelefone(rs.getString("telefone"));
				paciente.setNascimento(rs.getString("nascimento"));

				pacientes.add(paciente);
			}
		} catch (SQLException ex) {
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return pacientes;
	}
	
	public void updatePaciente(Paciente p) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"UPDATE cadastro.paciente SET nome = ?, documento = ?, telefone = ?, nascimento = ? WHERE documento = ?");
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getDocumento());
			stmt.setString(3, p.getTelefone());
			stmt.setString(4, p.getNascimento());
			stmt.setString(5, p.getDocumento());

			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public void deletePaciente(Paciente p) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement("DELETE FROM cadastro.paciente WHERE documento = ?");
			stmt.setString(1, p.getDocumento());

			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Excluído com sucesso");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public List<Paciente> buscarPaciente(String nome) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Paciente> pacientes = new ArrayList<>();

		try {
			stmt = con.prepareStatement("SELECT * FROM cadastro.paciente WHERE nome LIKE ?");
			stmt.setString(1, "%" + nome + "%");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Paciente paciente = new Paciente();

				paciente.setNome(rs.getString("nome"));
				paciente.setDocumento(rs.getString("documento"));
				paciente.setTelefone(rs.getString("telefone"));
				paciente.setNascimento(rs.getString("nascimento"));

				pacientes.add(paciente);
			}
		} catch (SQLException ex) {
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return pacientes;
	}
	

}
