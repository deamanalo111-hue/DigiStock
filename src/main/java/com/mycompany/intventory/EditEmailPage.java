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

public class EditEmailPage extends javax.swing.JDialog {

    private String email, newEmail;
    private File file;
    private BufferedWriter writer;
    private BufferedReader reader;
    private AccountFile acf;
    
    public EditEmailPage() {
        initComponents();
        
        try {
            file = new File("");
            reader = new BufferedReader(new FileReader(file.getAbsolutePath() 
                    + "\\Accounts\\Accounts.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        txtOldEmail.setText(UserFile.getEmail());
        setLocationRelativeTo(null);
        acf = new AccountFile();
        setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblExitEdit = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtOldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNewEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Email");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExitEdit)
                .addContainerGap())
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 269, 110, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Current Email: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, -1, 30));

        txtOldEmail.setEditable(false);
        txtOldEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtOldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtOldEmail.setFocusable(false);
        getContentPane().add(txtOldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 116, 250, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("New Email: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 192, -1, 30));

        txtNewEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNewEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtNewEmail.setText("Enter New Email");
        txtNewEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewEmailFocusLost(evt);
            }
        });
        getContentPane().add(txtNewEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 193, 250, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
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

        email = txtOldEmail.getText();
        newEmail = txtNewEmail.getText().trim();
        String data = "", line;

        String emailMessage = "Press ok to confirm email change.\n" +
                email + "  >  " + newEmail;
        
        if (doesEmailExist(newEmail)) {

        } else if (isEmailInvalid(newEmail)) {
            
        } else if (newEmail.equals("Enter New Email") ||
                newEmail.isBlank()) {

            JOptionPane.showMessageDialog(this,
                "Please enter your new Email.");

        } else if ((Validation.isEmailInvalid(newEmail) == false) &&
                (JOptionPane.showConfirmDialog(this, 
                        emailMessage, "Change email", 
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)) {
            
            try {
                while((line = reader.readLine()) != null){

                    if (line.substring(line.indexOf("     ") + 5,
                        line.lastIndexOf("     "))
                    .equals(email)) {

                    line = line.replace(email, newEmail);
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
                UserFile.setEmail(newEmail);

                txtOldEmail.setText(newEmail);
                JOptionPane.showMessageDialog(this,
                    "Email Updated Successfully.");
                
            } catch (Exception ex) {
                System.out.println("Error input." + ex);;
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNewEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewEmailFocusGained
        if (txtNewEmail.getText().equals("Enter New Email")) {
            txtNewEmail.setText("");
            txtNewEmail.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNewEmailFocusGained

    private void txtNewEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewEmailFocusLost
        if (txtNewEmail.getText().equals("")) {
            txtNewEmail.setText("Enter New Email");
            txtNewEmail.setForeground(new Color(153, 153, 153));

        }
    }//GEN-LAST:event_txtNewEmailFocusLost

//JOptionPane from other file wont function properly with 
//JDialog hence the lack of OOP regarding JOptionPane
    
    public boolean doesEmailExist (String email) {
    
        String checker; //placeholder ng info
        
        for (int i = 0; i < AccountFile.accList.size(); i++) {
            
            checker = AccountFile.accList.get(i).toString();
            if (checker.substring(checker.indexOf("     ") + 5, 
                checker.lastIndexOf("     ")).equals(email)) {
                
                JOptionPane.showMessageDialog(this, 
                                        "Email already in use");
                return true;
            }
        }
        return false;
    }
    
    
    public boolean isEmailInvalid(String email) {
    
        if ((!email.contains("@") || !email.contains(".com"))
                || email.contains(" ") || email.contains("@.com")) {
            
            JOptionPane.showMessageDialog(this,
                        "Please enter valid e-mail format!");
            return true;
        }
    
        return false;
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmailPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblExitEdit;
    private javax.swing.JTextField txtNewEmail;
    private javax.swing.JTextField txtOldEmail;
    // End of variables declaration//GEN-END:variables
}
