package com.csit321.TCGMart.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblsale")
public class SaleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int saleid;
	
	private float price;
	private int cardid;
	private String cardtitle;
	private int buyerid;
	private String sellername;
	private String cardimg;
	
	public SaleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaleEntity(int saleid, float price, int cardid, String cardtitle, int buyerid, String sellername) {
		super();
		this.saleid = saleid;
		this.price = price;
		this.cardid = cardid;
		this.cardtitle = cardtitle;
		this.buyerid = buyerid;
		this.sellername = sellername;
	}

	public int getSaleid() {
		return saleid;
	}

	public void setSaleid(int saleid) {
		this.saleid = saleid;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCardid() {
		return cardid;
	}

	public void setCardid(int cardid) {
		this.cardid = cardid;
	}

	public String getCardtitle() {
		return cardtitle;
	}

	public void setCardtitle(String cardtitle) {
		this.cardtitle = cardtitle;
	}

	public int getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	
	
}
