/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanage;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author motev
 */
public class DEMO extends javax.swing.JFrame {

    /**
     * Creates new form DEMO
     */
    public DEMO() {
        initComponents();
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        adate = new javax.swing.JTextField();
        aday = new javax.swing.JTextField();
        aday1 = new javax.swing.JTextField();
        aday2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        adate1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        aday3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        atime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ill = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        med = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        recom = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JButton();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("NAME :");

        jTextField4.setBackground(new java.awt.Color(0, 204, 0));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setText("VIEW REPORT ");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 204, 0));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setText("VIEW REPORT ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("DEMO HERE");

        jTextField5.setBackground(new java.awt.Color(0, 204, 0));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setText("VIEW REPORT ");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanage/reportmain.png"))); // NOI18N

        jTextField7.setBackground(new java.awt.Color(0, 204, 0));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField7.setText("VIEW REPORT ");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(0, 204, 0));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField8.setText("VIEW REPORT ");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setText("REPORT MODULE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 321, 46));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Following is your Report you can refer it for further Queries ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 539, 27));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setText("ENTER YOUR ID :");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 167, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NAME :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 63, 28));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 167, 28));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("APPOINTMENT DATE :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 164, 28));
        getContentPane().add(adate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 167, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("MOBILE NO :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 28));
        getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 167, 28));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("APPOINTMENT DAY :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, 29));
        getContentPane().add(aday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 170, 29));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("AGE :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 49, 28));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 170, 29));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("APPOINTMENT TIME :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));
        getContentPane().add(atime, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 167, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("GENDER :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 70, 28));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 170, 29));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ADDRESS :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 97, 32));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 210, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("ILLNESS :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 79, 32));
        getContentPane().add(ill, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 170, 29));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("MORE INFO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 140, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setText("MEDICINES :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 90, -1));
        getContentPane().add(med, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 240, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("FEEES / CHARGES :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, -1));

        fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeActionPerformed(evt);
            }
        });
        getContentPane().add(fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 167, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("RECOMMANDATIONS :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 670, -1, 35));

        recom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomActionPerformed(evt);
            }
        });
        getContentPane().add(recom, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 240, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 204));
        jLabel17.setText("THANK YOU !! VISIT AGAIN");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, 250, 20));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 90, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("LOGOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 720, 100, 30));

        jTextField9.setBackground(new java.awt.Color(0, 204, 0));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField9.setText("VIEW REPORT ");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:

     

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField5ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String ID = jTextField2.getText();

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from checkup_module WHERE ID='"+ID+"'");

            if(rs.next()){
                med.setText(rs.getString(2));
                recom.setText(rs.getString(3));
                fee.setText(rs.getString(4));

            }

            else{
                JOptionPane.showMessageDialog(null, "Patient ID does not exist");
            }
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeActionPerformed

    private void recomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Welcome obj = new Welcome();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        loginpage obj=new loginpage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:

 
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:

      

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:

        String ID = jTextField2.getText();

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from appointment1_module WHERE ID='"+ID+"'");

            if(rs.next()){
                name.setText(rs.getString(2));
                mob.setText(rs.getString(3));
                age.setText(rs.getString(4));
                address.setText(rs.getString(5));
                gender.setText(rs.getString(6));
                ill.setText(rs.getString(7));
                adate.setText(rs.getString(8));
                aday.setText(rs.getString(9));
                atime.setText(rs.getString(10));

            }

            else{
                JOptionPane.showMessageDialog(null, "Patient ID does not exist");
            }
        }catch(Exception e){

        }

    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEMO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adate;
    private javax.swing.JTextField adate1;
    private javax.swing.JTextField aday;
    private javax.swing.JTextField aday1;
    private javax.swing.JTextField aday2;
    private javax.swing.JTextField aday3;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField atime;
    private javax.swing.JTextField fee;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField ill;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTextField2;
    private javax.swing.JButton jTextField3;
    private javax.swing.JButton jTextField4;
    private javax.swing.JButton jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jTextField7;
    private javax.swing.JButton jTextField8;
    private javax.swing.JButton jTextField9;
    private javax.swing.JTextField med;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField name;
    private javax.swing.JTextField recom;
    // End of variables declaration//GEN-END:variables

 private void setIconImage() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hmsmainlogo.png")));
    }
}
