package com.map.service;

import com.map.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User getUser(Integer id);

}
