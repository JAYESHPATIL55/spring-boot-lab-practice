package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.entity.Profile;
import com.nt.entity.User;
import com.nt.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService service;

	public void addUserWithProfile(User user) {
		service.addUserWithProfile(user);
	}

	public User getUserDetailsWithProfile(Long id) {

		return service.getUserById(id);
	}

	public void changeUser(Long id ,User user) {
		service.changeUser(id, user);
	}

	public void deleteUserById(Long id) {
		service.deleteUserById(id);
	}



}
