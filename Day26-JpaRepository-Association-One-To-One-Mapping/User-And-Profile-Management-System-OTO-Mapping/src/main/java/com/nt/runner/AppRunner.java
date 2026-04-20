package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.UserController;
import com.nt.entity.Profile;
import com.nt.entity.User;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private UserController controller;

	@Override
	public void run(String... args) throws Exception {

//		controller.addUserWithProfile(new User(2l, "Vesh", "Vesh7013@gmail.com",
//				new Profile(2l, "7847382737", "Badnera, Maharashtra")));

		controller.deleteUserById(2l);
		controller.changeUser(1l,new User(1l,"Jayesh","jayeshpatil8744@gmail.com" ,new Profile(1l, "7385628744", "Jalgaon, Maharashtra")));
		User data = controller.getUserDetailsWithProfile(1l);
	System.out.println(data);
	
	
	}

}
