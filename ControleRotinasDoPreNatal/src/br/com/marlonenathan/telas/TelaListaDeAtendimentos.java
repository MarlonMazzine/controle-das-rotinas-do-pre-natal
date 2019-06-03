package br.com.marlonenathan.telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.com.marlonenathan.model.bean.Atendimento;
import br.com.marlonenathan.model.dao.AtendimentoDAO;

/**
 * @author marlonmazzine
 */
public final class TelaListaDeAtendimentos extends javax.swing.JFrame {

	DefaultTableModel modelo;

	private static final long serialVersionUID = 1L;

	public TelaListaDeAtendimentos() {
		initComponents();
		modelo = (DefaultTableModel) tbAtendimentos.getModel();
		tbAtendimentos.setRowSorter(new TableRowSorter<DefaultTableModel>(modelo));

		readTable();
	}

	TelaAtendimento telaAtendimento = new TelaAtendimento();
	Atendimento a = new Atendimento();

	public void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		txtPesquisaPeloNome = new javax.swing.JTextField();
		btnPesquisar = new javax.swing.JButton();
		tbAtendimentos = new javax.swing.JTable();
		JScrollPane jScrollPane1 = new JScrollPane(tbAtendimentos, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		tbAtendimentos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		btnVoltar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista de atendimentos");
		setBackground(new java.awt.Color(8, 77, 110));
		setMinimumSize(new java.awt.Dimension(1280, 720));
		setResizable(false);

		jPanel2.setBackground(new java.awt.Color(8, 77, 110));
		jPanel2.setMaximumSize(new java.awt.Dimension(1280, 720));
		jPanel2.setMinimumSize(new java.awt.Dimension(1280, 720));
		jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));

		txtPesquisaPeloNome.setFont(new java.awt.Font("Dialog", 0, 16));
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
		btnPesquisar.setFont(new java.awt.Font("Dialog", 1, 16));
		btnPesquisar.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/pesquisar.png")));
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

		tbAtendimentos.setAutoCreateRowSorter(true);
		tbAtendimentos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		tbAtendimentos.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null }, },
				new String[] { "Nome", "SUS", "Data", "Atendimento", "Filhos", "Gravidez", "Partos", "Abortos",
						"Doença prévia", "Ult. preventivo", "BHCG", "USG dias", "USG semanas", "Ult. USG",
						"Ult. menstruação", "Obs." }));
		tbAtendimentos.setColumnSelectionAllowed(true);
		tbAtendimentos.setRowHeight(30);
		if (tbAtendimentos.getColumnModel().getColumnCount() >= 0) {
			// nome
			tbAtendimentos.getColumnModel().getColumn(0).setMinWidth(300);
			tbAtendimentos.getColumnModel().getColumn(0).setPreferredWidth(300);
			tbAtendimentos.getColumnModel().getColumn(0).setMaxWidth(300);
			// SUS
			tbAtendimentos.getColumnModel().getColumn(1).setMinWidth(200);
			tbAtendimentos.getColumnModel().getColumn(1).setPreferredWidth(200);
			tbAtendimentos.getColumnModel().getColumn(1).setMaxWidth(200);
			// data
			tbAtendimentos.getColumnModel().getColumn(2).setMinWidth(110);
			tbAtendimentos.getColumnModel().getColumn(2).setPreferredWidth(110);
			tbAtendimentos.getColumnModel().getColumn(2).setMaxWidth(110);
			// atendimentos
			tbAtendimentos.getColumnModel().getColumn(3).setMinWidth(90);
			tbAtendimentos.getColumnModel().getColumn(3).setPreferredWidth(90);
			tbAtendimentos.getColumnModel().getColumn(3).setMaxWidth(90);
			// filhos
			tbAtendimentos.getColumnModel().getColumn(4).setMinWidth(50);
			tbAtendimentos.getColumnModel().getColumn(4).setPreferredWidth(50);
			tbAtendimentos.getColumnModel().getColumn(4).setMaxWidth(50);
			// gravidez
			tbAtendimentos.getColumnModel().getColumn(5).setMinWidth(60);
			tbAtendimentos.getColumnModel().getColumn(5).setPreferredWidth(60);
			tbAtendimentos.getColumnModel().getColumn(5).setMaxWidth(60);
			// partos
			tbAtendimentos.getColumnModel().getColumn(6).setMinWidth(50);
			tbAtendimentos.getColumnModel().getColumn(6).setPreferredWidth(50);
			tbAtendimentos.getColumnModel().getColumn(6).setMaxWidth(50);
			// abortos
			tbAtendimentos.getColumnModel().getColumn(7).setMinWidth(60);
			tbAtendimentos.getColumnModel().getColumn(7).setPreferredWidth(60);
			tbAtendimentos.getColumnModel().getColumn(7).setMaxWidth(60);
			// doença prévia
			tbAtendimentos.getColumnModel().getColumn(8).setMinWidth(100);
			tbAtendimentos.getColumnModel().getColumn(8).setPreferredWidth(100);
			tbAtendimentos.getColumnModel().getColumn(8).setMaxWidth(100);
			// ultimo prevetivo
			tbAtendimentos.getColumnModel().getColumn(9).setMinWidth(110);
			tbAtendimentos.getColumnModel().getColumn(9).setPreferredWidth(110);
			tbAtendimentos.getColumnModel().getColumn(9).setMaxWidth(110);
			// BHCG
			tbAtendimentos.getColumnModel().getColumn(10).setMinWidth(110);
			tbAtendimentos.getColumnModel().getColumn(10).setPreferredWidth(110);
			tbAtendimentos.getColumnModel().getColumn(10).setMaxWidth(110);
			// USG dias
			tbAtendimentos.getColumnModel().getColumn(11).setMinWidth(70);
			tbAtendimentos.getColumnModel().getColumn(11).setPreferredWidth(70);
			tbAtendimentos.getColumnModel().getColumn(11).setMaxWidth(70);
			// USG semanas
			tbAtendimentos.getColumnModel().getColumn(12).setMinWidth(100);
			tbAtendimentos.getColumnModel().getColumn(12).setPreferredWidth(100);
			tbAtendimentos.getColumnModel().getColumn(12).setMaxWidth(100);
			// ultima USG
			tbAtendimentos.getColumnModel().getColumn(13).setMinWidth(110);
			tbAtendimentos.getColumnModel().getColumn(13).setPreferredWidth(110);
			tbAtendimentos.getColumnModel().getColumn(13).setMaxWidth(110);
			// ultima menstruacao
			tbAtendimentos.getColumnModel().getColumn(14).setMinWidth(120);
			tbAtendimentos.getColumnModel().getColumn(14).setPreferredWidth(120);
			tbAtendimentos.getColumnModel().getColumn(14).setMaxWidth(120);
			// obs
			tbAtendimentos.getColumnModel().getColumn(15).setMinWidth(200);
			tbAtendimentos.getColumnModel().getColumn(15).setPreferredWidth(200);
			tbAtendimentos.getColumnModel().getColumn(15).setMaxWidth(200);
		}

		btnVoltar.setBackground(new java.awt.Color(255, 153, 0));
		btnVoltar.setFont(new java.awt.Font("Dialog", 1, 18));
		btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
		btnVoltar
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marlonenathan/imagens/voltar.png")));
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

		JButton btnVerAtendimento = new JButton();
		btnVerAtendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verAtendimento(e);
			}
		});
		btnVerAtendimento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerAtendimento.setBounds(new Rectangle(0, 0, 100, 40));
		btnVerAtendimento.setToolTipText("");
		btnVerAtendimento.setText("Ver atendimento >>");
		btnVerAtendimento.setForeground(Color.WHITE);
		btnVerAtendimento.setFont(new Font("Dialog", Font.BOLD, 18));
		btnVerAtendimento.setFocusPainted(false);
		btnVerAtendimento.setFocusCycleRoot(true);
		btnVerAtendimento.setBorderPainted(false);
		btnVerAtendimento.setBackground(new Color(0, 204, 255));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout
				.createSequentialGroup().addContainerGap(38, Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(txtPesquisaPeloNome, GroupLayout.PREFERRED_SIZE, 468,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
										.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 145,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnVerAtendimento, GroupLayout.PREFERRED_SIZE, 386,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1215,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(27, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(36)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtPesquisaPeloNome, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVerAtendimento, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
				.addGap(33)));
		jPanel2.setLayout(jPanel2Layout);

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
	}

	String pesquisaPeloNome;

	private static final DateTimeFormatter FBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final LocalDate HOJE = LocalDate.now();
	private static final String DATA_ATENDIMENTO = HOJE.format(FBR);

	private void txtPesquisaPeloNomeFocusGained(java.awt.event.FocusEvent evt) {
		pesquisaPeloNome = txtPesquisaPeloNome.getText();
		if (pesquisaPeloNome.length() > 0 && !txtPesquisaPeloNome.getText().contains("Nome do paciente")) {
			pesquisaPeloNome = txtPesquisaPeloNome.getText();
			txtPesquisaPeloNome.setText(pesquisaPeloNome);
		} else {
			txtPesquisaPeloNome.setText("");
		}
	}

	private void txtPesquisaPeloNomeFocusLost(java.awt.event.FocusEvent evt) {
		pesquisaPeloNome = txtPesquisaPeloNome.getText();
		if (pesquisaPeloNome.length() == 0 || txtPesquisaPeloNome.getText().contains("Nome do paciente")) {
			txtPesquisaPeloNome.setText("Nome do paciente");
		}
	}

	private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
		readTablePeloNome(txtPesquisaPeloNome.getText());
	}

	private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		new TelaEscolhaFuncionario().setVisible(true);
		this.dispose();
	}

	private void verAtendimento(ActionEvent e) {
		if (tbAtendimentos.getSelectedRow() != -1) {
			int index = tbAtendimentos.getSelectedRow();
			TableModel tabela = tbAtendimentos.getModel();

			telaAtendimento.setVisible(true);
			telaAtendimento.pack();
			telaAtendimento.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			telaAtendimento.txtNomePaciente.setText(tabela.getValueAt(index, 0).toString());
			telaAtendimento.txtSUS.setText(tabela.getValueAt(index, 1).toString());
			telaAtendimento.qtdFilhos.setValue(tabela.getValueAt(index, 4));
			telaAtendimento.qtdGravidez.setValue(tabela.getValueAt(index, 5));
			telaAtendimento.qtdPartos.setValue(tabela.getValueAt(index, 6));
			telaAtendimento.qtdAbortos.setValue(tabela.getValueAt(index, 7));
			if (tabela.getValueAt(index, 8).equals(true)) {
				telaAtendimento.rdbtnSim.setSelected(true);
			} else {
				telaAtendimento.rdbtnNo.setSelected(true);
			}
			telaAtendimento.dtUltimoPreventivo.setText(tabela.getValueAt(index, 9).toString());
			telaAtendimento.exameBHCG.setSelectedItem(tabela.getValueAt(index, 10));
			telaAtendimento.igUSGDias.setValue(tabela.getValueAt(index, 11));
			telaAtendimento.igUSGSemanas.setValue(tabela.getValueAt(index, 12));
			telaAtendimento.ultimaUSG.setText(tabela.getValueAt(index, 13).toString());
			telaAtendimento.ultimaMenstruacao.setText(tabela.getValueAt(index, 14).toString());
			telaAtendimento.observacoes.setText(tabela.getValueAt(index, 15).toString());

			readTable();
			this.dispose();
			telaAtendimento.setLocationRelativeTo(null);
		} else {
			JOptionPane.showMessageDialog(null, "Selecione um paciente para editar");
		}
	}

	public void readTable() {
		DefaultTableModel modelo = (DefaultTableModel) tbAtendimentos.getModel();
		modelo.setNumRows(0);
		AtendimentoDAO aDao = new AtendimentoDAO();

		for (Atendimento a : aDao.readAtendimentos()) {
			modelo.addRow(new Object[] { a.getNome(), a.getDocumento(), DATA_ATENDIMENTO, a.getNumDeConsultas(),
					a.getQtdFilhos(), a.getQtdGravidez(), a.getQtdPartos(), a.getQtdAbortos(), a.getDoencaPrevia(),
					a.getDtUltimoPreventivo(), a.getExameBHCG(), a.getIgUSGDias(), a.getIgUSGSemanas(),
					a.getUltimaUSG(), a.getUltimaMenstruacao(), a.getObservacoes() });
		}
	}

	public void readTablePeloNome(String nome) {
		DefaultTableModel modelo = (DefaultTableModel) tbAtendimentos.getModel();
		modelo.setNumRows(0);
		AtendimentoDAO aDao = new AtendimentoDAO();

		for (Atendimento a : aDao.buscarAtendimento(nome)) {
			modelo.addRow(new Object[] { a.getNome(), a.getDocumento(), DATA_ATENDIMENTO, a.getNumDeConsultas(),
					a.getQtdFilhos(), a.getQtdGravidez(), a.getQtdPartos(), a.getQtdAbortos(), a.getDoencaPrevia(),
					a.getDtUltimoPreventivo(), a.getExameBHCG(), a.getIgUSGDias(), a.getIgUSGSemanas(),
					a.getUltimaUSG(), a.getUltimaMenstruacao(), a.getObservacoes() });
		}
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaListaDeAtendimentos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(() -> {
			TelaListaDeAtendimentos telaCadastroDeFuncionarios = new TelaListaDeAtendimentos();
			telaCadastroDeFuncionarios.setVisible(true);
			telaCadastroDeFuncionarios.getContentPane().setBackground(new Color(8, 77, 110));
		});
	}

	private javax.swing.JButton btnPesquisar;
	private javax.swing.JButton btnVoltar;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTable tbAtendimentos;
	private javax.swing.JTextField txtPesquisaPeloNome;
}
