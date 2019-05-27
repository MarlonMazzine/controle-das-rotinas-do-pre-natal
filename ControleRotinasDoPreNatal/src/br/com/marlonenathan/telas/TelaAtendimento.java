package br.com.marlonenathan.telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		painel.setBounds(0, 0, 690, 1000);
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
		txtSUS.setBounds(400, 25, 150, 30);
		painel.add(txtSUS);
		txtSUS.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nº SUS:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(400, 8, 70, 15);
		painel.add(lblNewLabel_1);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setFont(new Font("Dialog", Font.BOLD, 16));
		spinner.setBounds(584, 25, 85, 30);
		painel.add(spinner);

		JLabel lblQtdFilhos = new JLabel("Qtd. filhos");
		lblQtdFilhos.setForeground(new Color(255, 255, 255));
		lblQtdFilhos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQtdFilhos.setBounds(584, 8, 85, 15);
		painel.add(lblQtdFilhos);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_1.setFont(new Font("Dialog", Font.BOLD, 16));
		spinner_1.setBounds(25, 92, 85, 30);
		painel.add(spinner_1);

		JLabel lblNewLabel_2 = new JLabel("Qtd. gravidez");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(25, 75, 110, 15);
		painel.add(lblNewLabel_2);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_2.setFont(new Font("Dialog", Font.BOLD, 16));
		spinner_2.setBounds(162, 92, 85, 30);
		painel.add(spinner_2);

		JLabel lblQtdPartos = new JLabel("Qtd. partos");
		lblQtdPartos.setForeground(Color.WHITE);
		lblQtdPartos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQtdPartos.setBounds(162, 75, 110, 15);
		painel.add(lblQtdPartos);

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setFont(new Font("Dialog", Font.BOLD, 16));
		spinner_3.setBounds(303, 92, 85, 30);
		painel.add(spinner_3);

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
		
		JButton btnNewButton = new JButton("Clique aqui e descubra");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new java.awt.Color(255, 153, 0));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(212, 145, 200, 25);
		painel.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Data do último preventivo:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_5.setBounds(450, 140, 220, 15);
		painel.add(lblNewLabel_5);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(450, 160, 150, 30);
		try {
			formattedTextField.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		formattedTextField.setFont(new Font("Dialog", Font.BOLD, 14));
		painel.add(formattedTextField);
		
		JLabel lblExameBhcg = new JLabel("Exame B.H.C.G.:");
		lblExameBhcg.setFont(new Font("Dialog", Font.BOLD, 14));
		lblExameBhcg.setForeground(new Color(255, 255, 255));
		lblExameBhcg.setBounds(25, 200, 140, 15);
		painel.add(lblExameBhcg);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblNewLabel_6.setBounds(15, 138, 407, 40);
		painel.add(lblNewLabel_6);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Selecione", "Não possui", "Negativo", "Positivo"}));
		comboBox.setBounds(25, 220, 140, 30);
		painel.add(comboBox);
		
		JLabel lblIdadeGestacionalnnaUsg = new JLabel("<HTML>Idade gestacional<br>na USG:</HTML>");
		lblIdadeGestacionalnnaUsg.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIdadeGestacionalnnaUsg.setForeground(new Color(255, 255, 255));
		lblIdadeGestacionalnnaUsg.setBounds(210, 200, 150, 30);
		painel.add(lblIdadeGestacionalnnaUsg);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		spinner_4.setForeground(new Color(0, 0, 0));
		spinner_4.setFont(new Font("Dialog", Font.BOLD, 14));
		spinner_4.setBackground(new Color(255, 255, 255));
		spinner_4.setBounds(210, 235, 50, 30);
		painel.add(spinner_4);
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Período", "Dia (s)", "Semana (s)", "Mês (ses)"}));
		comboBox_1.setBounds(262, 235, 110, 30);
		painel.add(comboBox_1);
		
		JLabel lblDataDaltima = new JLabel("Data da última USG:");
		lblDataDaltima.setForeground(new Color(255, 255, 255));
		lblDataDaltima.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDataDaltima.setBounds(400, 200, 160, 15);
		painel.add(lblDataDaltima);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		try {
			formattedTextField_1.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		formattedTextField_1.setFont(new Font("Dialog", Font.BOLD, 14));
		formattedTextField_1.setBounds(400, 220, 150, 30);
		painel.add(formattedTextField_1);
		
		JLabel lblDataDaltima_1 = new JLabel("<html>Data da última<br>menstruação:</html>");
		lblDataDaltima_1.setForeground(new Color(255, 255, 255));
		lblDataDaltima_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDataDaltima_1.setBounds(25, 280, 120, 30);
		painel.add(lblDataDaltima_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		try {
			formattedTextField_2.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		formattedTextField_2.setFont(new Font("Dialog", Font.BOLD, 14));
		formattedTextField_2.setBounds(25, 315, 150, 30);
		painel.add(formattedTextField_2);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(8, 77, 110));
		panel.setBounds(690, 0, 590, 720);
		contentPane.add(panel);
		panel.setLayout(null);

		JTextArea txtrAquiAparecerAlgumas = new JTextArea();
		txtrAquiAparecerAlgumas.setFont(new Font("Dialog", Font.BOLD, 14));
		txtrAquiAparecerAlgumas.setDisabledTextColor(new Color(153, 153, 153));
		txtrAquiAparecerAlgumas.setEnabled(false);
		txtrAquiAparecerAlgumas.setEditable(false);
		txtrAquiAparecerAlgumas.setSelectionColor(new Color(153, 153, 153));
		txtrAquiAparecerAlgumas.setText("Aqui aparecerá alguns avisos importantes durante o atendimento.");
		txtrAquiAparecerAlgumas.setBounds(20, 25, 540, 670);
		panel.add(txtrAquiAparecerAlgumas);

		JLabel lblNewLabel_3 = new JLabel("Avisos:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(20, 8, 70, 15);
		panel.add(lblNewLabel_3);

	}
}
