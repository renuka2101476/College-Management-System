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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FacultyRegistration extends javax.swing.JFrame {

    Connection con = null;
    String path2;
    public FacultyRegistration() {
        con = CollegeDatabase.loadConnection();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FacultyPageL.png")));
        
        Color col = new Color(204,204,204);       //(153,153,153);
        getContentPane().setBackground(col);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        facname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        facmaleRadiobtn = new javax.swing.JRadioButton();
        facfemaleRadiobtn = new javax.swing.JRadioButton();
        facddress = new javax.swing.JTextField();
        facage = new javax.swing.JTextField();
        facmono = new javax.swing.JTextField();
        facemail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        uploadfacultyimage = new javax.swing.JButton();
        facultysetimage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        facdob = new javax.swing.JTextField();
        facEdu = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        facRegisterbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faculty Registration Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Faculty Registration Form");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 230, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CMSProject/FacultyImagee.jpg"))); // NOI18N
        jLabel6.setToolTipText("Faculty Registration Form");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setToolTipText("Faculty Registration Form");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(facname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 210, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Age");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mobile Number");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 110, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Email Id");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 30));

        facmaleRadiobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        facmaleRadiobtn.setText("Male");
        jPanel2.add(facmaleRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, 40));

        facfemaleRadiobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        facfemaleRadiobtn.setText("Female");
        jPanel2.add(facfemaleRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 40));

        facddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        facddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facddressActionPerformed(evt);
            }
        });
        jPanel2.add(facddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 210, 30));

        facage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(facage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 210, 30));

        facmono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(facmono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 210, 30));

        facemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(facemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 210, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Name");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 30));

        uploadfacultyimage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uploadfacultyimage.setText("Upload Image");
        uploadfacultyimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadfacultyimageActionPerformed(evt);
            }
        });
        jPanel2.add(uploadfacultyimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 150, 30));

        facultysetimage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jPanel2.add(facultysetimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Date of Birth");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Education");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        facdob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(facdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, 30));

        facEdu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(facEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 210, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 460, 480));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Progressive Education Society's");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon("D:\\ProjectImages\\Coll.jpg")); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Modern College of Arts, Science and Commerce (Autonomus)");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setText("Shivaji Nagar Pune-411005");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30))))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 120));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 510));

        facRegisterbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        facRegisterbtn.setText("Register");
        facRegisterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facRegisterbtnActionPerformed(evt);
            }
        });
        getContentPane().add(facRegisterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 110, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 110, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void facddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FacultyLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void facRegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facRegisterbtnActionPerformed

        if (facname.getText().isEmpty() || facddress.getText().isEmpty() ||
            (!facmaleRadiobtn.isSelected() && !facfemaleRadiobtn.isSelected()) ||
            facdob.getText().isEmpty() || facage.getText().isEmpty() || 
            facEdu.getText().isEmpty() || facmono.getText().isEmpty() ||
            facemail.getText().isEmpty() )
            //facusername.getText().isEmpty() || facpassword.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(facRegisterbtn, "Please fill all Fields");
            return;
        }

        String dob = facdob.getText().trim();
        if (!isValidDate(dob)) 
        {
            JOptionPane.showMessageDialog(facRegisterbtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
            return;
        }
        
        String mobileNumber = facmono.getText().trim();
        if (!isValidMobileNumber(mobileNumber))
        {
            JOptionPane.showMessageDialog(facRegisterbtn, "Invalid Mobile Number");
            return; // Exit method if mobile number is invalid
        }

        String email = facemail.getText().trim();
        if (!isValidEmail(email))
        {
            JOptionPane.showMessageDialog(facRegisterbtn, "Invalid Email Address");
            return; // Exit method if email is invalid
        }

        String query = "insert into facultyregistertb (FacultyName,FacultyAddress,FacultyGender,FacultyDOB,FacultyAge,FacultyEducation,FacultyMoNo,FacultyEmailId,FacultyImage) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1, facname.getText());
            ps.setString(2, facddress.getText());
            if(facmaleRadiobtn.isSelected())
            ps.setString(3, facmaleRadiobtn.getText());
            else
            ps.setString(3, facfemaleRadiobtn.getText());
            ps.setString(4, facdob.getText());
            ps.setInt(5, Integer.parseInt(facage.getText()));
            ps.setString(6, facEdu.getText());
            ps.setString(7, facmono.getText());
            ps.setString(8, facemail.getText());            
            //ps.setString(7, facusername.getText());
            //ps.setString(8, facpassword.getText());
            InputStream is = new FileInputStream(new File(path2));
            ps.setBlob(9, is);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(facRegisterbtn, "You Have Registered...\n\nWait for UserName & PassWord.");
            ps.close();
            con.close();
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
            //JOptionPane.showMessageDialog(facRegisterbtn, "Enter Valid Date....!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FacultyRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        facname.setText("");
        facddress.setText("");
        //if(maleadminrbtn.isSelected() && femaleadminrbtn.isSelected())
        facmaleRadiobtn.setSelected(false);
        //else
        facfemaleRadiobtn.setSelected(false);
        facdob.setText("");
        facage.setText("");
        facEdu.setText("");
        facmono.setText("");
        facemail.setText("");
        facultysetimage.setIcon(null);
        //facusername.setText("");
        //facpassword.setText("");

    }//GEN-LAST:event_facRegisterbtnActionPerformed

    private void uploadfacultyimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadfacultyimageActionPerformed
        
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        try {
            BufferedImage br = ImageIO.read(new File(path));
            Image img;
            img = br.getScaledInstance(130, 172, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            facultysetimage.setIcon(icon);
            path2 = path;
        } catch (IOException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadfacultyimageActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField facEdu;
    private javax.swing.JButton facRegisterbtn;
    private javax.swing.JTextField facage;
    private javax.swing.JTextField facddress;
    private javax.swing.JTextField facdob;
    private javax.swing.JTextField facemail;
    private javax.swing.JRadioButton facfemaleRadiobtn;
    private javax.swing.JRadioButton facmaleRadiobtn;
    private javax.swing.JTextField facmono;
    private javax.swing.JTextField facname;
    private javax.swing.JLabel facultysetimage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton uploadfacultyimage;
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
    
    private boolean isValidDate(String date) {
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        return date.matches(regex);
    }
}
