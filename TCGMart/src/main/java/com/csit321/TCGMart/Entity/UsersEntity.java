package com.csit321.TCGMart.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tblusers")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	private String username;
	
	private String password;
	
	private String phone_num;
	
	private String email_address;
		
	private String mssngr_link;
	
	private double totalEarnings;
	
	private double totalPurchases;

	public UsersEntity() {
		super();
		this.totalEarnings = 0;
		this.totalPurchases = 0;
	}

	public UsersEntity(int uid, String username, String password, String phone_num, String email_address,
			String mssngr_link) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.phone_num = phone_num;
		this.email_address = email_address;
		this.mssngr_link = mssngr_link;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getUid() {
		return uid;
	}
	
	public double getTotalEarnings() {
		return totalEarnings;
	}

	public void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	public double getTotalPurchases() {
		return totalPurchases;
	}

	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	
	
}
