package com.csit321.TCGMart.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.TransactionEntity;
import com.csit321.TCGMart.Repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	TransactionRepository transactionrepo;
	
	//Create	
	public TransactionEntity insertTransaction(TransactionEntity transaction) {
		return transactionrepo.save(transaction);
	}
	
	//Read
	public List<TransactionEntity> getAllTransactions(){
		return transactionrepo.findAll();
	}
	
	//Update
	@SuppressWarnings("finally")
	public TransactionEntity updateTransaction(long transactionid, TransactionEntity newTransactionDetails) {
		TransactionEntity transaction = new TransactionEntity();
		try {
			transaction = transactionrepo.findById(transactionid).get();
			
			transaction.setCard(newTransactionDetails.getCard());
			transaction.setTransactionAmount(newTransactionDetails.getTransactionAmount());
			transaction.setTimeStamp(newTransactionDetails.getTimeStamp());
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("Card " + transactionid + " does not exist.");
		}finally {
			return transactionrepo.save(transaction);
		}
	}
	
	//Delete
	public String deleteTransaction(long transactionid) {
		String msg = "";
		if(transactionrepo.findById(transactionid) != null) {
			transactionrepo.deleteById(transactionid);
			msg = "User " + transactionid + " is successfully deleted.";
		}else {
			msg = "User " + transactionid + " does not exist.";
		}
		return msg;
	}
	
	//R - read transactions by buyer id
	public List<TransactionEntity> getTransactionByBuyerUid(int uid){
		try {
			return transactionrepo.findByCardBuyer(uid);
		}catch (Exception e){
			e.printStackTrace();
			throw new NoSuchElementException("Error while fetching transactions by buyer with uid: " + uid, e);
		}
	}
	
	
}
