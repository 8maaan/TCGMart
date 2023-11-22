package com.csit321.TCGMart.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.ListHistoryEntity;
import com.csit321.TCGMart.Repository.ListHistoryRepository;

@Service
public class ListHistoryService {
	@Autowired
	ListHistoryRepository listhistoryrepo;
	
	//C
	public ListHistoryEntity insertListingHistory(ListHistoryEntity listHistory) {
		return listhistoryrepo.save(listHistory);
	}
	
	//R
	public List<ListHistoryEntity> getAllListHistory(){
		return listhistoryrepo.findAll();
	}
	
	//U
	@SuppressWarnings("finally")
	public ListHistoryEntity updateListHistory(int listid, ListHistoryEntity newListHistory) {
		ListHistoryEntity listHistory = new ListHistoryEntity();
		try {
			listHistory = listhistoryrepo.findById(listid).get();
			
			listHistory.setCardInfo(newListHistory.getCardInfo());
			listHistory.setDate(newListHistory.getDate());
			listHistory.setTime(newListHistory.getTime());
			listHistory.setStatus(newListHistory.getStatus());
		}catch(NoSuchElementException ex) {
	        throw new NoSuchElementException("Listing " + listid + " does not exist!");
	    }finally {
	        return listhistoryrepo.save(listHistory);
	    }
	}
	
	//R by uid
	public List<ListHistoryEntity> getListHistoryByUid(int uid) {
	    List<ListHistoryEntity> result = listhistoryrepo.findByUid(uid);
	    if (!result.isEmpty()) {
	        return result;
	    } else {
	        throw new RuntimeException("User with uid " + uid + " does not exist");
	    }
	}

}
