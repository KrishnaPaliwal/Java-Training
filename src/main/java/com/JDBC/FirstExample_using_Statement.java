package com.JDBC;

//STEP 1. Import required packages
import java.sql.*;

public class FirstExample_using_Statement {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:3306/test";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "root";
 
 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    //Class.forName("com.mysql.jdbc.Driver").newInstance();
    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = conn.createStatement();
    String sql;
    sql = "SELECT id, name, departmentid FROM Employee";
    ResultSet rs = stmt.executeQuery(sql);

    //STEP 5: Extract data from result set
    while(rs.next()){
       //Retrieve by column name
       int id  = rs.getInt("id");
       String name = rs.getString("name");
       int departmentid = rs.getInt("departmentid");

       //Display values
       System.out.print("ID: " + id);
       System.out.print(", Name: " + name);
       System.out.print(", departmentid: " + departmentid);

    }
    
    int x = stmt.executeUpdate("update Employee set name = 'Paliwal' where id=4");
    int y = stmt.executeUpdate("delete from Employee where Id=103");
    int z = stmt.executeUpdate("insert into Employee values (106, 'Mohan', 5)");
    
    //STEP 6: Clean-up environmentFatma
    rs.close();
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
}//end FirstExample