package IHM;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Menu extends JFrame {

    private JButton Deconnecter;
    private JButton GestionOeuvresExamplaires;
    private JButton GestionReservationsEmprunts;
    private JButton GestionUsager;
    private JLabel bibliothequeLabel;
    private JPanel jPanel1;

    public Menu() {

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        Deconnecter = new JButton();
        GestionReservationsEmprunts = new JButton();
        GestionUsager = new JButton();
        GestionOeuvresExamplaires = new JButton();
        bibliothequeLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new Dimension(410, 410));
        setResizable(false);

        jPanel1.setBackground(new Color(214, 214, 214));

        Deconnecter.setBackground(new Color(225, 242, 242));
        Deconnecter.setFont(new Font("Candara", 1, 20));
        Deconnecter.setForeground(new Color(0, 0, 0));
        Deconnecter.setText("Déconnecter");
        Deconnecter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DeconnecterActionPerformed(evt);
            }
        });

        GestionReservationsEmprunts.setBackground(new Color(225, 242, 242));
        GestionReservationsEmprunts.setFont(new Font("Candara", 1, 20));
        GestionReservationsEmprunts.setForeground(new Color(0, 0, 0));
        GestionReservationsEmprunts.setText("Gestion Reservations et Emprunts");
        GestionReservationsEmprunts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GestionReservationsEmpruntsActionPerformed(evt);
            }
        });

        GestionUsager.setBackground(new Color(225, 242, 242));
        GestionUsager.setFont(new Font("Candara", 1, 20));
        GestionUsager.setForeground(new Color(0, 0, 0));
        GestionUsager.setText("Gestion Des Usagers");
        GestionUsager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GestionUsagerActionPerformed(evt);
            }
        });

        GestionOeuvresExamplaires.setBackground(new Color(225, 242, 242));
        GestionOeuvresExamplaires.setFont(new Font("Candara", 1, 20));
        GestionOeuvresExamplaires.setForeground(new Color(0, 0, 0));
        GestionOeuvresExamplaires.setText("Gestion Oeuvres et Examplaires");
        GestionOeuvresExamplaires.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GestionOeuvresExamplairesActionPerformed(evt);
            }
        });

        bibliothequeLabel.setFont(new Font("Times New Roman", 1, 48));
        bibliothequeLabel.setForeground(new Color(0, 0, 0));
        bibliothequeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bibliothequeLabel.setText("Gestion Bibliothèque");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(GestionReservationsEmprunts, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
        						.addComponent(GestionUsager, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(GestionOeuvresExamplaires, GroupLayout.PREFERRED_SIZE, 285, Short.MAX_VALUE)
        						.addComponent(Deconnecter, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addComponent(bibliothequeLabel)
        					.addGap(65))))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(bibliothequeLabel, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(GestionUsager, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        				.addComponent(GestionOeuvresExamplaires, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
        			.addGap(40)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(GestionReservationsEmprunts, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        				.addComponent(Deconnecter, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void GestionUsagerActionPerformed(ActionEvent evt) {
        GestionUsager gu = new GestionUsager();
        this.dispose();
        gu.setVisible(true);
    }

    private void DeconnecterActionPerformed(ActionEvent evt) {
        Authentification a = new Authentification();
        this.dispose();
        a.setVisible(true);
    }

    private void GestionOeuvresExamplairesActionPerformed(ActionEvent evt) {
        GestionOeuvresExemplaires goe = new GestionOeuvresExemplaires();
        this.dispose();
        goe.setVisible(true);

    }

    private void GestionReservationsEmpruntsActionPerformed(ActionEvent evt) {
        GestionReservationsEmprunts goe = new GestionReservationsEmprunts();
        this.dispose();
        goe.setVisible(true);
    }

}
