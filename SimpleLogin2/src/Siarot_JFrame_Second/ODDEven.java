/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Siarot_JFrame_Second;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahaj
 */
public class ODDEven extends javax.swing.JFrame {
        static int score = 0; // score each corrent question add 1 
        static int count = 0; // number of  question out of 10
        
        //generate random number for each question(number)
        Random r = new Random();
        int randomNum;
        
    /**
     * Creates new form ODDEven
     */
    public ODDEven() {
        initComponents();
        //first time generate random 
        randomNum = r.nextInt(100);
        lblNumber.setText(String.valueOf(randomNum));
    }
public ODDEven(String game) {
        initComponents();
        users.setText(game);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        btnEven = new javax.swing.JButton();
        btnOdd = new javax.swing.JButton();
        lblNumber = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        users = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setMinimumSize(new java.awt.Dimension(570, 380));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 117, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Siarot_JFrame_Second/pic1.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCORE:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 92, 30));

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 122, 36));

        btnEven.setBackground(new java.awt.Color(0, 102, 102));
        btnEven.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEven.setText("EVEN");
        btnEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvenActionPerformed(evt);
            }
        });
        jPanel4.add(btnEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 108, -1));

        btnOdd.setBackground(new java.awt.Color(0, 102, 102));
        btnOdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOdd.setText("ODD");
        btnOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOddActionPerformed(evt);
            }
        });
        jPanel4.add(btnOdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 92, -1));

        lblNumber.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 0, 51));
        jPanel4.add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 95, 48));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Odd & Even GAME");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel4.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        users.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel4.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 140, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOddActionPerformed
        // TODO add your handling code here:
        //odd operation
        count = count+1; //each button click count question add 1 out of 10
        int num = Integer.parseInt(lblNumber.getText());  //lblnumber is random num and convert to int for odd even operation
        if(count==10){
            //when counter reach last question(number)
            //than it calculate for last number 
            if(num%2!=0){
                // number corret add score 
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set value of score when answer correct
                randomNum = r.nextInt(100); // random number generate for next question number
                
            }else{
                //if not odd number
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum)); //set randomnumber
                               
            }
            
            //result display on 10th question
            JOptionPane.showMessageDialog(this, "Your score is: "+score+"/10");
            //reset values after score
            count=0;
            score =0;
            lblScore.setText("");
            randomNum = r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));
            
        }else{
            // if number not reach 10th qestion ( for 1 to 9 )
            if(num%2!=0){
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set score value
                //generate random number for next question
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }else{
                //if not odd than generate random for next
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }
        }
        
        
        
    }//GEN-LAST:event_btnOddActionPerformed

    private void btnEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvenActionPerformed
        // TODO add your handling code here:
        // for even do opposite 
        //paste here and change
        
        count = count+1; //each button click count question add 1 out of 10
        int num = Integer.parseInt(lblNumber.getText());  //lblnumber is random num and convert to int for odd even operation
        if(count==10){
            //when counter reach last question(number)
            //than it calculate for last number 
            if(num%2==0){
                // number corret add score 
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set value of score when answer correct
                randomNum = r.nextInt(100); // random number generate for next question number
                
            }else{
                //if not odd number
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum)); //set randomnumber
                               
            }
            
            //result display on 10th question
            JOptionPane.showMessageDialog(this, "Your score is: "+score+"/10");
            //reset values after score
            count=0;
            score =0;
            lblScore.setText("");
            randomNum = r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));
            
        }else{
            // if number not reach 10th qestion ( for 1 to 9 )
            if(num%2==0){
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set score value
                //generate random number for next question
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }else{
                //if not odd than generate random for next
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }
        }
        
        
    }//GEN-LAST:event_btnEvenActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Dashboard dash = new Dashboard(users.getText());
                    
                    dash.pack();
                    setVisible(false);
                    dash.show();
                    dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ODDEven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEven;
    private javax.swing.JButton btnOdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel user;
    public javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
