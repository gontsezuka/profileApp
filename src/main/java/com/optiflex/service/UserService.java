package com.optiflex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optiflex.model.UserModel;
import com.optiflex.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<UserModel> getAllUsers()
	{
		return userRepository.findAll();
	}

	
	public Optional<UserModel> findUserById(UserModel userModel)
	{
		return userRepository.findById(userModel.getId());
	}
	
	
	public UserModel findUserByID(Integer userId)
	{
		return userRepository.findUserById(userId);
	}
	
	
	public UserModel saveUser(UserModel userModel)
	{
		return userRepository.save(userModel);
	}
	
	
	
	public void deleteUser(UserModel userModel)
	{
		userRepository.deleteById(userModel.getId());
	}
	
	
	/**
	 * ADDED 23 FEB 2020
	 */
	public boolean isUserAvailable(UserModel userModel)
	{
		/*
		 * HERE WE ARE CHECKING IF THE USER EXISTS IN OUR SYSTEM
		 */
		Optional<UserModel> user = findUserById(userModel);
		
		if(!user.isPresent())
		{
			return false;
		}

		return true;
	}
	
	
	
	public UserModel findUserByEmail(String email)
	{
		/*
		 * Finds the user in database given an email address.
		 */
		return userRepository.findUserByEmail(email);
	}
	
	
	
	public boolean checkIfValuesArePresent(String password, String email)
	{
		/**
		 * 
		 * This method checks if values are present for login.
		 */
		if(!password.isEmpty()&& !email.isEmpty())
		{
			return true;
		}
		return false;
	}
	
	
	public boolean checkIfPasswordIsCorrect(UserModel userModel)
	{
		/**
		 * 
		 * This method check if user password is correct
		 */
		for(UserModel user: userRepository.findAll())
		{
			if(user.getPass().equals(userModel.getPass()))
			{
				return true;
			}
		}	
		return false;
	}
	
	
	
	public List<UserModel> findAllUsersByGroupId(Integer groupId)
	{
		return userRepository.findAllUsersByGroupId(groupId);
	}
}

