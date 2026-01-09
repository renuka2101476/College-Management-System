/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CMSProject;

import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminDashboard extends javax.swing.JFrame {

    Connection con = null;
    String loggedInUsername;
    String path2;
    
    PreparedStatement pst = null;
    ResultSet rss = null;
    //int q, i, id, deleteItem;
    
    public AdminDashboard(String usernam) {
        
        this.loggedInUsername = usernam;
        con = CollegeDatabase.loadConnection();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AdminPageL.png")));
        
        Color col = new Color(204,204,204);       //(153,153,153);
        getContentPane().setBackground(col);
        
        initComponents();
        upDateDB();
        StudDetails();
        FacultyDetails();
        
    }
    
    public void upDateDB()
    {
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
                    columnData.add(rss.getString("BookId"));
                    columnData.add(rss.getString("BookName"));
                    columnData.add(rss.getString("Author"));
                    columnData.add(rss.getBytes("BookImage"));
                    
                   //JLabel image
                    //columnData.add(rss.getString("BookImage"));
                     
                    /*byte[] imageData;
                     imageData = columnData.add(rss.getByte("AdminImage"));
                if (imageData != null) {
                    ImageIcon image = new ImageIcon(imageData);
                    getimage.setIcon(image);
                } else {
                    getimage.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
                }*/
                    
                    columnData.add(rss.getString("StudEnrollNo"));
                    columnData.add(rss.getString("FacultyNo"));
                    columnData.add(rss.getString("IssueDate"));
                    columnData.add(rss.getString("ReturnDate"));
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
    
    public void StudDetails()
    {
        try
        {
            pst = con.prepareStatement("select * from studentadmission");
            
            rss = pst.executeQuery();
            
            ResultSetMetaData stdata = rss.getMetaData();
            
            int q = stdata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)StudentDetails.getModel();
            RecordTable.setRowCount(0);
            
            while(rss.next())
            {
                Vector columnData = new Vector();
                
                for(int i=1; i<=q; i++)
                {
                    columnData.add(rss.getString("EnrollmentNo"));
                    columnData.add(rss.getString("StudentName"));
                    columnData.add(rss.getString("StudentAddress"));
                    columnData.add(rss.getString("StudentGender"));                 
                    columnData.add(rss.getString("DOB"));
                    columnData.add(rss.getString("StudentAge"));
                    columnData.add(rss.getString("Class"));
                    columnData.add(rss.getString("Division"));
                    columnData.add(rss.getString("StudentMoNo"));
                    columnData.add(rss.getString("StudentEmailId"));
                    columnData.add(rss.getString("StudentUserName")); 
                    columnData.add(rss.getBytes("StudentImage"));  
                }
                RecordTable.addRow(columnData);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     public void FacultyDetails()
    {
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
                    columnData.add(rss.getString("FacultyId"));
                    columnData.add(rss.getString("FacultyName"));
                    columnData.add(rss.getString("FacultyAddress"));
                    columnData.add(rss.getString("FacultyGender"));                 
                    columnData.add(rss.getString("FacultyDOB"));
                    columnData.add(rss.getString("FacultyAge"));
                    columnData.add(rss.getString("FacultyEducation"));
                    columnData.add(rss.getString("FacultyMoNo"));
                    columnData.add(rss.getString("FacultyEmailId"));
                    columnData.add(rss.getString("FacultyUserName")); 
                    columnData.add(rss.getBytes("FacultyImage"));  
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        adminnm = new javax.swing.JLabel();
        admingender = new javax.swing.JLabel();
        adminage = new javax.swing.JLabel();
        adminemail = new javax.swing.JLabel();
        adminmono = new javax.swing.JLabel();
        getimage = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        adminaddress = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        adminID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rollno = new javax.swing.JTextField();
        studusername = new javax.swing.JTextField();
        studdiv = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        facid = new javax.swing.JTextField();
        facuser = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bauthor = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        bimage = new javax.swing.JLabel();
        addbook = new javax.swing.JButton();
        updatebook = new javax.swing.JButton();
        SelectBookImage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        declarebtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentDetails = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        sroll = new javax.swing.JTextField();
        snm = new javax.swing.JTextField();
        saddd = new javax.swing.JTextField();
        sgen = new javax.swing.JTextField();
        sdb = new javax.swing.JTextField();
        sagee = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        suser = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        seid = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        snmo = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        sdivvv = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        scls = new javax.swing.JTextField();
        sphoto = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FacultyTable = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        facphoto = new javax.swing.JLabel();
        fur = new javax.swing.JTextField();
        fid = new javax.swing.JTextField();
        fnm = new javax.swing.JTextField();
        fad = new javax.swing.JTextField();
        fgen = new javax.swing.JTextField();
        fdb = new javax.swing.JTextField();
        fag = new javax.swing.JTextField();
        fed = new javax.swing.JTextField();
        fmn = new javax.swing.JTextField();
        feid = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        salaryamt = new javax.swing.JTextField();
        facc = new javax.swing.JTextField();
        cacc = new javax.swing.JTextField();
        facultyid = new javax.swing.JTextField();
        facname = new javax.swing.JTextField();
        tdt = new javax.swing.JTextField();
        facmo = new javax.swing.JTextField();
        faceid = new javax.swing.JTextField();
        salpaybtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard Form");
        setBackground(new java.awt.Color(255, 255, 255));
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 110));

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
        jButton2.setText("Result Declaration");
        jButton2.setActionCommand("Result Declare");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Sudent Usern & Div");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 40));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Faculty UserName");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 40));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Library Management");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 40));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("Student Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 40));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("Faculty Details");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 40));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setText("Pay Faculty Salary");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 520));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Welcome to Modern College.....");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Admin Portal");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Go to Profile");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 150, 40));

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Admin Name");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Gender");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 100, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Age");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Email ID");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Mobile Number");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        adminnm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminnm.setText("a");
        jPanel5.add(adminnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 130, 40));

        admingender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        admingender.setText("a");
        jPanel5.add(admingender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 130, 30));

        adminage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminage.setText("a");
        jPanel5.add(adminage, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 130, 40));

        adminemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminemail.setText("a");
        jPanel5.add(adminemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 130, 30));

        adminmono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminmono.setText("a");
        jPanel5.add(adminmono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 130, 40));

        getimage.setText("jLabel23");
        getimage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        jPanel5.add(getimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 310, 320));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setText("Profile");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 110, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Address");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        adminaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminaddress.setText("a");
        jPanel5.add(adminaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 130, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Admin ID");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        adminID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminID.setText("a");
        jPanel5.add(adminID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 130, 40));

        jTabbedPane1.addTab("tab2", jPanel5);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Enter Student Enrollment");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Enter Username");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Enter Division");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 190, 30));

        studusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 190, 30));

        studdiv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(studdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 190, 30));

        submitbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel4.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 140, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Division Allocation to Student");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Faculty ID");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, 30));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel6.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 140, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Faculty Username");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        facid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(facid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 150, 30));

        facuser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(facuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 150, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("Give the UserName to Facutly");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jTabbedPane1.addTab("tab4", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setText("Library Management");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Book Name");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Book Author");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 30));

        bauthor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(bauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 170, 30));

        bname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, 30));

        bimage.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel7.add(bimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 140, 170));

        addbook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbook.setText("Add");
        addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookActionPerformed(evt);
            }
        });
        jPanel7.add(addbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, 40));

        updatebook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatebook.setText("Update");
        updatebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebookActionPerformed(evt);
            }
        });
        jPanel7.add(updatebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 130, 40));

        SelectBookImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SelectBookImage.setText("Browse Image");
        SelectBookImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBookImageActionPerformed(evt);
            }
        });
        jPanel7.add(SelectBookImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 130, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BookID", "BookName", "Author", "BookImage", "StudRollNo", "FacultyNo", "IssueDate", "ReturnDate", "BookStatus"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 710, 150));

        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("Result Declaration");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 330, 40));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCheckBox1.setText("Declare");
        jPanel8.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        declarebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        declarebtn.setText("Declare Result");
        declarebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declarebtnActionPerformed(evt);
            }
        });
        jPanel8.add(declarebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 160, 40));

        jTabbedPane1.addTab("tab6", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EnrollmentNo", "StudName", "Address", "Gender", "DOB", "Age", "Class", "Division", "MoNo", "EmailID", "UserName", "Photo"
            }
        ));
        StudentDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(StudentDetails);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 790, 120));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setText("Student Details");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Enrollment No.");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Student Name");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Address");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Gender");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Date of Birth");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Age");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        sroll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(sroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 140, -1));

        snm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(snm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 140, -1));

        saddd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(saddd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, -1));

        sgen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgenActionPerformed(evt);
            }
        });
        jPanel9.add(sgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 140, -1));

        sdb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(sdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 140, -1));

        sagee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(sagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 140, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("UserName");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        suser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(suser, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 140, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Email ID");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        seid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(seid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 140, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Mobile No.");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        snmo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        snmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snmoActionPerformed(evt);
            }
        });
        jPanel9.add(snmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 140, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Division");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        sdivvv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sdivvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdivvvActionPerformed(evt);
            }
        });
        jPanel9.add(sdivvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 140, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Class");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 100, -1));

        scls.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(scls, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 140, -1));

        sphoto.setText("jLabel38");
        sphoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel9.add(sphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 140, 150));

        jTabbedPane1.addTab("tab7", jPanel9);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FacultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "FacultyID", "FacultyName", "Address", "Gender", "DOB", "Age", "Education", "MobileNo", "Email ID", "UserName", "Photo"
            }
        ));
        FacultyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacultyTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(FacultyTable);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 790, 120));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel38.setText("Faculty Details");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Facutly ID");
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Faculty Name");
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Address");
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Gender");
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Date of Birth");
        jPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Age");
        jPanel10.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Education");
        jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        facphoto.setText("jLabel46");
        facphoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 204)));
        jPanel10.add(facphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 140, 150));

        fur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fur, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 140, -1));

        fid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 140, -1));

        fnm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 140, -1));

        fad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 140, -1));

        fgen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 140, -1));

        fdb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 140, -1));

        fag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fag, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 140, -1));

        fed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 140, -1));

        fmn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(fmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 140, -1));

        feid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel10.add(feid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 140, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Mobile No.");
        jPanel10.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Email ID");
        jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("UserName");
        jPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jTabbedPane1.addTab("tab8", jPanel10);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel46.setText("Pay the Faculty Salary.....");
        jPanel11.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Faculty Account Number");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("College Account Number");
        jPanel11.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Faculty ID");
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("Faculty Name");
        jPanel11.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Mobile No");
        jPanel11.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Email ID");
        jPanel11.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Date");
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Salary Amount");
        jPanel11.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        salaryamt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel11.add(salaryamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 190, 30));

        facc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel11.add(facc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 190, 30));

        cacc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cacc.setText("7878787");
        jPanel11.add(cacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 190, 30));

        facultyid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        facultyid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facultyidKeyPressed(evt);
            }
        });
        jPanel11.add(facultyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 190, 30));

        facname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel11.add(facname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 190, 30));

        tdt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel11.add(tdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 190, 30));

        facmo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel11.add(facmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 190, 30));

        faceid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel11.add(faceid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 190, 30));

        salpaybtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salpaybtn.setText("Pay");
        salpaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salpaybtnActionPerformed(evt);
            }
        });
        jPanel11.add(salpaybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 200, 50));

        jTabbedPane1.addTab("tab9", jPanel11);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 840, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        if (rollno.getText().isEmpty() || studusername.getText().isEmpty() || studdiv.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(submitbtn, "Please fill all Fields");
            return;
        }
        
        String query = "UPDATE StudentAdmission SET StudentUsername=?, Division=? WHERE EnrollmentNo=?";
    PreparedStatement ps = null;
    try
    {
        ps = con.prepareStatement(query);
        ps.setString(1, studusername.getText());
        ps.setString(2, studdiv.getText());
        ps.setString(3, rollno.getText());
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(submitbtn, "Division & Username Successfully Allocated...");
        } else {
            JOptionPane.showMessageDialog(submitbtn, "No records found for EnrollmentNo: " + rollno.getText());
        }
        ps.close();
        con.close();        
    }
    catch (SQLException e1)
    {
        e1.printStackTrace();
    }
      rollno.setText("");
      studusername.setText("");
      studdiv.setText("");
    }//GEN-LAST:event_submitbtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            String query = "SELECT AdminId, AdminName, AdminAddress, AdminGender, AdminAge, AdminMoNo, AdminEmailId, AdminImage FROM adminregistertb WHERE AdminUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                adminID.setText(rs.getString("AdminId"));
                adminnm.setText(rs.getString("AdminName"));
                adminaddress.setText(rs.getString("AdminAddress"));
                admingender.setText(rs.getString("AdminGender"));
                adminage.setText(rs.getString("AdminAge"));                
                adminmono.setText(rs.getString("AdminMoNo"));
                adminemail.setText(rs.getString("AdminEmailId"));
                //studmono.setText(rs.getString("StudentMoNo"));
                
                /*byte[] imageData = rs.getBytes("AdminImage");
                if (imageData != null) {
                    ImageIcon image = new ImageIcon(imageData);
                    getimage.setIcon(image);
                } else {
                    getimage.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
                }*/
                
                byte[] imageData = rs.getBytes("AdminImage");
            if (imageData != null) {
                // Load image from byte array
                try (ByteArrayInputStream bis = new ByteArrayInputStream(imageData)) {
                    BufferedImage img = ImageIO.read(bis);
                    // Scale image to fit the JLabel
                    ImageIcon image = new ImageIcon(img.getScaledInstance(getimage.getWidth(), getimage.getHeight(), Image.SCALE_SMOOTH));
                    getimage.setIcon(image);
                }   catch (IOException ex) {
                        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
            } else {
                // Set default image if no image found
                getimage.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            String query = "SELECT AdminId, AdminName, AdminAddress, AdminGender, AdminAge, AdminMoNo, AdminEmailId, AdminImage FROM adminregistertb WHERE AdminUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                adminID.setText(rs.getString("AdminId"));
                adminnm.setText(rs.getString("AdminName"));
                adminaddress.setText(rs.getString("AdminAddress"));
                admingender.setText(rs.getString("AdminGender"));
                adminage.setText(rs.getString("AdminAge"));                
                adminmono.setText(rs.getString("AdminMoNo"));
                adminemail.setText(rs.getString("AdminEmailId"));
                //studmono.setText(rs.getString("StudentMoNo"));
                
                byte[] imageData = rs.getBytes("AdminImage");
                if (imageData != null) {
                    ImageIcon image = new ImageIcon(imageData);
                    getimage.setIcon(image);
                } else {
                    getimage.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
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
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        if (facid.getText().isEmpty() || facuser.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(submit, "Please fill all Fields");
            return;
        }
        
        String query = "UPDATE facultyregistertb SET FacultyUsername=? WHERE FacultyId=?";
    PreparedStatement ps = null;
    try
    {
        ps = con.prepareStatement(query);        
        ps.setString(1, facuser.getText());
        ps.setString(2, facid.getText());
        //ps.setString(3, rollno.getText());
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(submit, "Username Successfully Allocated...");
        } else {
            JOptionPane.showMessageDialog(submit, "No records found for Faculty ID : " + facid.getText());
        }
        ps.close();
        con.close();        
    }
    catch (SQLException e1)
    {
        e1.printStackTrace();
    }
      facid.setText("");
      facuser.setText("");
      //studdiv.setText("");
    }//GEN-LAST:event_submitActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
        //upDateDB();
       /* try
        {
            Statement st = con.createStatement();
            String sql = "select * from Librarybooks";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                String ID = String.valueOf(rs.getInt("BookId"));
                String BName = rs.getString("BookName");
                String BAuthor = rs.getString("Author");
                String BImage = rs.getString("BookImage");
                String StudID = String.valueOf(rs.getInt("StudEnrollNo"));
                String TeacherID = String.valueOf(rs.getInt("FacultyNo"));
                String DIssue = rs.getString("IssueDate");
                String DReturn = rs.getString("ReturnDate");
                String BStatus = rs.getString("BookStatus");
                
                String tbData[] = {ID,BName,BAuthor,BImage,StudID,TeacherID,DIssue,DReturn,BStatus};
                DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
                
                tbModel.addRow(tbData);
                
            }
            
           //con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_jButton8ActionPerformed

    private void addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookActionPerformed
        
        if (bname.getText().isEmpty() || bauthor.getText().isEmpty() || path2 == null)
        {
            JOptionPane.showMessageDialog(addbook, "Please fill all Fields");
            return;
        }
        
        String query = "insert into Librarybooks (BookName,Author,BookImage) values(?,?,?)";
        PreparedStatement ps = null;
        try 
        {
            //pst = con.prepareStatement("insert into Librarybooks (BookName,Author,BookImage) values(?,?,?)");
            ps = con.prepareStatement(query);
            ps.setString(1, bname.getText());
            //pst.setString(1, bname.getText());
	    ps.setString(2, bauthor.getText());
           // pst.setString(2, bauthor.getText());
            InputStream is = new FileInputStream(new File(path2));
            ps.setBlob(3, is);
            //pst.setBlob(3, is);
            
            ps.executeUpdate();
           //pst.executeUpdate();
           
            JOptionPane.showMessageDialog(addbook, "Book Added Successufully...");
            //ps.close();
            //con.close();
           upDateDB();
        }
        catch (SQLException e1) 
        {
            e1.printStackTrace();
        } 
        catch (FileNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        bname.setText("");
        bauthor.setText("");
        bimage.setIcon(null);
    }//GEN-LAST:event_addbookActionPerformed

    private void SelectBookImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBookImageActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        try{
            BufferedImage br = ImageIO.read(new File(path));
            Image img;
            img = br.getScaledInstance(130, 172, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            bimage.setIcon(icon);
            path2 = path;
        }
        catch(IOException e)
        {
            Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, e);
          
        }
    }//GEN-LAST:event_SelectBookImageActionPerformed

    private void updatebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebookActionPerformed
        
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        if (bname.getText().isEmpty() || bauthor.getText().isEmpty() || path2 == null)
        {
            JOptionPane.showMessageDialog(addbook, "Please fill all Fields");
            return;
        }
        
        String query = "update Librarybooks set Author=?, BookImage=? where BookName=?";
        PreparedStatement ps = null;
        try 
        {
            ps = con.prepareStatement(query);
           // ps.setString(1, bname.getText());
	    ps.setString(1, bauthor.getText());
            InputStream is = new FileInputStream(new File(path2));
            ps.setBlob(2, is);
            ps.setString(3, bname.getText());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(updatebook, "Book Updated Successufully...");
            //ps.close();
            //con.close();
            upDateDB();
        }
        catch (SQLException e1) 
        {
            e1.printStackTrace();
        } 
        catch (FileNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        bname.setText("");
        bauthor.setText("");
        bimage.setIcon(null);
        
    }//GEN-LAST:event_updatebookActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
      int r = jTable1.getSelectedRow();
    String click = (jTable1.getModel().getValueAt(r,0).toString());
    String sql = "SELECT BookName, Author, BookImage FROM Librarybooks WHERE BookId=?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, click);
        ResultSet rss = pst.executeQuery();
        if (rss.next()) {
            String BName = rss.getString("BookName");
            String BAuthor = rss.getString("Author");
            byte[] imgBytes = rss.getBytes("BookImage");
            if (imgBytes != null) {
              
                /*String path = "D:\\ProjectImages\\Books\\" + BName + ".jpg";
                try (FileOutputStream fos = new FileOutputStream(path)) {
                    fos.write(imgBytes);
                }
            
                ImageIcon icon = new ImageIcon(path);
                bimage.setIcon(icon);*/
                
            try (ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes)) 
            {
                BufferedImage img = ImageIO.read(bis);
                 
                ImageIcon icon = new ImageIcon(img.getScaledInstance(bimage.getWidth(), bimage.getHeight(), Image.SCALE_SMOOTH));
                    bimage.setIcon(icon);
            }
            } else {
              
                bimage.setIcon(new ImageIcon()); 
            }
         
            bname.setText(BName);
            bauthor.setText(BAuthor);
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void declarebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declarebtnActionPerformed
        
    if (!jCheckBox1.isSelected())
        {
            JOptionPane.showMessageDialog(declarebtn, "Please Select Field");
            return;
        }
    
    String query = "UPDATE studentresult SET ResultStatus=?";
    PreparedStatement ps = null;
    try
    {
        ps = con.prepareStatement(query);        
        ps.setString(1, jCheckBox1.getText());
       
        ps.executeUpdate();
    
            JOptionPane.showMessageDialog(declarebtn, "Result Declared Successfully...");
        
        //ps.close();
        //con.close();        
    }
    catch (SQLException e1)
    {
        //e1.printStackTrace();
        JOptionPane.showMessageDialog(declarebtn, "Result Not Declared Successfully...!");
    }
      jCheckBox1.setSelected(false);
    }//GEN-LAST:event_declarebtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void StudentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentDetailsMouseClicked
        
        int r = StudentDetails.getSelectedRow();
    String click = (StudentDetails.getModel().getValueAt(r,0).toString());
    String sql = "SELECT EnrollmentNo,StudentName,StudentAddress,StudentGender,DOB,StudentAge,Class,Division,StudentMoNo,StudentEmailId,StudentUserName,StudentImage FROM studentadmission WHERE EnrollmentNo=?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, click);
        ResultSet rss = pst.executeQuery();
        if (rss.next()) {
            String erollno = rss.getString("EnrollmentNo");
            String sname = rss.getString("StudentName");
            String sadd = rss.getString("StudentAddress");
            String sgender = rss.getString("StudentGender");
            String sdob = rss.getString("DOB");
            String sage = rss.getString("StudentAge");
            String sclass = rss.getString("Class");
            String sdivision = rss.getString("Division");
            String smono = rss.getString("StudentMoNo");
            String semail = rss.getString("StudentEmailId");
            String eusername = rss.getString("StudentUserName");
            
            byte[] imgBytes = rss.getBytes("StudentImage");
            if (imgBytes != null) {
               
            try (ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes)) 
            {
                BufferedImage img = ImageIO.read(bis);
                 
                ImageIcon icon = new ImageIcon(img.getScaledInstance(sphoto.getWidth(), sphoto.getHeight(), Image.SCALE_SMOOTH));
                    sphoto.setIcon(icon);
            }
            } else {
              
                sphoto.setIcon(new ImageIcon()); 
            }
         
            sroll.setText(erollno);
            snm.setText(sname);
            saddd.setText(sadd);
            sgen.setText(sgender);
            sdb.setText(sdob);
            sagee.setText(sage);
            scls.setText(sclass);
            sdivvv.setText(sdivision);
            snmo.setText(smono);
            seid.setText(semail);
            suser.setText(eusername);
                      
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_StudentDetailsMouseClicked

    private void sgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgenActionPerformed

    private void snmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snmoActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void sdivvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdivvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdivvvActionPerformed

    private void FacultyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyTableMouseClicked
        
       int r = FacultyTable.getSelectedRow();
    String click = (FacultyTable.getModel().getValueAt(r,0).toString());
    String sql = "SELECT FacultyId,FacultyName,FacultyAddress,FacultyGender,FacultyDOB,FacultyAge,FacultyEducation,FacultyMoNo,FacultyEmailId,FacultyUserName,FacultyImage FROM facultyregistertb WHERE FacultyId=?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, click);
        ResultSet rss = pst.executeQuery();
        if (rss.next()) {
            String facid = rss.getString("FacultyId");
            String facnm = rss.getString("FacultyName");
            String facadd = rss.getString("FacultyAddress");
            String facgen = rss.getString("FacultyGender");
            String facdob = rss.getString("FacultyDOB");
            String facage = rss.getString("FacultyAge");
           // String sclass = rss.getString("FacultyAge");
            String facedu = rss.getString("FacultyEducation");
            String facmono = rss.getString("FacultyMoNo");
            String facemail = rss.getString("FacultyEmailId");
            String facuser = rss.getString("FacultyUserName");
            
            byte[] imgBytes = rss.getBytes("FacultyImage");
            if (imgBytes != null) {
               
            try (ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes)) 
            {
                BufferedImage img = ImageIO.read(bis);
                 
                ImageIcon icon = new ImageIcon(img.getScaledInstance(facphoto.getWidth(), facphoto.getHeight(), Image.SCALE_SMOOTH));
                    facphoto.setIcon(icon);
            }
            } else {
              
                facphoto.setIcon(new ImageIcon()); 
            }
         
            fid.setText(facid);
            fnm.setText(facnm);
            fad.setText(facadd);
            fgen.setText(facgen);
            fdb.setText(facdob);
            fag.setText(facage);
            fed.setText(facedu);
           // fmn.setText(sdivision);
            fmn.setText(facmono);
            feid.setText(facemail);
            fur.setText(facuser);
                      
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_FacultyTableMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void facultyidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyidKeyPressed
      
        try {
        String query = "SELECT  FacultyId, FacultyName, FacultyMoNo, FacultyEmailId FROM facultyregistertb WHERE FacultyId = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, facultyid.getText());
        
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            facultyid.setText(rs.getString("FacultyId"));
          facname.setText(rs.getString("FacultyName"));
            facmo.setText(rs.getString("FacultyMoNo"));
            faceid.setText(rs.getString("FacultyEmailId"));
        } else {
            //JOptionPane.showMessageDialog(this, "No student data found.");            
            facname.setText("");
            facmo.setText("");
            faceid.setText("");
        }
    } catch (SQLException e) {
       // e.printStackTrace();
        //JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "No student data found.");
    }
    }//GEN-LAST:event_facultyidKeyPressed

    private void salpaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salpaybtnActionPerformed
       
         if (facc.getText().isEmpty() || cacc.getText().isEmpty() ||           
            facultyid.getText().isEmpty() || facname.getText().isEmpty() ||
            tdt.getText().isEmpty() || facmo.getText().isEmpty() || 
            faceid.getText().isEmpty() || salaryamt.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(salpaybtn, "Please fill all Fields");
            return;
        }

       String clgAccountNumber = cacc.getText().trim();
       if (!isValidBankAccountNumber(clgAccountNumber))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid College Bank Account Number");
            return; // Exit method if college account number is invalid
        }

        String studAccountNumber = facc.getText().trim();
        if (!isValidBankAccountNumber(studAccountNumber))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Student Bank Account Number");
            return; // Exit method if student account number is invalid
        }
        
        String dob = tdt.getText().trim();
        if (!isValidDate(dob)) 
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Date of Birth format. Please use YYYY-MM-DD");
            return;
        }
        
        String mobileNumber = facmo.getText().trim();
        if (!isValidMobileNumber(mobileNumber))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Mobile Number");
            return; // Exit method if mobile number is invalid
        }

        String email = faceid.getText().trim();
        if (!isValidEmail(email))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Email Address");
            return; // Exit method if email is invalid
        }
        
        String query = "insert into facultysalary (FacultyAccountNumber,CollegeAccountNumber,FacultyName,FacultyId,FacultyMoNo,FacultyEmailId,TransDate,SalaryAmount) values(?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1, facc.getText());
            ps.setString(2, cacc.getText());
            ps.setString(3, facname.getText());
            ps.setString(4, facultyid.getText());        
          //  ps.setString(4, facname.getText());
           ps.setString(5, facmo.getText());
           ps.setString(6, faceid.getText());
            ps.setString(7, tdt.getText());
            //ps.setString(6, facmo.getText());
           // ps.setString(7, faceid.getText());
            ps.setString(8, salaryamt.getText());
            //ps.setString(9, emailid.getText());
            //ps.setString(10, div.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(salpaybtn, "Payment Successfully...");
          //  ps.close();
           // con.close();
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog(salpaybtn, "You Have Aleardy Paid the Salary of this Faculty....!");
            //e1.printStackTrace();
        }

        facc.setText("");
       // cacc.setText("");
        facultyid.setText("");
        facname.setText("");
        tdt.setText("");
        facmo.setText("");
        faceid.setText("");
        salaryamt.setText("");
        //emailid.setText("");
        //div.setText("");
      /* try {
        if (facultyAccountNumber.getText().isEmpty() || collegeAccountNumber.getText().isEmpty() ||           
            facultyId.getText().isEmpty() || facultyName.getText().isEmpty() ||
            transactionDate.getText().isEmpty() || facultyMobileNumber.getText().isEmpty() || 
            facultyEmail.getText().isEmpty() || salaryAmount.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(salpaybtn, "Please fill all fields.");
            return;
        }

        String clgAccountNumber = collegeAccountNumber.getText().trim();
        if (!isValidBankAccountNumber(clgAccountNumber))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid College Bank Account Number");
            return;
        }

        String facAccountNumber = facultyAccountNumber.getText().trim();
        if (!isValidBankAccountNumber(facAccountNumber))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Faculty Bank Account Number");
            return;
        }
        
        String dob = transactionDate.getText().trim();
        if (!isValidDate(dob)) 
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Transaction Date format. Please use YYYY-MM-DD");
            return;
        }
        
        String mobileNumber = facultyMobileNumber.getText().trim();
        if (!isValidMobileNumber(mobileNumber))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Mobile Number");
            return;
        }

        String email = facultyEmail.getText().trim();
        if (!isValidEmail(email))
        {
            JOptionPane.showMessageDialog(salpaybtn, "Invalid Email Address");
            return;
        }
        
        String query = "INSERT INTO facultysalary (FacultyAccountNumber, CollegeAccountNumber, FacultyName, FacultyId, FacultyMoNo, FacultyEmailId, TransDate, SakaryAmount) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, facAccountNumber);
            ps.setString(2, clgAccountNumber);
            ps.setString(3, facultyId.getText());        
            ps.setString(4, facultyName.getText());
            ps.setString(5, transactionDate.getText());
            ps.setString(6, facultyMobileNumber.getText());
            ps.setString(7, facultyEmail.getText());
            ps.setString(8, salaryAmount.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(salpaybtn, "Payment Successfully Recorded.");
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(salpaybtn, "Faculty salary payment already recorded.");
            e1.printStackTrace();
        }

        // Clear all text fields after successful payment
        facultyAccountNumber.setText("");
        collegeAccountNumber.setText("");
        facultyId.setText("");
        facultyName.setText("");
        transactionDate.setText("");
        facultyMobileNumber.setText("");
        facultyEmail.setText("");
        salaryAmount.setText("");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(salpaybtn, "Error occurred while processing payment: " + e.getMessage());
    }*/

    }//GEN-LAST:event_salpaybtnActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FacultyTable;
    private javax.swing.JButton SelectBookImage;
    private javax.swing.JTable StudentDetails;
    private javax.swing.JButton addbook;
    private javax.swing.JLabel adminID;
    private javax.swing.JLabel adminaddress;
    private javax.swing.JLabel adminage;
    private javax.swing.JLabel adminemail;
    private javax.swing.JLabel admingender;
    private javax.swing.JLabel adminmono;
    private javax.swing.JLabel adminnm;
    private javax.swing.JTextField bauthor;
    private javax.swing.JLabel bimage;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField cacc;
    private javax.swing.JButton declarebtn;
    private javax.swing.JTextField facc;
    private javax.swing.JTextField faceid;
    private javax.swing.JTextField facid;
    private javax.swing.JTextField facmo;
    private javax.swing.JTextField facname;
    private javax.swing.JLabel facphoto;
    private javax.swing.JTextField facultyid;
    private javax.swing.JTextField facuser;
    private javax.swing.JTextField fad;
    private javax.swing.JTextField fag;
    private javax.swing.JTextField fdb;
    private javax.swing.JTextField fed;
    private javax.swing.JTextField feid;
    private javax.swing.JTextField fgen;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fmn;
    private javax.swing.JTextField fnm;
    private javax.swing.JTextField fur;
    private javax.swing.JLabel getimage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JTextField rollno;
    private javax.swing.JTextField saddd;
    private javax.swing.JTextField sagee;
    private javax.swing.JTextField salaryamt;
    private javax.swing.JButton salpaybtn;
    private javax.swing.JTextField scls;
    private javax.swing.JTextField sdb;
    private javax.swing.JTextField sdivvv;
    private javax.swing.JTextField seid;
    private javax.swing.JTextField sgen;
    private javax.swing.JTextField snm;
    private javax.swing.JTextField snmo;
    private javax.swing.JLabel sphoto;
    private javax.swing.JTextField sroll;
    private javax.swing.JTextField studdiv;
    private javax.swing.JTextField studusername;
    private javax.swing.JButton submit;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField suser;
    private javax.swing.JTextField tdt;
    private javax.swing.JButton updatebook;
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
    
    private boolean isValidBankAccountNumber(String accountNumber) {
    return accountNumber.matches("\\d{7}");
    }
    
}
