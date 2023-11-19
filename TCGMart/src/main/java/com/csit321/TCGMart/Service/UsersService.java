package com.csit321.TCGMart.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.UsersEntity;
import com.csit321.TCGMart.Repository.UsersRepository;
import com.csit321.TCGMart.Response.UserResponseDTO;

@Service
public class UsersService {
	@Autowired
	UsersRepository usersrepo;
	
	
	//C - Create or insert student record in tblusers
	public UsersEntity insertUsers (UsersEntity user) {
		return usersrepo.save(user);
	}
	
	//R - Read all records in tblusers
	public List<UsersEntity> getAllUsers(){
		return usersrepo.findAll();
	}
	
	//U - update a user
	@SuppressWarnings("finally")
	public UsersEntity updateUsers(int uid, UsersEntity newUserDetails) {
		UsersEntity user = new UsersEntity();
		try {
			//1.) Search the UID number of the user to be updated
			user = usersrepo.findById(uid).get();
			
			//2.) Update
//			user.setUsername(newUserDetails.getUsername());
			user.setPassword(newUserDetails.getPassword());
			user.setPhone_num(newUserDetails.getPhone_num());
			user.setEmail_address(newUserDetails.getEmail_address());
			user.setMssngr_link(newUserDetails.getMssngr_link());
			
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("User " + uid + " does not exist.");
		}finally {
			return usersrepo.save(user);
		}
	}
	
	//D - delete a user (not really)
	public String deleteUser(int uid) {
		String msg = "";
		if(usersrepo.findById(uid) != null) {
			usersrepo.deleteById(uid);
			msg = "User " + uid + " is successfully deleted.";
		}else {
			msg = "User " + uid + " does not exist.";
		}
		return msg;
	}
	
	//Get/find specific user attributes
//	public UsersEntity getUserById(int uid) {
//	    try {
//	        return usersrepo.findById(uid).orElseThrow(() ->
//	                new NoSuchElementException("User " + uid + " does not exist."));
//	    } catch (NoSuchElementException ex) {
//	        throw new NoSuchElementException("User " + uid + " does not exist.");
//	    }
//	}
	public UserResponseDTO getUserById(int uid) {
        UsersEntity user = usersrepo.findById(uid).orElseThrow(() ->new NoSuchElementException("User " + uid + " does not exist."));
        
        UserResponseDTO userResponse = new UserResponseDTO();
        userResponse.setUid(user.getUid());
        userResponse.setUsername(user.getUsername());
        userResponse.setPhone_num(user.getPhone_num());
        userResponse.setEmail_address(user.getEmail_address());
        userResponse.setMssngr_link(user.getMssngr_link());
        return userResponse;
    }
	

}
