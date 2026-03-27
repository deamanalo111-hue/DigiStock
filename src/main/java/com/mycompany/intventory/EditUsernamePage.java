package com.mycompany.intventory;

import java.awt.Color;
import java.awt.Dialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditUsernamePage extends javax.swing.JDialog {
    
    private String newName, oldName, oldPassword, email;
    private File file;
    private BufferedWriter writer;
    private BufferedReader reader;
    private AccountFile acf;
    private File oldFileName, newFileName; // For the Items
    private File oldHistory, newHistory; // For the history
    
    public EditUsernamePage() {
        initComponents();
        
        try {
            file = new File("");
            reader = new BufferedReader(new FileReader(file.getAbsolutePath() 
                    + "\\Accounts\\Accounts.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        txtOldName.setText(UserFile.getUserName());
        setLocationRelativeTo(null);
        acf = new AccountFile();
        setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblExitEdit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOldName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNewName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

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
        setSize(new java.awt.Dimension(410, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Username");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(lblExitEdit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblExitEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Current Username: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        txtOldName.setEditable(false);
        txtOldName.setBackground(new java.awt.Color(255, 255, 255));
        txtOldName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtOldName.setFocusable(false);
        getContentPane().add(txtOldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, 30));

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 110, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("New Username: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        txtNewName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNewName.setForeground(new java.awt.Color(204, 204, 204));
        txtNewName.setText("Enter New Username");
        txtNewName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewNameFocusLost(evt);
            }
        });
        getContentPane().add(txtNewName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 250, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitEditMouseClicked
        this.setVisible(false);
        new SettingsPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblExitEditMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                
        
        oldName = txtOldName.getText();
        oldPassword = UserFile.getPassword();
        email = UserFile.getEmail();
        
        newName = txtNewName.getText().trim();
        
        String data = "", line;
        
        String nameMessage = "Press ok to confirm username change.\n" +
                oldName + "  >  " + newName;
        
        if (isNameUsed(newName)) {
            
        } else if (newName.equals("Enter New Username") || 
                newName.isBlank()) {
            
            JOptionPane.showMessageDialog(this, 
                    "Please enter your new username.");
            
        } else if (isUsernameInvalid(newName)) {
            
        } else if (JOptionPane.showConfirmDialog(this, 
                nameMessage, "Change username", 
               JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            
            try {
                while((line = reader.readLine()) != null){
                    
                    if (line.substring(0, 
                            line.indexOf("     "))
                            .equals(oldName)) {
                        
                        line = line.replace(oldName, newName);
                        
                    }
                    data = data + line + "\n";
                }
                reader.close();
                
               writer = new BufferedWriter(new FileWriter(file.getAbsolutePath() 
                    + "\\Accounts\\Accounts.txt", false));
                
                writer.write(data); //writes data to file
                writer.close(); //close BufferedWriter
                
//This lines will update the Account File, users File, and history
                oldFileName = new File(file.getAbsoluteFile() 
                                        + "\\Accounts\\" + oldName + ".txt");

                newFileName = new File(file.getAbsoluteFile() + 
                                        "\\Accounts\\" + newName + ".txt");

                oldFileName.renameTo(newFileName);
                
                oldHistory = new File(file.getAbsoluteFile() + 
                        "\\Accounts\\" + oldName + "History.txt");
                
                newHistory = new File(file.getAbsoluteFile() + 
                        "\\Accounts\\" + newName + "History.txt");
                
                oldHistory.renameTo(newHistory);
                
                new AccountFile();
                UserFile.setUserName(newName);
                
                txtOldName.setText(newName);
                JOptionPane.showMessageDialog(this, 
                    "Username Updated Successfully.");
            } catch (Exception ex) {
                System.out.println("Error input." + ex);;
            }
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNewNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewNameFocusGained
        if (txtNewName.getText().equals("Enter New Username")) {
            txtNewName.setText("");
            txtNewName.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNewNameFocusGained

    private void txtNewNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewNameFocusLost
        if (txtNewName.getText().equals("")) {
            txtNewName.setText("Enter New Username");
            txtNewName.setForeground(new Color(153, 153, 153));

        }
    }//GEN-LAST:event_txtNewNameFocusLost

//JOptionPane from other file wont function properly with 
//JDialog hence the lack of OOP regarding JOptionPane
    
    public boolean isNameUsed (String name) {
    
        String checker;
        
        for (int i = 0; i < AccountFile.accList.size(); i++) {
            
            checker = AccountFile.accList.get(i).toString();
            if (checker.substring(0, 
                checker.indexOf("     ")).equals(name)) {
                
                JOptionPane.showMessageDialog(this,
                                    "Username already in use");
                return true;
            }
        }
        return false;
    
    }
    
    
    
    public boolean isUsernameInvalid(String name) {
    
        if (name.length() > 16) {
            
            JOptionPane.showMessageDialog(this, 
                    "Username is too long" + 
                  "\nCannot exceed 16 characters");
            return true;
        }
        
        if (name.contains(" ")) {
            
            JOptionPane.showMessageDialog(this, 
                    "Username cannot contain spaces.");
            return true;
        }
        return false;
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUsernamePage().setVisible(true);
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblExitEdit;
    private javax.swing.JTextField txtNewName;
    private javax.swing.JTextField txtOldName;
    // End of variables declaration//GEN-END:variables
}
