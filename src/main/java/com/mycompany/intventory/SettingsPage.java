package com.mycompany.intventory;

import java.awt.Dialog;
import java.awt.Point;

public class SettingsPage extends javax.swing.JDialog {
    

    public SettingsPage() {
        initComponents();
        
        setLocationRelativeTo(null);
        setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        pnlEdit1 = new javax.swing.JPanel();
        lblEditName = new javax.swing.JLabel();
        pnlEdit2 = new javax.swing.JPanel();
        lblEditPass = new javax.swing.JLabel();
        lblEditInfo = new javax.swing.JLabel();
        pnlEdit3 = new javax.swing.JPanel();
        lblEditEmail = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 320));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Settings");

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross (1).png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(lblExit)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlEdit1.setPreferredSize(new java.awt.Dimension(480, 60));

        lblEditName.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblEditName.setText("Edit Username");
        lblEditName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditNameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEdit1Layout = new javax.swing.GroupLayout(pnlEdit1);
        pnlEdit1.setLayout(pnlEdit1Layout);
        pnlEdit1Layout.setHorizontalGroup(
            pnlEdit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdit1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditName, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEdit1Layout.setVerticalGroup(
            pnlEdit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdit1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditName, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlEdit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        pnlEdit2.setPreferredSize(new java.awt.Dimension(480, 60));

        lblEditPass.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblEditPass.setText("Edit Password");
        lblEditPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEdit2Layout = new javax.swing.GroupLayout(pnlEdit2);
        pnlEdit2.setLayout(pnlEdit2Layout);
        pnlEdit2Layout.setHorizontalGroup(
            pnlEdit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdit2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditPass, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEdit2Layout.setVerticalGroup(
            pnlEdit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdit2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditPass, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlEdit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        lblEditInfo.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lblEditInfo.setText("Edit Information:");
        jPanel2.add(lblEditInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 362, 48));

        pnlEdit3.setPreferredSize(new java.awt.Dimension(480, 60));

        lblEditEmail.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblEditEmail.setText("Edit Email");
        lblEditEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditEmailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEdit3Layout = new javax.swing.GroupLayout(pnlEdit3);
        pnlEdit3.setLayout(pnlEdit3Layout);
        pnlEdit3Layout.setHorizontalGroup(
            pnlEdit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdit3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEdit3Layout.setVerticalGroup(
            pnlEdit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdit3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlEdit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditNameMouseClicked
        
        this.setVisible(false);
        new EditUsernamePage().setVisible(true);
        
    }//GEN-LAST:event_lblEditNameMouseClicked

    private void lblEditPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPassMouseClicked
        
        this.setVisible(false);
        new EditPasswordPage().setVisible(true);
        
    }//GEN-LAST:event_lblEditPassMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        ProfilePage.updateLabel();
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblEditEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditEmailMouseClicked
        
        this.setVisible(false);
        new EditEmailPage().setVisible(true);
        
    }//GEN-LAST:event_lblEditEmailMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEditEmail;
    private javax.swing.JLabel lblEditInfo;
    private javax.swing.JLabel lblEditName;
    private javax.swing.JLabel lblEditPass;
    private javax.swing.JLabel lblExit;
    private javax.swing.JPanel pnlEdit1;
    private javax.swing.JPanel pnlEdit2;
    private javax.swing.JPanel pnlEdit3;
    // End of variables declaration//GEN-END:variables
}
