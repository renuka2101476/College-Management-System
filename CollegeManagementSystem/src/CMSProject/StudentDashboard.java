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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentDashboard extends javax.swing.JFrame {
  
    Connection con = null;
    String loggedInUsername;
    
    public StudentDashboard(String username) {
        //String username = null;
        this.loggedInUsername = username;
        
        con = CollegeDatabase.loadConnection();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StudentPageLogo.png")));
        
        Color col = new Color(204,204,204);       //(153,153,153);
        getContentPane().setBackground(col);
        initComponents();
        upDateDB();
        FacultyInfo();
    }

    public void upDateDB()
    {
        PreparedStatement pst = null;
        ResultSet rss = null;
        
        try
        {
            pst = con.prepareStatement("select * from Librarybooks");
            
            rss = pst.executeQuery();
            
            ResultSetMetaData stdata = rss.getMetaData();
            
            int q = stdata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rss.next())
            {
                Vector columnData = new Vector();
                
                for(int i=1; i<=q; i++)
                {
           
                    columnData.add(rss.getString("BookName"));
                    columnData.add(rss.getString("Author"));
                    columnData.add(rss.getBytes("BookImage"));                 
                              
                    columnData.add(rss.getString("BookStatus"));
                       
                }
                RecordTable.addRow(columnData);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     public void FacultyInfo()
    {
        PreparedStatement pst = null;
        ResultSet rss = null;
        
        try
        {
            pst = con.prepareStatement("select * from facultyregistertb");
            
            rss = pst.executeQuery();
            
            ResultSetMetaData stdata = rss.getMetaData();
            
            int q = stdata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)FacultyTable.getModel();
            RecordTable.setRowCount(0);
            
            while(rss.next())
            {
                Vector columnData = new Vector();
                
                for(int i=1; i<=q; i++)
                {
                    columnData.add(rss.getString("FacultyName"));
                    columnData.add(rss.getString("FacultyEducation"));                                  
                }
                RecordTable.addRow(columnData);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        studname1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        studrollno1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        studclass1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        studdiv1 = new javax.swing.JLabel();
        getstudimage1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        studdob = new javax.swing.JLabel();
        studmono = new javax.swing.JLabel();
        studEid = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        clgaccnum = new javax.swing.JTextField();
        studaccnum = new javax.swing.JTextField();
        studnm = new javax.swing.JTextField();
        enrollno = new javax.swing.JTextField();
        studclass = new javax.swing.JTextField();
        paymentdate = new javax.swing.JTextField();
        clgfeeamount = new javax.swing.JTextField();
        paybtn = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        emailid = new javax.swing.JTextField();
        mono = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        div = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        srollno = new javax.swing.JTextField();
        bnm = new javax.swing.JTextField();
        banm = new javax.swing.JTextField();
        rdate = new javax.swing.JTextField();
        bookimg = new javax.swing.JLabel();
        issuebtn = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FacultyTable = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Fnm = new javax.swing.JTextField();
        FEdu = new javax.swing.JTextField();
        FImage = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        studrollno = new javax.swing.JTextField();
        studname = new javax.swing.JTextField();
        sclass = new javax.swing.JTextField();
        studdiv = new javax.swing.JTextField();
        examfeeamt = new javax.swing.JTextField();
        payexamfeesbtn = new javax.swing.JButton();
        printexamreceipt = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        clgacc = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        studacc = new javax.swing.JTextField();
        exampaymentdate = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        EID = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        bbaFY = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        bbaSY = new javax.swing.JButton();
        bbaTY = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        bbacaFY = new javax.swing.JButton();
        bbacaSY = new javax.swing.JButton();
        bbacaTY = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        bcomFY = new javax.swing.JButton();
        bcomSY = new javax.swing.JButton();
        bcomTY = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        bbaibFY = new javax.swing.JButton();
        bbaibSY = new javax.swing.JButton();
        bbaibTY = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CollegeFeeReceipt = new javax.swing.JTextArea();
        downloadbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Dashboard Form");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1050, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ProjectImages\\Coll.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Progressive Education Society's");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Modern College of Arts, Science and Commerce (Autonomus)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Shivaji Nagar Pune-411005");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 110));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Pay College Fees");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Exam Form");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 160, 40));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Profile");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 40));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Library");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 40));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("Faculty");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 40));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton10.setText("Old Question Paper");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 160, 40));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setText("Courses & Syllabus");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 530));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Welcome to Modern College........");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Go to Profile");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 170, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setText("Student Portal");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, 40));

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Name");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        studname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 110, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Enrollment No. ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        studrollno1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studrollno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Class ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        studclass1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studclass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 100, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Division");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        studdiv1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studdiv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, 20));

        getstudimage1.setText("jLabel9");
        getstudimage1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        getstudimage1.setMaximumSize(new java.awt.Dimension(45, 18));
        getstudimage1.setMinimumSize(new java.awt.Dimension(45, 18));
        getstudimage1.setPreferredSize(new java.awt.Dimension(45, 18));
        jPanel4.add(getstudimage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 310, 320));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("PROFILE");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No.");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email ID");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Date of Birth");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        studdob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 100, 20));

        studmono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studmono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 110, 20));

        studEid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studEid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 110, 20));

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Pay Your College Fees.....");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("College Acc Number");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Student Acc Number");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Student Name");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Enrollment No");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Class");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Date");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Amount");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, 30));

        clgaccnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clgaccnum.setText("7878787");
        jPanel5.add(clgaccnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 180, 30));

        studaccnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(studaccnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 180, 30));

        studnm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(studnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 180, 30));

        enrollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enrollno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enrollnoKeyPressed(evt);
            }
        });
        jPanel5.add(enrollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 180, 30));

        studclass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(studclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 180, 30));

        paymentdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(paymentdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 180, 30));

        clgfeeamount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(clgfeeamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 180, 30));

        paybtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paybtn.setText("Pay");
        paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybtnActionPerformed(evt);
            }
        });
        jPanel5.add(paybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 170, 40));

        printbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printbtn.setText("Print Receipt");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });
        jPanel5.add(printbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 170, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Mobile Number");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Email ID");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, 30));

        emailid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 180, 30));

        mono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(mono, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 180, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Division");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, 30));

        div.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 180, 30));

        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel34.setText("LIBRARY");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookName", "AuthorName", "BookImage", "BookStatus"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 560, 120));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Enrollment No.");
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Book Name");
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Author Name");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("Issue/Return Date");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        srollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(srollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 140, -1));

        bnm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(bnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 140, -1));

        banm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(banm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 140, -1));

        rdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 140, -1));

        bookimg.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel6.add(bookimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 160, 200));

        issuebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        issuebtn.setText("ISSUE");
        issuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebtnActionPerformed(evt);
            }
        });
        jPanel6.add(issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 40));

        returnbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnbtn.setText("RETURN");
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        jPanel6.add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 130, 40));

        jTabbedPane1.addTab("tab4", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FacultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Teacher Name", "Education"
            }
        ));
        FacultyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacultyTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(FacultyTable);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 440, 110));

        jLabel54.setIcon(new javax.swing.ImageIcon("D:\\ProjectImages\\facultyphoto\\principal.jpg")); // NOI18N
        jLabel54.setText("principal");
        jLabel54.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, 130));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("(Principal)");
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Prof. Dr. R. S. Zunjarrao");
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 170, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Teacher Name");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setText("FACULTY");
        jLabel58.setToolTipText("");
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 40));

        jLabel59.setIcon(new javax.swing.ImageIcon("D:\\ProjectImages\\facultyphoto\\viceprin.jpg")); // NOI18N
        jLabel59.setText("vice principal");
        jLabel59.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel7.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 110, 130));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Prof. Dr. M. D. Alindikar");
        jPanel7.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 170, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("(Vice-Principal)");
        jPanel7.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon("D:\\ProjectImages\\facultyphoto\\HOD.jpg")); // NOI18N
        jLabel62.setText("hod");
        jLabel62.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel7.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 110, 130));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("Prof. Dr. P.Khalane");
        jPanel7.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 160, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("(HOD)");
        jPanel7.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setText("Education");
        jPanel7.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        Fnm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(Fnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 150, -1));

        FEdu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(FEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 150, -1));

        FImage.setText("faculty");
        FImage.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel7.add(FImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 110, 130));

        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel39.setText("Pay Your Exam Fees.....");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Enrollment No.");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Student Name");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Class");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Division");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 30));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Semester");
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 30));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Amount");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, 30));

        studrollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(studrollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 180, 30));

        studname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(studname, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 180, 30));

        sclass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(sclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 180, 30));

        studdiv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studdivActionPerformed(evt);
            }
        });
        jPanel8.add(studdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 180, 30));

        examfeeamt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(examfeeamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 180, 30));

        payexamfeesbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        payexamfeesbtn.setText("Pay ");
        payexamfeesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payexamfeesbtnActionPerformed(evt);
            }
        });
        jPanel8.add(payexamfeesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 170, 40));

        printexamreceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printexamreceipt.setText("Print Receipt");
        printexamreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printexamreceiptActionPerformed(evt);
            }
        });
        jPanel8.add(printexamreceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 170, 40));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("College Acc Number");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        clgacc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clgacc.setText("7878787");
        jPanel8.add(clgacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 180, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Student Acc Number");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 30));

        studacc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(studacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 180, 30));

        exampaymentdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(exampaymentdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 180, 30));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Date");
        jPanel8.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Email ID");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, 30));

        EID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(EID, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 180, 30));

        sem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 180, 30));

        jTabbedPane1.addTab("tab6", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel66.setText("RESULT");
        jPanel9.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jTabbedPane1.addTab("tab7", jPanel9);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("BBA : Bachelor of Business Administration");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 320, -1));

        bbaFY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbaFY.setText("First Year");
        bbaFY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaFYActionPerformed(evt);
            }
        });
        jPanel10.add(bbaFY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 40));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel28.setText("Courses and Syllabus");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        bbaSY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbaSY.setText("Second Year");
        bbaSY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaSYActionPerformed(evt);
            }
        });
        jPanel10.add(bbaSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 40));

        bbaTY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbaTY.setText("Third Year");
        bbaTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaTYActionPerformed(evt);
            }
        });
        jPanel10.add(bbaTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 40));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Syllabus :");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("BBA(CA) : Bachelor of Business Administration");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("(Computer Application)");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 20));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Syllabus :");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        bbacaFY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbacaFY.setText("First Year");
        bbacaFY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbacaFYActionPerformed(evt);
            }
        });
        jPanel10.add(bbacaFY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, 40));

        bbacaSY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbacaSY.setText("Second Year");
        bbacaSY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbacaSYActionPerformed(evt);
            }
        });
        jPanel10.add(bbacaSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 130, 40));

        bbacaTY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbacaTY.setText("Third Year");
        bbacaTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbacaTYActionPerformed(evt);
            }
        });
        jPanel10.add(bbacaTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 130, 40));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("B.Com : Bachelor of Commerce");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Syllabus :");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        bcomFY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bcomFY.setText("First Year");
        bcomFY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcomFYActionPerformed(evt);
            }
        });
        jPanel10.add(bcomFY, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 130, 40));

        bcomSY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bcomSY.setText("Second Year");
        bcomSY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcomSYActionPerformed(evt);
            }
        });
        jPanel10.add(bcomSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 130, 40));

        bcomTY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bcomTY.setText("Third Year");
        bcomTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcomTYActionPerformed(evt);
            }
        });
        jPanel10.add(bcomTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 130, 40));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("BBA(IB) : Bachelor of Business Administration");
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("(International Business)");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, 20));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText("Syllabus :");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        bbaibFY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbaibFY.setText("First Year");
        bbaibFY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaibFYActionPerformed(evt);
            }
        });
        jPanel10.add(bbaibFY, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 130, 40));

        bbaibSY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbaibSY.setText("Second Year");
        bbaibSY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaibSYActionPerformed(evt);
            }
        });
        jPanel10.add(bbaibSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 130, 40));

        bbaibTY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bbaibTY.setText("Third Year");
        bbaibTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaibTYActionPerformed(evt);
            }
        });
        jPanel10.add(bbaibTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 130, 40));

        jTabbedPane1.addTab("tab8", jPanel10);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setText("BBA Question Paper");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 290, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setText("BBA(CA) Question Paper");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 290, 50));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setText("BBA(IB) Question Paper");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 290, 50));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setText("B.Com Question Paper");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 290, 50));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel26.setText("Previous Year Question Paper");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jTabbedPane1.addTab("tab9", jPanel11);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CollegeFeeReceipt.setColumns(20);
        CollegeFeeReceipt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CollegeFeeReceipt.setRows(5);
        jScrollPane3.setViewportView(CollegeFeeReceipt);

        jPanel12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 530, 450));

        downloadbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        downloadbtn.setText("Download Receipt");
        downloadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadbtnActionPerformed(evt);
            }
        });
        jPanel12.add(downloadbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 180, 40));

        jTabbedPane1.addTab("tab10", jPanel12);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 880, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
        try {
            
            String query = "SELECT StudentName, EnrollmentNo, Class, Division, StudentEmailId FROM StudentAdmission WHERE StudentUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);     
            
           // ps.setString(2, enrollno.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                studnm.setText(rs.getString("StudentName"));
                enrollno.setText(rs.getString("EnrollmentNo"));
                studclass.setText(rs.getString("Class"));
                div.setText(rs.getString("Division"));
                emailid.setText(rs.getString("StudentEmailId"));
         
            } else {
                JOptionPane.showMessageDialog(this, "Record not found....!");
            }
            
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        }
        
        jTabbedPane1.setSelectedIndex(2);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
         try {
            String query = "SELECT StudentName, EnrollmentNo, Class, Division, DOB, StudentEmailId, StudentMoNo, StudentImage FROM StudentAdmission WHERE StudentUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                studname1.setText(rs.getString("StudentName"));
                studrollno1.setText(rs.getString("EnrollmentNo"));
                studclass1.setText(rs.getString("Class"));
                studdiv1.setText(rs.getString("Division"));
                studdob.setText(rs.getString("DOB"));
                studEid.setText(rs.getString("StudentEmailId"));
                studmono.setText(rs.getString("StudentMoNo"));
                
                byte[] imageData = rs.getBytes("StudentImage");
                if (imageData != null) {
                    ImageIcon image = new ImageIcon(imageData);
                    getstudimage1.setIcon(image);
                } else {
                    getstudimage1.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
                }
            } else {
                JOptionPane.showMessageDialog(this, "No student data found.");
            }
            
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        }
        jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       /*try {
     
       String query = "SELECT af.MarkSheetID, af.EnrollmentNo,af.StudName,af.Class,af.Division,af.Subject1,af.Subject2,af.Subject3,af.TotalMarks,af.TotalPercentage FROM studentadmission sf, studentresult af where sf.EnrollmentNo = af.EnrollmentNo and sf.StudentUserName=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, loggedInUsername);
        ResultSet rs = ps.executeQuery();
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("\n\n     ****************************************************\n");
        receiptText.append("     *                                 RESULT                                  *\n");
        receiptText.append("     ****************************************************\n");
        receiptText.append("     *                                                                                *\n");
        boolean dataFound = false; // Flag to check if any data is found for the logged-in user
        
        while (rs.next()) {
            dataFound = true; // Set the flag to true since data is found for the logged-in user
            
            receiptText.append("     *          MarkSheet ID              :       ").append(rs.getString("MarkSheetID")).append("                   *\n");
            receiptText.append("     *          Enrollment No.            :       ").append(rs.getString("EnrollmentNo")).append("               *\n");
            receiptText.append("     *          Student Name             :       ").append(rs.getString("StudName")).append("                   *\n");
            receiptText.append("     *          Class                             :       ").append(rs.getString("Class")).append("             *\n");
            receiptText.append("     *          Division                        :       ").append(rs.getString("Division")).append("                      *\n");
            receiptText.append("     *          Mark of Subject 1        :       ").append(rs.getString("Subject1")).append("                    *\n");
            receiptText.append("     *          Mark of Subject 2        :       ").append(rs.getString("Subject2")).append("                    *\n");
            receiptText.append("     *          Mark of Subject 3        :       ").append(rs.getString("Subject3")).append("                    *\n");
            receiptText.append("     *          Total Marks                  :       ").append(rs.getString("TotalMarks")).append("               *\n");
            receiptText.append("     *          Total Percentage         :       ").append(rs.getString("TotalPercentage")).append("           *\n");
            
        }
        receiptText.append("     *                                                                                *\n");
        receiptText.append("     ****************************************************\n");
        if (!dataFound) {
            receiptText.append("No student data found for logged-in user: ").append(loggedInUsername);
        }
        
        CollegeFeeReceipt.setText(receiptText.toString());
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
    }
    
    jTabbedPane1.setSelectedIndex(9);*/
       
       try {
        String query = "SELECT af.MarkSheetID, af.EnrollmentNo, af.StudName, af.Class, af.Division, af.Subject1, af.Subject2, af.Subject3, af.TotalMarks, af.TotalPercentage, af.ResultStatus FROM studentadmission sf, studentresult af WHERE sf.EnrollmentNo = af.EnrollmentNo AND sf.StudentUserName=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, loggedInUsername);
        ResultSet rs = ps.executeQuery();
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("\n\n     ****************************************************\n");
        receiptText.append("                                       RESULT                                   \n");
        receiptText.append("     ****************************************************\n");
      //  receiptText.append("     *                                                                                *\n");
        
        boolean dataFound = false; // Flag to check if any data is found for the logged-in user
        
        while (rs.next()) {
            String resultStatus = rs.getString("ResultStatus");
            
            if (resultStatus != null && resultStatus.equals("NotDecleared")) {
                receiptText.append("     *   Your Result is Not Declared Yet....!                  *\n");
            } else {
                dataFound = true; // Set the flag to true since data is found for the logged-in user
                
                receiptText.append("               MarkSheet ID              :       ").append(rs.getString("MarkSheetID")).append("\n");
                receiptText.append("               Enrollment No.            :       ").append(rs.getString("EnrollmentNo")).append("\n");
                receiptText.append("               Student Name             :       ").append(rs.getString("StudName")).append("\n");
                receiptText.append("               Class                             :       ").append(rs.getString("Class")).append("\n");
                receiptText.append("               Division                        :       ").append(rs.getString("Division")).append("\n");
                receiptText.append("               Mark of Subject 1        :       ").append(rs.getString("Subject1")).append("\n");
                receiptText.append("               Mark of Subject 2        :       ").append(rs.getString("Subject2")).append("\n");
                receiptText.append("               Mark of Subject 3        :       ").append(rs.getString("Subject3")).append("\n");
                receiptText.append("               Total Marks                  :       ").append(rs.getString("TotalMarks")).append("\n");
                receiptText.append("               Total Percentage         :       ").append(rs.getString("TotalPercentage")).append("\n");
            }
        }
        
      //  receiptText.append("     *                                                                                *\n");
        receiptText.append("     ****************************************************\n");
        
        if (!dataFound) {
            //receiptText.append("No student data found for logged-in user: ").append(loggedInUsername);
        }
        
        CollegeFeeReceipt.setText(receiptText.toString());
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
    }
    
    jTabbedPane1.setSelectedIndex(9);
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     try {
            String query = "SELECT StudentName, EnrollmentNo, Class, Division, DOB, StudentEmailId, StudentMoNo, StudentImage FROM StudentAdmission WHERE StudentUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                studname1.setText(rs.getString("StudentName"));
                studrollno1.setText(rs.getString("EnrollmentNo"));
                studclass1.setText(rs.getString("Class"));
                studdiv1.setText(rs.getString("Division"));
                studdob.setText(rs.getString("DOB"));
                studEid.setText(rs.getString("StudentEmailId"));
                studmono.setText(rs.getString("StudentMoNo"));
                
                /*byte[] imageData = rs.getBytes("StudentImage");
                if (imageData != null) {
                    ImageIcon image = new ImageIcon(imageData);
                    getstudimage1.setIcon(image);
                } else {
                    getstudimage1.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
                }*/
                
                byte[] imageData = rs.getBytes("StudentImage");
                if (imageData != null) {
                // Load image from byte array
                try (ByteArrayInputStream bis = new ByteArrayInputStream(imageData)) 
                {
                    BufferedImage img = ImageIO.read(bis);
                    // Scale image to fit the JLabel
                    ImageIcon image = new ImageIcon(img.getScaledInstance(getstudimage1.getWidth(), getstudimage1.getHeight(), Image.SCALE_SMOOTH));
                    getstudimage1.setIcon(image);
                }   
                catch (IOException ex) 
                {
                    Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
                } else {
                // Set default image if no image found
                getstudimage1.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
            }
            
            } else {
                JOptionPane.showMessageDialog(this, "No student data found.");
            }
            
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        }
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        new StudentLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void paybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybtnActionPerformed
       if (clgaccnum.getText().isEmpty() || studaccnum.getText().isEmpty() ||           
            studnm.getText().isEmpty() || enrollno.getText().isEmpty() ||
            studclass.getText().isEmpty() || div.getText().isEmpty() || 
            paymentdate.getText().isEmpty() || emailid.getText().isEmpty() || 
            mono.getText().isEmpty() || clgfeeamount.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(paybtn, "Please fill all Fields");
            return;
        }

       String clgAccountNumber = clgaccnum.getText().trim();
        if (!isValidBankAccountNumber(clgAccountNumber))
        {
            JOptionPane.showMessageDialog(paybtn, "Invalid College Bank Account Number");
            return; // Exit method if college account number is invalid
        }

        String studAccountNumber = studaccnum.getText().trim();
        if (!isValidBankAccountNumber(studAccountNumber))
        {
            JOptionPane.showMessageDialog(paybtn, "Invalid Student Bank Account Number");
            return; // Exit method if student account number is invalid
        }
        
        String dob = paymentdate.getText().trim();
        if (!isValidDate(dob)) 
        {
            JOptionPane.showMessageDialog(paybtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
            return;
        }
        
        String mobileNumber = mono.getText().trim();
        if (!isValidMobileNumber(mobileNumber))
        {
            JOptionPane.showMessageDialog(paybtn, "Invalid Mobile Number");
            return; // Exit method if mobile number is invalid
        }

        String email = emailid.getText().trim();
        if (!isValidEmail(email))
        {
            JOptionPane.showMessageDialog(paybtn, "Invalid Email Address");
            return; // Exit method if email is invalid
        }
      

        String query = "insert into admissionfees (CollegeAccountNumber,YourAccountNumber,StudentName,EnrollmentNo,StudentClass,TransactionDate,CollegeFeeAmt,MobileNumber,EmailId,StudDiv) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1, clgaccnum.getText());
            ps.setString(2, studaccnum.getText());
            ps.setString(3, studnm.getText());        
            ps.setString(4, enrollno.getText());
            ps.setString(5, studclass.getText());
            ps.setString(6, paymentdate.getText());
            ps.setString(7, clgfeeamount.getText());
            ps.setString(8, mono.getText());
            ps.setString(9, emailid.getText());
            ps.setString(10, div.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(paybtn, "Payment Successfully...");
            ps.close();
            con.close();
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog(paybtn, "You Have Aleardy Paid College Fees....!");
            //e1.printStackTrace();
        }

        clgaccnum.setText("");
        studaccnum.setText("");
        studnm.setText("");
        enrollno.setText("");
        studclass.setText("");
        paymentdate.setText("");
        clgfeeamount.setText("");
        mono.setText("");
        emailid.setText("");
        div.setText("");
    }//GEN-LAST:event_paybtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try 
        {
            String query = "SELECT EnrollmentNo FROM StudentAdmission WHERE StudentUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
            
                srollno.setText(rs.getString("EnrollmentNo"));
            } 
            else {
                JOptionPane.showMessageDialog(this, "No student data found.");
            }
            
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        }
        
        jTabbedPane1.setSelectedIndex(3);
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
        
        
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\QuestionPaper\\BBA.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\QuestionPaper\\BCOM.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

         try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\QuestionPaper\\BBACA.pdf");          
        }
        catch(Exception e)
        {          
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
  
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\QuestionPaper\\BBAIB.pdf");          
        }
        catch(Exception e)
        {          
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void bbacaFYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbacaFYActionPerformed
      try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBACAFirstYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbacaFYActionPerformed

    private void bbaFYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaFYActionPerformed
       try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBAFirstYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbaFYActionPerformed

    private void bbaSYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaSYActionPerformed
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBASecondYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbaSYActionPerformed

    private void bbaTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaTYActionPerformed
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBAThirdYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbaTYActionPerformed

    private void bbacaSYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbacaSYActionPerformed
       try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBACASecondYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbacaSYActionPerformed

    private void bbacaTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbacaTYActionPerformed
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBACAThirdYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbacaTYActionPerformed

    private void bcomFYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcomFYActionPerformed
       try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BCOMFirstYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bcomFYActionPerformed

    private void bcomSYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcomSYActionPerformed
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BCOMSecondYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bcomSYActionPerformed

    private void bcomTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcomTYActionPerformed
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BCOMThirdYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bcomTYActionPerformed

    private void bbaibFYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaibFYActionPerformed
      try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBAIBFirstYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbaibFYActionPerformed

    private void bbaibSYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaibSYActionPerformed
       try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBAIBSecondYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbaibSYActionPerformed

    private void bbaibTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaibTYActionPerformed
      try
        {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"D:\\ProjectImages\\CourseSyllabus\\BBAIBThirdYear.pdf");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check File Detials");
        }
    }//GEN-LAST:event_bbaibTYActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
         try {
            String query = "SELECT StudentName, EnrollmentNo, Class, Division, StudentEmailId FROM StudentAdmission WHERE StudentUserName = ?";
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);     
            
           // ps.setString(2, studrollno.getText());         
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                studname.setText(rs.getString("StudentName"));
                studrollno.setText(rs.getString("EnrollmentNo"));
                sclass.setText(rs.getString("Class"));
                studdiv.setText(rs.getString("Division"));
                EID.setText(rs.getString("StudentEmailId"));
         
            } else {
                JOptionPane.showMessageDialog(this, "You Hava Already Paid Your College Fees...!");
            }
            
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        }
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void payexamfeesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payexamfeesbtnActionPerformed
   
       if (clgacc.getText().isEmpty() || studacc.getText().isEmpty() ||           
            studname.getText().isEmpty() || studrollno.getText().isEmpty() ||
            sclass.getText().isEmpty() || sem.getText().isEmpty() ||
            studdiv.getText().isEmpty() || exampaymentdate.getText().isEmpty() || 
            EID.getText().isEmpty() || examfeeamt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(payexamfeesbtn, "Please fill all Fields");
            return;
        }
        
        String clgAccountNumber = clgacc.getText().trim();
        if (!isValidBankAccountNumber(clgAccountNumber))
        {
            JOptionPane.showMessageDialog(payexamfeesbtn, "Invalid College Bank Account Number");
            return; // Exit method if college account number is invalid
        }

        String studAccountNumber = studacc.getText().trim();
        if (!isValidBankAccountNumber(studAccountNumber))
        {
            JOptionPane.showMessageDialog(payexamfeesbtn, "Invalid Student Bank Account Number");
            return; // Exit method if student account number is invalid
        }
        
        String dob = exampaymentdate.getText().trim();
        if (!isValidDate(dob)) 
        {
            JOptionPane.showMessageDialog(payexamfeesbtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
            return;
        }
        
        String email = EID.getText().trim();
        if (!isValidEmail(email))
        {
            JOptionPane.showMessageDialog(payexamfeesbtn, "Invalid Email Address");
            return; // Exit method if email is invalid
        }
      

        String query = "insert into studexamfees (CollegeAccountNumber,YourAccountNumber,StudentName,EnrollmentNo,StudentClass,Semester,StudDiv,TransDate,EmailId,ExamFeeAmt) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1, clgacc.getText());
            ps.setString(2, studacc.getText());
            ps.setString(3, studname.getText());        
            ps.setString(4, studrollno.getText());
            ps.setString(5, sclass.getText());
            ps.setString(6, sem.getText());
            ps.setString(7, studdiv.getText());
            ps.setString(8, exampaymentdate.getText());
            ps.setString(9, EID.getText());
            ps.setString(10, examfeeamt.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(payexamfeesbtn, "Payment Successfully...");
            ps.close();
            con.close();
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog(paybtn, "You Have Aleardy Paid Exam Fees...!");
        }

        clgacc.setText("");
        studacc.setText("");
        studname.setText("");
        studrollno.setText("");
        sclass.setText("");
        sem.setText("");
        studdiv.setText("");
        exampaymentdate.setText("");
        EID.setText("");
        examfeeamt.setText("");
        
    }//GEN-LAST:event_payexamfeesbtnActionPerformed

    private void studdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studdivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studdivActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    int r = jTable1.getSelectedRow();
    String click = (jTable1.getModel().getValueAt(r,0).toString());
    String sql = "SELECT BookName, Author, BookImage FROM Librarybooks WHERE BookName=?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, click);
        ResultSet rss = pst.executeQuery();
        if (rss.next()) {
            String BName = rss.getString("BookName");
            String BAuthor = rss.getString("Author");
            byte[] imgBytes = rss.getBytes("BookImage");
            if (imgBytes != null) {
            try (ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes)) 
            {
                BufferedImage img = ImageIO.read(bis);
                 
                ImageIcon icon = new ImageIcon(img.getScaledInstance(bookimg.getWidth(), bookimg.getHeight(), Image.SCALE_SMOOTH));
                    bookimg.setIcon(icon);
            }  /* catch (IOException ex) {
                    Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            } else {
              
                bookimg.setIcon(new ImageIcon()); 
            }
         
            bnm.setText(BName);
            banm.setText(BAuthor);
        }
    }    catch (SQLException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jTable1MouseClicked

   
    private void issuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebtnActionPerformed
            
       /*if (srollno.getText().isEmpty() || bnm.getText().isEmpty() || banm.getText().isEmpty() || rdate.getText().isEmpty()) {
        JOptionPane.showMessageDialog(issuebtn, "Please fill all Fields");
        return;
    }
    
    String dob = rdate.getText().trim();
    if (!isValidDate(dob)) {
        JOptionPane.showMessageDialog(issuebtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
        return;
    }

    String queryCheck = "SELECT * FROM Librarybooks WHERE BookName = ? AND BookStatus='NotAvailable'";
    String queryUpdate = "UPDATE Librarybooks SET StudEnrollNo=?, IssueDate=?, ReturnDate='', BookStatus='NotAvailable' WHERE BookName=?";
    PreparedStatement psCheck = null;
    PreparedStatement psUpdate = null;

    try {
        psCheck = con.prepareStatement(queryCheck);
        psCheck.setString(1, bnm.getText());
        ResultSet rs = psCheck.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(issuebtn, "This Book is Already Issued");
            return;
        } else {
            psUpdate = con.prepareStatement(queryUpdate);
            psUpdate.setString(1, srollno.getText()); 
            psUpdate.setString(2, rdate.getText()); 
            psUpdate.setString(3, bnm.getText()); 

            psUpdate.executeUpdate();

            JOptionPane.showMessageDialog(issuebtn, "Book Issued Successfully");
            upDateDB(); 

            srollno.setText("");
            bnm.setText("");
            banm.setText("");
            rdate.setText("");
            bookimg.setIcon(null);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(issuebtn, "Error issuing book: " + e.getMessage());
    } finally {
        if (psCheck != null) {
            try {
                psCheck.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (psUpdate != null) {
            try {
                psUpdate.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }*/
       
       if (srollno.getText().isEmpty() || bnm.getText().isEmpty() || banm.getText().isEmpty() || rdate.getText().isEmpty()) {
        JOptionPane.showMessageDialog(issuebtn, "Please fill all Fields");
        return;
    }
    
    String dob = rdate.getText().trim();
    if (!isValidDate(dob)) {
        JOptionPane.showMessageDialog(issuebtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
        return;
    }  

    String queryCheck = "SELECT * FROM Librarybooks WHERE BookName = ? AND BookStatus='NotAvailable'";
    String queryUpdate = "UPDATE Librarybooks SET StudEnrollNo=?, IssueDate=?, FacultyNo=NULL, ReturnDate=NULL, BookStatus='NotAvailable' WHERE BookName=?";
    PreparedStatement psCheck = null;
    PreparedStatement psUpdate = null;

    try {
        psCheck = con.prepareStatement(queryCheck);
        psCheck.setString(1, bnm.getText());
        ResultSet rs = psCheck.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(issuebtn, "This Book is Already Issued");
            return;
        } else {
            psUpdate = con.prepareStatement(queryUpdate);
            psUpdate.setString(1, srollno.getText()); 
            psUpdate.setString(2, rdate.getText()); 
            psUpdate.setString(3, bnm.getText()); 

            psUpdate.executeUpdate();

            JOptionPane.showMessageDialog(issuebtn, "Book Issued Successfully");
            upDateDB(); 

            //srollno.setText("");
            bnm.setText("");
            banm.setText("");
            rdate.setText("");
            bookimg.setIcon(null);
        }
    } catch (SQLException e) {
        //e.printStackTrace();
        //JOptionPane.showMessageDialog(issuebtn, "Error issuing book: " + e.getMessage());
        
        JOptionPane.showMessageDialog(issuebtn, "Enter Valid Date....!");
    } finally {
        if (psCheck != null) {
            try {
                psCheck.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (psUpdate != null) {
            try {
                psUpdate.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        
    }//GEN-LAST:event_issuebtnActionPerformed

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
     
        if (srollno.getText().isEmpty() || bnm.getText().isEmpty() || banm.getText().isEmpty() || rdate.getText().isEmpty()) {
        JOptionPane.showMessageDialog(issuebtn, "Please fill all Fields");
        return;
    }
    
    String dob = rdate.getText().trim();
    if (!isValidDate(dob)) {
        JOptionPane.showMessageDialog(issuebtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
        return;
    }
    
    if (!hasIssuedBook(srollno.getText(), bnm.getText())) {
            JOptionPane.showMessageDialog(issuebtn, "You don't have this Book for Return....!");
            return;
        }

    String query = "UPDATE Librarybooks SET StudEnrollNo=?, ReturnDate=?, BookStatus='Available' WHERE BookName=?";
    PreparedStatement ps = null;
    try
    {
        ps = con.prepareStatement(query);
        ps.setString(1, srollno.getText()); 
            ps.setString(2, rdate.getText()); 
            ps.setString(3, bnm.getText()); 
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(issuebtn, "Book Return Successfully...");
        } else {
            JOptionPane.showMessageDialog(issuebtn, "Book is not Return Successfully....!");
        }
        //ps.close();
        //con.close();        
    }
    catch (SQLException e1)
    {
        //e1.printStackTrace();
        JOptionPane.showMessageDialog(issuebtn, "Enter Valid Date....!");
    }
       upDateDB(); 

            //srollno.setText("");
            bnm.setText("");
            banm.setText("");
            rdate.setText("");
            bookimg.setIcon(null);
        
   // String queryCheck = "SELECT * FROM Librarybooks WHERE BookName = ? AND BookStatus = 'NotAvailable'";
   /* String queryUpdate = "UPDATE Librarybooks SET StudEnrollNo=?, IssueDate=?, BookStatus='Available' WHERE BookName=?";
   // PreparedStatement psCheck = null;
    PreparedStatement psUpdate = null;

    try {
        psUpdate = con.prepareStatement(queryUpdate);
        psUpdate.setString(1, bnm.getText());
        ResultSet rs = psUpdate.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(issuebtn, "This Book is Already Issued");
            return;
        } else {
            psUpdate = con.prepareStatement(queryUpdate);
            psUpdate.setString(1, srollno.getText()); 
            psUpdate.setString(2, rdate.getText()); 
            psUpdate.setString(3, bnm.getText()); 

            psUpdate.executeUpdate();

            JOptionPane.showMessageDialog(issuebtn, "Book Issued Successfully");
            upDateDB(); 

            srollno.setText("");
            bnm.setText("");
            banm.setText("");
            rdate.setText("");
            bookimg.setIcon(null);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(issuebtn, "Error issuing book: " + e.getMessage());
    } finally {
        if (psCheck != null) {
            try {
                psCheck.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (psUpdate != null) {
            try {
                psUpdate.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }*/
    }//GEN-LAST:event_returnbtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     
        
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void FacultyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyTableMouseClicked
     
        int r = FacultyTable.getSelectedRow();
    String click = (FacultyTable.getModel().getValueAt(r,0).toString());
    String sql = "SELECT FacultyName, FacultyEducation, FacultyImage FROM facultyregistertb WHERE FacultyName=?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, click);
        ResultSet rss = pst.executeQuery();
        if (rss.next()) {
            String FName = rss.getString("FacultyName");
            String FEducation = rss.getString("FacultyEducation");
            byte[] imgBytes = rss.getBytes("FacultyImage");
            if (imgBytes != null) {
            try (ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes)) 
            {
                BufferedImage img = ImageIO.read(bis);
                 
                ImageIcon icon = new ImageIcon(img.getScaledInstance(FImage.getWidth(), FImage.getHeight(), Image.SCALE_SMOOTH));
                    FImage.setIcon(icon);
            }  /* catch (IOException ex) {
                    Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            } else {
              
                FImage.setIcon(new ImageIcon()); 
            }
         
            Fnm.setText(FName);
            FEdu.setText(FEducation);
        }
    }    catch (SQLException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_FacultyTableMouseClicked

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        
     try {
     
       String query = "SELECT af.TransactionID, af.CollegeAccountNumber, af.YourAccountNumber, af.StudentName, af.EnrollmentNo, af.StudentClass, af.StudDiv, af.TransactionDate, af.MobileNumber, af.EmailId, af.CollegeFeeAmt FROM studentadmission sf, admissionfees af where sf.EnrollmentNo = af.EnrollmentNo and sf.StudentUserName=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, loggedInUsername);
        ResultSet rs = ps.executeQuery();
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("\n\n ***********************************************************\n");
        receiptText.append("                        ADMISSION FEES RECEIPT                         \n");
        receiptText.append(" ***********************************************************\n");
      //  receiptText.append(" *                                                                                           *\n");
        boolean dataFound = false; // Flag to check if any data is found for the logged-in user
        
        while (rs.next()) {
            dataFound = true; // Set the flag to true since data is found for the logged-in user
            
            receiptText.append("       Transaction ID                      :       ").append(rs.getString("TransactionID")).append("\n");
            receiptText.append("       College Account Number    :       ").append(rs.getString("CollegeAccountNumber")).append("\n");
            receiptText.append("       Your Account Number        :       ").append(rs.getString("YourAccountNumber")).append("\n");
            receiptText.append("       Student Name                      :       ").append(rs.getString("StudentName")).append("\n");
            receiptText.append("       Enrollment No                      :       ").append(rs.getString("EnrollmentNo")).append("\n");
            receiptText.append("       Student Class                        :       ").append(rs.getString("StudentClass")).append("\n");
            receiptText.append("       Student Division                   :       ").append(rs.getString("StudDiv")).append("\n");
            receiptText.append("       Transaction Date                  :       ").append(rs.getString("TransactionDate")).append("\n");
            receiptText.append("       Mobile Number                    :       ").append(rs.getString("MobileNumber")).append("\n");
            receiptText.append("       Email ID                                 :       ").append(rs.getString("EmailId")).append("\n");
            receiptText.append("       Total College Fees                :       ").append(rs.getString("CollegeFeeAmt")).append("\n");
        }
        //receiptText.append(" *                                                                                           *\n");
        receiptText.append(" ***********************************************************\n");
        if (!dataFound) {
            receiptText.append("You have Not Paid Your College Fees....!");//.append(loggedInUsername);
        }
        
        CollegeFeeReceipt.setText(receiptText.toString());
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
    }
    
    jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_printbtnActionPerformed

    private void enrollnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrollnoKeyPressed
      
        try {
        String query = "SELECT EnrollmentNo, StudentName, Class, Division, StudentMoNo, StudentEmailId FROM studentadmission WHERE EnrollmentNo = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, enrollno.getText());
        
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            enrollno.setText(rs.getString("EnrollmentNo"));
            studnm.setText(rs.getString("StudentName"));
            studclass.setText(rs.getString("Class"));
            div.setText(rs.getString("Division"));
            mono.setText(rs.getString("StudentMoNo"));
            emailid.setText(rs.getString("StudentEmailId"));
        } else {
            //JOptionPane.showMessageDialog(this, "No student data found.");            
            studnm.setText("");
            studclass.setText("");
            div.setText("");
            mono.setText("");
            emailid.setText("");
        }
    } catch (SQLException e) {
       // e.printStackTrace();
        //JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "No student data found.");
    }
    }//GEN-LAST:event_enrollnoKeyPressed

    private void downloadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadbtnActionPerformed
       
        try
        {
            CollegeFeeReceipt.print();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_downloadbtnActionPerformed

    private void printexamreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printexamreceiptActionPerformed
        
         try {
     
       String query = "SELECT af.TransID, af.CollegeAccountNumber, af.YourAccountNumber, af.StudentName, af.EnrollmentNo, af.StudentClass, af.StudDiv,af.Semester,af.TransDate,af.EmailId,af.ExamFeeAmt FROM studentadmission sf, studexamfees af where sf.EnrollmentNo = af.EnrollmentNo and sf.StudentUserName=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, loggedInUsername);
        ResultSet rs = ps.executeQuery();
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("\n\n ***********************************************************\n");
        receiptText.append("                              EXAM FEES RECEIPT                              \n");
        receiptText.append(" ***********************************************************\n");
       // receiptText.append(" *                                                                                           *\n");
        boolean dataFound = false; // Flag to check if any data is found for the logged-in user
        
        while (rs.next()) {
            dataFound = true; // Set the flag to true since data is found for the logged-in user
            
            receiptText.append("       Transaction ID                      :       ").append(rs.getString("TransID")).append("\n");
            receiptText.append("       College Account Number    :       ").append(rs.getString("CollegeAccountNumber")).append("\n");
            receiptText.append("       Your Account Number        :       ").append(rs.getString("YourAccountNumber")).append("\n");
            receiptText.append("       Student Name                      :       ").append(rs.getString("StudentName")).append("\n");
            receiptText.append("       Enrollment No                      :       ").append(rs.getString("EnrollmentNo")).append("\n");
            receiptText.append("       Student Class                        :       ").append(rs.getString("StudentClass")).append("\n");
            receiptText.append("       Student Division                   :       ").append(rs.getString("StudDiv")).append("\n");
            receiptText.append("       Semester                               :       ").append(rs.getString("Semester")).append("\n");
            receiptText.append("       Transaction Date                  :       ").append(rs.getString("TransDate")).append("\n");
            receiptText.append("       Email ID                                 :       ").append(rs.getString("EmailId")).append("\n");
            receiptText.append("       Total Exam Fees                    :       ").append(rs.getString("ExamFeeAmt")).append("\n");
        }
       // receiptText.append(" *                                                                                           *\n");
        receiptText.append(" ***********************************************************\n");
        if (!dataFound) {
            receiptText.append("You have Not Paid Your Exam Fees....!"); //.append(loggedInUsername);
        }
        
        CollegeFeeReceipt.setText(receiptText.toString());
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
    }
    
    jTabbedPane1.setSelectedIndex(9);
        
    }//GEN-LAST:event_printexamreceiptActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextArea CollegeFeeReceipt;
    private javax.swing.JTextField EID;
    private javax.swing.JTextField FEdu;
    private javax.swing.JLabel FImage;
    private javax.swing.JTable FacultyTable;
    private javax.swing.JTextField Fnm;
    private javax.swing.JTextField banm;
    private javax.swing.JButton bbaFY;
    private javax.swing.JButton bbaSY;
    private javax.swing.JButton bbaTY;
    private javax.swing.JButton bbacaFY;
    private javax.swing.JButton bbacaSY;
    private javax.swing.JButton bbacaTY;
    private javax.swing.JButton bbaibFY;
    private javax.swing.JButton bbaibSY;
    private javax.swing.JButton bbaibTY;
    private javax.swing.JButton bcomFY;
    private javax.swing.JButton bcomSY;
    private javax.swing.JButton bcomTY;
    private javax.swing.JTextField bnm;
    private javax.swing.JLabel bookimg;
    private javax.swing.JTextField clgacc;
    private javax.swing.JTextField clgaccnum;
    private javax.swing.JTextField clgfeeamount;
    private javax.swing.JTextField div;
    private javax.swing.JButton downloadbtn;
    private javax.swing.JTextField emailid;
    private javax.swing.JTextField enrollno;
    private javax.swing.JTextField examfeeamt;
    private javax.swing.JTextField exampaymentdate;
    private javax.swing.JLabel getstudimage1;
    private javax.swing.JButton issuebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mono;
    private javax.swing.JButton paybtn;
    private javax.swing.JButton payexamfeesbtn;
    private javax.swing.JTextField paymentdate;
    private javax.swing.JButton printbtn;
    private javax.swing.JButton printexamreceipt;
    private javax.swing.JTextField rdate;
    private javax.swing.JButton returnbtn;
    private javax.swing.JTextField sclass;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField srollno;
    private javax.swing.JLabel studEid;
    private javax.swing.JTextField studacc;
    private javax.swing.JTextField studaccnum;
    private javax.swing.JTextField studclass;
    private javax.swing.JLabel studclass1;
    private javax.swing.JTextField studdiv;
    private javax.swing.JLabel studdiv1;
    private javax.swing.JLabel studdob;
    private javax.swing.JLabel studmono;
    private javax.swing.JTextField studname;
    private javax.swing.JLabel studname1;
    private javax.swing.JTextField studnm;
    private javax.swing.JTextField studrollno;
    private javax.swing.JLabel studrollno1;
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
    
    private boolean isValidBankAccountNumber(String accountNumber) {
    return accountNumber.matches("\\d{7}");
    }
    
    private boolean isValidDate(String date) {
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        return date.matches(regex);
    }
    
    private boolean hasIssuedBook(String StudID, String bookName) {
    String query = "SELECT * FROM Librarybooks WHERE StudEnrollNo=? AND BookName=?";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, StudID);
        ps.setString(2, bookName);
        ResultSet rs = ps.executeQuery();
        return rs.next(); // If there's a result, it means the book has been issued to the faculty
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Return false in case of an error or no result
    }
    }
}
