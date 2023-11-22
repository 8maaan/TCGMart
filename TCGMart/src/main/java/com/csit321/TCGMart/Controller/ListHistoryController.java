package com.csit321.TCGMart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csit321.TCGMart.Entity.ListHistoryEntity;
import com.csit321.TCGMart.Service.ListHistoryService;

@RestController
@RequestMapping("tcg/listhistory")
@CrossOrigin
public class ListHistoryController {
	@Autowired
	ListHistoryService listhistoryservice;
	
	@GetMapping("/status")
	public String checkStatus() {
	    return "All good.";
	}
	
	@PostMapping("/insertListHistory")
	public ListHistoryEntity insertListHistory(@RequestBody ListHistoryEntity listHistory) {
		return listhistoryservice.insertListingHistory(listHistory);
	}
	
	@GetMapping("/getListHistoryByUid")
	public List<ListHistoryEntity> getListHistoryByUid(int uid){
		return listhistoryservice.getListHistoryByUid(uid);
	}
}
