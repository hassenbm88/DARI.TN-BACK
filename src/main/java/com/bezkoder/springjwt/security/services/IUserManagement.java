package com.bezkoder.springjwt.security.services;

import java.util.List;

import com.bezkoder.springjwt.models.User;


public interface IUserManagement {
	public List<User> getUsers();
	
	public void updateUser(User user);
	void deleteUser(String email);
}
