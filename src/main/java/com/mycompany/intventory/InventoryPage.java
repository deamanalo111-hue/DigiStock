package com.mycompany.intventory;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class InventoryPage extends javax.swing.JFrame {

    private DefaultTableModel model;
    private DefaultTableCellRenderer renderer;
    private TableRowSorter sorter;
    private int index = -1;
    
    public InventoryPage() {
        initComponents();
        
        setLocationRelativeTo(null);
        tblList.getColumnModel().getColumn(0).
                setPreferredWidth(447);
        
        model = (DefaultTableModel)tblList.getModel();
        sorter = new TableRowSorter(model);
        tblList.setRowSorter(sorter);
        
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
            txtName.setFont(new Font("Tahoma", Font.BOLD, 20));
        }
        
        txtName.setText(UserFile.getUserName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        lblAddItem = new javax.swing.JLabel();
        lblInventory = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        lblInAndOut = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        lblHistory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        txtSearchBar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 570));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Inventory");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 200, 50));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(235, 550));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockNiAaron-removebg-preview.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel11)
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
        lblAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddItemMouseClicked(evt);
            }
        });

        lblInventory.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblInventory.setForeground(new java.awt.Color(255, 255, 255));
        lblInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse (1).png"))); // NOI18N
        lblInventory.setText("Inventory");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator15)
            .addComponent(jSeparator16)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(lblProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInAndOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

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
        tblList.setAutoscrolls(false);
        tblList.getTableHeader().setResizingAllowed(false);
        tblList.getTableHeader().setReorderingAllowed(false);
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 107, 750, 440));

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
        jPanel3.add(txtSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 275, 39));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 40, 39));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usersmall.png"))); // NOI18N
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 250, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1090, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddItemMouseClicked

        new AddItemPage().setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_lblAddItemMouseClicked

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        
        new DashboardPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseClicked
        
        ProfilePage.givePoint(this.getLocation());
        new ProfilePage().setVisible(true);
        this.setVisible(false);
        this.dispose();
                
    }//GEN-LAST:event_lblProfileMouseClicked

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked

        if (index == tblList.convertRowIndexToModel
                            (tblList.getSelectedRow())) {

            tblList.clearSelection();
            index = -1;
            
        } else {

            index = tblList.convertRowIndexToModel
                            (tblList.getSelectedRow());
            
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

    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        
        String filter = txtSearchBar.getText().trim();
        
        if (filter.equals("")) {
            
            sorter.setRowFilter(null);
            
        } else {
        
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filter));
        
        }
        
    }//GEN-LAST:event_txtSearchBarKeyReleased

    
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
                new InventoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables
}
