/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlonenathan.telas;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.com.marlonenathan.model.bean.Paciente;
import br.com.marlonenathan.model.dao.PessoaDAO;

/**
 *
 * @author marlonmazzine
 */
public class TelaCadastraPaciente extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form TelaCadastraFuncionario
	 */
	public TelaCadastraPaciente() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		txtNome = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		btnSalvar = new javax.swing.JButton();
		btnSair = new javax.swing.JButton();
		txtSUS = new javax.swing.JFormattedTextField();
		txtTelefone = new javax.swing.JFormattedTextField();
		txtNascimento = new javax.swing.JFormattedTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Novo cadastro");
		setBackground(new java.awt.Color(8, 77, 110));
		setMaximumSize(new java.awt.Dimension(600, 680));
		setMinimumSize(new java.awt.Dimension(600, 680));
		setPreferredSize(new java.awt.Dimension(600, 680));
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel1.setBackground(new java.awt.Color(0, 102, 204));
		jPanel1.setPreferredSize(new java.awt.Dimension(342, 161));

		jLabel5.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("Novo cadastro");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(45, 45, 45).addComponent(jLabel5)
						.addContainerGap(269, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(59, 59, 59).addComponent(jLabel5)
						.addContainerGap(65, Short.MAX_VALUE)));

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

		jPanel2.setBackground(new java.awt.Color(8, 77, 110));
		jPanel2.setMaximumSize(new java.awt.Dimension(600, 530));
		jPanel2.setMinimumSize(new java.awt.Dimension(600, 530));
		jPanel2.setName(""); // NOI18N

		txtNome.setBackground(new java.awt.Color(204, 204, 204));
		txtNome.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
		txtNome.setForeground(new java.awt.Color(51, 51, 51));

		jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Nome:");

		jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("SUS:");

		jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("Telefone:");

		jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Nascimento:");

		btnSalvar.setBackground(new java.awt.Color(35, 142, 35));
		btnSalvar.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/checkmark.png"))); // NOI18N
		btnSalvar.setBorderPainted(false);
		btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnSalvar.setFocusPainted(false);
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarActionPerformed(evt);
			}
		});

		btnSair.setBackground(new java.awt.Color(204, 0, 51));
		btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/delete.png"))); // NOI18N
		btnSair.setBorderPainted(false);
		btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnSair.setFocusPainted(false);
		btnSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSairActionPerformed(evt);
			}
		});

		txtSUS.setBackground(new java.awt.Color(204, 204, 204));
		txtSUS.setForeground(new java.awt.Color(51, 51, 51));
		try {
			txtSUS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
					new javax.swing.text.MaskFormatter("### #### #### ####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtSUS.setCaretColor(new java.awt.Color(51, 51, 51));
		txtSUS.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

		txtTelefone.setBackground(new java.awt.Color(204, 204, 204));
		txtTelefone.setForeground(new java.awt.Color(51, 51, 51));
		try {
			txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
					new javax.swing.text.MaskFormatter("(##) # ####-####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtTelefone.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

		txtNascimento.setBackground(new java.awt.Color(204, 204, 204));
		txtNascimento.setForeground(new java.awt.Color(51, 51, 51));
		try {
			txtNascimento.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtNascimento.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(0, 36, Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(53).addComponent(jLabel1)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4).addGap(18).addComponent(
								txtNascimento, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(386)
								.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(
												jPanel2Layout.createSequentialGroup().addGap(27).addComponent(jLabel3))
										.addGroup(
												jPanel2Layout.createSequentialGroup().addGap(64).addComponent(jLabel2)))
								.addGap(18)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtSUS, GroupLayout.PREFERRED_SIZE, 400,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 400,
												GroupLayout.PREFERRED_SIZE))))
				.addGap(0, 36, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap(47, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1))
								.addGap(18)
								.addGroup(jPanel2Layout
										.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(
												txtSUS, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(
												jPanel2Layout.createSequentialGroup().addGap(15).addComponent(jLabel3))
										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(
												jPanel2Layout.createSequentialGroup().addGap(15).addComponent(jLabel4))
										.addComponent(txtNascimento, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE))
								.addGap(154)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE))
								.addGap(0, 32, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		txtNascimento.getAccessibleContext().setAccessibleDescription("");

		getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 600, 520));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
		Paciente p = new Paciente();
		PessoaDAO dao = new PessoaDAO();

		p.setNome(txtNome.getText());
		p.setDocumento(txtSUS.getText());
		p.setTelefone(txtTelefone.getText());
		p.setNascimento(txtNascimento.getText());

		if (p.getNome().length() == 0 || p.getDocumento().replaceAll("[^0-9]", "").length() == 0
				|| p.getTelefone().replaceAll("[^0-9]", "").length() == 0
				|| p.getNascimento().replaceAll("[^0-9]", "").length() == 0) {
			JOptionPane.showMessageDialog(null, "Todos os campos são de preencheimento obrigatório");
			return;
		} else {
			dao.createPaciente(p);
			new TelaCadastroDePacientes().setVisible(true);
			this.dispose();
		}

	}// GEN-LAST:event_btnSalvarActionPerformed

	private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSairActionPerformed
		new TelaCadastroDePacientes().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_btnSairActionPerformed

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
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaCadastraPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaCadastraPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaCadastraPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadastraPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			TelaCadastraPaciente telaCadastraFuncionario = new TelaCadastraPaciente();
			telaCadastraFuncionario.setVisible(true);
			telaCadastraFuncionario.getContentPane().setBackground(new Color(8, 77, 110));
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnSair;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JFormattedTextField txtSUS;
	private javax.swing.JFormattedTextField txtNascimento;
	private javax.swing.JTextField txtNome;
	private javax.swing.JFormattedTextField txtTelefone;
	// End of variables declaration//GEN-END:variables
}