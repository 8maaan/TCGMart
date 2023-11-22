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

import com.csit321.TCGMart.Entity.UsersEntity;
import com.csit321.TCGMart.Response.UserResponseDTO;
import com.csit321.TCGMart.Service.UsersService;

@RestController
@RequestMapping("tcg/users")
@CrossOrigin
public class UsersController {
	@Autowired
	UsersService usersservice;
	
	@GetMapping("/status")
	public String printStatus() {
		return "Working";
	}
		
	//C - Create a user record
	@PostMapping("/insertUser")
	public UsersEntity insertStudent(@RequestBody UsersEntity user) {
		return usersservice.insertUsers(user);
	}
	
	// R - Read all records in tblusers
	@GetMapping("/getAllUsers")
	public List<UsersEntity> getAllUsers(){
		return usersservice.getAllUsers();
	}
	
	// U - Update a user record
	@PutMapping("/updateUser")
	public UsersEntity updateUsers(@RequestParam int uid, @RequestBody UsersEntity newUserDetails) {
		return usersservice.updateUsers(uid, newUserDetails);
	}
	
	// D - Delete a user record
	@DeleteMapping("/deleteUser/{uid}")
	public String deleteUser (@PathVariable int uid) {
		return usersservice.deleteUser(uid);
	}
	
	//Get user by id
	@GetMapping("/getUserById")
	public UserResponseDTO getUserById(@RequestParam int uid) {
		return usersservice.getUserById(uid);
	}
}
