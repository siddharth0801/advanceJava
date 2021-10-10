package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectdb {
	
	static Connection con = null;
	
	 public static Connection connect() {
	        
	        try 
	        {
	        	final String url = "jdbc:postgresql://localhost/customerRegistration";
	        	final String user = "postgres";
	        	final String password = "sid123";
	           Class.forName("org.postgresql.Driver");
	           con = DriverManager.getConnection(url,user,password);
	        } 
	        catch (Exception e) 
	        {
	        	
	           e.printStackTrace();
	           System.err.println(e.getClass().getName()+": "+e.getMessage());
	           System.exit(0);
	        }
//	        System.out.println("Opened database successfully");
	        return con;
	   }
}
