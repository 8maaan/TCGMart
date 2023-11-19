package com.cit321.TCGMart.Response;

public class UserResponseDTO {
    private int uid;
    private String username;
    private String phone_num;
    private String email_address;
    private String mssngr_link;
	public UserResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponseDTO(int uid, String username, String phone_num, String email_address, String mssngr_link) {
		super();
		this.uid = uid;
		this.username = username;
		this.phone_num = phone_num;
		this.email_address = email_address;
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
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getMssngr_link() {
		return mssngr_link;
	}
	public void setMssngr_link(String mssngr_link) {
		this.mssngr_link = mssngr_link;
	}

    
}