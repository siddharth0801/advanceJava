package com.db;
import java.sql.*;

import com.user.Party;
import com.user.UserLogin;



public class Crud {
	
	
	public static boolean insert(Party pt) {
		
		Connection con=Connectdb.connect();
		
		String q="insert into Party(firstName,lastName,address,city,zip,state,country,phone) values(?,?,?,?,?,?,?,?)";
		
		boolean flag=false;
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(q);
			pstmt.setString(1,pt.getFirstName());
			pstmt.setString(2,pt.getLastname());
			pstmt.setString(3,pt.getAddress());
			pstmt.setString(4,pt.getCity());
			pstmt.setString(5,pt.getZip());
			pstmt.setString(6,pt.getState());
			pstmt.setString(7,pt.getCountry());
			pstmt.setString(8,pt.getPhone());
			
			pstmt.executeUpdate();
			flag=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}
	public static boolean delete(int id) {
		Connection con=Connectdb.connect();
		String q="delete from Party where partyId=?";
		
		boolean flag=false;
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(q);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			flag=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	public static void printTable() {
		Connection con=Connectdb.connect();
		String q="select * from Party";
		
		try {
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(q);
			ResultSetMetaData rsmd = rs.getMetaData();
	        
//	        PrintColumnTypes.printColTypes(rsmd);
	        
	        System.out.println("");
	    
	        int numberOfColumns = rsmd.getColumnCount();
	    
	        for (int i = 1; i <= numberOfColumns; i++) {
	          if (i > 1) System.out.print(",  ");
	          String columnName = rsmd.getColumnName(i);
	          System.out.print(columnName);
	        }
	        System.out.println("");
	    
	        while (rs.next()) {
	          for (int i = 1; i <= numberOfColumns; i++) {
	            if (i > 1) System.out.print(",  ");
	            String columnValue = rs.getString(i);
	            System.out.print(columnValue);
	          }
	          System.out.println("");  
	        }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static boolean insertUserLogin(UserLogin ul) {
		
		Connection con=Connectdb.connect();
		
		String q="insert into UserLogin values(?,?,?)";
		
		boolean flag=false;
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(q);
			pstmt.setString(1,ul.getUserName());
			pstmt.setString(2,ul.getPassword());
			pstmt.setInt(3,ul.getPartyId());
			
			pstmt.executeUpdate();
			flag=true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
		
	}
	public static boolean updateParty(Party pt) {
		boolean flag = false;
		Connection con=Connectdb.connect();
		String q="update Party set firstName=?,lastName=?,Address=?,City=?,Zip=?,State=?,Country=?,Phone=? where PartyId=?";
		try 
		{
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt = con.prepareStatement(q);
			pstmt.setString(1,pt.getFirstName());
			pstmt.setString(2,pt.getLastname());
			pstmt.setString(3,pt.getAddress());
			pstmt.setString(4,pt.getCity());
			pstmt.setString(5,pt.getZip());
			pstmt.setString(6,pt.getState());
			pstmt.setString(7,pt.getCountry());
			pstmt.setString(8,pt.getPhone());
			pstmt.setInt(9, pt.getPartyId());
			flag = pstmt.executeUpdate() > 0;
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		return flag;
	}
	
	

}
