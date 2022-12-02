
 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package hardwarestore;



import static hardwarestore.LoginFormfinal.EmailTb;

import java.awt.Image;

import java.awt.RenderingHints.Key;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.io.File;

import java.io.FileInputStream;

import java.io.InputStream;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;



import javafx.stage.FileChooser;

import javax.swing.ImageIcon;

import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

import javax.swing.RowFilter;

import javax.swing.Timer;



import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableRowSorter;

import net.proteanit.sql.DbUtils;



/**

 *

 * @author 1styrGroupC

 */

public class Items extends javax.swing.JFrame {



 Connection Con = null;

 PreparedStatement pst = null;

 ResultSet Rs= null;

 Statement St= null;

 

    public Items() {

        initComponents();

        date();

        time();

        displayNameandId();

        DisplayItems();

        CountItems();

        

        

       

    }



   public void date(){

       Date d = new Date();

       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");

       

       String dd = sdf.format(d);

       Date.setText(dd);

   }

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

           IDofClerk.setText(Rs.getString(1)) ;

           NameofClerk.setText(Rs.getString(2)+" "+Rs.getString(3));

        }

       

   }catch(Exception e){

       

   }

   }

   

   private void DisplayItems()

{

    try{

                        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");

                        St = (Statement) Con.createStatement();

                        Rs = St.executeQuery("select * from inventory");

                        ItemsTable.setModel(DbUtils.resultSetToTableModel(Rs));

    }catch (Exception e){

        

    }

}

   

   

   private void Clear()

{

    ItNameTb.setText("");

    ItQtyTb.setText("");

    SellingPrice.setText("");

    ItPictureDb.setIcon(null);

}

int ItemId;

Statement St1 = null;

ResultSet Rs1= null;

private void CountItems()

{

    try{

        St1 = Con.createStatement();

        Rs1 = St1.executeQuery("select Max(InventoryID)from inventory");

        Rs1.next();

        ItemId= Rs1.getInt(1)+1;

    }catch(Exception e){

        

    }

}

int SID;

private void CountTransactions()

{   

    try{

        St1 = Con.createStatement();

        Rs1 = St1.executeQuery("select Max(STransactionID)from stransactions");

        Rs1.next();

        SID= Rs1.getInt(1)+1;

    }catch(Exception e){

        

    }

}



private void filter(String query)

{

    DefaultTableModel model = (DefaultTableModel)ItemsTable.getModel();

    TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);

    ItemsTable.setRowSorter(tr);

    if(query != "None")

    {

        tr.setRowFilter(RowFilter.regexFilter(query));

       

    }else

    {

        ItemsTable.setRowSorter(tr);

    }

    

}



   





private void getThreshold(){

   if(Float.valueOf(ItQtyTb.getText())<=10){
       if (JOptionPane.showConfirmDialog(null, "Quantity had reached the threshold, would you like to order?", "WARNING",

        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

    // yes option

    ItQtyTb.requestFocus();
    

} else {

    // no option

//    remove(JOptionPane.YES_NO_OPTION);

}   
   }
}
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    private void initComponents() {



        jLabel14 = new javax.swing.JLabel();

        jPanel1 = new javax.swing.JPanel();

        jPanel2 = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();

        jLabel4 = new javax.swing.JLabel();

        jLabel15 = new javax.swing.JLabel();

        jPanel3 = new javax.swing.JPanel();

        jLabel7 = new javax.swing.JLabel();

        Datelbl = new javax.swing.JLabel();

        jLabel9 = new javax.swing.JLabel();

        jLabel10 = new javax.swing.JLabel();

        jLabel11 = new javax.swing.JLabel();

        jLabel12 = new javax.swing.JLabel();

        ItNameTb = new javax.swing.JTextField();

        SellingPrice = new javax.swing.JTextField();

        ItQtyTb = new javax.swing.JTextField();

        ItCatDb = new javax.swing.JComboBox<>();

        ItPictureDb = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();

        ItemsTable = new javax.swing.JTable();

        jLabel13 = new javax.swing.JLabel();

        BrowseBtn = new javax.swing.JButton();

        AddBtn = new javax.swing.JButton();

        EditBtn = new javax.swing.JButton();

        DeleteBtn = new javax.swing.JButton();

        jTextField1 = new javax.swing.JTextField();

        ItCatDb1 = new javax.swing.JComboBox<>();

        jLabel2 = new javax.swing.JLabel();

        jLabel3 = new javax.swing.JLabel();

        jLabel16 = new javax.swing.JLabel();

        Timelbl = new javax.swing.JLabel();

        Date = new javax.swing.JLabel();

        Time = new javax.swing.JLabel();

        IDofClerk = new javax.swing.JLabel();

        NameofClerk = new javax.swing.JLabel();

        jLabel17 = new javax.swing.JLabel();

        jLabel18 = new javax.swing.JLabel();

        BuyingPrice = new javax.swing.JTextField();

        jLabel19 = new javax.swing.JLabel();

        UnitofMeasure = new javax.swing.JTextField();

        jLabel20 = new javax.swing.JLabel();

        Date1 = new javax.swing.JLabel();

        Time1 = new javax.swing.JLabel();



        jLabel14.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Logout");

        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {

                jLabel14MouseClicked(evt);

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

                .addComponent(jLabel4)

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()

                .addGap(0, 0, Short.MAX_VALUE)

                .addComponent(jLabel15)

                .addGap(49, 49, 49))

        );

        jPanel2Layout.setVerticalGroup(

            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel2Layout.createSequentialGroup()

                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addGroup(jPanel2Layout.createSequentialGroup()

                        .addContainerGap()

                        .addComponent(jLabel4)))

                .addGap(119, 119, 119)

                .addComponent(jLabel15)

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );



        jPanel3.setBackground(new java.awt.Color(204, 204, 204));



        jLabel7.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel7.setText("Items Stock");



        Datelbl.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        Datelbl.setForeground(new java.awt.Color(51, 51, 51));

        Datelbl.setText("Date:");



        jLabel9.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setText("Measure");



        jLabel10.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setText("Buying Price");



        jLabel11.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));

        jLabel11.setText("Photo");



        jLabel12.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));

        jLabel12.setText("Categories");



        ItNameTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N



        SellingPrice.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N



        ItQtyTb.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        ItQtyTb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ItQtyTb.setInheritsPopupMenu(true);



        ItCatDb.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N

        ItCatDb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Smartphones", "Laptops ", "Watch", " " }));

        ItCatDb.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                ItCatDbActionPerformed(evt);

            }

        });



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



        jLabel13.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people_carry_96px.png"))); // NOI18N

        jLabel13.setText("Manage Items");



        BrowseBtn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N

        BrowseBtn.setText("Browse");

        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {

                BrowseBtnMouseClicked(evt);

            }

        });

        BrowseBtn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                BrowseBtnActionPerformed(evt);

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



        jTextField1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField1ActionPerformed(evt);

            }

        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyReleased(java.awt.event.KeyEvent evt) {

                jTextField1KeyReleased(evt);

            }

        });



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



        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search_in_list_48px.png"))); // NOI18N



        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filter_and_sort_48px.png"))); // NOI18N



        jLabel16.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));

        jLabel16.setText("ID:");



        Timelbl.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        Timelbl.setForeground(new java.awt.Color(51, 51, 51));

        Timelbl.setText("Time:");



        Date.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        Date.setForeground(new java.awt.Color(51, 51, 51));

        Date.setText("0");



        Time.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        Time.setForeground(new java.awt.Color(51, 51, 51));

        Time.setText("0");



        IDofClerk.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        IDofClerk.setText("ID");



        NameofClerk.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        NameofClerk.setText("Name");



        jLabel17.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel17.setForeground(new java.awt.Color(51, 51, 51));

        jLabel17.setText("Name");



        jLabel18.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel18.setForeground(new java.awt.Color(51, 51, 51));

        jLabel18.setText("Name:");



        BuyingPrice.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N



        jLabel19.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel19.setForeground(new java.awt.Color(51, 51, 51));

        jLabel19.setText("Selling Price");



        UnitofMeasure.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        UnitofMeasure.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                UnitofMeasureActionPerformed(evt);

            }

        });



        jLabel20.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        jLabel20.setForeground(new java.awt.Color(51, 51, 51));

        jLabel20.setText("Quantity");



        Date1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        Date1.setForeground(new java.awt.Color(51, 51, 51));

        Date1.setText("0");



        Time1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        Time1.setForeground(new java.awt.Color(51, 51, 51));

        Time1.setText("0");



        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);

        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(

            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel3Layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addComponent(jLabel13)

                        .addGap(583, 583, 583)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addGap(74, 74, 74)

                                .addComponent(Datelbl))

                            .addComponent(Timelbl, javax.swing.GroupLayout.Alignment.TRAILING))

                        .addGap(0, 0, 0)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                            .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(BuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(jLabel17)

                                    .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jLabel10))

                                .addGap(35, 35, 35)

                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(SellingPrice)

                                        .addComponent(ItCatDb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jLabel20))

                                .addGap(40, 40, 40)

                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(UnitofMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jLabel9)))

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addGap(10, 10, 10)

                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                                        .addComponent(ItPictureDb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))))

                        .addGap(18, 18, 18)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addComponent(jLabel18)

                                .addGap(18, 18, 18)

                                .addComponent(NameofClerk)

                                .addGap(198, 198, 198)

                                .addComponent(jLabel16)

                                .addGap(18, 18, 18)

                                .addComponent(IDofClerk))

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addComponent(jLabel7)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(jLabel2)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(jLabel3)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(ItCatDb1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addContainerGap(632, Short.MAX_VALUE))))

            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                .addGroup(jPanel3Layout.createSequentialGroup()

                    .addGap(1048, 1048, 1048)

                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)

                        .addComponent(Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))

                    .addGap(757, 757, 757)))

        );

        jPanel3Layout.setVerticalGroup(

            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel3Layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel13)

                    .addComponent(Datelbl)

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addComponent(Date)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(Time)

                            .addComponent(Timelbl))))

                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addGap(70, 70, 70)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addComponent(jLabel17)

                                .addGap(0, 0, 0)

                                .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addComponent(jLabel12)

                                .addGap(1, 1, 1)

                                .addComponent(ItCatDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(jLabel9)

                            .addComponent(jLabel20))

                        .addGap(1, 1, 1)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(UnitofMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(15, 15, 15)

                                .addComponent(jLabel10)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(BuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(jPanel3Layout.createSequentialGroup()

                                .addComponent(jLabel19)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(SellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                        .addComponent(jLabel11)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addGap(34, 34, 34)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(ItCatDb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))

                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addComponent(ItPictureDb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(16, 16, 16)

                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))

                    .addGroup(jPanel3Layout.createSequentialGroup()

                        .addGap(46, 46, 46)

                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(IDofClerk)

                            .addComponent(jLabel16)

                            .addComponent(NameofClerk)

                            .addComponent(jLabel18))))

                .addGap(111, 111, 111))

            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                .addGroup(jPanel3Layout.createSequentialGroup()

                    .addGap(21, 21, 21)

                    .addComponent(Date1)

                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                    .addComponent(Time1)

                    .addContainerGap(619, Short.MAX_VALUE)))

        );



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(

            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel1Layout.createSequentialGroup()

                .addGap(20, 20, 20)

                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(0, 0, Short.MAX_VALUE)

                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(306, 306, 306))

        );

        jPanel1Layout.setVerticalGroup(

            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1397, Short.MAX_VALUE)

        );

        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );



        pack();

        setLocationRelativeTo(null);

    }// </editor-fold>//GEN-END:initComponents



    private void ItCatDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItCatDbActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_ItCatDbActionPerformed



    private void BrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseBtnActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_BrowseBtnActionPerformed



    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_AddBtnActionPerformed



    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_EditBtnActionPerformed



    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_DeleteBtnActionPerformed

public ImageIcon ResizePhoto(String ImagePath,byte[] pic)

{

 ImageIcon MyImage = null;

if(ImagePath !=null)

{

    MyImage = new ImageIcon(ImagePath);

}else{

    MyImage= new ImageIcon(pic);

}

Image img= MyImage.getImage();

Image newImg = img.getScaledInstance(ItPictureDb.getWidth(),ItPictureDb.getHeight(),Image.SCALE_SMOOTH);

   ImageIcon image = new ImageIcon (newImg);

   return image;

}

 String imgPath;

    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked

      JFileChooser file = new JFileChooser();

      file.setCurrentDirectory(new File(System.getProperty("user.dir")));

      FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Image","jpg","gif","png");

      file.addChoosableFileFilter(filter);

      int result = file.showSaveDialog(file);

      if(result == JFileChooser.APPROVE_OPTION)

      {

          File selectedFile = file.getSelectedFile();

          String path = selectedFile.getAbsolutePath();

          ItPictureDb.setIcon(ResizePhoto(path,null));

          imgPath = path;

      }else if(result == JFileChooser.CANCEL_OPTION)

      {

          JOptionPane.showMessageDialog(this,"No File Selected");

      }

    }//GEN-LAST:event_BrowseBtnMouseClicked





    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked

        if(ItNameTb.getText().isEmpty()|| ItQtyTb.getText().isEmpty()|| SellingPrice.getText().isEmpty()|| ItCatDb.getSelectedIndex()== -1)

        {

           JOptionPane.showMessageDialog(this,"Missing Information") ;

        }else{

            try{

                CountItems();

                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");

            PreparedStatement Save = (PreparedStatement) Con.prepareStatement("insert into inventory Values (?,?,?,?,?,?,?,?)");

            Save.setInt(1,ItemId);

            Save.setString(2,ItNameTb.getText());

            Save.setString(3, ItCatDb.getSelectedItem().toString());

            Save.setInt(4, Integer.valueOf(BuyingPrice.getText()));

            Save.setInt(5, Integer.valueOf(SellingPrice.getText()));

            Save.setInt(6,Integer.valueOf(ItQtyTb.getText()));

            Save.setString(7,UnitofMeasure.getText());

            InputStream img = new FileInputStream(imgPath);

            Save.setBlob(8,img);

            Save.executeUpdate();

            JOptionPane.showMessageDialog(this,"Item Added");

            DisplayItems();

            CountTransactions();

            PreparedStatement Insert = (PreparedStatement) Con.prepareStatement("insert into stransactions values(?,?,?,?,?,?,?)");

            Insert.setInt(1,SID);

            Insert.setInt(2,ItemId);

            Insert.setInt(3,Integer.valueOf(ItQtyTb.getText()));

            Insert.setString(4, "Add");

            Insert.setString(5, IDofClerk.getText());

             Insert.setString(6, Date.getText());

            Insert.setString(7,Time.getText());

            Insert.executeUpdate();

            Con.close();

            Clear();

        }catch(Exception Ex)

                {

                JOptionPane.showMessageDialog(this,Ex);

                }

             try{

           

        }catch(Exception Ex){}

             

        }

    }//GEN-LAST:event_AddBtnMouseClicked

   

   private void GetItemPhoto() {

       String Query = "select Photo from Inventory where InventoryId="+Key;

       Statement St;

       ResultSet Rs;

       try{

            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");

            St=  Con.createStatement();

            Rs = St.executeQuery(Query);

            if(Rs.next())

            {

                ItPictureDb.setIcon(ResizePhoto(null,Rs.getBytes("Photo")));
               

            } 

       }catch (Exception e){

           

       }

   }

      

  int Key= 0; 

      

    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)ItemsTable.getModel();

        int MyIndex = ItemsTable.getSelectedRow();

        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());

        ItNameTb.setText(model.getValueAt(MyIndex,1).toString());

        ItQtyTb.setText(model.getValueAt(MyIndex,5).toString());

        SellingPrice.setText(model.getValueAt(MyIndex,4).toString());

        ItCatDb.setSelectedItem(model.getValueAt(MyIndex,2).toString());  

        BuyingPrice.setText(model.getValueAt(MyIndex,3).toString());

        UnitofMeasure.setText(model.getValueAt(MyIndex,6).toString());

   

        getThreshold();

    }//GEN-LAST:event_ItemsTableMouseClicked



    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked

        if (Key == 0)

        {

            JOptionPane.showMessageDialog(this,"Select the Item");

            

        }else{

            try{

            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");

            String Query ="Delete From inventory where InventoryID="+Key;

            Statement Del = Con.createStatement();

            Del.executeUpdate(Query);

            JOptionPane.showMessageDialog(this,"Item Deleted");

            DisplayItems();
             CountTransactions();
            PreparedStatement Dele = (PreparedStatement) Con.prepareStatement("insert into stransactions values(?,?,?,?,?,?,?)");

            Dele.setInt(1,SID);

            Dele.setInt(2,Key);

            Dele.setInt(3,Integer.valueOf(ItQtyTb.getText()));

            Dele.setString(4, "Delete");

            Dele.setString(5, IDofClerk.getText());

             Dele.setString(6, Date.getText());

            Dele.setString(7,Time.getText());

            Dele.executeUpdate();

            Con.close();

            Clear();

            }catch(Exception e){

                

                }

            

            try{

            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");

            

        }catch(Exception Ex){}

            

            

        }

    }//GEN-LAST:event_DeleteBtnMouseClicked



    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked

        if(imgPath !=null)

        {

            try{

                InputStream img = new FileInputStream(imgPath);

                String UpdateQuery="Update Inventory set ProductName=?, Quantity=?,SellingPrice=?,BuyingPrice=?,Description=?,Photo=?,UnitOfMeasure=?, where InventoryID=?";

                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadgetsdb","root","");

                PreparedStatement Ps = Con.prepareStatement(UpdateQuery);

                Ps.setString(1,ItNameTb.getText());

                Ps.setFloat(2,Float.valueOf(ItQtyTb.getText()));

                Ps.setFloat(3,Float.valueOf(SellingPrice.getText()));

                Ps.setFloat(4,Float.valueOf(BuyingPrice.getText()));

                Ps.setString(5,ItCatDb.getSelectedItem().toString());

                Ps.setBlob(6,img);
                Ps.setString(7,UnitofMeasure.getText());

                Ps.setInt(7, Key);

                if (Ps.executeUpdate()==1)

                {

                    DisplayItems();

                    JOptionPane.showMessageDialog(this,"Item Updated");
                     CountTransactions();
                    PreparedStatement Edit = (PreparedStatement) Con.prepareStatement("insert into stransactions values(?,?,?,?,?,?,?)");

                    Edit.setInt(1,SID);

                    Edit.setInt(2,Key);

                    Edit.setFloat(3,Float.valueOf(ItQtyTb.getText()));

                    Edit.setString(4, "Edit");

                    Edit.setString(5, IDofClerk.getText());

                    Edit.setString(6, Date.getText());

                    Edit.setString(7,Time.getText());

                    Edit.executeUpdate();

                    Con.close();

                    Clear();

                }else{

                    JOptionPane.showMessageDialog(this, "Missing Information");

                }

            }catch(Exception e){

                JOptionPane.showMessageDialog(this,e);

            }

        }else{

            JOptionPane.showMessageDialog(this,"No Photo Selected ");

        }

        imgPath=null;

    }//GEN-LAST:event_EditBtnMouseClicked



    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        new LoginForm().setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jLabel14MouseClicked



    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        new LoginFormfinal().setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jLabel15MouseClicked



    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed





    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        DefaultTableModel model = (DefaultTableModel)ItemsTable.getModel();

        String search=jTextField1.getText().toLowerCase();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);

        ItemsTable.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(search));

        

    }//GEN-LAST:event_jTextField1KeyReleased



    private void ItCatDb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItCatDb1ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_ItCatDb1ActionPerformed



    private void ItCatDb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItCatDb1ItemStateChanged

        String query = ItCatDb1.getSelectedItem().toString();

        filter(query);

    }//GEN-LAST:event_ItCatDb1ItemStateChanged



    private void UnitofMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitofMeasureActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_UnitofMeasureActionPerformed



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

            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>



        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Items().setVisible(true);

            }

        });

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton AddBtn;

    private javax.swing.JButton BrowseBtn;

    private javax.swing.JTextField BuyingPrice;

    private javax.swing.JLabel Date;

    private javax.swing.JLabel Date1;

    private javax.swing.JLabel Datelbl;

    private javax.swing.JButton DeleteBtn;

    private javax.swing.JButton EditBtn;

    private javax.swing.JLabel IDofClerk;

    private javax.swing.JComboBox<String> ItCatDb;

    private javax.swing.JComboBox<String> ItCatDb1;

    private javax.swing.JTextField ItNameTb;

    private javax.swing.JLabel ItPictureDb;

    private javax.swing.JTextField ItQtyTb;

    private javax.swing.JTable ItemsTable;

    private javax.swing.JLabel NameofClerk;

    private javax.swing.JTextField SellingPrice;

    private javax.swing.JLabel Time;

    private javax.swing.JLabel Time1;

    private javax.swing.JLabel Timelbl;

    private javax.swing.JTextField UnitofMeasure;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel12;

    private javax.swing.JLabel jLabel13;

    private javax.swing.JLabel jLabel14;

    private javax.swing.JLabel jLabel15;

    private javax.swing.JLabel jLabel16;

    private javax.swing.JLabel jLabel17;

    private javax.swing.JLabel jLabel18;

    private javax.swing.JLabel jLabel19;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel20;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JPanel jPanel3;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JTextField jTextField1;

    // End of variables declaration//GEN-END:variables

}

