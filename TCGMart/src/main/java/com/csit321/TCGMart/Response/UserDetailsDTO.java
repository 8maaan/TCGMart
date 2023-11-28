package com.csit321.TCGMart.Response;

public class UserDetailsDTO {
    private int uid;
    private String username;
    private String mssngr_link;
	public UserDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetailsDTO(int uid, String username, String phone_num, String email_address, String mssngr_link) {
		super();
		this.uid = uid;
		this.username = username;
		this.mssngr_link = mssngr_link;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getMssngr_link() {
		return mssngr_link;
	}
	public void setMssngr_link(String mssngr_link) {
		this.mssngr_link = mssngr_link;
	}
 
}