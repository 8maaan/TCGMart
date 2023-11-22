package com.csit321.TCGMart.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbluser_listinghistory")
public class ListHistoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int listinghistoryid;
	//	UserID 	
    private int uid; 	
	private String cardInfo;
	private String date;
	private String time;
	private String status;
	
	public ListHistoryEntity() {
		super();
	}
	
	public ListHistoryEntity(int listinghistoryid, int uid, String cardInfo, String date, String time,
			String status) {
		super();
		this.listinghistoryid = listinghistoryid;
		this.uid = uid;
		this.cardInfo = cardInfo;
		this.date = date;
		this.time = time;
		this.status = status;
	}
	public String getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getListinghistoryid() {
		return listinghistoryid;
	}
	public int getUid() {
		return uid;
	}
	
	

}
