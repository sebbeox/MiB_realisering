package application;

import oru.inf.InfDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarcusSkarud
 */
public class Huvudfönster extends javax.swing.JFrame {

    private static InfDB db;
    /**
     * Creates new form NewJFrame
     */
    public Huvudfönster(InfDB db) {
        this.db = db;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        mibpLbl = new javax.swing.JLabel();
        skiljestreck = new javax.swing.JSeparator();
        body = new javax.swing.JPanel();
        välkommenLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        agentBtn = new javax.swing.JButton();
        alienBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        header.setBackground(new java.awt.Color(40, 40, 40));
        header.setPreferredSize(new java.awt.Dimension(1095, 100));

        headerLbl.setBackground(new java.awt.Color(120, 120, 120));
        headerLbl.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(180, 180, 180));
        headerLbl.setText("Men in Black - Sektor Skandinavien");

        mibpLbl.setBackground(new java.awt.Color(120, 120, 120));
        mibpLbl.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        mibpLbl.setForeground(new java.awt.Color(180, 180, 180));
        mibpLbl.setText("MiB-Portalen");

        skiljestreck.setForeground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(headerLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(mibpLbl))
                            .addComponent(skiljestreck, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljestreck, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mibpLbl)
                .addContainerGap())
        );

        body.setBackground(new java.awt.Color(80, 80, 80));
        body.setForeground(new java.awt.Color(100, 100, 100));

        välkommenLbl.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        välkommenLbl.setForeground(new java.awt.Color(255, 255, 255));
        välkommenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        välkommenLbl.setText("Välkommen till Men in Black-portalen");

        infoLbl.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        infoLbl.setForeground(new java.awt.Color(255, 255, 255));
        infoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLbl.setText("Logga in nedan");

        agentBtn.setBackground(new java.awt.Color(150, 150, 150));
        agentBtn.setForeground(new java.awt.Color(0, 0, 0));
        agentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agentIkon.png"))); // NOI18N
        agentBtn.setText("Agent");
        agentBtn.setIconTextGap(0);
        agentBtn.setOpaque(false);
        agentBtn.setPreferredSize(new java.awt.Dimension(200, 200));
        agentBtn.setSize(new java.awt.Dimension(200, 200));
        agentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentBtnActionPerformed(evt);
            }
        });

        alienBtn.setBackground(new java.awt.Color(150, 150, 150));
        alienBtn.setForeground(new java.awt.Color(0, 0, 0));
        alienBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alienIkon.png"))); // NOI18N
        alienBtn.setText("Alien");
        alienBtn.setIconTextGap(0);
        alienBtn.setOpaque(false);
        alienBtn.setPreferredSize(new java.awt.Dimension(200, 200));
        alienBtn.setSize(new java.awt.Dimension(200, 200));
        alienBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienBtnActionPerformed(evt);
            }
        });

        adminBtn.setBackground(new java.awt.Color(150, 150, 150));
        adminBtn.setForeground(new java.awt.Color(0, 0, 0));
        adminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIkon.png"))); // NOI18N
        adminBtn.setText("Admin");
        adminBtn.setIconTextGap(0);
        adminBtn.setOpaque(false);
        adminBtn.setPreferredSize(new java.awt.Dimension(200, 200));
        adminBtn.setSize(new java.awt.Dimension(200, 200));
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Credits");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(agentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(alienBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(adminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(välkommenLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(välkommenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(infoLbl)
                .addGap(50, 50, 50)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alienBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentBtnActionPerformed
        new AgentLogin(db).setVisible(true);
    }//GEN-LAST:event_agentBtnActionPerformed

    private void alienBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienBtnActionPerformed
        new AlienLogin(db).setVisible(true);
    }//GEN-LAST:event_alienBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        new AdminLogin(db).setVisible(true);
    }//GEN-LAST:event_adminBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Credits().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton agentBtn;
    private javax.swing.JButton alienBtn;
    private javax.swing.JPanel body;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mibpLbl;
    private javax.swing.JSeparator skiljestreck;
    private javax.swing.JLabel välkommenLbl;
    // End of variables declaration//GEN-END:variables
}
