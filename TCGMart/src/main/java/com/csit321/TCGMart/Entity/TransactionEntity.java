package com.csit321.TCGMart.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbltransaction")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    
    @Column(name="buyer_uid")
    private int cardBuyer; //uid
    
    @Column(name="seller_uid")
    private int cardSeller;

	@ManyToOne
    @JoinColumn(name = "cardid", referencedColumnName = "cardid")
    private CardEntity card; //card details + owner uid

    private double transactionAmount; 
    private String timeStamp;
        
    
	public TransactionEntity() {
		super();
	}


	public TransactionEntity(Long transactionId, int cardBuyer, int cardSeller, CardEntity card,
			double transactionAmount, String timeStamp) {
		super();
		this.transactionId = transactionId;
		this.cardBuyer = cardBuyer;
		this.cardSeller = cardSeller;
		this.card = card;
		this.transactionAmount = transactionAmount;
		this.timeStamp = timeStamp;
	}


	public CardEntity getCard() {
		return card;
	}

	public void setCard(CardEntity card) {
		this.card = card;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public String getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}


	public Long getTransactionId() {
		return transactionId;
	}


	public int getCardBuyer() {
		return cardBuyer;
	}


	public int getCardSeller() {
		return cardSeller;
	}

	
	
	
	
}

