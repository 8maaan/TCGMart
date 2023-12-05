package com.csit321.TCGMart.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.UserDashboardEntity;
import com.csit321.TCGMart.Repository.UserDashboardRepository;

@Service
public class UserDashboardService {
	
	@Autowired
	UserDashboardRepository userdashboardrepo;
	
	//C - create or insert userdashboard
	public UserDashboardEntity insertUserDashboard (UserDashboardEntity userdashboard) {
		return userdashboardrepo.save(userdashboard);
	}
	
	//R - read all userdashboard records
	public List<UserDashboardEntity> getAllUserDashboards(){
		return userdashboardrepo.findAll();
	}
	
	//U - update userdashboard records
	@SuppressWarnings("finally")
	public UserDashboardEntity updateUserDashboard(int uid, UserDashboardEntity newUserDashboardDetails) {
		UserDashboardEntity userdashboard = new UserDashboardEntity();
		try {
			userdashboard = userdashboardrepo.findById(uid).get();
			
			userdashboard.setUserEarnings(newUserDashboardDetails.getUserEarnings());
			userdashboard.setUserPurchasesAmount(newUserDashboardDetails.getUserPurchasesAmount());
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("User" + uid + " does not exist.");
		}finally {
			return userdashboardrepo.save(userdashboard);
		}
	}

}
