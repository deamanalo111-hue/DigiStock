package com.mycompany.intventory;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class InAndOutPage extends javax.swing.JFrame {

    private DefaultTableModel model;
    private DefaultTableCellRenderer renderer;
    private TableRowSorter sorter;
    private int qtyInput;
    private boolean isQtyCorrect;
    private int newQty, oldQty;
    private String history;
    
    int index = -1;
    
    public InAndOutPage() {
        initComponents();
        
        cmbStock.setBackground(Color.WHITE);
        
        setLocationRelativeTo(null);
        tblList.getColumnModel().getColumn(0).
                        setPreferredWidth(451);
        
        model = (DefaultTableModel)tblList.getModel();
        sorter = new TableRowSorter(model);
        tblList.setRowSorter(sorter);
        
        //This code Centers the text for size, price, qunatity, and type
        renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER); 
        tblList.getColumnModel().getColumn(1).
                setCellRenderer(renderer);
        tblList.getColumnModel().getColumn(2).
                setCellRenderer(renderer);
        tblList.getColumnModel().getColumn(3).
                setCellRenderer(renderer);
        tblList.getColumnModel().getColumn(4).
                setCellRenderer(renderer);
        
        updateTable();
        jScrollPane1.getVerticalScrollBar().setValue(0);
        
        if (UserFile.getUserName().length() > 10) {
            txtName.setFont(new Font("Tahoma", Font.BOLD, 18));
        }
        
        txtName.setText(UserFile.getUserName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        lblInventory = new javax.swing.JLabel();
        lblAddItem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblHistory = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        txtItem = new javax.swing.JTextField();
        txtCurrentQty = new javax.swing.JTextField();
        cmbStock = new javax.swing.JComboBox<>();
        txtInputQty = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(235, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockNiAaron-removebg-preview.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard (1)_1.png"))); // NOI18N
        jLabel1.setText("Dashboard");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (4).png"))); // NOI18N
        lblProfile.setText("Profile");
        lblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProfileMouseClicked(evt);
            }
        });

        lblInventory.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblInventory.setForeground(new java.awt.Color(255, 255, 255));
        lblInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse (1).png"))); // NOI18N
        lblInventory.setText("Inventory");
        lblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInventoryMouseClicked(evt);
            }
        });

        lblAddItem.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblAddItem.setForeground(new java.awt.Color(255, 255, 255));
        lblAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-item (1).png"))); // NOI18N
        lblAddItem.setText("Add Item");
        lblAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddItemMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stock inout (1).png"))); // NOI18N
        jLabel8.setText("Stock In/Out");

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        lblHistory.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblHistory.setForeground(new java.awt.Color(255, 255, 255));
        lblHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/history.png"))); // NOI18N
        lblHistory.setText("History");
        lblHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator7)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHistory)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 81, 790, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Stock In/Out");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 13, -1, 50));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblList.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Size", "Type", "Price", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblList.getTableHeader().setResizingAllowed(false);
        tblList.getTableHeader().setReorderingAllowed(false);
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 264, 754, 280));

        txtItem.setEditable(false);
        txtItem.setBackground(new java.awt.Color(255, 255, 255));
        txtItem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(txtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 184, 254, 45));

        txtCurrentQty.setEditable(false);
        txtCurrentQty.setBackground(new java.awt.Color(255, 255, 255));
        txtCurrentQty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(txtCurrentQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 184, 84, 45));

        cmbStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stock In", "Stock Out" }));
        cmbStock.setSelectedIndex(-1);
        jPanel2.add(cmbStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 185, 140, 45));

        txtInputQty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(txtInputQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 184, 75, 45));

        btnConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.setEnabled(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 184, 90, 45));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Item");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 159, 37, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Current Qty");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 159, -1, -1));

        txtSearchBar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSearchBar.setForeground(java.awt.Color.lightGray);
        txtSearchBar.setText("Search here");
        txtSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchBarFocusLost(evt);
            }
        });
        txtSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBarKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 275, 39));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, 39));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Stock In/Out");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 159, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Qty");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 159, -1, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usersmall.png"))); // NOI18N
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 230, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        
        
        if (isQtyIncorrect()) {
            
        } else if (cmbStock.getSelectedIndex() == -1) {
            
            JOptionPane.showMessageDialog(this, 
                    "Please select a stocking option.");
            
        } else if (cmbStock.getSelectedIndex() == 0) { // stock in
            
            stockIn();
            
        } else if (cmbStock.getSelectedIndex() == 1) { // stock out
            
            if (oldQty < qtyInput) {
                
                JOptionPane.showMessageDialog(this, 
                        "Invalid Input." + 
                      "\nNot enough stocks.");
                
            } else {
                
                stockOut();
                
            }
            
            
        }
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
  
        new DashboardPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseClicked
        
        ProfilePage.givePoint(this.getLocation());
        new ProfilePage().setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_lblProfileMouseClicked

    private void lblAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddItemMouseClicked
       
        new AddItemPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_lblAddItemMouseClicked

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        
        if (index == tblList.convertRowIndexToModel
                        (tblList.getSelectedRow())) {
            
            tblList.clearSelection();
            btnConfirm.setEnabled(false);
            
            txtItem.setText("");
            txtCurrentQty.setText("");
            
            index = -1;
            
        } else {
            
            btnConfirm.setEnabled(true);
            
            index = tblList.convertRowIndexToModel
                        (tblList.getSelectedRow());
            
            txtItem.setText(UserFile.list.get(index).getiName() + " : " + 
                            UserFile.list.get(index).getiSize());
            txtCurrentQty.setText(UserFile.list.get(index).getiQty() + "");
            
            
        }
        
    }//GEN-LAST:event_tblListMouseClicked

    private void txtSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchBarFocusGained

        if (txtSearchBar.getText().equals("Search here")) {

            txtSearchBar.setText("");
            txtSearchBar.setForeground(new Color(0, 0, 0));

        }

    }//GEN-LAST:event_txtSearchBarFocusGained

    private void txtSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchBarFocusLost

        if (txtSearchBar.getText().equals("")) {

            txtSearchBar.setText("Search here");
            txtSearchBar.setForeground(new Color(153, 153, 153));

        }

    }//GEN-LAST:event_txtSearchBarFocusLost

    private void lblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInventoryMouseClicked
       
        new InventoryPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_lblInventoryMouseClicked

    private void lblHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistoryMouseClicked
       
        new HistoryPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_lblHistoryMouseClicked

    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        
        String filter = txtSearchBar.getText().trim();

        if (filter.equals("")) {

            sorter.setRowFilter(null);

        } else {

            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filter));

        }
        
    }//GEN-LAST:event_txtSearchBarKeyReleased

    public boolean isQtyIncorrect() {
    
        try {
            
            oldQty = UserFile.list.get(index).getiQty();
            qtyInput = Integer.parseInt(txtInputQty.getText());
            
            if (qtyInput < 1) {
                
                JOptionPane.showMessageDialog(this, 
                                "Please enter a number greater than 0.");
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, 
                            "Invalid Quantity" + 
                          "\nEnter a whole number");
            return true;
        }
    
        return false;
    }
    
    public void stockIn() {
    
        newQty = 0;
        newQty = oldQty + qtyInput; // basically laman plus dinagdag
        
        String inMessage = "Confirm to add " + qtyInput + " stocks to\n" +
                UserFile.list.get(index).getiName() + " : " + 
                UserFile.list.get(index).getiType() + " : " + 
                UserFile.list.get(index).getiSize() + " : " +
                UserFile.list.get(index).getiPrice();
        
        
        if (JOptionPane.showConfirmDialog(this, 
                inMessage, "Add stocks", 
              JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            
            
            UserFile.editQty(newQty + "", index);
        
            updateTable();
        
        
            history = "Stock In - Amount: " + qtyInput + " Result: " + 
                    oldQty + " > " + newQty;
            
            HistoryFile.addHistory(UserFile.list.get(index).getiName(),
                                 UserFile.list.get(index).getiType(),
                                 UserFile.list.get(index).getiSize(),
                                 UserFile.list.get(index).getiPrice() + "",
                                      history);
        
            JOptionPane.showMessageDialog(this, 
                "Added " + qtyInput + " Stocks to\n" + 
                UserFile.list.get(index).getiName());
        
            tblList.clearSelection();
            cmbStock.setSelectedIndex(-1);
            txtInputQty.setText("");
            btnConfirm.setEnabled(false);
            txtItem.setText("");
            txtCurrentQty.setText("");
            index = -1;
            
            
        }
    }
    
    public void stockOut() {
    
        newQty = 0;
        newQty = oldQty - qtyInput; // basically laman plus dinagdag
        
        String outMessage = "Confirm to remove " + qtyInput + " stocks from\n" +
                UserFile.list.get(index).getiName() + " : " + 
                UserFile.list.get(index).getiType() + " : " + 
                UserFile.list.get(index).getiSize() + " : " +
                UserFile.list.get(index).getiPrice();
        
        
        if (JOptionPane.showConfirmDialog(this, 
                outMessage, "remove stocks", 
              JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            
            UserFile.editQty(newQty + "", index);
        
            updateTable();
        
        
            history = "Stock Out - Amount: " + qtyInput + " Result: " +
                    oldQty + " > " + newQty;
            
            HistoryFile.addHistory(UserFile.list.get(index).getiName(),
                                 UserFile.list.get(index).getiType(),
                                 UserFile.list.get(index).getiSize(),
                                 UserFile.list.get(index).getiPrice() + "",
                                      history);
        
            JOptionPane.showMessageDialog(this, 
                "Removed " + qtyInput + " Stocks to\n" + 
                UserFile.list.get(index).getiName());
        
            tblList.clearSelection();
            cmbStock.setSelectedIndex(-1);
            txtInputQty.setText("");
            btnConfirm.setEnabled(false);
            txtItem.setText("");
            txtCurrentQty.setText("");
            index = -1;
    
            
        }
        
    }
    
    public void updateTable() {
    
        model.setRowCount(0);
        
        Object column[] = new Object[5];
        
        //In this for loop, i represents the row of the table
        
        for (int i = 0; i < UserFile.list.size(); i++) {
            
            column[0] = UserFile.list.get(i).getiName();
            column[1] = UserFile.list.get(i).getiSize();
            column[2] = UserFile.list.get(i).getiType();
            column[3] = UserFile.list.get(i).getiPrice();
            column[4] = UserFile.list.get(i).getiQty();
            
            model.addRow(column);
            
        }
    
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InAndOutPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cmbStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblInventory;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtCurrentQty;
    private javax.swing.JTextField txtInputQty;
    private javax.swing.JTextField txtItem;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables
}
