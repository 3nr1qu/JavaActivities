/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardwarestore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class Cashier extends javax.swing.JFrame {
Connection Con = null;
 PreparedStatement pst = null;
 ResultSet Rs= null;
 Statement St= null;
    public Cashier() {
        initComponents();
        DisplayItems();
        ShowDate();
        time();
        displayNameandId();
       
    }
//    int SellerId;
//public Cashier(String Sname,int SId)
//{
//    initComponents();
//    SNameLbl.setText(Sname);
//    SellerId=SId;
//     DisplayItems();
//        ShowDate();
//        
//}
 public void time(){

       new Timer (0,new ActionListener() {

           @Override

           public void actionPerformed(ActionEvent e) {

              Date d = new Date();

              SimpleDateFormat s = new SimpleDateFormat("hh-mm-ss a");

              String tim = s.format(d);

              Time.setText(tim);

           }

       }).start();

   } 
 public void displayNameandId(){

       String Query = "select * from users where Email='"+LoginFormfinal.EmailTb.getText()+"'";

         try{

       

        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");

        St= Con.createStatement();

        Rs= St.executeQuery(Query);



        if(Rs.next()){

           SIdLbl.setText(Rs.getString(1)) ;

           SNameLbl.setText(Rs.getString(2)+" "+Rs.getString(3));

        }
         }catch(Exception e){

       

   }

   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SNameLbl = new javax.swing.JLabel();
        SIdLbl = new javax.swing.JLabel();
        SIdLbl1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        TodayDateLbl = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ItNameTb = new javax.swing.JTextField();
        ItPriceTb = new javax.swing.JTextField();
        ItQtyTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillText = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        TotalLbl = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();

        jPanel10.setBackground(new java.awt.Color(246, 85, 12));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("VAL STORE");

        jLabel25.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Items");

        jLabel26.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Dashboard");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel25))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel24)))
                .addGap(42, 42, 42)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile_shopping_48px.png"))); // NOI18N
        jLabel8.setText("VAL STORE");

        jLabel10.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout_rounded_left_48px.png"))); // NOI18N
        jLabel10.setText("Logout");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        SNameLbl.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        SNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        SNameLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass_money_48px.png"))); // NOI18N
        SNameLbl.setText("SName");

        SIdLbl.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        SIdLbl.setForeground(new java.awt.Color(255, 255, 255));
        SIdLbl.setText("SId");

        SIdLbl1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        SIdLbl1.setForeground(new java.awt.Color(255, 255, 255));
        SIdLbl1.setText("UserID:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SNameLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(SIdLbl1)
                                .addGap(0, 0, 0)
                                .addComponent(SIdLbl)))))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(SNameLbl)))
                .addGap(78, 78, 78)
                .addComponent(jLabel10)
                .addGap(290, 290, 290)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SIdLbl1)
                    .addComponent(SIdLbl))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        TodayDateLbl.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        TodayDateLbl.setForeground(new java.awt.Color(0, 0, 51));
        TodayDateLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/date_time_48px.png"))); // NOI18N
        TodayDateLbl.setText("Date");

        jLabel18.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Name");

        jLabel19.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Quantity");

        jLabel20.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Price");

        ItNameTb.setBackground(new java.awt.Color(102, 102, 102));
        ItNameTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ItNameTb.setForeground(new java.awt.Color(255, 255, 255));

        ItPriceTb.setBackground(new java.awt.Color(102, 102, 102));
        ItPriceTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ItPriceTb.setForeground(new java.awt.Color(255, 255, 255));

        ItQtyTb.setBackground(new java.awt.Color(102, 102, 102));
        ItQtyTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ItQtyTb.setForeground(new java.awt.Color(255, 255, 255));

        ItemsTable.setBackground(new java.awt.Color(102, 102, 102));
        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ItemsTable.setRowHeight(25);
        ItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemsTable);

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investment_96px.png"))); // NOI18N
        jLabel23.setText("Billing");

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

        AddBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        AddBtn.setText("Add to Bill");
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

        PrintBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        BillText.setColumns(20);
        BillText.setRows(5);
        jScrollPane2.setViewportView(BillText);

        jLabel21.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel21.setText("Items Stock");

        TotalLbl.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        TotalLbl.setText("Total");

        Time.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Time.setForeground(new java.awt.Color(0, 0, 51));
        Time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/date_time_48px.png"))); // NOI18N
        Time.setText("Time");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TodayDateLbl)
                        .addGap(83, 83, 83)
                        .addComponent(Time)
                        .addGap(173, 173, 173))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(TotalLbl)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn)
                            .addGap(144, 144, 144)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel21))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TodayDateLbl)
                        .addComponent(Time)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(0, 0, 0)
                            .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(0, 0, 0)
                            .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TotalLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1405, 765));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
try{
    InsertBill();
}catch(Exception e){
    JOptionPane.showMessageDialog(this,e);
}
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
                if(ItNameTb.getText().isEmpty()|| ItQtyTb.getText().isEmpty())
                {
                        JOptionPane.showMessageDialog(this,"Missing Information") ;
                    }else if(AvailQty < Integer.valueOf(ItQtyTb.getText())){
                    
                              JOptionPane.showMessageDialog(this,"Not Enough In Stock");
                             }else{
                      
                               i++;
                              GrdTotal = GrdTotal +(Integer.valueOf(ItPriceTb.getText())*Integer.valueOf(ItQtyTb.getText()));
                               if(i == 1)
                               {
                               BillText.setText(BillText.getText()+"        ************************Gadget/Devices Shop******************************\n"
                                       + "ID\tProduct\t QTY\t PRICE\tTOTAL\n"
                                       + ""+i+ "\t"+ItNameTb.getText()+"\t"+ItQtyTb.getText() + "\t"+ItPriceTb.getText()+"\t"+Integer.valueOf(ItQtyTb.getText())*Integer.valueOf(ItPriceTb.getText())+"\n");
                               }
                               else{
                               BillText.setText(""+BillText.getText()+i+'\t'+ItNameTb.getText()+"\t"+ItQtyTb.getText() + "\t"+ItPriceTb.getText()+"\t"+Integer.valueOf(ItQtyTb.getText())*Integer.valueOf(ItPriceTb.getText())+"\n");
                               }
                               NumberFormat myFormat = NumberFormat.getInstance();
                               myFormat.setGroupingUsed(true);
                               TotalLbl.setText("Php "+myFormat.format(GrdTotal));
                               UpdateQty();
                               }
                        
                    
                
    }//GEN-LAST:event_AddBtnMouseClicked
private void ShowDate()
{
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
    TodayDateLbl.setText(s.format(d));
}
    private void Clear()
{
    BillText.setText("");
    ItNameTb.setText("");
    ItQtyTb.setText("");
    ItPriceTb.setText("");
    i=0;
    TotalLbl.setText("");
}
    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked
int Key= 0;
int AvailQty;
int i = 0;
int GrdTotal=0;
    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ItemsTable.getModel();
        int MyIndex = ItemsTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        ItNameTb.setText(model.getValueAt(MyIndex,1).toString());
        ItQtyTb.setText(model.getValueAt(MyIndex,2).toString());
        ItPriceTb.setText(model.getValueAt(MyIndex,3).toString());

    }//GEN-LAST:event_ItemsTableMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      new LoginFormfinal().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

int BillId;
Statement St1 = null;
ResultSet Rs1= null;
    private void CountBills()
{
    try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select Max(CTransactionID)from ctransactions");
        Rs1.next();
        BillId= Rs1.getInt(1)+1;
    }catch(Exception e){
        
    }
}
    private void InsertBill(){
     try{
            CountBills();
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
            PreparedStatement Save = (PreparedStatement) Con.prepareStatement("insert into ctransactions Values (?,?,?,?,?,?,?,?)");
            Save.setInt(1,BillId);
            Save.setInt(2,Key);
            Save.setString(3,ItQtyTb.getText());
            Save.setString(4, ItPriceTb.getText());
            Save.setInt(5,GrdTotal);
            Save.setInt(6,Integer.valueOf(SIdLbl.getText()));
            Save.setString(7,TodayDateLbl.getText());
            Save.setString(8,Time.getText());
            Save.executeUpdate();
            JOptionPane.showMessageDialog(this,"Bill Inserted");
            Con.close();
            DisplayItems();
            Clear();
        }catch(Exception Ex)
                {
                JOptionPane.showMessageDialog(this,Ex);
                }
}
    private void UpdateQty(){
      
             try{
                 int newqty= AvailQty-Integer.valueOf(ItQtyTb.getText());
                String UpdateQuery="Update Inventory set Quantity=? where InventoryID=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                Ps.setInt(1,newqty);
                Ps.setInt(2,Key);
             
               if (Ps.executeUpdate()==1)
                {
                    DisplayItems();
                   
                       
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    
   private void DisplayItems()
{
    try{
                        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");
                        St = (Statement) Con.createStatement();
                        Rs = St.executeQuery("SELECT * FROM `Inventory` WHERE Quantity > 10;");
                        ItemsTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch (Exception e){
        
    }
}

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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextArea BillText;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField ItNameTb;
    private javax.swing.JTextField ItPriceTb;
    private javax.swing.JTextField ItQtyTb;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JLabel SIdLbl;
    private javax.swing.JLabel SIdLbl1;
    private javax.swing.JLabel SNameLbl;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel TodayDateLbl;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
