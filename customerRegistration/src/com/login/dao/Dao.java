package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.db.Connectdb;
import com.user.Party;

public class Dao {
	
	public boolean check(String uname,String passw) {
		System.out.println("In LoginDao");
		Connection con = Connectdb.connect();
		String sql="Select * from UserLogin where userloginid=? and password=?";
		
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, passw);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	public int getPartyId(Party pt) {
		
		System.out.println("In LoginDao  getpartyid");
		Connection con = Connectdb.connect();
		String sql="Select * from Party where firstName=? and lastName=? and Phone=?";
		
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pt.getFirstName());
			pstmt.setString(2, pt.getLastname());
			pstmt.setString(3, pt.getPhone());
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt(1);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return -1;
	}
	
	public ArrayList<Party> getList(String fname,String lname){
		ArrayList<Party> al = new ArrayList<Party>();
		
		Connection con = Connectdb.connect();
		String sql="select * from Party where Upper(firstName)=Upper(?) or Upper(lastName)=Upper(?)";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {

				Party pt = new Party();
				pt.setFirstName(rs.getString(2));
				pt.setLastname(rs.getString(3));
				pt.setAddress(rs.getString(4));
				pt.setCity(rs.getString(5));
				pt.setZip(rs.getString(6));
				pt.setState(rs.getString(7));
				pt.setCountry(rs.getString(8));
				pt.setPhone(rs.getString(9));
				pt.setPartyId(rs.getInt(1));
				al.add(pt);
				
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;
		
	}

	public ArrayList<Party> getList() {
ArrayList<Party> al = new ArrayList<Party>();
		
		Connection con = Connectdb.connect();
		String sql="select * from Party";
		Statement stmt;
		try {
			stmt = con.createStatement();
			
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {

				Party pt = new Party();
				pt.setFirstName(rs.getString(2));
				pt.setLastname(rs.getString(3));
				pt.setAddress(rs.getString(4));
				pt.setCity(rs.getString(5));
				pt.setZip(rs.getString(6));
				pt.setState(rs.getString(7));
				pt.setCountry(rs.getString(8));
				pt.setPhone(rs.getString(9));
				pt.setPartyId(rs.getInt(1));
				al.add(pt);
				
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;
		
	}
	
	public static Party selectUser(int id) {
		Party pt=null;
		Connection con = Connectdb.connect();
		String sql="Select * from Party where Partyid=?";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String add = rs.getString(4);
				String city = rs.getString(5);
				String zip = rs.getString(6);
				String state = rs.getString(7);
				String country = rs.getString(8);
				String phone = rs.getString(9);
				
				pt = new Party(fname, lname, add, city, zip, state, country, phone);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return pt;
	}
	

}
