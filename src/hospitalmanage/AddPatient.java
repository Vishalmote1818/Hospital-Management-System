

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanage;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;


/**
 *
 * @author motev
 */
public class AddPatient extends javax.swing.JFrame implements Runnable{
   int hour,seconds,minutes;
 
    /**
     * Creates new form AddPatient
     */
   public AddPatient() {
        initComponents();
        showDate();
        Thread t= new Thread(this);
        t.start();
        
        setIconImage();
    }
    
void showDate(){
    Date d = new Date();
    SimpleDateFormat sd  = new SimpleDateFormat("dd-MM-yyyy");
    pad.setText(sd.format(d));
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pg = new javax.swing.JTextField();
        pat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pi = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\motev\\Downloads\\addpatientmodule (1) (1).jpg")); // NOI18N
        jLabel6.setText("hhugbuyh");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jLabel8.setIcon(new javax.swing.ImageIcon("V:\\Hospitalmanage\\IMAGES\\addpatientmodule (1) (1).jpg")); // NOI18N

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ADD PATIENT DETAILS ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 44));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PATIENT ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 153, 35));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 186, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("PATIENT NAME :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 153, 35));
        getContentPane().add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 186, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("MOBILE NO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 153, 35));
        getContentPane().add(pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 186, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("AGE :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 153, 35));

        pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paActionPerformed(evt);
            }
        });
        getContentPane().add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 186, 35));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 95, 37));

        jButton2.setBackground(new java.awt.Color(0, 255, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("ADMIT ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 140, 37));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("GENDER :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 90, 40));
        getContentPane().add(pg, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 186, 35));
        getContentPane().add(pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 186, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("ADMIT DATE :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 153, 35));
        getContentPane().add(pad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 186, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("ADMIT TIME :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 140, 35));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("ILLNESS :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 100, 35));
        getContentPane().add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 186, 35));

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("LOGOUT");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 90, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanage/Add p&d.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Patients obj = new Patients();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        

               try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            
            String sql="insert into patient_record values(?,?,?,?,?,?,?,?)";
            PreparedStatement ptst =conn.prepareStatement(sql);
            ptst.setString(1,pid.getText());
            ptst.setString(2,pn.getText());
            ptst.setString(3,pm.getText());
            ptst.setString(4,pa.getText());
            ptst.setString(5,pg.getText());
            ptst.setString(6,pi.getText());
            ptst.setString(7,pad.getText());
            ptst.setString(8,pat.getText());
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data inserted Successfully");
            conn.close();
            pid.setText("");pm.setText("");pn.setText("");
            pa.setText("");pg.setText("");pi.setText("");
            pad.setText("");pat.setText("");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                                

        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void paActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pa;
    private javax.swing.JTextField pad;
    private javax.swing.JTextField pat;
    private javax.swing.JTextField pg;
    private javax.swing.JTextField pi;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pm;
    private javax.swing.JTextField pn;
    // End of variables declaration//GEN-END:variables

    
   private void setIconImage() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hmsmainlogo.png")));
    }  
    
    
    @Override
    public void run() {
        
        while(true){
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minutes =cal.get(Calendar.MINUTE);
            seconds =cal.get(Calendar.SECOND);
            
            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss:aa"); 
            Date dat = cal.getTime();
            String time24 = sdf24.format(dat);
            pat.setText(time24);
            
        }
    }


}
