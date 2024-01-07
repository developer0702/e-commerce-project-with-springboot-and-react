package com.ecommerce.services;

import com.ecommerce.entities.User;
import com.ecommerce.exceptions.UserException;

public interface UserService {

	public User findUserById(Long userId) throws UserException;

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	
	

}
