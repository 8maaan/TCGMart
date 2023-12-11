package com.csit321.TCGMart.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321.TCGMart.Entity.UsersEntity;
import com.csit321.TCGMart.Repository.UsersRepository;
import com.csit321.TCGMart.Response.UserDetailsDTO;

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
			user.setUsername(newUserDetails.getUsername());
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
	
	/* Additional Methods/Functions */
	
	//Get user details w/o password
	public UserDetailsDTO getUserById(int uid) {
        UsersEntity user = usersrepo.findById(uid).orElseThrow(() ->new NoSuchElementException("User " + uid + " does not exist."));
        
        UserDetailsDTO userResponse = new UserDetailsDTO();
        userResponse.setUid(user.getUid());
        userResponse.setUsername(user.getUsername());
        userResponse.setMssngr_link(user.getMssngr_link());
        return userResponse;
    }
	
	
	//For User Profile Page
	public UsersEntity getUserProfileInfo(int uid) {
		UsersEntity user = usersrepo.findById(uid).orElseThrow(() ->new NoSuchElementException("User " + uid + " does not exist."));
		return user;
	}
	
	//Check if username already exists
	public boolean checkUsernameValidity(String username) {
		 UsersEntity user = usersrepo.findByUsername(username);
	    return user != null;
	}
	
	//Check if log-in credentials are valid
	public int checkLoginCredentials(String username, String password) {
	    UsersEntity user = usersrepo.findByUsername(username);
	    if (user != null && user.getPassword().equals(password)) {
	        return user.getUid();
	    } else {
	        return -1;
	    }
	}
	
	@SuppressWarnings("finally")
	public UsersEntity updateUserDashboard(int uid, String type, double amount) {
		UsersEntity user = new UsersEntity();
		try {
			user = usersrepo.findById(uid).get();
			if(type.equals("Purchase")) {
				double current = user.getTotalPurchases();
				user.setTotalPurchases(current + amount);
				
			}else if(type.equals("Earning")) {
				double current = user.getTotalEarnings();
				user.setTotalEarnings(current + amount);
			}
			
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("User " + uid + " does not exist.");
		}finally {
			return usersrepo.save(user);
		}
	}
	
	
	
	
	
	
//	public boolean checkLoginCredentials(String username, String password) {
//	    try {
//	        UsersEntity user = usersrepo.findByUsername(username);
//	        if (user != null) {
//	            return user.getUsername().equals(username) && user.getPassword().equals(password);
//	        } else {
//	            return false;
//	        }
//	    } catch (NoSuchElementException ex) {
//	        throw new NoSuchElementException("User " + username + " does not exist.");
//	    }
//	}
	

}
