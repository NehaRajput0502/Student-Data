/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author frof
 */
public class Login extends javax.swing.JFrame {
    private Object uid_msg_lb1;
    private Object pass_msg_lb1;
    private Object pass;
    private Object p_msg_lb1;
    private Object id_msg_lb1;
    private Object jTextField2;
    private Object id_msg_lb;
    private Object p_msg_lb;
    private Object st;

    /**
     * Creates new form Login
     */
    public Login() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userid_tf = new javax.swing.JTextField();
        login_b = new javax.swing.JButton();
        registration_b = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        password_tf = new javax.swing.JPasswordField();
        uid_msg_lb = new javax.swing.JLabel();
        pass_msg_lb = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("jLabel4");

        jPasswordField1.setText("jPasswordField1");

        jPasswordField2.setText("jPasswordField2");

        jPasswordField3.setText("jPasswordField3");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 0));
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 0));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        userid_tf.setName(""); // NOI18N
        userid_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userid_tfActionPerformed(evt);
            }
        });
        getContentPane().add(userid_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 66, -1));

        login_b.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        login_b.setText("Login");
        login_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_bActionPerformed(evt);
            }
        });
        getContentPane().add(login_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 100, 30));

        registration_b.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        registration_b.setText("Registration");
        registration_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registration_bActionPerformed(evt);
            }
        });
        getContentPane().add(registration_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 340, -1, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 204));
        jLabel5.setText("New User Register");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 160, 20));

        password_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_tfActionPerformed(evt);
            }
        });
        getContentPane().add(password_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 66, -1));

        uid_msg_lb.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        uid_msg_lb.setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().add(uid_msg_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 100, 14));

        pass_msg_lb.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pass_msg_lb.setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().add(pass_msg_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, 13));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/n/image1.jpg"))); // NOI18N
        jLabel7.setText("Image");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 370, 330));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 90));

        jLabel9.setForeground(new java.awt.Color(153, 255, 204));
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userid_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userid_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userid_tfActionPerformed

    private void registration_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registration_bActionPerformed
    Registration jf1= new Registration();
    jf1.show();
    dispose();
    }//GEN-LAST:event_registration_bActionPerformed

    private void login_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_bActionPerformed
        // TODO add your handling code here:
        String id =userid_tf.getText();
        String p=new String(password_tf.getPassword());
       if(id.equals(""))
       {
           uid_msg_lb.setText("Enter the user id");
       }
       else
       if(p.equals(""))
       {
           pass_msg_lb.setText("Enter the password");
        }
       try {
           Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nehaproject","root","");
            PreparedStatement st1 = con.prepareStatement("select * from usertb where u_id=? AND u_password=?");
             ResultSet rs;
             st1.setString(1,id);
             st1.setString(2,p);
            rs=st1.executeQuery();
            String s="";
            while(rs.next())
            {
                s="1";
            }
             if(s.equals("1"))
             {
                 JOptionPane.showMessageDialog(null,"Login Successful");
                           Profile jf2= new Profile(id);
                           jf2.show();
             }
             else
             {
                 uid_msg_lb.setText("Check your user id");
                 pass_msg_lb.setText("Check your password");
             }
                       
		
                        con.close();
			//System.out.println("Inserted Successfully");
            }
	catch(Exception e)
	{	
            System.out.println(e);
                
	}   
       
    }//GEN-LAST:event_login_bActionPerformed

    private void password_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_tfActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton login_b;
    private javax.swing.JLabel pass_msg_lb;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JButton registration_b;
    private javax.swing.JLabel uid_msg_lb;
    private javax.swing.JTextField userid_tf;
    // End of variables declaration//GEN-END:variables
}
