package com.user;

public class UserLogin {
	
	
	private String userName;
	private String password;
	private int partyId;
	
	public UserLogin() {
		super();
		
	}

	public UserLogin(String userName, String password, int partyId) {
		super();
		this.userName = userName;
		this.password = password;
		this.partyId = partyId;
	}
	
	@Override
	public String toString() {
		return "UserLogin [userName=" + userName + ", password=" + password + ", partyId=" + partyId + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	

}
