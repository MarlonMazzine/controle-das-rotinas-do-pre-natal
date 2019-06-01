package br.com.marlonenathan.telas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nathan
 */
public class TelaPedidoDeExame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public TelaPedidoDeExame() {
		setTitle("Gerar pedidos de exame");
		setPreferredSize(new Dimension(1280, 720));
		setMinimumSize(new Dimension(1280, 720));
		setMaximumSize(new Dimension(1280, 720));
		setBounds(new Rectangle(65, 24, 1280, 720));
		setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(44, 103, 1194, 422);
        tabelaExames = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBounds(44, 39, 393, 40);
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(946, 571, 213, 58);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(8, 77, 110));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 110));

        tabelaExames.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"", null},
        	},
        	new String[] {
        		"Nome", "Data do atendimento"
        	}
        ) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
        		false, false
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        });
        tabelaExames.getColumnModel().getColumn(0).setResizable(false);
        tabelaExames.getColumnModel().getColumn(1).setResizable(false);
        tabelaExames.setRowHeight(30);
        if (tabelaExames.getColumnModel().getColumnCount() > 0) {
			tabelaExames.getColumnModel().getColumn(1).setMinWidth(160);
			tabelaExames.getColumnModel().getColumn(1).setPreferredWidth(160);
			tabelaExames.getColumnModel().getColumn(1).setMaxWidth(160);
        }
        jScrollPane1.setViewportView(tabelaExames);

        jTextField1.setFont(new Font("Dialog", Font.PLAIN, 16)); // NOI18N
        jTextField1.setText("Nome para pesquisa");

        jButton1.setIcon(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jPanel1.add(jScrollPane1);
        jPanel1.add(jButton1);
        
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(79, 40));
        button.setMinimumSize(new Dimension(79, 40));
        button.setMaximumSize(new Dimension(79, 40));
        button.setFont(new Font("Dialog", Font.BOLD, 16));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setBackground(new Color(153, 153 ,153));
        button.setBounds(449, 39, 79, 40);
        jPanel1.add(button);
        getContentPane().setLayout(layout);

        pack();
    }
    
    public static void main(String args[]) {

    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoDeExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoDeExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoDeExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoDeExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedidoDeExame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaExames;
    private javax.swing.JTextField jTextField1;
}
