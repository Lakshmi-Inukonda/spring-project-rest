package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcs.utils.DBUtils;

public class StudentJdbc {

	// Step 1
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/crs";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	
	
	
	public static void main(String[] args) {
	
		// Step 2 
		// Declare the Coneection or prepaidstatement variable here 
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try{
			   
			   // Step 3 Regiater Driver here and create connection 
			   
			   //Class.forName("com.mysql.jdbc.Driver");

			   // Step 4 make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			      conn = DBUtils.getConnection();
			   
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      String sql="insert into student values(?,?,?,?)";
			      //String sql = "UPDATE Employees set age=? WHERE id=?";
			     // String sql1="delete from employee where id=?";
			     // stmt.setInt(1, 101);
			      stmt = conn.prepareStatement(sql);
			   
			      /*
			      // Hard coded data 
			      
			      int studentRegNo=109;
			      String studentName="Va";
			      int sem=2;
			      String branch="eee";
			      //Bind values into the parameters.
			      stmt.setInt(1, studentRegNo);  // This would set age
			      stmt.setString(2,studentName);
			      stmt.setInt(3, sem);
			      stmt.setString(4, branch);
			      stmt.executeUpdate();
			      
			      */
			   
			   
			   
			   // Let us update age of the record with studentRegNo = 102;
			      //int rows = stmt.executeUpdate();
			      //System.out.println("Rows impacted : " + rows );

			      // Let us select all the records and display them.
			      sql = "SELECT studentRegNo, studentName ,sem, branch FROM student";
			      ResultSet rs = stmt.executeQuery(sql);

			      //STEP 5: Extract data from result set
			      while(rs.next()){
			         //Retrieve by column name
			         int sid  = rs.getInt("studentRegNo");
			         String sname = rs.getString("studentName");
			         String sem1 = rs.getString("sem");
			         String branch1 = rs.getString("branch");

			         //Display values
			         System.out.print("ID: " + sid);
			         System.out.print(", Age: " + sname);
			         System.out.print(", First: " + sem1);
			         System.out.println(", Last: " + branch1);
			      }
			      //STEP 6: Clean-up environment
			     // rs.close();
			      stmt.close();
			      conn.close();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
			}//end main
			   

		

	}