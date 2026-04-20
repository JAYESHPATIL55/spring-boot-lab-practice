package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Profile;
import com.nt.entity.User;
import com.nt.repository.IProfileRepository;
import com.nt.repository.IUserRepository;

@Service
public class UserService implements IUserService {
@Autowired
private IUserRepository repoU;
@Autowired
private IProfileRepository repoP;
	@Override
	public void addUserWithProfile(User user) {
		repoU.save(user);
	}

	@Override
	public User getUserById(Long id) {

		return repoU.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
	}

	@Override
	public void changeUser(Long id,User user) {
		User u1 = getUserById(id);
		
		u1.setId(id);
		u1.setName(user.getName());
		u1.setEmail(user.getEmail());
		
		Profile profile = u1.getProfile();
		profile.setPhone(user.getProfile().getPhone());
		profile.setAddress(user.getProfile().getAddress());
		
		repoU.save(u1);
	}
	@Override
	public void deleteUserById(Long id) {
		repoU.deleteById(id);
	}

}
