/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Anushka
 */
public class DispUserSearch extends javax.swing.JFrame {

    /**
     * Creates new form DispUserSearch
     */
    private String name;
    public DispUserSearch(String z) {
        name = z;
        initComponents();
    }
    
    public DispUserSearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DONOR-ID");

        jLabel2.setText("NAME");

        jLabel3.setText("AGE");

        jLabel4.setText("E-MAIL");

        jLabel5.setText("UNIT");

        jLabel6.setText("BLOOD GROUP");

        jLabel7.setText("GENDER");

        jLabel8.setText("PHONE-NO.");

        jButton1.setText("DISPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("DISPLYING DETAIL OF DONOR");

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(138, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(56, 56, 56)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField5))))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int oldunit;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                Class.forName("oracle.jdbc.OracleDriver");
                Connection c3 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                        "MINI", "123456789");
                
                PreparedStatement ps4 = c3.prepareStatement("select * from donor where name = ?");
                 ps4.setString(1,name);
                
                
                ResultSet r4 = ps4.executeQuery();
                r4.next();
                
                int a4 = r4.getInt(1);
                jTextField1.setText(a4+"");
                
                jTextField2.setText(name);
                int a5 = r4.getInt(3);
                jTextField3.setText(a5+"");
                
                String a6 = r4.getString(4);
                jTextField4.setText(a6);
                
                String unit = r4.getString(5);
                oldunit = Integer.parseInt(unit);
                jTextField5.setText(unit);             
                
                String a9 = r4.getString(6);
                jTextField6.setText(a9);
               
                String a8 = r4.getString(7);
                jTextField7.setText(a8);
                System.out.println("7");
               
                int a = r4.getInt(8);
                jTextField8.setText(a+"");
                
                c3.close();
            }
            catch(Exception e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection s = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","MINI",
                        "123456789");
             PreparedStatement pq = s.prepareStatement("update donor set id = ?, age=?, email=?,unit= ?, bg = ?, gender = ?, phno =? where name = ?");
                String i = jTextField1.getText();
                int id = Integer.parseInt(i);
                pq.setInt(1,id);
                
                String a = jTextField3.getText();
                int age = Integer.parseInt(a);
                pq.setInt(2,age);
                
                String email = jTextField4.getText();
                pq.setString(3,email);
                
                String unit = jTextField5.getText();
                int u = Integer.parseInt(unit);
                pq.setString(4,unit);
                
                String bg = jTextField6.getText();
                pq.setString(5,bg);
                
                String gender =jTextField7.getText();
                pq.setString(6,gender);
                
                String ph = jTextField8.getText();
                int phno = Integer.parseInt(ph);
                pq.setInt(7,phno);
                
                pq.setString(8,name);
                                        //TO SET UNITS FROM TOTAL BLOOD
                PreparedStatement b = s.prepareStatement("select unit from blood where bg = ?");
                b.setString(1,bg);
                ResultSet r = b.executeQuery();
                r.next();
                int totunit = r.getInt(1);
                u = totunit-oldunit;
                System.out.println(u+" "+oldunit);
//                if(u != oldunit) 

                    System.out.println("2we");
                    int newunit=0;
//                    if(u > oldunit)
//                        newunit = u;
//                    else if(u < oldunit)
                        newunit += u;              //NOT CHANGINGG DB IN BLOOD TABLE
                        newunit += Integer.parseInt(jTextField5.getText()); 
                    System.out.println(newunit +" "+bg);
                    PreparedStatement ps4 = s.prepareStatement("update blood set unit=? where bg = ?");
                    ps4.setInt(1,newunit);
                    ps4.setString(2,bg);
                    
                ps4.executeUpdate();
                pq.executeUpdate(); 
                JOptionPane.showMessageDialog(null,"record updated successfully");
                s.close();
                
            }
            catch(Exception e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DispUserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DispUserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DispUserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DispUserSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DispUserSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
//                PreparedStatement ps5 = c3.prepareStatement("select age from donor where name = ?");
//                PreparedStatement ps6 = c3.prepareStatement("select email from donor where name = ?");
//                PreparedStatement ps7 = c3.prepareStatement("select unit from donor where name = ?");
//                PreparedStatement ps8 = c3.prepareStatement("select gender from donor where name = ?");
//                PreparedStatement ps9 = c3.prepareStatement("select bg from donor where name = ?");
//                PreparedStatement ps0 = c3.prepareStatement("select phno from donor where name = ?");
                //jTextField2.setText(name);