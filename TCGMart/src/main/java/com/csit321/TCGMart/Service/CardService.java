package com.csit321.TCGMart.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.CardEntity;
import com.csit321.TCGMart.Repository.CardRepository;

@Service
public class CardService {
	@Autowired
	CardRepository cardrepo;
	
	//C - create or insert card
	public CardEntity insertCard (CardEntity card) {
		return cardrepo.save(card);
	}
	
	//R - read all card records
	public List<CardEntity> getAllCards(){
		return cardrepo.findAll();
	}
	
	//U - update card records
	@SuppressWarnings("finally")
	public CardEntity updateCard(int cardid, CardEntity newCardEntityDetails) {
		CardEntity card = new CardEntity();
		try {
			card = cardrepo.findById(cardid).get();
			
			card.setCardTitle(newCardEntityDetails.getCardTitle());
			card.setCardImg(newCardEntityDetails.getCardImg());
			card.setCardCondition(newCardEntityDetails.getCardCondition());
			card.setCardNumRarity(newCardEntityDetails.getCardNumRarity());
			card.setCardTypeHPStage(newCardEntityDetails.getCardTypeHPStage());
			card.setCardPrice(newCardEntityDetails.getCardPrice());
			card.setCardDescription(newCardEntityDetails.getCardDescription());
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("Card " + cardid + " does not exist.");
		}finally {
			return cardrepo.save(card);
		}
	}

}