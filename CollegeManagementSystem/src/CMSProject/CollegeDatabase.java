/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CMSProject;

//import javax.swing.table.DefaultTableModel;

//import com.mysql.jdbc.ResultSetMetaData;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*public class CollegeDatabase {
    public static Connection con = null;
    public static void loadConnection() {
   // public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/collegedata";
        String username = "root";
        String password = "";
        //return DriverManager.getConnection(url, username, password);
        try{
            con = DriverManager.getConnection(url, "root", "mysql@2024MYSQL");
            if(con != null){
            JOptionPane.showMessageDialog(null, "Database has been Successfully Connected...!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in Database Loading...!"+e);
        }
    }
}*/

public class CollegeDatabase 
{
    
       Connection con = null;
	//java.sql.PreparedStatement ps;
	
	public static Connection loadConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedata","root","mysql@2024MYSQL");
			return con;
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
			return null;
		}
	} 
}
