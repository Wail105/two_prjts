package IHM;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import control.securityController;

import java.awt.*;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;

public class Authentification extends JFrame {

    private JButton Connecter;
    private JTextField LoginText;
    private JPasswordField PasseText;
    private JLabel bibliothequeLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;

    public Authentification() {

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        LoginText = new JTextField();
        PasseText = new JPasswordField();
        Connecter = new JButton();
        bibliothequeLabel = new JLabel();
        bibliothequeLabel.setBackground(new Color(0, 0, 0));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification");
        setBackground(new Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new Dimension(450, 180));
        setResizable(false);

        jPanel1.setBackground(new Color(255, 255, 255));
        jLabel1.setFont(new Font("Times New Roman", 1, 18));
        jLabel1.setText("Nom d'utilisateur ");
        jLabel2.setFont(new Font("Times New Roman", 1, 18));
        jLabel2.setText("Mot de passe ");
        LoginText.setFont(new Font("Times New Roman", 1, 14));
        PasseText.setFont(new Font("Times New Roman", 1, 14));
        Connecter.setFont(new Font("Times New Roman", 1, 18));
        Connecter.setText("Connecter");
        Connecter.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        Connecter.setHorizontalTextPosition(SwingConstants.CENTER);
        Connecter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                connecterActionPerformed(evt);
            }
        });

        bibliothequeLabel.setFont(new Font("Sonic XBd BT", 1, 40));
        bibliothequeLabel.setForeground(new Color(0, 0, 0));
        bibliothequeLabel.setText("Gestion De Bibliothèque");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(bibliothequeLabel))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap(77, Short.MAX_VALUE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(jLabel2))
        					.addGap(9)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(LoginText, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        						.addComponent(PasseText, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))))
        			.addGap(96))
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap(274, Short.MAX_VALUE)
        			.addComponent(Connecter, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
        			.addGap(185))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(59)
        			.addComponent(bibliothequeLabel)
        			.addGap(52)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(LoginText, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(PasseText, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(18)
        			.addComponent(Connecter)
        			.addGap(144))
        );
        jPanel1.setLayout(jPanel1Layout);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                .addComponent(jPanel1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1)
                )
        );

        setSize(new Dimension(636, 428));
        setLocationRelativeTo(null);
    }

    public void connecterActionPerformed(ActionEvent e) {
    	securityController  authenticator=new securityController();
		Menu m=null;
		if(authenticator.authenticate(LoginText.getText().trim(),PasseText.getText().trim())) {
		    m=new Menu();
			dispose();
			m.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Login ou Mot de passe est invalide");
		}
	}
    public static void main(String args[]) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

}
