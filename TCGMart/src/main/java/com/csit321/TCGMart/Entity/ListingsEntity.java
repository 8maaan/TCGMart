package com.csit321.TCGMart.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbllistings")
public class ListingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int listingId;

    @ManyToOne
    @JoinColumn(name = "card_id", referencedColumnName = "cardid")
    private CardEntity card;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "uid")
    private UsersEntity owner;
    
    public ListingsEntity() {
		super();
	}
    
    public ListingsEntity(int listingId, CardEntity card, UsersEntity owner) {
		super();
		this.listingId = listingId;
		this.card = card;
		this.owner = owner;
	}

	public int getListingId() {
		return listingId;
	}

	public void setListingId(int listingId) {
		this.listingId = listingId;
	}

	public CardEntity getCard() {
		return card;
	}

	public void setCard(CardEntity card) {
		this.card = card;
	}

	public UsersEntity getOwner() {
		return owner;
	}

	public void setOwner(UsersEntity owner) {
		this.owner = owner;
	}
    
}
