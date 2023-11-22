package com.csit321.TCGMart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csit321.TCGMart.Entity.SaleEntity;
import com.csit321.TCGMart.Service.SaleService;

@RestController
@RequestMapping("/tcg/sale")
public class SaleController {
	@Autowired
	SaleService saleservice;
	
	@GetMapping("/status")
	public String checkstatus() {
		return "Sale controller working :)";
	}
	
	//create
	@PostMapping("/insertSale")
	public SaleEntity insertSale(@RequestBody SaleEntity sale) {
		return saleservice.insertSale(sale);
	}
	
	//read or get all
	@GetMapping("/getAllSales")
	public List<SaleEntity> getAllSales(){
		return saleservice.getAllSales();
	}
	
	//update
	@PutMapping("/updateSale")
	public SaleEntity updateSale(@RequestParam int saleid, @RequestBody SaleEntity newSaleDetails) {
		return saleservice.updateSale(saleid, newSaleDetails);
	}
}
