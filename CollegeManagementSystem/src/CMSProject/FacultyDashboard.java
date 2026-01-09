/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CMSProject;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FacultyDashboard extends javax.swing.JFrame {

    Connection con = null;
    String loggedInUsername;
    public FacultyDashboard(String username) {
        
        this.loggedInUsername = username;
        con = CollegeDatabase.loadConnection();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FacultyPageL.png")));
        
        Color col = new Color(204,204,204);       //(153,153,153);
        getContentPane().setBackground(col);
        
        initComponents();
        upDateDB();
        StudInfo();
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
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
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

     public void StudInfo()
    {
        PreparedStatement pst = null;
        ResultSet rss = null;
        
        try
        {
            pst = con.prepareStatement("select * from studentadmission");
            
            rss = pst.executeQuery();
            
            ResultSetMetaData stdata = rss.getMetaData();
            
            int q = stdata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)StudentTable.getModel();
            RecordTable.setRowCount(0);
            
            while(rss.next())
            {
                Vector columnData = new Vector();
                
                for(int i=1; i<=q; i++)
                {
           
                    columnData.add(rss.getString("EnrollmentNo"));
                    columnData.add(rss.getString("StudentName"));
                    columnData.add(rss.getString("StudentAddress"));                   
                    columnData.add(rss.getString("Class"));
                    columnData.add(rss.getString("Division"));
                    columnData.add(rss.getString("DOB"));
                    columnData.add(rss.getString("StudentMoNo"));
                    columnData.add(rss.getString("StudentEmailId"));
                    //columnData.add(rss.getBytes("BookImage"));                 
                                                
                }
                RecordTable.addRow(columnData);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
   /* public void selectstud()
    {
        try {
            String query = "SELECT EnrollmentNo,StudentName,Class,Divion FROM studentadmission WHERE EnrollmentNo = ?";
            PreparedStatement ps = con.prepareStatement(query);
            //ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                facid.setText(rs.getString("EnrollmentNo"));
                facnm.setText(rs.getString("StudentName"));
                facadd.setText(rs.getString("Class"));
                facgen.setText(rs.getString("Divion"));
                } else {
                JOptionPane.showMessageDialog(this, "No student data found.");
            }

           // rs.close();
           // ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        }
    }*/
     
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
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        library = new javax.swing.JButton();
        studinfo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        facid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        facnm = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        facadd = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        facgen = new javax.swing.JLabel();
        getfacimage1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        facdob = new javax.swing.JLabel();
        facmono = new javax.swing.JLabel();
        facEid = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        facage = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        faceducation = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        facID = new javax.swing.JTextField();
        bookimg1 = new javax.swing.JLabel();
        bnm1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        banm1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        rdate1 = new javax.swing.JTextField();
        issuebtn1 = new javax.swing.JButton();
        returnbtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        StudPhoto = new javax.swing.JLabel();
        StudEN = new javax.swing.JLabel();
        StudNM = new javax.swing.JLabel();
        StudADD = new javax.swing.JLabel();
        StudCL = new javax.swing.JLabel();
        StudeDIV = new javax.swing.JLabel();
        StudDT = new javax.swing.JLabel();
        StudMN = new javax.swing.JLabel();
        StudED = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Sno = new javax.swing.JTextField();
        snm = new javax.swing.JTextField();
        scl = new javax.swing.JTextField();
        sdiv = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        calculatebtn = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        per = new javax.swing.JTextField();
        subbtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SalaryReceipt = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faculty Dashboard Form");
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
        jButton2.setText("Result Making");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText(" Salary Receipt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 40));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Profile");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 40));

        library.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        library.setText("Library");
        library.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryActionPerformed(evt);
            }
        });
        jPanel2.add(library, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 40));

        studinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studinfo.setText("Student Info");
        studinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studinfoActionPerformed(evt);
            }
        });
        jPanel2.add(studinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 510));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Welcome to Modern College........");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Go to Profile");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 180, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setText("Faculty Portal");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 40));

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Name");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        facid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 110, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Teacher ID");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        facnm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 110, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        facadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Gender");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        facgen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 20));

        getfacimage1.setText("jLabel9");
        getfacimage1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        getfacimage1.setMaximumSize(new java.awt.Dimension(45, 18));
        getfacimage1.setMinimumSize(new java.awt.Dimension(45, 18));
        jPanel4.add(getfacimage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 310, 320));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("PROFILE");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No.");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email ID");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Date of Birth");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        facdob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, 20));

        facmono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facmono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, 20));

        facEid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facEid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 210, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Age");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        facage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(facage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 100, 20));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Education");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        faceducation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(faceducation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, 20));

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel34.setText("LIBRARY");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Faculty ID");
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        facID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(facID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, -1));

        bookimg1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel6.add(bookimg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 160, 200));

        bnm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(bnm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Book Name");
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Author Name");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        banm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(banm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 140, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("Issue/Return Date");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        rdate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel6.add(rdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 140, -1));

        issuebtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        issuebtn1.setText("ISSUE");
        issuebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebtn1ActionPerformed(evt);
            }
        });
        jPanel6.add(issuebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 120, 40));

        returnbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnbtn1.setText("RETURN");
        returnbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtn1ActionPerformed(evt);
            }
        });
        jPanel6.add(returnbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 120, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookName", "AuthorName", "BookImage", "BookStatus"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 560, 120));

        jTabbedPane1.addTab("tab3", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EnrollmentNo", "StudentName", "Address", "Class", "Division", "DOB", "MoNo", "Email-ID"
            }
        ));
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(StudentTable);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 750, 110));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("STUDENT DETAILS");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Enrollment No. ");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Student Name");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Address");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Date of Birth");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Class");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Division");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Mobile No.");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Email ID");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        StudPhoto.setText("Student Photo");
        StudPhoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jPanel7.add(StudPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 150, 180));

        StudEN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 180, 20));

        StudNM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 190, 20));

        StudADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 190, 20));

        StudCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 190, 20));

        StudeDIV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudeDIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 180, 20));

        StudDT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 170, 20));

        StudMN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 170, 20));

        StudED.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel7.add(StudED, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 200, 20));

        jTabbedPane1.addTab("tab4", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setText("Making a Result of Student");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Student Enrollment No");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Student Name");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Class");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Division");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Marks of Subject 1");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Marks of Subject 2");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Marks of Subject 3");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        Sno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SnoKeyPressed(evt);
            }
        });
        jPanel8.add(Sno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 180, -1));

        snm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(snm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 180, -1));

        scl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(scl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 180, -1));

        sdiv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(sdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 180, -1));

        m1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 180, -1));

        m2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 180, -1));

        m3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 180, -1));

        calculatebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        calculatebtn.setText("Calculate");
        calculatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebtnActionPerformed(evt);
            }
        });
        jPanel8.add(calculatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 140, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Total Marks");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 120, -1));

        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 180, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Percentage");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 130, -1));

        per.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel8.add(per, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 180, -1));

        subbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subbtn.setText("Submit ");
        subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbtnActionPerformed(evt);
            }
        });
        jPanel8.add(subbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 140, 40));

        jTabbedPane1.addTab("tab5", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SalaryReceipt.setColumns(20);
        SalaryReceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SalaryReceipt.setRows(5);
        jScrollPane3.setViewportView(SalaryReceipt);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 440, 380));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Download Receipt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 180, 40));

        jTabbedPane1.addTab("tab6", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 840, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        /* try {
     
       String query = "SELECT af.TransID,af.FacultyAccountNumber,af.CollegeAccountNumber,af.FacultyName,af.FacultyId,af.FacultyMoNo,af.FacultyEmailId,af.TransDate,af.SalaryAmount FROM facultyregistertb sf, facultysalary af where sf.FacultyId = af.FacultyId and sf.FacultyUserName=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, loggedInUsername);
        ResultSet rs = ps.executeQuery();
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("\n\n ****************************************************************\n");
        receiptText.append(" *                              SALARY RECEIPT                                    *\n");
        receiptText.append(" ****************************************************************\n");
        receiptText.append(" *                                                                                             *\n");
        boolean dataFound = false; // Flag to check if any data is found for the logged-in user
        
        while (rs.next()) {
            dataFound = true; // Set the flag to true since data is found for the logged-in user
            
            receiptText.append(" *    Transaction ID                       :     ").append(rs.getString("TransID")).append("                            *\n");
            receiptText.append(" *    Faculty Account Number      :     ").append(rs.getString("FacultyAccountNumber")).append("                      *\n");
            receiptText.append(" *    College Account Number     :     ").append(rs.getString("CollegeAccountNumber")).append("                      *\n");
            receiptText.append(" *    Faculty Name                        :     ").append(rs.getString("FacultyName")).append("                        *\n");
            receiptText.append(" *    Faculty ID                              :     ").append(rs.getString("FacultyId")).append("                       *\n");
            receiptText.append(" *    Mobile No.                            :     ").append(rs.getString("FacultyMoNo")).append("                *\n");
            receiptText.append(" *    Email ID                                 :     ").append(rs.getString("FacultyEmailId")).append("    *\n");
            receiptText.append(" *    Transaction Date                  :     ").append(rs.getString("TransDate")).append("                  *\n");
            receiptText.append(" *    Total Salary Amount            :     ").append(rs.getString("SalaryAmount")).append("                           *\n");
        }
        receiptText.append(" *                                                                                             *\n");
        receiptText.append(" ****************************************************************\n");
        if (!dataFound) {
            receiptText.append("You haven't Received Your Salary Yet....!"); //.append(loggedInUsername);
        }
        
        SalaryReceipt.setText(receiptText.toString());
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
    }*/
        
         try {
     
       String query = "SELECT af.TransID,af.FacultyAccountNumber,af.CollegeAccountNumber,af.FacultyName,af.FacultyId,af.FacultyMoNo,af.FacultyEmailId,af.TransDate,af.SalaryAmount FROM facultyregistertb sf, facultysalary af where sf.FacultyId = af.FacultyId and sf.FacultyUserName=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, loggedInUsername);
        ResultSet rs = ps.executeQuery();
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("\n\n ****************************************************************\n");
        receiptText.append("                                SALARY RECEIPT                                     \n");
        receiptText.append(" ****************************************************************\n");
      //  receiptText.append(" *                                                                                             *\n");
        boolean dataFound = false; // Flag to check if any data is found for the logged-in user
        
        while (rs.next()) {
            dataFound = true; // Set the flag to true since data is found for the logged-in user
            
            receiptText.append("     Transaction ID                       :     ").append(rs.getString("TransID")).append("\n");
            receiptText.append("     Faculty Account Number      :     ").append(rs.getString("FacultyAccountNumber")).append("\n");
            receiptText.append("     College Account Number     :     ").append(rs.getString("CollegeAccountNumber")).append("\n");
            receiptText.append("     Faculty Name                        :     ").append(rs.getString("FacultyName")).append("\n");
            receiptText.append("     Faculty ID                              :     ").append(rs.getString("FacultyId")).append("\n");
            receiptText.append("     Mobile No.                            :     ").append(rs.getString("FacultyMoNo")).append("\n");
            receiptText.append("     Email ID                                 :     ").append(rs.getString("FacultyEmailId")).append("\n");
            receiptText.append("     Transaction Date                  :     ").append(rs.getString("TransDate")).append("\n");
            receiptText.append("     Total Salary Amount            :     ").append(rs.getString("SalaryAmount")).append("\n");
        }
       // receiptText.append(" *                                                                                             *\n");
        receiptText.append(" ****************************************************************\n");
        if (!dataFound) {
            receiptText.append("You haven't Received Your Salary Yet....!"); //.append(loggedInUsername);
        }
        
        SalaryReceipt.setText(receiptText.toString());
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
    }
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        new FacultyLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String query = "SELECT FacultyId,FacultyName,FacultyAddress,FacultyGender,FacultyDOB,FacultyAge,FacultyEducation,FacultyMoNo,FacultyEmailId,FacultyImage FROM facultyregistertb WHERE FacultyUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                facid.setText(rs.getString("FacultyId"));
                facnm.setText(rs.getString("FacultyName"));
                facadd.setText(rs.getString("FacultyAddress"));
                facgen.setText(rs.getString("FacultyGender"));
                facdob.setText(rs.getString("FacultyDOB"));
                facage.setText(rs.getString("FacultyAge"));
                faceducation.setText(rs.getString("FacultyEducation"));                
                facmono.setText(rs.getString("FacultyMoNo"));
                facEid.setText(rs.getString("FacultyEmailId"));

                /*byte[] imageData = rs.getBytes("FacultyImage");
                if (imageData != null) {
                    ImageIcon image = new ImageIcon(imageData);
                    getfacimage1.setIcon(image);
                } else {
                    getfacimage1.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
                }*/
                
                byte[] imageData = rs.getBytes("FacultyImage");
            if (imageData != null) {
                // Load image from byte array
                try (ByteArrayInputStream bis = new ByteArrayInputStream(imageData)) {
                    BufferedImage img = ImageIO.read(bis);
                    // Scale image to fit the JLabel
                    ImageIcon image = new ImageIcon(img.getScaledInstance(getfacimage1.getWidth(), getfacimage1.getHeight(), Image.SCALE_SMOOTH));
                    getfacimage1.setIcon(image);
                }   catch (IOException ex) {
                        Logger.getLogger(FacultyDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
            } else {
                // Set default image if no image found
                getfacimage1.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
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

    private void libraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryActionPerformed

        try 
        {
            String query = "SELECT FacultyId FROM facultyregistertb WHERE FacultyUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
            
                facID.setText(rs.getString("FacultyId"));
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
        
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_libraryActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            String query = "SELECT FacultyId,FacultyName,FacultyAddress,FacultyGender,FacultyDOB,FacultyAge,FacultyEducation,FacultyMoNo,FacultyEmailId,FacultyImage FROM facultyregistertb WHERE FacultyUserName = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, loggedInUsername);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                facid.setText(rs.getString("FacultyId"));
                facnm.setText(rs.getString("FacultyName"));
                facadd.setText(rs.getString("FacultyAddress"));
                facgen.setText(rs.getString("FacultyGender"));
                facdob.setText(rs.getString("FacultyDOB"));
                facage.setText(rs.getString("FacultyAge"));
                faceducation.setText(rs.getString("FacultyEducation"));                
                facmono.setText(rs.getString("FacultyMoNo"));
                facEid.setText(rs.getString("FacultyEmailId"));

                byte[] imageData = rs.getBytes("FacultyImage");
                if (imageData != null) {
                    ImageIcon image = new ImageIcon(imageData);
                    getfacimage1.setIcon(image);
                } else {
                    getfacimage1.setIcon(new ImageIcon(getClass().getResource("default_image.png")));
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

    private void issuebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebtn1ActionPerformed
       
        if (facID.getText().isEmpty() || bnm1.getText().isEmpty() || banm1.getText().isEmpty() || rdate1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(issuebtn1, "Please fill all Fields");
            return;
        }

        String dob = rdate1.getText().trim();
        if (!isValidDate(dob)) {
            JOptionPane.showMessageDialog(issuebtn1, "Invalid Date of Birth format. Please use YYYY-MM-DD");
            return;
        }

        String queryCheck = "SELECT * FROM Librarybooks WHERE BookName = ? AND BookStatus='NotAvailable'";
        String queryUpdate = "UPDATE Librarybooks SET FacultyNo=?, IssueDate=?, StudEnrollNo=NULL, ReturnDate=NULL, BookStatus='NotAvailable' WHERE BookName=?";
        PreparedStatement psCheck = null;
        PreparedStatement psUpdate = null;

        try {
            psCheck = con.prepareStatement(queryCheck);
            psCheck.setString(1, bnm1.getText());
            ResultSet rs = psCheck.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(issuebtn1, "This Book is Already Issued");
                return;
            } else {
                psUpdate = con.prepareStatement(queryUpdate);
                psUpdate.setString(1, facID.getText());
                psUpdate.setString(2, rdate1.getText());
                psUpdate.setString(3, bnm1.getText());

                psUpdate.executeUpdate();

                JOptionPane.showMessageDialog(issuebtn1, "Book Issued Successfully");
                upDateDB();

                //facID.setText("");
                bnm1.setText("");
                banm1.setText("");
                rdate1.setText("");
                bookimg1.setIcon(null);
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            //JOptionPane.showMessageDialog(issuebtn1, "Error issuing book: " + e.getMessage());
            JOptionPane.showMessageDialog(issuebtn1, "Enter Valid Date....!");
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

    }//GEN-LAST:event_issuebtn1ActionPerformed

    private void returnbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtn1ActionPerformed

        if (facID.getText().isEmpty() || bnm1.getText().isEmpty() || banm1.getText().isEmpty() || rdate1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(issuebtn1, "Please fill all Fields");
            return;
        }

        String dob = rdate1.getText().trim();
        if (!isValidDate(dob)) {
            JOptionPane.showMessageDialog(issuebtn1, "Invalid Date of Birth format. Please use YYYY-MM-DD");
            return;
        }
        
        if (!hasIssuedBook(facID.getText(), bnm1.getText())) {
            JOptionPane.showMessageDialog(issuebtn1, "You don't have this Book for Return....!");
            return;
        }
        
        
       // String query1 = "select * from adminregistertb where AdminUserName=? and AdminId=?";
        String query = "UPDATE Librarybooks SET FacultyNo=?, ReturnDate=?, BookStatus='Available' WHERE BookName=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1, facID.getText());
            ps.setString(2, rdate1.getText());
            ps.setString(3, bnm1.getText());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(issuebtn1, "Book Return Successfully...");
            } else {
                JOptionPane.showMessageDialog(issuebtn1, "Book is not Returned Sucessfully....!");
            }
            //ps.close();
            //con.close();
        }
        catch (SQLException e1)
        {
            //e1.printStackTrace();
            JOptionPane.showMessageDialog(issuebtn1, "Enter Valid Date....!");
        }
        upDateDB();

        //facID.setText("");
        bnm1.setText("");
        banm1.setText("");
        rdate1.setText("");
        bookimg1.setIcon(null);

        
    }//GEN-LAST:event_returnbtn1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int r = jTable2.getSelectedRow();
        String click = (jTable2.getModel().getValueAt(r,0).toString());
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

                        ImageIcon icon = new ImageIcon(img.getScaledInstance(bookimg1.getWidth(), bookimg1.getHeight(), Image.SCALE_SMOOTH));
                        bookimg1.setIcon(icon);
                    }  /* catch (IOException ex) {
                        Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }*/
                } else {

                    bookimg1.setIcon(new ImageIcon());
                }

                bnm1.setText(BName);
                banm1.setText(BAuthor);
            }
        }    catch (SQLException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void studinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studinfoActionPerformed
        
        
        
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_studinfoActionPerformed

    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableMouseClicked
       
        int r = StudentTable.getSelectedRow();
        String click = (StudentTable.getModel().getValueAt(r,0).toString());
        String sql = "SELECT EnrollmentNo, StudentName, StudentAddress, Class, Division, DOB, StudentMoNo, StudentEmailId, StudentImage FROM studentadmission WHERE EnrollmentNo=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, click);
            ResultSet rss = pst.executeQuery();
            if (rss.next()) {
                String StudEnrollno = rss.getString("EnrollmentNo");
                String StudName = rss.getString("StudentName");
                String StudAdd = rss.getString("StudentAddress");
                String StudClass = rss.getString("Class");
                String StudDiv = rss.getString("Division");
                String StudDOB = rss.getString("DOB");
                String StudMono = rss.getString("StudentMoNo");
                String StudEmail = rss.getString("StudentEmailId");
                
                byte[] imgBytes = rss.getBytes("StudentImage");
                if (imgBytes != null) {
                    try (ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes))
                    {
                        BufferedImage img = ImageIO.read(bis);

                        ImageIcon icon = new ImageIcon(img.getScaledInstance(StudPhoto.getWidth(), StudPhoto.getHeight(), Image.SCALE_SMOOTH));
                        StudPhoto.setIcon(icon);
                    }  /* catch (IOException ex) {
                        Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }*/
                } else {

                    StudPhoto.setIcon(new ImageIcon());
                }

                StudEN.setText(StudEnrollno);
                StudNM.setText(StudName);
                StudADD.setText(StudAdd);
                StudCL.setText(StudClass);
                StudeDIV.setText(StudDiv);
                StudDT.setText(StudDOB);
                StudMN.setText(StudMono);
                StudED.setText(StudEmail);
            }
        }    catch (SQLException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_StudentTableMouseClicked

    private void calculatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebtnActionPerformed
          
    float sub1 = Float.parseFloat(m1.getText());
    float sub2 = Float.parseFloat(m2.getText());
    float sub3 = Float.parseFloat(m3.getText());
    
    float totalmarks = sub1 + sub2 + sub3;
    float percentage = totalmarks / 3;
    
    total.setText(String.valueOf(totalmarks));
    per.setText(String.format("%.2f %%", percentage));

    }//GEN-LAST:event_calculatebtnActionPerformed

    private void subbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbtnActionPerformed
             
        try 
        {
        String checkQuery = "SELECT * FROM studentresult WHERE EnrollmentNo = ?";
        PreparedStatement checkPs = con.prepareStatement(checkQuery);
        checkPs.setString(1, Sno.getText());
        ResultSet rs = checkPs.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(subbtn, "The Result of this Student has been Already Declared.");
            return; 
        }

        String insertQuery = "INSERT INTO studentresult (EnrollmentNo, StudName, Class, Division, Subject1, Subject2, Subject3, TotalMarks, TotalPercentage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(insertQuery);
        ps.setString(1, Sno.getText());
        ps.setString(2, snm.getText());
        ps.setString(3, scl.getText());
        ps.setString(4, sdiv.getText());
        ps.setString(5, m1.getText());
        ps.setString(6, m2.getText());
        ps.setString(7, m3.getText());
        ps.setString(8, total.getText());
        ps.setString(9, per.getText());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(subbtn, "Result submitted successfully.");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(subbtn, "An error occurred while submitting the result.");
    }
    
    Sno.setText("");
    snm.setText("");    
    scl.setText("");
    sdiv.setText("");
    m1.setText("");
    m2.setText("");
    m3.setText("");
    total.setText("");
    per.setText("");
      
    }//GEN-LAST:event_subbtnActionPerformed

    private void SnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SnoKeyPressed
           
        try {
        String query = "SELECT EnrollmentNo, StudentName, Class, Division FROM studentadmission WHERE EnrollmentNo = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, Sno.getText());
        
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Sno.setText(rs.getString("EnrollmentNo"));
            snm.setText(rs.getString("StudentName"));
            scl.setText(rs.getString("Class"));
            sdiv.setText(rs.getString("Division"));
        } else {
            //JOptionPane.showMessageDialog(this, "No student data found.");            
            snm.setText("");
            scl.setText("");
            sdiv.setText("");
        }
    } catch (SQLException e) {
       // e.printStackTrace();
        //JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "No student data found.");
    }
        
           /* try {
        String query = "SELECT EnrollmentNo, StudentName, Class, Division, ResultStatus FROM studentadmission WHERE EnrollmentNo = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, Sno.getText());
        
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String resultStatus = rs.getString("ResultStatus");
            //if (resultStatus == null && !resultStatus.isEmpty()) 
            if (resultStatus == "Declare")// && !resultStatus.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "The result for this student has already been declared.");
                return; // No need to populate other fields if result already declared
            }
            
            Sno.setText(rs.getString("EnrollmentNo"));
            snm.setText(rs.getString("StudentName"));
            scl.setText(rs.getString("Class"));
            sdiv.setText(rs.getString("Division"));
        } else {
            snm.setText("");
            scl.setText("");
            sdiv.setText("");
            JOptionPane.showMessageDialog(this, "No student data found.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while fetching student data: " + e.getMessage());
    }*/
        
    }//GEN-LAST:event_SnoKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
        try
        {
            SalaryReceipt.print();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

   
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
            java.util.logging.Logger.getLogger(FacultyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea SalaryReceipt;
    private javax.swing.JTextField Sno;
    private javax.swing.JLabel StudADD;
    private javax.swing.JLabel StudCL;
    private javax.swing.JLabel StudDT;
    private javax.swing.JLabel StudED;
    private javax.swing.JLabel StudEN;
    private javax.swing.JLabel StudMN;
    private javax.swing.JLabel StudNM;
    private javax.swing.JLabel StudPhoto;
    private javax.swing.JLabel StudeDIV;
    private javax.swing.JTable StudentTable;
    private javax.swing.JTextField banm1;
    private javax.swing.JTextField bnm1;
    private javax.swing.JLabel bookimg1;
    private javax.swing.JButton calculatebtn;
    private javax.swing.JLabel facEid;
    private javax.swing.JTextField facID;
    private javax.swing.JLabel facadd;
    private javax.swing.JLabel facage;
    private javax.swing.JLabel facdob;
    private javax.swing.JLabel faceducation;
    private javax.swing.JLabel facgen;
    private javax.swing.JLabel facid;
    private javax.swing.JLabel facmono;
    private javax.swing.JLabel facnm;
    private javax.swing.JLabel getfacimage1;
    private javax.swing.JButton issuebtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton library;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField per;
    private javax.swing.JTextField rdate1;
    private javax.swing.JButton returnbtn1;
    private javax.swing.JTextField scl;
    private javax.swing.JTextField sdiv;
    private javax.swing.JTextField snm;
    private javax.swing.JButton studinfo;
    private javax.swing.JButton subbtn;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    
    private boolean isValidDate(String date) {
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        return date.matches(regex);
    }

    private boolean hasIssuedBook(String facultyID, String bookName) {
    String query = "SELECT * FROM Librarybooks WHERE FacultyNo=? AND BookName=?";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, facultyID);
        ps.setString(2, bookName);
        ResultSet rs = ps.executeQuery();
        return rs.next(); // If there's a result, it means the book has been issued to the faculty
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Return false in case of an error or no result
    }
    }
}
