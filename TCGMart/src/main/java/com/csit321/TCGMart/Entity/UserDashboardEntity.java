package com.csit321.TCGMart.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdashboard")
public class UserDashboardEntity {
	@Id
	private int uid;
	private float userEarnings;
	private float userPurchasesAmount;
	
	public UserDashboardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDashboardEntity(int uid, float userEarnings, float userPurchasesAmount) {
		super();
		this.uid = uid;
		this.userEarnings = userEarnings;
		this.userPurchasesAmount = userPurchasesAmount;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public float getUserEarnings() {
		return userEarnings;
	}

	public void setUserEarnings(float userEarnings) {
		this.userEarnings = userEarnings;
	}

	public float getUserPurchasesAmount() {
		return userPurchasesAmount;
	}

	public void setUserPurchasesAmount(float userPurchasesAmount) {
		this.userPurchasesAmount = userPurchasesAmount;
	}
	
	

}
