package com.csit321.TCGMart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csit321.TCGMart.Entity.UserDashboardEntity;
import com.csit321.TCGMart.Service.UserDashboardService;

@RestController
@RequestMapping("/tcg/userdashboard")
@CrossOrigin
public class UserDashboardController {
	@Autowired
	UserDashboardService userdashboardservice;
	
	@GetMapping("/status")
	public String checkStatus() {
		return "User Dashboard API is working.";
	}
	
	
	//C - create a userdashboard
	@PostMapping("/insertUserDashboard")
	public UserDashboardEntity insertUserDashboard(@RequestBody UserDashboardEntity userdashboard) {
		return userdashboardservice.insertUserDashboard(userdashboard);
	}
	
	//R - read all userdashboard records
	@GetMapping("/getAllUserDashboards")
	public List<UserDashboardEntity> getAllUserDashboards(){
		return userdashboardservice.getAllUserDashboards();
	}
	
	//U - update userdashboard
	public UserDashboardEntity updateUserDashboard(@RequestParam int uid, @RequestBody UserDashboardEntity newUserDashboardDetails) {
		return userdashboardservice.updateUserDashboard(uid, newUserDashboardDetails);
	}
}
