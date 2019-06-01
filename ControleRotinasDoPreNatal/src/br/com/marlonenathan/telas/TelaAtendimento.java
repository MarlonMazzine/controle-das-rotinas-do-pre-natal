package br.com.marlonenathan.telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.marlonenathan.model.bean.Atendimento;
import br.com.marlonenathan.model.dao.AtendimentoDAO;

public class TelaAtendimento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField txtNomePaciente;
	JTextField txtSUS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(() -> {
			TelaAtendimento frame = new TelaAtendimento();
			frame.setVisible(true);
		});

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroDeFuncionarios.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
	}

	/**
	 * Create the frame.
	 */
	public TelaAtendimento() {

		ButtonGroup bg = new ButtonGroup();

		setResizable(false);
		setTitle("Novo atendimento");
		setSize(new Dimension(1280, 720));
		setPreferredSize(new Dimension(1280, 720));
		setMinimumSize(new Dimension(1280, 720));
		setMaximumSize(new Dimension(1280, 720));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(1280, 720));
		contentPane.setPreferredSize(new Dimension(1280, 720));
		contentPane.setMinimumSize(new Dimension(1280, 720));
		contentPane.setMaximumSize(new Dimension(1280, 720));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(690, 720));
		scrollPane.setSize(new Dimension(690, 720));
		scrollPane.setMinimumSize(new Dimension(690, 720));
		scrollPane.setMaximumSize(new Dimension(690, 720));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBackground(new Color(8, 77, 110));
		scrollPane.setBounds(0, 0, 690, 720);
		scrollPane.setLayout(null);
		contentPane.add(scrollPane);

		JPanel painel = new JPanel();
		painel.setBackground(new Color(8, 77, 110));
		painel.setBounds(0, 0, 690, 720);
		painel.setLayout(null);
		scrollPane.add(painel);

		txtNomePaciente = new JTextField();
		txtNomePaciente.setEditable(false);
		txtNomePaciente.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNomePaciente.setBounds(25, 25, 350, 30);
		painel.add(txtNomePaciente);
		txtNomePaciente.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(24, 8, 70, 15);
		painel.add(lblNewLabel);

		txtSUS = new JTextField();
		txtSUS.setEditable(false);
		txtSUS.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSUS.setBounds(400, 25, 160, 30);
		painel.add(txtSUS);
		txtSUS.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nº SUS:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(400, 8, 70, 15);
		painel.add(lblNewLabel_1);

		JSpinner qtdFilhos = new JSpinner();
		qtdFilhos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		qtdFilhos.setFont(new Font("Dialog", Font.BOLD, 16));
		qtdFilhos.setBounds(584, 25, 85, 30);
		painel.add(qtdFilhos);

		JLabel lblQtdFilhos = new JLabel("Qtd. filhos");
		lblQtdFilhos.setForeground(new Color(255, 255, 255));
		lblQtdFilhos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQtdFilhos.setBounds(584, 8, 85, 15);
		painel.add(lblQtdFilhos);

		JSpinner qtdGravidez = new JSpinner();
		qtdGravidez.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		qtdGravidez.setFont(new Font("Dialog", Font.BOLD, 16));
		qtdGravidez.setBounds(25, 92, 85, 30);
		painel.add(qtdGravidez);

		JLabel lblNewLabel_2 = new JLabel("Qtd. gravidez");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(25, 75, 110, 15);
		painel.add(lblNewLabel_2);

		JSpinner qtdPartos = new JSpinner();
		qtdPartos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		qtdPartos.setFont(new Font("Dialog", Font.BOLD, 16));
		qtdPartos.setBounds(162, 92, 85, 30);
		painel.add(qtdPartos);

		JLabel lblQtdPartos = new JLabel("Qtd. partos");
		lblQtdPartos.setForeground(Color.WHITE);
		lblQtdPartos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQtdPartos.setBounds(162, 75, 110, 15);
		painel.add(lblQtdPartos);

		JSpinner qtdAbortos = new JSpinner();
		qtdAbortos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		qtdAbortos.setFont(new Font("Dialog", Font.BOLD, 16));
		qtdAbortos.setBounds(303, 92, 85, 30);
		painel.add(qtdAbortos);

		JLabel lblQtdAbortos = new JLabel("Qtd. abortos");
		lblQtdAbortos.setForeground(Color.WHITE);
		lblQtdAbortos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQtdAbortos.setBounds(303, 75, 110, 15);
		painel.add(lblQtdAbortos);

		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setBackground(new Color(255, 255, 255));
		rdbtnSim.setBounds(450, 96, 50, 23);
		painel.add(rdbtnSim);

		JRadioButton rdbtnNo = new JRadioButton("Não");
		rdbtnNo.setBackground(new Color(255, 255, 255));
		rdbtnNo.setBounds(520, 96, 60, 23);
		painel.add(rdbtnNo);

		JLabel lblPossuiAlgumaDoena = new JLabel("Alguma doença prévia?");
		lblPossuiAlgumaDoena.setForeground(new Color(255, 255, 255));
		lblPossuiAlgumaDoena.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPossuiAlgumaDoena.setBounds(450, 75, 190, 15);
		painel.add(lblPossuiAlgumaDoena);

		JLabel lblNewLabel_4 = new JLabel("Vacinas na gestação?");
		lblNewLabel_4.setBorder(null);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4.setBounds(25, 150, 190, 15);
		painel.add(lblNewLabel_4);

		JButton btnInformacaoVacinas = new JButton("Clique aqui e descubra");
		btnInformacaoVacinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnInformacaoVacinasActionPerformed(evt);
			}

		});
		btnInformacaoVacinas.setFocusPainted(false);
		btnInformacaoVacinas.setFocusTraversalPolicyProvider(true);
		btnInformacaoVacinas.setBorderPainted(false);
		btnInformacaoVacinas.setFont(new Font("Dialog", Font.BOLD, 12));
		btnInformacaoVacinas.setForeground(new Color(255, 255, 255));
		btnInformacaoVacinas.setBackground(new java.awt.Color(255, 153, 0));
		btnInformacaoVacinas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInformacaoVacinas.setBounds(212, 145, 200, 25);
		painel.add(btnInformacaoVacinas);

		JLabel lblNewLabel_5 = new JLabel("Data do último preventivo:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_5.setBounds(450, 140, 220, 15);
		painel.add(lblNewLabel_5);

		JFormattedTextField dtUltimoPreventivo = new JFormattedTextField();
		dtUltimoPreventivo.setBounds(450, 160, 150, 30);
		try {
			dtUltimoPreventivo.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dtUltimoPreventivo.setFont(new Font("Dialog", Font.BOLD, 14));
		painel.add(dtUltimoPreventivo);

		JLabel lblExameBhcg = new JLabel("Exame B.H.C.G.:");
		lblExameBhcg.setFont(new Font("Dialog", Font.BOLD, 14));
		lblExameBhcg.setForeground(new Color(255, 255, 255));
		lblExameBhcg.setBounds(25, 200, 140, 15);
		painel.add(lblExameBhcg);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblNewLabel_6.setBounds(15, 138, 407, 40);
		painel.add(lblNewLabel_6);

		JComboBox<Object> exameBHCG = new JComboBox<Object>();
		exameBHCG.setBackground(new Color(255, 255, 255));
		exameBHCG.setForeground(new Color(0, 0, 0));
		exameBHCG.setFont(new Font("Dialog", Font.BOLD, 14));
		exameBHCG.setModel(
				new DefaultComboBoxModel<Object>(new String[] { "Selecione", "Não possui", "Negativo", "Positivo" }));
		exameBHCG.setBounds(25, 220, 140, 30);
		painel.add(exameBHCG);

		JLabel lblIdadeGestacionalnnaUsg = new JLabel("<HTML>Idade gestacional<br>na USG:</HTML>");
		lblIdadeGestacionalnnaUsg.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIdadeGestacionalnnaUsg.setForeground(new Color(255, 255, 255));
		lblIdadeGestacionalnnaUsg.setBounds(210, 200, 150, 30);
		painel.add(lblIdadeGestacionalnnaUsg);

		JSpinner igUSGDias = new JSpinner();
		igUSGDias.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		igUSGDias.setForeground(new Color(0, 0, 0));
		igUSGDias.setFont(new Font("Dialog", Font.BOLD, 14));
		igUSGDias.setBackground(new Color(255, 255, 255));
		igUSGDias.setBounds(210, 235, 50, 25);
		painel.add(igUSGDias);

		JLabel lblDataDaltima = new JLabel("Data da última USG:");
		lblDataDaltima.setForeground(new Color(255, 255, 255));
		lblDataDaltima.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDataDaltima.setBounds(400, 200, 160, 15);
		painel.add(lblDataDaltima);

		JFormattedTextField ultimaUSG = new JFormattedTextField();
		try {
			ultimaUSG.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ultimaUSG.setFont(new Font("Dialog", Font.BOLD, 14));
		ultimaUSG.setBounds(400, 220, 150, 30);
		painel.add(ultimaUSG);

		JLabel lblDataDaltima_1 = new JLabel("<html>Data da última<br>menstruação:</html>");
		lblDataDaltima_1.setForeground(new Color(255, 255, 255));
		lblDataDaltima_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDataDaltima_1.setBounds(25, 280, 120, 30);
		painel.add(lblDataDaltima_1);

		JFormattedTextField ultimaMenstruacao = new JFormattedTextField();
		try {
			ultimaMenstruacao.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ultimaMenstruacao.setFont(new Font("Dialog", Font.BOLD, 14));
		ultimaMenstruacao.setBounds(25, 315, 150, 30);
		painel.add(ultimaMenstruacao);

		JSpinner igUSGSemanas = new JSpinner();
		igUSGSemanas.setForeground(Color.BLACK);
		igUSGSemanas.setFont(new Font("Dialog", Font.BOLD, 14));
		igUSGSemanas.setBackground(Color.WHITE);
		igUSGSemanas.setBounds(210, 270, 50, 25);
		painel.add(igUSGSemanas);

		JLabel lblDias = new JLabel("dias");
		lblDias.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDias.setForeground(new Color(255, 255, 255));
		lblDias.setBounds(265, 240, 70, 15);
		painel.add(lblDias);

		JLabel lblSemanas = new JLabel("semanas");
		lblSemanas.setForeground(new Color(255, 255, 255));
		lblSemanas.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSemanas.setBounds(265, 275, 70, 15);
		painel.add(lblSemanas);

		JTextArea observacoes = new JTextArea();
		observacoes.setLineWrap(true);
		observacoes.setWrapStyleWord(true);
		observacoes.setFont(new Font("Dialog", Font.PLAIN, 14));
		observacoes.setBounds(26, 422, 640, 200);
		painel.add(observacoes);

		JLabel lblNewLabel_7 = new JLabel("Registros do atendimento:");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_7.setBounds(25, 395, 300, 15);
		painel.add(lblNewLabel_7);

		JButton btnNewButton = new JButton("   Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicouNoVoltar(e);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton
				.setIcon(new ImageIcon(TelaAtendimento.class.getResource("/br/com/marlonenathan/imagens/voltar.png")));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(25, 645, 120, 35);
		painel.add(btnNewButton);

		JButton btnFinalizar = new JButton("   Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atendimento a = new Atendimento();
				AtendimentoDAO dao = new AtendimentoDAO();

				a.setNome(txtNomePaciente.getText());
				a.setDocumento(txtSUS.getText());
				a.setQtdFilhos(qtdFilhos.getValue().hashCode());
				a.setQtdGravidez(qtdGravidez.getValue().hashCode());
				a.setQtdPartos(qtdPartos.getValue().hashCode());
				a.setQtdAbortos(qtdAbortos.getValue().hashCode());
				if (rdbtnSim.isSelected()) {
					a.setDoencaPrevia(true);
				} else {
					a.setDoencaPrevia(false);
				}
				a.setDtUltimoPreventivo(dtUltimoPreventivo.getText());
				a.setExameBHCG(exameBHCG.getSelectedItem().toString());
				a.setIgUSGDias(igUSGDias.getValue().hashCode());
				a.setIgUSGSemanas(igUSGSemanas.getValue().hashCode());
				a.setUltimaUSG(ultimaUSG.getText());
				a.setUltimaMenstruacao(ultimaMenstruacao.getText());
				a.setNumDeConsultas(1);
				a.setObservacoes(observacoes.getText());

				if (a.getExameBHCG().replace("[^0-9]", "").length() == 0
						|| a.getUltimaUSG().replace("[^0-9]", "").length() == 0
						|| a.getUltimaMenstruacao().replace("[^0-9]", "").length() == 0
						|| a.getObservacoes().replace("[^0-9]", "").length() == 0 || a.getIgUSGDias() == 0
						|| a.getIgUSGSemanas() == 0) {

					JOptionPane.showMessageDialog(null,
							"Campos de preenchimento obrigatório:\n'Data do último preventivo'"
									+ "\n'Exame B.H.C.G.\n'Idade gestacional na USG (dias ou mês)'\n'Data da última USG'\n"
									+ "'Data da última menstruação'\n'Observações'",
							"Avisos", JOptionPane.ERROR_MESSAGE);

				} else if (!rdbtnNo.isSelected() && !rdbtnSim.isSelected()) {
					JOptionPane.showMessageDialog(null,
							"O campo 'Alguma doença prévia' deve ser selecionado 'Sim' ou 'Não'!", "Avisos",
							JOptionPane.ERROR_MESSAGE);
				} else {
					// 0 = sim; 1 = não; 2 = cancelar
					int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar?",
							"Selecione a opção...", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

					if (opcao == 0) {
						dao.createAtendimento(a);
						new TelaCadastroDePacientes().setVisible(true);
						dispose();
					} else {
						return;
					}
				}
			}
		});

		btnFinalizar.setBorderPainted(false);
		btnFinalizar.setFocusPainted(false);
		btnFinalizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFinalizar.setForeground(Color.WHITE);
		btnFinalizar.setBackground(new Color(0, 153, 102));
		btnFinalizar.setIcon(
				new ImageIcon(TelaAtendimento.class.getResource("/br/com/marlonenathan/imagens/checkmark.png")));
		btnFinalizar.setBounds(520, 642, 145, 40);
		painel.add(btnFinalizar);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(8, 77, 110));
		panel.setBounds(690, 0, 590, 720);
		contentPane.add(panel);
		panel.setLayout(null);

		JTextArea txtAvisos = new JTextArea();
		txtAvisos.setFont(new Font("Dialog", Font.BOLD, 14));
		txtAvisos.setDisabledTextColor(new Color(153, 153, 153));
		txtAvisos.setEnabled(false);
		txtAvisos.setEditable(false);
		txtAvisos.setSelectionColor(new Color(153, 153, 153));
		txtAvisos.setText("Aqui aparecerá alguns avisos importantes durante o atendimento.");
		txtAvisos.setBounds(20, 25, 540, 657);
		panel.add(txtAvisos);

		JLabel lblNewLabel_3 = new JLabel("Avisos:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(20, 8, 70, 15);
		panel.add(lblNewLabel_3);

		bg.add(rdbtnNo);
		bg.add(rdbtnSim);
	}

	private void btnInformacaoVacinasActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(null, "Hepatite B\nInfluenza\nH1N1\nCólera\nDTPA\n", "Vacinas na gestação",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void clicouNoVoltar(ActionEvent e) {
		new TelaListaDeAtendimentos().setVisible(true);
		this.dispose();
	}

}
