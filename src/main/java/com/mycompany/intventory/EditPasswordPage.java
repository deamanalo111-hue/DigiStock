package com.mycompany.intventory;

import java.awt.Color;
import java.awt.Dialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class EditPasswordPage extends javax.swing.JDialog {

    private String newPass, confPass, oldPassword, email, oldName;
    private File file;
    private BufferedWriter writer;
    private BufferedReader reader;
    private AccountFile acf;
    
    public EditPasswordPage() {
        initComponents();
        
        try {
            file = new File("");
            reader = new BufferedReader(new FileReader(file.getAbsolutePath() 
                    + "\\Accounts\\Accounts.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        pfNewPass.setEchoChar((char)0);
        pfConfPass.setEchoChar((char)0);
        setLocationRelativeTo(null);
        acf = new AccountFile();
        setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        pfConfPass = new javax.swing.JPasswordField();
        pfNewPass = new javax.swing.JPasswordField();
        chkShowPass = new javax.swing.JCheckBox();
        chkShowPass1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblExitEdit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Confirm Password: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 189, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("New Password: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, 110, 30));

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 284, 110, 50));

        pfConfPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pfConfPass.setForeground(new java.awt.Color(204, 204, 204));
        pfConfPass.setText("Confirm Password");
        pfConfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfConfPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfConfPassFocusLost(evt);
            }
        });
        getContentPane().add(pfConfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 190, 260, 30));

        pfNewPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pfNewPass.setForeground(new java.awt.Color(204, 204, 204));
        pfNewPass.setText("Enter New Password");
        pfNewPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfNewPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfNewPassFocusLost(evt);
            }
        });
        getContentPane().add(pfNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 116, 260, 30));

        chkShowPass.setBackground(new java.awt.Color(255, 255, 255));
        chkShowPass.setText("Show Password");
        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });
        getContentPane().add(chkShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 232, -1, -1));

        chkShowPass1.setBackground(new java.awt.Color(255, 255, 255));
        chkShowPass1.setText("Show Password");
        chkShowPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPass1ActionPerformed(evt);
            }
        });
        getContentPane().add(chkShowPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 157, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Password");

        lblExitEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross (1).png"))); // NOI18N
        lblExitEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitEditMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(lblExitEdit)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblExitEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 320, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitEditMouseClicked
        this.setVisible(false);
        new SettingsPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblExitEditMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        oldName = UserFile.getUserName();
        oldPassword = UserFile.getPassword();
        email = UserFile.getEmail();
        
        newPass = pfNewPass.getText();
        confPass = pfConfPass.getText();

        String data = "", line;

        String passwordMessage = "Press ok to confirm password change.";
        
        if (oldPassword.equals(newPass)) {
            
            JOptionPane.showMessageDialog(this,
                "New password cannot be the same as old password.");
            
        } else if (newPass.equals("Enter New Password")
            || confPass.equals("Confirm Password")
            || newPass.isBlank() || confPass.isBlank()) {

            JOptionPane.showMessageDialog(this,
                "Please fill up all the details.");

        } else if (isPasswordInvalid(newPass, oldName, email)) {

        } else if (!newPass.equals(confPass)) {

            JOptionPane.showMessageDialog(this,
                            "Password does not match.");
            
        } else if ((JOptionPane.showConfirmDialog(this, 
                        passwordMessage, "Change password", 
              JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)){

            try {
                while((line = reader.readLine()) != null){

                    if (line.substring(line.lastIndexOf("     ") + 5,
                        line.length())
                    .equals(oldPassword)) {
                        
                    line = line.replace(oldPassword, newPass);

                }
                data = data + line + "\n";
            }
            reader.close();

            writer = new BufferedWriter(new FileWriter(file.getAbsolutePath()
                + "\\Accounts\\Accounts.txt", false));

            writer.write(data); //writes data to file
            writer.close(); //close BufferedWriter
            
        //This lines will update both the Account File and the users File

                new AccountFile();
                UserFile.setPassword(newPass);
                oldPassword = newPass;
                JOptionPane.showMessageDialog(this
                    , "Password Updated Successfully.");
                
            } catch (Exception ex) {
                System.out.println("Error input." + ex);;
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void pfConfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfConfPassFocusGained
        if (pfConfPass.getText().equals("Confirm Password")) {
            pfConfPass.setText("");
            pfConfPass.setEchoChar('*');
            pfConfPass.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_pfConfPassFocusGained

    private void pfConfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfConfPassFocusLost
        if (pfConfPass.getText().trim().equals("")) {
            pfConfPass.setText("Confirm Password");
            pfConfPass.setEchoChar((char)0);
            pfConfPass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_pfConfPassFocusLost

    private void pfNewPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfNewPassFocusGained
        if (pfNewPass.getText().equals("Enter New Password")) {
            pfNewPass.setText("");
            pfNewPass.setEchoChar('*');
            pfNewPass.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_pfNewPassFocusGained

    private void pfNewPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfNewPassFocusLost
        if (pfNewPass.getText().trim().equals("")) {
            pfNewPass.setText("Enter New Password");
            pfNewPass.setEchoChar((char)0);
            pfNewPass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_pfNewPassFocusLost

    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        if (chkShowPass.isSelected()) {

            pfConfPass.setEchoChar((char)0);

        } else {

            pfConfPass.setEchoChar('*');

        }
    }//GEN-LAST:event_chkShowPassActionPerformed

    private void chkShowPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPass1ActionPerformed
        if (chkShowPass1.isSelected()) {

            pfNewPass.setEchoChar((char)0);

        } else {

            pfNewPass.setEchoChar('*');

        }
    }//GEN-LAST:event_chkShowPass1ActionPerformed

//JOptionPane from other file wont function properly with 
//JDialog hence the lack of OOP regarding JOptionPane
    
    public boolean isPasswordInvalid(String pass, String name, String email) {
    
        if (pass.length() < 8) {
            
            JOptionPane.showMessageDialog(null, 
                                        "Password is too short." + 
                                      "\nMust be at least 8 characters");
            return true;
            
        } else if (pass.contains(" ")) {
            
            JOptionPane.showMessageDialog(null, 
                            "Spaces in password are not allowed.");
            return true;
            
        } else if (pass.equals(name)) {
            
            JOptionPane.showMessageDialog(null, 
                            "Password cannot be the same as username.");
            return true;
            
        } else if (pass.equals(email)) {
            
            JOptionPane.showMessageDialog(null, 
                            "Password cannot be the same as email.");
            return true;

        }
    
        return false;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPasswordPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkShowPass;
    private javax.swing.JCheckBox chkShowPass1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblExitEdit;
    private javax.swing.JPasswordField pfConfPass;
    private javax.swing.JPasswordField pfNewPass;
    // End of variables declaration//GEN-END:variables
}
