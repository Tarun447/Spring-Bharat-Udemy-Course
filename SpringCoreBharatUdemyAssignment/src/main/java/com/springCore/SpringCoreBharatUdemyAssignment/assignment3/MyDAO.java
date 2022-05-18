package com.springCore.SpringCoreBharatUdemyAssignment.assignment3;

public class MyDAO {
	
	private String url;
	private String dbUser;
	private String dbPass;
	
	
	public MyDAO(String url, String dbUser, String dbPass) {
		this.url = url;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}


	@Override
	public String toString() {
		return "MyDAO [url=" + url + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}
	
	
	
	

}
