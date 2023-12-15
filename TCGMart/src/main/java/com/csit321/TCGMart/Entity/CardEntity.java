package com.csit321.TCGMart.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblcard")
public class CardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardid;
	
	private String cardTitle;
	private String cardImg;
	private String cardCondition;
	private String cardNumRarity;
	private String cardTypeHPStage;
	private float cardPrice;
	private String cardDescription;
	private int uid;
	private String cardStatus;
	private String timestamp;

	public CardEntity() {
		super();
		this.cardStatus = "Active";
	}

	public CardEntity(int cardid, String cardTitle, String cardImg, String cardCondition, String cardNumRarity,
			String cardTypeHPStage, float cardPrice, String cardDescription, int uid, String timestamp) {
		super();
		this.cardid = cardid;
		this.cardTitle = cardTitle;
		this.cardImg = cardImg;
		this.cardCondition = cardCondition;
		this.cardNumRarity = cardNumRarity;
		this.cardTypeHPStage = cardTypeHPStage;
		this.cardPrice = cardPrice;
		this.cardDescription = cardDescription;
		this.uid = uid;
		this.setTimestamp(timestamp);
	}

	public int getCardid() {
		return cardid;
	}

	public void setCardid(int cardid) {
		this.cardid = cardid;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCardImg() {
		return cardImg;
	}

	public void setCardImg(String cardImg) {
		this.cardImg = cardImg;
	}

	public String getCardCondition() {
		return cardCondition;
	}

	public void setCardCondition(String cardCondition) {
		this.cardCondition = cardCondition;
	}

	public String getCardNumRarity() {
		return cardNumRarity;
	}

	public void setCardNumRarity(String cardNumRarity) {
		this.cardNumRarity = cardNumRarity;
	}

	public String getCardTypeHPStage() {
		return cardTypeHPStage;
	}

	public void setCardTypeHPStage(String cardTypeHPStage) {
		this.cardTypeHPStage = cardTypeHPStage;
	}

	public float getCardPrice() {
		return cardPrice;
	}

	public void setCardPrice(float cardPrice) {
		this.cardPrice = cardPrice;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public void setCardDescription(String cardDescription) {
		this.cardDescription = cardDescription;
	}
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	
	
	
	
	
	
	
	

}
