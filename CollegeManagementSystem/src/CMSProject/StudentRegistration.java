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

public class StudentRegistration extends javax.swing.JFrame {

    Connection con = null;
    String path2;
    public StudentRegistration() {
       
        con = (Connection) CollegeDatabase.loadConnection();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StudentPageLogo.png")));
        
        Color col = new Color(204,204,204);       //(153,153,153);
        getContentPane().setBackground(col);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        studname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        studmaleRadiobtn = new javax.swing.JRadioButton();
        studfemaleRadiobtn = new javax.swing.JRadioButton();
        studaddress = new javax.swing.JTextField();
        studage = new javax.swing.JTextField();
        studmono = new javax.swing.JTextField();
        studemail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        studclass = new javax.swing.JTextField();
        studdob = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        setimage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        studAdmissionbtn = new javax.swing.JButton();
        studBackbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(17, 17, 17))
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 120));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 540));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Student Addmission Form");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 230, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CMSProject/StudentImag.jpg"))); // NOI18N
        jLabel6.setToolTipText("Faculty Registration Form");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 330, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setToolTipText("Faculty Registration Form");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(studname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 210, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Age");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 50));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mobile Number");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Email Id");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, 20));

        studmaleRadiobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studmaleRadiobtn.setText("Male");
        studmaleRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studmaleRadiobtnActionPerformed(evt);
            }
        });
        jPanel2.add(studmaleRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 20));

        studfemaleRadiobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studfemaleRadiobtn.setText("Female");
        jPanel2.add(studfemaleRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 20));

        studaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(studaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 210, 30));

        studage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(studage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 30));

        studmono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(studmono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 30));

        studemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(studemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 210, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Name");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Class");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        studclass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(studclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 30));

        studdob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(studdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Date of Birth");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        setimage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jPanel2.add(setimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 150));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 450, 510));

        studAdmissionbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studAdmissionbtn.setText("Save");
        studAdmissionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studAdmissionbtnActionPerformed(evt);
            }
        });
        getContentPane().add(studAdmissionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 110, 30));

        studBackbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studBackbtn.setText("Back ");
        studBackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studBackbtnActionPerformed(evt);
            }
        });
        getContentPane().add(studBackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 110, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studAdmissionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studAdmissionbtnActionPerformed
        // TODO add your handling code here:
         if (studname.getText().isEmpty() || studaddress.getText().isEmpty() ||
            (!studmaleRadiobtn.isSelected() && !studfemaleRadiobtn.isSelected()) || 
            studdob.getText().isEmpty()|| studage.getText().isEmpty() || 
            studclass.getText().isEmpty() || studmono.getText().isEmpty() || 
            studemail.getText().isEmpty() || path2 == null)
            //studusername.getText().isEmpty() || facpassword.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(studAdmissionbtn, "Please fill all Fields");
            return;
        }

        String dob = studdob.getText().trim();
        if (!isValidDate(dob)) 
        {
            JOptionPane.showMessageDialog(studAdmissionbtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
            return;
        }
        
        String mobileNumber = studmono.getText().trim();
        if (!isValidMobileNumber(mobileNumber))
        {
            JOptionPane.showMessageDialog(studAdmissionbtn, "Invalid Mobile Number");
            return; // Exit method if mobile number is invalid
        }

        String email = studemail.getText().trim();
        if (!isValidEmail(email))
        {
            JOptionPane.showMessageDialog(studAdmissionbtn, "Invalid Email Address");
            return; // Exit method if email is invalid
        }
       

        String query = "insert into StudentAdmission (StudentName,StudentAddress,StudentGender,DOB,StudentAge,Class,StudentMoNo,StudentEmailId,StudentImage) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1, studname.getText());
            ps.setString(2, studaddress.getText());
            if(studmaleRadiobtn.isSelected())
            {ps.setString(3, studmaleRadiobtn.getText());}
            else if(studfemaleRadiobtn.isSelected())
            {ps.setString(3, studfemaleRadiobtn.getText());}
            ps.setString(4, studdob.getText());
            ps.setInt(5, Integer.parseInt(studage.getText()));
            ps.setString(6, studclass.getText());
            ps.setString(7, studmono.getText());
            ps.setString(8, studemail.getText());
            InputStream is = new FileInputStream(new File(path2));
            ps.setBlob(9, is);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(studAdmissionbtn, "Your Admission has been Done...\n\nWait for UserName & PassWord.");
            ps.close();
            con.close();
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        studname.setText("");
        studaddress.setText("");
       // if(studmaleRadiobtn.isSelected() && studfemaleRadiobtn.isSelected())
        studmaleRadiobtn.setSelected(false);
        //else
        studfemaleRadiobtn.setSelected(false);
        studdob.setText("");
        studage.setText("");
        studclass.setText("");
        studmono.setText("");
        studemail.setText("");
        setimage.setIcon(null);
        //facusername.setText("");
        //facpassword.setText("");
    }//GEN-LAST:event_studAdmissionbtnActionPerformed

    private void studBackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studBackbtnActionPerformed
        // TODO add your handling code here:
        new LoginInterface().setVisible(true);
        dispose();
            
    }//GEN-LAST:event_studBackbtnActionPerformed

    private void studmaleRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studmaleRadiobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studmaleRadiobtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        try {
            BufferedImage br = ImageIO.read(new File(path));
            Image img;
            img = br.getScaledInstance(130, 172, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            setimage.setIcon(icon);
            path2 = path;
        } catch (IOException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel setimage;
    private javax.swing.JButton studAdmissionbtn;
    private javax.swing.JButton studBackbtn;
    private javax.swing.JTextField studaddress;
    private javax.swing.JTextField studage;
    private javax.swing.JTextField studclass;
    private javax.swing.JTextField studdob;
    private javax.swing.JTextField studemail;
    private javax.swing.JRadioButton studfemaleRadiobtn;
    private javax.swing.JRadioButton studmaleRadiobtn;
    private javax.swing.JTextField studmono;
    private javax.swing.JTextField studname;
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
