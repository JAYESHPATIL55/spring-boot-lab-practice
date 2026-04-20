package com.nt.service;


import com.nt.entity.User;

public interface IUserService {
public void addUserWithProfile(User user);
public User getUserById(Long id);
public void changeUser(Long id ,User user);
public void deleteUserById(Long id);
}
