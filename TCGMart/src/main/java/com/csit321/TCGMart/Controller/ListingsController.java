package com.csit321.TCGMart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csit321.TCGMart.Entity.ListingsEntity;
import com.csit321.TCGMart.Service.ListingsService;

@RestController
@RequestMapping("tcg/listings")
public class ListingsController {
    @Autowired
    ListingsService listingsservice;

    @GetMapping("/status")
    public String printStatus() {
        return "All good.";
    }

    @PostMapping("/insertListing")
    public ListingsEntity insertListing(@RequestBody ListingsEntity listing) {
        return listingsservice.insertListings(listing);
    }

    @GetMapping("/getListings")
    public List<ListingsEntity> getAllListings() {
        return listingsservice.getAllListings();
    }
}

