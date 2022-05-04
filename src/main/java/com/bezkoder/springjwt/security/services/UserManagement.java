package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.UserRepository;




@Service
public class UserManagement implements IUserManagement{
	@Autowired
	private UserRepository myRepository;
	
	
	@Override
	public List<User> getUsers() {
		return myRepository.findAll(Sort.by(Sort.Direction.DESC, "username"));
	}

	

	@Override
	public void updateUser(User user) {
			 myRepository.save(user);
	}

	@Override
	public void deleteUser(String email) {
		User u = myRepository.findByEmail(email).orElse(null);
		myRepository.delete(u);
		
	}

}
