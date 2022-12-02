/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardwarestore;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author 1styrGroupC
 */
public class AdminForm extends javax.swing.JFrame {
 Connection Con = null;
 PreparedStatement pst = null;
 ResultSet Rs= null;
 Statement St= null;
 
    public AdminForm() {
        initComponents();
        DisplayUsers();
    }

 private void Clear()
{
    EmailTb.setText("");
    PasswordTb.setText("");
    FnameTb.setText("");
    LnameTb.setText("");}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ItCatDb1 = new javax.swing.JComboBox<>();
        ItCatDb3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EmailTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PasswordTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FnameTb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        LnameTb = new javax.swing.JTextField();
        ClearBtn = new javax.swing.JButton();
        RoleCb = new javax.swing.JComboBox<>();
        StatusCb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ItCatDb2 = new javax.swing.JComboBox<>();
        DisableBtn = new javax.swing.JButton();
        ApproveBtn = new javax.swing.JButton();
        AdminBtn = new javax.swing.JButton();
        SellerBtn = new javax.swing.JButton();
        ClerkBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ItCatDb4 = new javax.swing.JComboBox<>();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filter_and_sort_48px.png"))); // NOI18N

        ItCatDb1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        ItCatDb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Smartphones", "Laptops ", "Watch", "None", " " }));
        ItCatDb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItCatDb1ItemStateChanged(evt);
            }
        });
        ItCatDb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItCatDb1ActionPerformed(evt);
            }
        });

        ItCatDb3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        ItCatDb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller", "Clerk", "None", "" }));
        ItCatDb3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItCatDb3ItemStateChanged(evt);
            }
        });
        ItCatDb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItCatDb3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile_shopping_48px.png"))); // NOI18N
        jLabel4.setText("VAL STORE");

        jLabel6.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content_48px.png"))); // NOI18N
        jLabel6.setText("Dashboard");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout_rounded_left_48px.png"))); // NOI18N
        jLabel15.setText("Logout");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15))
                    .addComponent(jLabel6))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel7.setText("Users List");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Password");

        EmailTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        EmailTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTbActionPerformed(evt);
            }
        });

        UsersTable.setBackground(new java.awt.Color(102, 102, 102));
        UsersTable.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        UsersTable.setForeground(new java.awt.Color(255, 255, 255));
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        UsersTable.setRowHeight(25);
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/management_48px.png"))); // NOI18N
        jLabel13.setText("Manage Users");

        DeleteBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Change/Update Role as:");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Status");

        PasswordTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("First Name");

        FnameTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        FnameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameTbActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Last Name");

        LnameTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LnameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameTbActionPerformed(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        RoleCb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        RoleCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller", "Clerk" }));

        StatusCb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        StatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", " " }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filter_and_sort_48px.png"))); // NOI18N

        ItCatDb2.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        ItCatDb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Admin", "Seller", "Clerk", " " }));
        ItCatDb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItCatDb2ItemStateChanged(evt);
            }
        });
        ItCatDb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItCatDb2ActionPerformed(evt);
            }
        });

        DisableBtn.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        DisableBtn.setText("Disable");
        DisableBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisableBtnMouseClicked(evt);
            }
        });
        DisableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisableBtnActionPerformed(evt);
            }
        });

        ApproveBtn.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        ApproveBtn.setText("Approve");
        ApproveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApproveBtnMouseClicked(evt);
            }
        });
        ApproveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveBtnActionPerformed(evt);
            }
        });

        AdminBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        AdminBtn.setText("Admin");
        AdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminBtnMouseClicked(evt);
            }
        });
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        SellerBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        SellerBtn.setText("Seller");
        SellerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerBtnMouseClicked(evt);
            }
        });
        SellerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerBtnActionPerformed(evt);
            }
        });

        ClerkBtn.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        ClerkBtn.setText("Clerk");
        ClerkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClerkBtnMouseClicked(evt);
            }
        });
        ClerkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClerkBtnActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Role");

        ItCatDb4.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        ItCatDb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Active", "Inactive", "" }));
        ItCatDb4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItCatDb4ItemStateChanged(evt);
            }
        });
        ItCatDb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItCatDb4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(RoleCb, 0, 1, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(FnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(LnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(171, 171, 171)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AddBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SellerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DisableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ApproveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ClerkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItCatDb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ItCatDb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ItCatDb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ItCatDb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, 0)
                                .addComponent(LnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, 0)
                                .addComponent(FnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmailTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel16))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RoleCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApproveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClerkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void EmailTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTbActionPerformed
private void DisplayUsers()
{
    try{
                        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                        St = (Statement) Con.createStatement();
                        Rs = St.executeQuery("select * from users");
                        UsersTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch (Exception e){
        
    }
}
int Id;
Statement St1 = null;
ResultSet Rs1= null;
private void CountUsers()
{
    try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select Max(UserID)from users");
        Rs1.next();
        Id= Rs1.getInt(1)+1;
    }catch(Exception e){
        
    }
}
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
         if(EmailTb.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this,"Missing Information") ;
        }else{
            try{
            CountUsers();
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
            PreparedStatement Save = (PreparedStatement) Con.prepareStatement("insert into users values (?,?,?,?,?,?,?)");
            Save.setInt(1,Id);
            Save.setString(2, FnameTb.getText());
            Save.setString(3, LnameTb.getText());
            Save.setString(4, EmailTb.getText());
            Save.setString(5,PasswordTb.getText());
            Save.setString(6,RoleCb.getSelectedItem().toString());
            Save.setString(7,StatusCb.getSelectedItem().toString());
            Save.executeUpdate();
            JOptionPane.showMessageDialog(this,RoleCb.getSelectedItem().toString()+" Added");
            DisplayUsers();
            Clear();
        }catch(Exception Ex)
                {
                JOptionPane.showMessageDialog(this,Ex);
                }
        }
    }//GEN-LAST:event_AddBtnMouseClicked
int Key=0;
    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)UsersTable.getModel();
        int MyIndex = UsersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        FnameTb.setText(model.getValueAt(MyIndex,1).toString());
        LnameTb.setText(model.getValueAt(MyIndex,2).toString());
        EmailTb.setText(model.getValueAt(MyIndex,3).toString());
        RoleCb.setSelectedItem(model.getValueAt(MyIndex,5).toString());
        PasswordTb.setText(model.getValueAt(MyIndex,4).toString());
        StatusCb.setSelectedItem(model.getValueAt(MyIndex,6).toString());
            }//GEN-LAST:event_UsersTableMouseClicked

    
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if (Key == 0)
        {
            JOptionPane.showMessageDialog(this,"Select the Item");
            
        }else{
            try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
            String Query ="Delete From users where userId="+Key;
            Statement Del = Con.createStatement();
            Del.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,RoleCb.getSelectedItem().toString()+" Deleted");
            DisplayUsers();
            Con.close();
            Clear();
            }catch(Exception e){
                
                }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(EmailTb.getText().isEmpty() || Key==0)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{
             try{
                 CountUsers();
                String UpdateQuery="Update users set Email=?, Password=?,Role=?,Status=? Where UserId=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                Ps.setString(1,EmailTb.getText());
                Ps.setString(2,PasswordTb.getText());
                Ps.setString(3,RoleCb.getSelectedItem().toString());
                Ps.setString(4, StatusCb.getSelectedItem().toString());
                Ps.setInt(5,Key);
                if (Ps.executeUpdate()==1)
                {
                    DisplayUsers();
                    JOptionPane.showMessageDialog(this,RoleCb.getSelectedItem().toString()+" Updated");
                       Clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new LoginFormfinal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void FnameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameTbActionPerformed

    private void LnameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameTbActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void ItCatDb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItCatDb1ItemStateChanged
        String query = ItCatDb1.getSelectedItem().toString();
        filter(query);
    }//GEN-LAST:event_ItCatDb1ItemStateChanged

    private void ItCatDb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItCatDb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItCatDb1ActionPerformed
private void filter(String query)
{
    DefaultTableModel model = (DefaultTableModel)UsersTable.getModel();
    TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
    UsersTable.setRowSorter(tr);
    if(query != "All")
    {
        tr.setRowFilter(RowFilter.regexFilter(query));
       
    }else
    {
        UsersTable.setRowSorter(tr);
    }}
    private void ItCatDb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItCatDb2ItemStateChanged
        String query = ItCatDb2.getSelectedItem().toString();
        filter(query);
    }//GEN-LAST:event_ItCatDb2ItemStateChanged

    private void ItCatDb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItCatDb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItCatDb2ActionPerformed

    private void DisableBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisableBtnMouseClicked
            if(EmailTb.getText().isEmpty() || Key==0)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{try{
                 
                String UpdateQuery="Update users set Email=?, Password=?,Role=?,Status=? Where UserId=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                Ps.setString(1,EmailTb.getText());
                Ps.setString(2,PasswordTb.getText());
                Ps.setString(3,RoleCb.getSelectedItem().toString());
                Ps.setString(4,"Inactive");
                Ps.setInt(5,Key);
               
                if (Ps.executeUpdate()==1)
                {
                    DisplayUsers();
                    JOptionPane.showMessageDialog(this,RoleCb.getSelectedItem().toString()+" has been disabled");
                       Clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }}
    }//GEN-LAST:event_DisableBtnMouseClicked

    private void DisableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisableBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisableBtnActionPerformed

    private void ApproveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveBtnMouseClicked
         if(EmailTb.getText().isEmpty() || Key==0)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{try{
                 
               String UpdateQuery="Update users set Email=?, Password=?,Role=?,Status=? Where UserId=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                Ps.setString(1,EmailTb.getText());
                Ps.setString(2,PasswordTb.getText());
                Ps.setString(3,RoleCb.getSelectedItem().toString());
                Ps.setString(4,"Active");
                Ps.setInt(5,Key);
               
                if (Ps.executeUpdate()==1)
                {
                    DisplayUsers();
                    JOptionPane.showMessageDialog(this,RoleCb.getSelectedItem().toString()+" Approved");
                       Clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }}
    }//GEN-LAST:event_ApproveBtnMouseClicked

    private void ApproveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApproveBtnActionPerformed

    private void AdminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMouseClicked
          if(EmailTb.getText().isEmpty() || Key==0)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{try{
                 
               String UpdateQuery="Update users set Email=?, Password=?,Role=?,Status=? Where UserId=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                Ps.setString(1,EmailTb.getText());
                Ps.setString(2,PasswordTb.getText());
                Ps.setString(3,"Admin");
                Ps.setString(4, StatusCb.getSelectedItem().toString());
                Ps.setInt(5,Key);
               
                if (Ps.executeUpdate()==1)
                {
                    DisplayUsers();
                    JOptionPane.showMessageDialog(this,"Role Updated");
                       Clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }}
    }//GEN-LAST:event_AdminBtnMouseClicked

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminBtnActionPerformed

    private void SellerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerBtnMouseClicked
          if(EmailTb.getText().isEmpty() || Key==0)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{try{
                 
               String UpdateQuery="Update users set Email=?, Password=?,Role=?,Status=? Where UserId=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                Ps.setString(1,EmailTb.getText());
                Ps.setString(2,PasswordTb.getText());
                Ps.setString(3,"Seller");
                Ps.setString(4, StatusCb.getSelectedItem().toString());
                Ps.setInt(5,Key);
               
                if (Ps.executeUpdate()==1)
                {
                    DisplayUsers();
                    JOptionPane.showMessageDialog(this,"Role Updated");
                       Clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }}
    }//GEN-LAST:event_SellerBtnMouseClicked

    private void SellerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerBtnActionPerformed

    private void ClerkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClerkBtnMouseClicked
         if(EmailTb.getText().isEmpty() || Key==0)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{try{
                 
               String UpdateQuery="Update users set Email=?, Password=?,Role=?,Status=? Where UserId=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                Ps.setString(1,EmailTb.getText());
                Ps.setString(2,PasswordTb.getText());
                Ps.setString(3,"Clerk");
                Ps.setString(4, StatusCb.getSelectedItem().toString());
                Ps.setInt(5,Key);
               
                if (Ps.executeUpdate()==1)
                {
                    DisplayUsers();
                    JOptionPane.showMessageDialog(this,"Role Updated");
                       Clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }}
    }//GEN-LAST:event_ClerkBtnMouseClicked

    private void ClerkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClerkBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClerkBtnActionPerformed

    private void ItCatDb3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItCatDb3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ItCatDb3ItemStateChanged

    private void ItCatDb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItCatDb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItCatDb3ActionPerformed

    private void ItCatDb4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItCatDb4ItemStateChanged
         String query = ItCatDb4.getSelectedItem().toString();
         filter(query);
    }//GEN-LAST:event_ItCatDb4ItemStateChanged

    private void ItCatDb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItCatDb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItCatDb4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AdminBtn;
    private javax.swing.JButton ApproveBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton ClerkBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DisableBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField EmailTb;
    private javax.swing.JTextField FnameTb;
    private javax.swing.JComboBox<String> ItCatDb1;
    private javax.swing.JComboBox<String> ItCatDb2;
    private javax.swing.JComboBox<String> ItCatDb3;
    private javax.swing.JComboBox<String> ItCatDb4;
    private javax.swing.JTextField LnameTb;
    private javax.swing.JTextField PasswordTb;
    private javax.swing.JComboBox<String> RoleCb;
    private javax.swing.JButton SellerBtn;
    private javax.swing.JComboBox<String> StatusCb;
    private javax.swing.JTable UsersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
