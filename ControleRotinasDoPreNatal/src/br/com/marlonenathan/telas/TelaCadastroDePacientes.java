/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlonenathan.telas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.com.marlonenathan.model.bean.Paciente;
import br.com.marlonenathan.model.dao.PessoaDAO;

/**
 *
 * @author marlonmazzine
 */
public final class TelaCadastroDePacientes extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form TelaCadastroDePacientes
	 */
	public TelaCadastroDePacientes() {
		initComponents();
		DefaultTableModel modelo = (DefaultTableModel) tbPacientes.getModel();
		tbPacientes.setRowSorter(new TableRowSorter<DefaultTableModel>(modelo));

		readTable();
	}

	TelaEditarPaciente telaEdit = new TelaEditarPaciente();
	Paciente p = new Paciente();

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		txtPesquisaPeloNome = new javax.swing.JTextField();
		btnPesquisar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tbPacientes = new javax.swing.JTable();
		jButton2 = new javax.swing.JButton();
		btnEditar = new javax.swing.JButton();
		btnExcluir = new javax.swing.JButton();
		btnVoltar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Cadastros de paciente");
		setBackground(new java.awt.Color(8, 77, 110));
		setMinimumSize(new java.awt.Dimension(1280, 720));
		setResizable(false);

		jPanel2.setBackground(new java.awt.Color(8, 77, 110));
		jPanel2.setMaximumSize(new java.awt.Dimension(1280, 720));
		jPanel2.setMinimumSize(new java.awt.Dimension(1280, 720));
		jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));

		txtPesquisaPeloNome.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
		txtPesquisaPeloNome.setText("Nome do paciente");
		txtPesquisaPeloNome.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				txtPesquisaPeloNomeFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				txtPesquisaPeloNomeFocusLost(evt);
			}
		});

		btnPesquisar.setBackground(new java.awt.Color(153, 153, 153));
		btnPesquisar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
		btnPesquisar.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/pesquisar.png"))); // NOI18N
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnPesquisar.setFocusPainted(false);
		btnPesquisar.setMaximumSize(new java.awt.Dimension(79, 40));
		btnPesquisar.setMinimumSize(new java.awt.Dimension(79, 40));
		btnPesquisar.setPreferredSize(new java.awt.Dimension(79, 40));
		btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnPesquisarActionPerformed(evt);
			}
		});

		tbPacientes.setAutoCreateRowSorter(true);
		tbPacientes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		tbPacientes.setModel(new DefaultTableModel(new Object[][] { { null, "", null, null }, },
				new String[] { "Nome", "SUS", "Telefone", "Nascimento" }));
		tbPacientes.getColumnModel().getColumn(0).setPreferredWidth(200);
		tbPacientes.getColumnModel().getColumn(1).setPreferredWidth(100);
		tbPacientes.setColumnSelectionAllowed(true);
		tbPacientes.setRowHeight(30);
		jScrollPane1.setViewportView(tbPacientes);
		if (tbPacientes.getColumnModel().getColumnCount() > 0) {
			tbPacientes.getColumnModel().getColumn(1).setMinWidth(200);
			tbPacientes.getColumnModel().getColumn(1).setPreferredWidth(200);
			tbPacientes.getColumnModel().getColumn(1).setMaxWidth(200);
			tbPacientes.getColumnModel().getColumn(2).setMinWidth(160);
			tbPacientes.getColumnModel().getColumn(2).setPreferredWidth(160);
			tbPacientes.getColumnModel().getColumn(2).setMaxWidth(160);
			tbPacientes.getColumnModel().getColumn(3).setMinWidth(110);
			tbPacientes.getColumnModel().getColumn(3).setPreferredWidth(110);
			tbPacientes.getColumnModel().getColumn(3).setMaxWidth(110);
		}

		jButton2.setBackground(new java.awt.Color(0, 153, 102));
		jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/adicionarPessoa.png"))); // NOI18N
		jButton2.setText("  Incluir");
		jButton2.setToolTipText("");
		jButton2.setBorderPainted(false);
		jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jButton2.setFocusCycleRoot(true);
		jButton2.setFocusPainted(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		btnEditar.setBackground(new java.awt.Color(204, 204, 0));
		btnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		btnEditar.setForeground(new java.awt.Color(255, 255, 255));
		btnEditar
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/editar.png"))); // NOI18N
		btnEditar.setText("  Editar");
		btnEditar.setToolTipText("");
		btnEditar.setBorderPainted(false);
		btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnEditar.setFocusCycleRoot(true);
		btnEditar.setFocusPainted(false);
		btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnEditarMouseClicked(evt);
			}
		});

		btnExcluir.setBackground(new java.awt.Color(204, 51, 0));
		btnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
		btnExcluir
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/romver.png"))); // NOI18N
		btnExcluir.setText("  Excluir");
		btnExcluir.setToolTipText("");
		btnExcluir.setBorderPainted(false);
		btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnExcluir.setFocusCycleRoot(true);
		btnExcluir.setFocusPainted(false);
		btnExcluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExcluirActionPerformed(evt);
			}
		});

		btnVoltar.setBackground(new java.awt.Color(255, 153, 0));
		btnVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
		btnVoltar
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/voltar.png"))); // NOI18N
		btnVoltar.setText("  Voltar");
		btnVoltar.setToolTipText("");
		btnVoltar.setBorderPainted(false);
		btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnVoltar.setFocusCycleRoot(true);
		btnVoltar.setFocusPainted(false);
		btnVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnVoltarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(38, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(txtPesquisaPeloNome, javax.swing.GroupLayout.PREFERRED_SIZE, 468,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnPesquisar,
												javax.swing.GroupLayout.PREFERRED_SIZE, 79,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane1)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 597,
												Short.MAX_VALUE)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnExcluir,
												javax.swing.GroupLayout.PREFERRED_SIZE, 145,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(29, 29, 29)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(36, 36, 36)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(txtPesquisaPeloNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(jScrollPane1).addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(46, 46, 46)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	String pesquisaPeloNome;

	private void txtPesquisaPeloNomeFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtPesquisaPeloNomeFocusGained
		pesquisaPeloNome = txtPesquisaPeloNome.getText();
		if (pesquisaPeloNome.length() > 0 && !txtPesquisaPeloNome.getText().contains("Nome do paciente")) {
			pesquisaPeloNome = txtPesquisaPeloNome.getText();
			txtPesquisaPeloNome.setText(pesquisaPeloNome);
		} else {
			txtPesquisaPeloNome.setText("");
		}
	}// GEN-LAST:event_txtPesquisaPeloNomeFocusGained

	private void txtPesquisaPeloNomeFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtPesquisaPeloNomeFocusLost
		pesquisaPeloNome = txtPesquisaPeloNome.getText();
		if (pesquisaPeloNome.length() == 0 || txtPesquisaPeloNome.getText().contains("Nome do paciente")) {
			txtPesquisaPeloNome.setText("Nome do funcionário");
		}
	}// GEN-LAST:event_txtPesquisaPeloNomeFocusLost

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		new TelaCadastraPaciente().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_jButton2ActionPerformed

	private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPesquisarActionPerformed
		readTablePeloNome(txtPesquisaPeloNome.getText());
	}// GEN-LAST:event_btnPesquisarActionPerformed

	private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnVoltarActionPerformed
		// alguma outra tela
		this.dispose();
	}// GEN-LAST:event_btnVoltarActionPerformed

	private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
		int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir?", "Confirmar exlusão",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (resposta == JOptionPane.YES_OPTION) {
			if (tbPacientes.getSelectedRow() != -1) {
				Paciente p = new Paciente();
				PessoaDAO pdao = new PessoaDAO();

				p.setDocumento(tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 1).toString());

				pdao.deletePaciente(p);

				readTable();
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um paciente para excluir");
			}
		}

	}// GEN-LAST:event_btnExcluirActionPerformed

	private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnEditarMouseClicked
		if (tbPacientes.getSelectedRow() != -1) {
			int index = tbPacientes.getSelectedRow();
			TableModel tabela = tbPacientes.getModel();

			telaEdit.setVisible(true);
			telaEdit.pack();
			telaEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			telaEdit.txtNome.setText(tabela.getValueAt(index, 0).toString());
			telaEdit.txtSUS.setText(tabela.getValueAt(index, 1).toString());
			telaEdit.txtTelefone.setText(tabela.getValueAt(index, 2).toString());
			telaEdit.txtNascimento.setText(tabela.getValueAt(index, 3).toString());

			readTable();
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Selecione um paciente para editar");
		}
	}// GEN-LAST:event_btnEditarMouseClicked

	private void readTable() {
		DefaultTableModel modelo = (DefaultTableModel) tbPacientes.getModel();
		modelo.setNumRows(0);
		PessoaDAO pDao = new PessoaDAO();

		for (Paciente p : pDao.readPaciente()) {
			modelo.addRow(new Object[] { p.getNome(), p.getDocumento(), p.getTelefone(), p.getNascimento() });
		}
	}

	private void readTablePeloNome(String nome) {
		DefaultTableModel modelo = (DefaultTableModel) tbPacientes.getModel();
		modelo.setNumRows(0);
		PessoaDAO pDao = new PessoaDAO();

		for (Paciente p : pDao.buscarPaciente(nome)) {
			modelo.addRow(new Object[] { p.getNome(), p.getDocumento(), p.getTelefone(), p.getNascimento() });
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroDePacientes.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			TelaCadastroDePacientes telaCadastroDePacientes = new TelaCadastroDePacientes();
			telaCadastroDePacientes.setVisible(true);
			telaCadastroDePacientes.getContentPane().setBackground(new Color(8, 77, 110));
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnEditar;
	private javax.swing.JButton btnExcluir;
	private javax.swing.JButton btnPesquisar;
	private javax.swing.JButton btnVoltar;
	private javax.swing.JButton jButton2;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tbPacientes;
	private javax.swing.JTextField txtPesquisaPeloNome;
	// End of variables declaration//GEN-END:variables
}
