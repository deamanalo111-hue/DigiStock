package com.mycompany.intventory;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AddItemPage extends javax.swing.JFrame {

    private DefaultTableModel model;
    private DefaultTableCellRenderer renderer;
    String iName, iPrice, iType, iSize, iQty;
    String newItem; // para sa edit, laman neto bagong item
    private TableRowSorter sorter;
    
    String addMessage;
    
    int index = -1;// para ma check kung ano yung pinili ni user

    public AddItemPage() {
        
        initComponents();
        
        cmbType.setBackground(Color.WHITE);
        cmbSize.setBackground(Color.WHITE);
        
        setLocationRelativeTo(null);
        tblList.getColumnModel().getColumn
            (0).setPreferredWidth(397);
        
        
        model = (DefaultTableModel)tblList.getModel();
        sorter = new TableRowSorter(model);
        tblList.setRowSorter(sorter);
        
        
        //This code Centers the text for size, price, qunatity, and type
        renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER); 
        tblList.getColumnModel().getColumn(1)
                .setCellRenderer(renderer);
        tblList.getColumnModel().getColumn(2)
                .setCellRenderer(renderer);
        tblList.getColumnModel().getColumn(3)
                .setCellRenderer(renderer);
        tblList.getColumnModel().getColumn(4)
                .setCellRenderer(renderer);
        
        
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

        jLabel2 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        cmbSize = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblInventory = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        lblInAndOut = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        lblHistory = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        lblAddItem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(1030, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Item Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 34));

        cmbType.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belt", "Blazers", "Blouse", "Dress", "Coat", "Gloves", "Hat", "Hoodie", "Jacket", "Jeans", "Leggings", "Pants", "Scarf", "Shirt", "Shorts", "Skirt", "Sweater", "Tank Top", "Tracksuits", "Trunks", "T-Shirt", "Vests", "Other" }));
        cmbType.setSelectedIndex(-1);
        getContentPane().add(cmbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 165, 36));

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 125));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnEdit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Price:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblList.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "SIZE", "TYPE", "PRICE", "QTY"
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

        cmbSize.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        cmbSize.setSelectedIndex(-1);

        txtPrice.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtItemName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Size:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Type:");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Item");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usersmall.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 810, 550));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        lblInventory.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblInventory.setForeground(new java.awt.Color(255, 255, 255));
        lblInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse (1).png"))); // NOI18N
        lblInventory.setText("Inventory");
        lblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInventoryMouseClicked(evt);
            }
        });

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));

        lblInAndOut.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblInAndOut.setForeground(new java.awt.Color(255, 255, 255));
        lblInAndOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stock inout (1).png"))); // NOI18N
        lblInAndOut.setText("Stock In/Out");
        lblInAndOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInAndOutMouseClicked(evt);
            }
        });

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));

        lblHistory.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblHistory.setForeground(new java.awt.Color(255, 255, 255));
        lblHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/history.png"))); // NOI18N
        lblHistory.setText("History");
        lblHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoryMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockNiAaron-removebg-preview.png"))); // NOI18N
        jLabel14.setText("jLabel11");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(26, 26, 26))
        );

        lblDashboard.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard (1)_1.png"))); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
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

        lblAddItem.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblAddItem.setForeground(new java.awt.Color(255, 255, 255));
        lblAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-item (1).png"))); // NOI18N
        lblAddItem.setText("Add Item");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator15)
            .addComponent(jSeparator16)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(lblProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInAndOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInAndOut, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 815, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        String item; //sama samang info para sa file
            
            iName = txtItemName.getText().trim();
            iPrice = txtPrice.getText().trim();
            iQty = "0";
        
        
        if (isNameEmpty()) {
            
        } else if (isNameIncorrect()) {
            
        } else if (isPriceEmpty()) {
        
        } else if (isPriceIncorrect()) {
            
        } else if (isSizeSelected()) {
            //FALSE pag may pinili, true pag wala
        } else if (isTypeSelected()) {
            //FALSE pag may pinili, true pag wala
        } else if (UserFile.doItemExist(iName, iSize, 
                iType, iPrice, index)) {
            
        } else if (JOptionPane.showConfirmDialog(this, 
                addMessage, "Add item",
              JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
        
            
            item = iName + "     " + iSize + "     " + iType + "     " + 
                    iPrice + "     " + iQty + "\n";
            UserFile.addItem(item);
            updateTable();
            
            HistoryFile.addHistory(iName, iType, iSize, iPrice,
                    "Item added to inventory");
            
            txtItemName.setText("");
            txtPrice.setText("");
            cmbSize.setSelectedIndex(-1);
            cmbType.setSelectedIndex(-1);
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        
        if (index == tblList.convertRowIndexToModel
                    (tblList.getSelectedRow())) {
            
            tblList.clearSelection();
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
            btnSave.setEnabled(true);
            
            txtItemName.setText("");
            txtPrice.setText("");
            cmbSize.setSelectedIndex(-1);
            cmbType.setSelectedIndex(-1);
            
            index = -1;
        } else {
            
            btnEdit.setEnabled(true);
            btnDelete.setEnabled(true);
            btnSave.setEnabled(false);
            
            index = tblList.convertRowIndexToModel
                        (tblList.getSelectedRow());
            
            txtItemName.setText(UserFile.list.get(index).getiName());
            txtPrice.setText(UserFile.list.get(index).getiPrice() + "");
            cmbSize.setSelectedItem(UserFile.list.get(index).getiSize());
            cmbType.setSelectedItem(UserFile.list.get(index).getiType());
            
        }
        
    }//GEN-LAST:event_tblListMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        iName = txtItemName.getText().trim();
        iSize = cmbSize.getSelectedItem().toString();
        iType = cmbType.getSelectedItem().toString();
        iPrice = txtPrice.getText().trim();
        iQty = UserFile.list.get(index).getiQty() + "";
        
        String oldiName = UserFile.list.get(index).getiName();
        String oldiType = UserFile.list.get(index).getiType();
        String oldiSize = UserFile.list.get(index).getiSize();
        String oldiPrice = UserFile.list.get(index).getiPrice() + "";
        
        String editMessage = "Press ok to edit\n" + oldiName + " : " +
                oldiType + " : " + oldiSize + " : " + oldiPrice + " > " +
                iName + " : " + iType + " : " + iSize + " : " + iPrice;
        
        String editHistory = "Information change | old info: " + 
                oldiName + " : " + oldiType + " : " + 
                oldiSize + " : " + oldiPrice;
        
        
        if (isNameEmpty()) {
            
        } else if (isNameIncorrect()) {
            
        } else if (isPriceEmpty()) {
            
        } else if (isPriceIncorrect()) {
            
        } else if (UserFile.doItemExist(iName, iSize, 
                        iType, iPrice, index)) {
            
        } else if (JOptionPane.showConfirmDialog(this, 
                editMessage, 
                iType, 
              JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            
        
            newItem = iName + "     " + iSize + "     " + iType + "     " + 
                            iPrice + "     " + iQty;
            
            UserFile.editItem(newItem, index);
            
            updateTable();
            
            HistoryFile.addHistory(iName, iType, iSize, iPrice,
                    editHistory);
            
            txtItemName.setText("");
            txtPrice.setText("");
            cmbSize.setSelectedIndex(-1);
            cmbType.setSelectedIndex(-1);
            
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
            btnSave.setEnabled(true);
            index = -1;
            
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    
        //This is for the history and dialogue box
        iName = UserFile.list.get(index).getiName();
        iSize = UserFile.list.get(index).getiType();
        iType = UserFile.list.get(index).getiSize();
        iPrice = UserFile.list.get(index).getiPrice() + "";
        
        
        String deleteMessage = "Press ok to delete\n" + 
                iName + " : " + iSize + " : " + 
                iType + " : " + iPrice;
        
        if (JOptionPane.showConfirmDialog(this, 
            deleteMessage,"Delete item", 
         JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            
            UserFile.deleteItem(index);
        
            updateTable();
        
            HistoryFile.addHistory(iName, iType, iSize, iPrice,
                    "Item removed from inventory");
            
            txtItemName.setText("");
            txtPrice.setText("");
            cmbSize.setSelectedIndex(-1);
            cmbType.setSelectedIndex(-1);
        
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
            btnSave.setEnabled(true);
            index = -1;
            
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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

    private void lblInAndOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInAndOutMouseClicked

        new InAndOutPage().setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_lblInAndOutMouseClicked

    private void lblHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistoryMouseClicked

        new HistoryPage().setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_lblHistoryMouseClicked

    private void lblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseClicked

        ProfilePage.givePoint(this.getLocation());
        new ProfilePage().setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_lblProfileMouseClicked

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
       
        new DashboardPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        
        String filter = txtSearchBar.getText().trim();
        
        if (filter.equals("")) {
            
            sorter.setRowFilter(null);
            
        } else {
        
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filter));
        
        }
        
    }//GEN-LAST:event_txtSearchBarKeyReleased

    public boolean isNameEmpty() {
    
        if (iName.equals("")) {
            JOptionPane.showMessageDialog(this, 
                                    "Item name cannot be empty.");
            return true;
        }
        return false;
        
    }
    
    
    
    public boolean isNameIncorrect() {
    
        if (iName.contains("  ")) {
            JOptionPane.showMessageDialog(this, 
                    "Item name is invalid.\n" +
                    "Multiple spaces between words is not allowed.");
            return true;
        }
        
        if (iName.length() > 50) {
            JOptionPane.showMessageDialog(this, 
                    "Name is too long\n" +
                    "Cannot exceed 50 characters");
            return true;
        }
        
        return false;
    
    }
    
    
    
    public boolean isPriceEmpty() {
    
        if (iPrice.equals("")) {
            JOptionPane.showMessageDialog(this, 
                                        "Price cannot be empty.");
            return true;
        }
        return false;
        
    }
    
    
    
    public boolean isPriceIncorrect() {
    
        try {
            
            Double.parseDouble(iPrice);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                                            "Invalid price input");
            return true;
        }
        return false;
    
    }
    
    

    public boolean isSizeSelected() {
    
        if (cmbSize.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, 
                                        "Please choose a size.");
            return true;
        }
    // After check kung may pinili tsaka lang kukunin yung pinili    
        iSize = cmbSize.getSelectedItem().toString();
        return false;
        
    }
    
    
    
    public boolean isTypeSelected() {
    
        if (cmbType.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, 
                                        "Please choose a type");
            return true;
        }
    // After check kung may pinili tsaka lang kukunin yung pinili
        iType = cmbType.getSelectedItem().toString();
        
    //seset yung message
        addMessage = "Press ok to add\n" +
                iName + " : " + iType + " : " + iSize + " : " + iPrice;
        
        return false;
        
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
                new AddItemPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblInAndOut;
    private javax.swing.JLabel lblInventory;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables
}
