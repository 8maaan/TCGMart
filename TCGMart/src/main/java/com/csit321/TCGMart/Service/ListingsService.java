package com.csit321.TCGMart.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.ListingsEntity;
import com.csit321.TCGMart.Repository.ListingsRepository;

@Service
public class ListingsService {
	@Autowired
	ListingsRepository listingsrepo;
	
	
	//C -Create Listings
	public ListingsEntity insertListings (ListingsEntity listings) {
		return listingsrepo.save(listings);
	}
	
	//R - Read All Listing Records
	public List<ListingsEntity> getAllListings(){
		return listingsrepo.findAll();
	}	
	
}
