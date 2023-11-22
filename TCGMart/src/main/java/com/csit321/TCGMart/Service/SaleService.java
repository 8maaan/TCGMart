package com.csit321.TCGMart.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.SaleEntity;
import com.csit321.TCGMart.Repository.SaleRepository;

@Service
public class SaleService {
	@Autowired
	SaleRepository salerepo;
	
	//create
	public SaleEntity insertSale(SaleEntity sale) {
		return salerepo.save(sale);
	}
	
	//read or get all
	public List<SaleEntity> getAllSales(){
		return salerepo.findAll();
	}
	
	//update
	@SuppressWarnings("finally")
	public SaleEntity updateSale(int saleid, SaleEntity newSaleEntity) {
		SaleEntity sale = new SaleEntity();
		
		try {
			sale = salerepo.findById(saleid).get();
			
			sale.setPrice(newSaleEntity.getPrice());
			sale.setCardid(newSaleEntity.getCardid());
			sale.setCardtitle(newSaleEntity.getCardtitle());
			sale.setBuyerid(newSaleEntity.getBuyerid());
			sale.setSellername(newSaleEntity.getSellername());
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("Sale " + saleid + " does not exist.");
		}finally {
			return salerepo.save(sale);
		}
	}
}
