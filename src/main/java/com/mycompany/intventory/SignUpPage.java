package com.mycompany.intventory;

import com.mycompany.intventory.AccountFile;
import com.mycompany.intventory.DashboardPage;
import com.mycompany.intventory.UserFile;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignUpPage extends javax.swing.JFrame {

    private String username, email, pass, rePass;
    private BufferedWriter accWrite;
    AccountFile af;
    File file;

    public SignUpPage() {
        initComponents();

        pfPass.setEchoChar((char)0);
        pfRePass.setEchoChar((char)0);
        setLocationRelativeTo(null);
        file = new File("");
        
        try {
            accWrite = new BufferedWriter(new FileWriter(file.getAbsolutePath() 
                                    + "\\Accounts\\Accounts.txt", true));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        af = new AccountFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        cbPass = new javax.swing.JCheckBox();
        lblRePass = new javax.swing.JLabel();
        pfRePass = new javax.swing.JPasswordField();
        lvlUname = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();
        lblLogIn = new javax.swing.JLabel();
        cbPass2 = new javax.swing.JCheckBox();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIGIStock");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitle.setText("Create an account");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 22, 170, 27));

        lblInfo1.setForeground(java.awt.Color.gray);
        lblInfo1.setText("Don't have an account? it takes less than a minute.");
        getContentPane().add(lblInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 55, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockNiAaron-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome To DIGIStock");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
        );

        lblInfo2.setForeground(java.awt.Color.gray);
        lblInfo2.setText("If you already have an account");

        cbPass.setBackground(new java.awt.Color(255, 255, 255));
        cbPass.setText("Show password");
        cbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPassActionPerformed(evt);
            }
        });

        lblRePass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRePass.setText("Confirm Password:");

        pfRePass.setForeground(new java.awt.Color(153, 153, 153));
        pfRePass.setText("Confirm Password");
        pfRePass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfRePassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfRePassFocusLost(evt);
            }
        });

        lvlUname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lvlUname.setText("Username:");

        txtUName.setForeground(new java.awt.Color(153, 153, 153));
        txtUName.setText("Enter Username");
        txtUName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUNameFocusLost(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("Email Address:");
        lblEmail.setToolTipText("");

        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Enter Email");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPass.setText("Password:");

        pfPass.setForeground(new java.awt.Color(153, 153, 153));
        pfPass.setText("Enter Password");
        pfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfPassFocusLost(evt);
            }
        });

        lblLogIn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLogIn.setForeground(new java.awt.Color(51, 102, 255));
        lblLogIn.setText("Login.");
        lblLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogInMouseClicked(evt);
            }
        });

        cbPass2.setBackground(new java.awt.Color(255, 255, 255));
        cbPass2.setText("Show password");
        cbPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPass2ActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(51, 153, 255));
        btnCreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("CREATE ACCOUNT");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblInfo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogIn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbPass)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPass2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pfRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lvlUname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRePass))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo2)
                    .addComponent(lblLogIn))
                .addGap(18, 18, 18)
                .addComponent(lvlUname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPass2)
                .addGap(8, 8, 8)
                .addComponent(lblRePass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogInMouseClicked

        new LoginPage().setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_lblLogInMouseClicked

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        username = txtUName.getText().trim();
        email = txtEmail.getText().trim();
        pass = pfPass.getText();
        rePass = pfRePass.getText();
              
        if (Validation.isUsernameEmpty(username)) {
            
        } else if (af.isNameUsed(username)) {
            
        } else if (Validation.isUsernameInvalid(username)) {
            
        } else if (Validation.isEmailEmpty(email)) {
            
        } else if (Validation.isEmailInvalid(email)) {
            
        } else if (af.doesEmailExist(email)) {
            
        } else if (Validation.isPasswordEmpty(pass)) {
            
        } else if (Validation.isPasswordInvalid(pass, username, email)) {
            
        } else if (Validation.doesPassMatch(pass, rePass)) {
            
            try {
                
                accWrite.write(username + "     ");
                accWrite.write(email + "     ");
                accWrite.write(pass + "\n");
                accWrite.close();

                JOptionPane.showMessageDialog(this,
                                    "Welcome " + username + ".");
                        
                UserFile.setEmail(email);
                UserFile.setUserName(username);
                UserFile.setPassword(pass);
                new DashboardPage().setVisible(true);
                this.setVisible(false);
                this.dispose();
                        
                } catch (IOException ex) {
                    System.out.println("Error occured. " + ex);
                }        
            
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtUNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUNameFocusGained
        if (txtUName.getText().equals("Enter Username")) {

            txtUName.setText("");
            txtUName.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtUNameFocusGained

    private void txtUNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUNameFocusLost
        if (txtUName.getText().equals("")) {

            txtUName.setText("Enter Username");
            txtUName.setForeground(new Color(153, 153, 153));

        }
    }//GEN-LAST:event_txtUNameFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals("Enter Email")) {

            txtEmail.setText("");
            txtEmail.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals("")) {

            txtEmail.setText("Enter Email");
            txtEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void cbPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassActionPerformed
        
        if (cbPass.isSelected()) {
            
            pfRePass.setEchoChar((char)0);
            
        } else {
        
            pfRePass.setEchoChar('*');
            
        }  
        
    }//GEN-LAST:event_cbPassActionPerformed

    private void pfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusGained
        
        if (pfPass.getText().equals("Enter Password")) {
            pfPass.setText("");
            pfPass.setEchoChar('*');
            pfPass.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_pfPassFocusGained

    private void pfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusLost
        
        if (pfPass.getText().trim().equals("")) {
            pfPass.setText("Enter Password");
            pfPass.setEchoChar((char)0);
            pfPass.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_pfPassFocusLost

    private void pfRePassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfRePassFocusGained
        
        if (pfRePass.getText().equals("Confirm Password")) {
            pfRePass.setText("");
            pfRePass.setEchoChar('*');
            pfRePass.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_pfRePassFocusGained

    private void pfRePassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfRePassFocusLost
        
        if (pfRePass.getText().trim().equals("")) {
            pfRePass.setText("Confirm Password");
            pfRePass.setEchoChar((char)0);
            pfRePass.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_pfRePassFocusLost

    private void cbPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPass2ActionPerformed
        if (cbPass2.isSelected()) {
            
            pfPass.setEchoChar((char)0);
            
        } else {
        
            pfPass.setEchoChar('*');
            
        }  
    }//GEN-LAST:event_cbPass2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JCheckBox cbPass;
    private javax.swing.JCheckBox cbPass2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRePass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lvlUname;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JPasswordField pfRePass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUName;
    // End of variables declaration//GEN-END:variables
}
