/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CMSProject;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AdminRegistration extends javax.swing.JFrame {

    Connection con = null;
    String path2;
    public AdminRegistration() {
        
        con = (Connection) CollegeDatabase.loadConnection();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AdminPageL.png")));
        
        Color col = new Color(204,204,204);       //(153,153,153);
        getContentPane().setBackground(col);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        adusername = new javax.swing.JTextField();
        adname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        admaleRadiobtn = new javax.swing.JRadioButton();
        adfemaleRadiobtn = new javax.swing.JRadioButton();
        adaddress = new javax.swing.JTextField();
        adage = new javax.swing.JTextField();
        admono = new javax.swing.JTextField();
        ademail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        setimage1 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        adRegisterbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Registration Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Progressive Education Society's");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ProjectImages\\Coll.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Modern College of Arts, Science and Commerce (Autonomus)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Shivaji Nagar Pune-411005");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 120));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 510));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CMSProject/AdminImag.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 310, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adusernameActionPerformed(evt);
            }
        });
        jPanel2.add(adusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 210, 30));

        adname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(adname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 210, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 60, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Age");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 60, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mobile Number");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Email Id");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 70, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("User Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, 30));

        admaleRadiobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        admaleRadiobtn.setText("Male");
        jPanel2.add(admaleRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 40));

        adfemaleRadiobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adfemaleRadiobtn.setText("Female");
        jPanel2.add(adfemaleRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, 40));

        adaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaddressActionPerformed(evt);
            }
        });
        jPanel2.add(adaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, 30));

        adage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(adage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 210, 30));

        admono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(admono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 210, 30));

        ademail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(ademail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 210, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Name");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 60, 30));

        setimage1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jPanel2.add(setimage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 150));

        upload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        upload.setText("Upload Image");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel2.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 490, 480));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Admin Registration Form");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 220, 30));

        adRegisterbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adRegisterbtn.setText("Register");
        adRegisterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adRegisterbtnActionPerformed(evt);
            }
        });
        getContentPane().add(adRegisterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 110, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 110, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adaddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adRegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adRegisterbtnActionPerformed
       
        if (adname.getText().isEmpty() || adaddress.getText().isEmpty() || 
                (!admaleRadiobtn.isSelected() && !adfemaleRadiobtn.isSelected()) ||
                  adage.getText().isEmpty() || admono.getText().isEmpty() ||
                  ademail.getText().isEmpty() || adusername.getText().isEmpty() || 
                  path2 == null) 
                    {
                        JOptionPane.showMessageDialog(adRegisterbtn, "Please fill all Fields");
			return;
                    }
				
                    String mobileNumber = admono.getText().trim();
                    if (!isValidMobileNumber(mobileNumber)) 
                    {
                        JOptionPane.showMessageDialog(adRegisterbtn, "Invalid Mobile Number");
			return; // Exit method if mobile number is invalid
                    }
				
                    String email = ademail.getText().trim();
                    if (!isValidEmail(email)) 
                    {
			JOptionPane.showMessageDialog(adRegisterbtn, "Invalid Email Address");
			return; // Exit method if email is invalid
                    }
                                
                    String query = "insert into adminregistertb (AdminName,AdminAddress,AdminGender,AdminAge,AdminMoNo,AdminEmailId,AdminUserName,AdminImage) values(?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = null;
                    try 
                    {
                        ps = con.prepareStatement(query);
                        ps.setString(1, adname.getText());
			ps.setString(2, adaddress.getText());
			if(admaleRadiobtn.isSelected())
                            ps.setString(3, admaleRadiobtn.getText());
			else
                            ps.setString(3, adfemaleRadiobtn.getText()); 
                        ps.setInt(4, Integer.parseInt(adage.getText()));
			ps.setString(5, admono.getText());
			ps.setString(6, ademail.getText());
			//ps.setInt(5, Integer.parseInt(monoadmintxt.getText()));
			ps.setString(7, adusername.getText());
			//ps.setString(8, adpassword.getText());
                        InputStream is = new FileInputStream(new File(path2));
                        ps.setBlob(8, is);
				
			ps.executeUpdate();
			JOptionPane.showMessageDialog(adRegisterbtn, "You Have Registered..!");
			ps.close();
			con.close();
                    } 
                    catch (SQLException e1) 
                    {
                        e1.printStackTrace();
                    } 
                    catch (FileNotFoundException ex) 
                    {
                        java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
				
                    adname.setText("");
                    adaddress.setText("");
                    //if(maleadminrbtn.isSelected() && femaleadminrbtn.isSelected())
			admaleRadiobtn.setSelected(false);
                    //else
                        adfemaleRadiobtn.setSelected(false);
                    adage.setText("");
                    admono.setText("");
                    ademail.setText("");
                    adusername.setText("");
                   // adpassword.setText("");
                    setimage1.setIcon(null);
		
    }//GEN-LAST:event_adRegisterbtnActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
      
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        try{
            BufferedImage br = ImageIO.read(new File(path));
            Image img;
            img = br.getScaledInstance(130, 172, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            setimage1.setIcon(icon);
            path2 = path;
        }
        catch(IOException e)
        {
            //Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        /*try {
            BufferedImage br = ImageIO.read(new File(path));
            Image img;
            img = br.getScaledInstance(130, 172, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            setimage1.setIcon(icon);
            path2 = path;
        } catch (IOException ex) {
            //Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, ex);
            //Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_uploadActionPerformed

    private void adusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adusernameActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adRegisterbtn;
    private javax.swing.JTextField adaddress;
    private javax.swing.JTextField adage;
    private javax.swing.JTextField ademail;
    private javax.swing.JRadioButton adfemaleRadiobtn;
    private javax.swing.JRadioButton admaleRadiobtn;
    private javax.swing.JTextField admono;
    private javax.swing.JTextField adname;
    private javax.swing.JTextField adusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel setimage1;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables

    private boolean isValidMobileNumber(String mobileNumber) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String regex = "^[0-9]{10}$";
        return mobileNumber.matches(regex);
    }

    private boolean isValidEmail(String email) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	return email.matches(regex);
    }
}
