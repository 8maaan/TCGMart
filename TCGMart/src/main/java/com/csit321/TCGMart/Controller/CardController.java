package com.csit321.TCGMart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csit321.TCGMart.Entity.CardEntity;
import com.csit321.TCGMart.Service.CardService;

@RestController
@RequestMapping("/tcg/card")
@CrossOrigin
public class CardController {
	@Autowired
	CardService cardservice;
	
	@GetMapping("/status")
	public String checkStatus() {
		return "API's working!";
	}
	
	//C - create a card record
	@PostMapping("/insertCard")
	public CardEntity insertCard(@RequestBody CardEntity card) {
		return cardservice.insertCard(card);
	}
	
	//R - read all card records
	@GetMapping("/getAllCards")
	public List<CardEntity> getAllCards(){
		return cardservice.getAllCards();
	}
	
	//U - update a card
	@PutMapping("/updateCard")
	public CardEntity updateCard(@RequestParam int cardid, @RequestBody CardEntity newCardEntityDetails) {
		return cardservice.updateCard(cardid, newCardEntityDetails);
	}
	
	//D - delete or remove a card
	@PutMapping("/removecard")
	public String removeCard(@RequestParam int cardid, @RequestParam String reason) {
		return cardservice.removeCard(cardid, reason);
	}
	
	//Additional Services
	
	//Fetch card by status === active
	@GetMapping("/getAllActiveCards")
	public List<CardEntity> getAllActiveCards(){
		return cardservice.getAllActiveCards();
	}
	
	//Fetch card by id	
	@GetMapping("/getCardByCardId")
	public CardEntity getCardByCardId(@RequestParam int cardid) {
		return cardservice.getCardByCardId(cardid);
	}
	
	
}
