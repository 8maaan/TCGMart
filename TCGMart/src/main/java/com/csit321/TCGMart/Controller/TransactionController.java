package com.csit321.TCGMart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csit321.TCGMart.Entity.TransactionEntity;
import com.csit321.TCGMart.Service.TransactionService;

@RestController
@RequestMapping("/tcg/transactions")
@CrossOrigin
public class TransactionController {
	@Autowired
	TransactionService transactionserv;
	
	@GetMapping("/status")
	public String checkStatus() {
		return "API is working!";
	}
	
	@PostMapping("/insertTransaction")
	public TransactionEntity insertTransaction (@RequestBody TransactionEntity transaction) {
		return transactionserv.insertTransaction(transaction);
	}
	
	@GetMapping("/getAllTransactions")
	public List<TransactionEntity> getAllTransactions(){
		return transactionserv.getAllTransactions();
	}
	
	@PutMapping("/updateTransaction")
	public TransactionEntity updateTransaction(@RequestParam long transactionid, @RequestBody TransactionEntity newTransactionDetails) {
		return transactionserv.updateTransaction(transactionid, newTransactionDetails);
	}
	
	@DeleteMapping("/deleteTransaction/{transactionid}")
	public String deleteTransaction (@PathVariable long transactionId) {
		return transactionserv.deleteTransaction(transactionId);
	}
	
	
	
}
