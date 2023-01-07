package com.map.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.map.dao.PolicyDao;
import com.map.dao.UserDao;
import com.map.entity.User;
import com.map.exception.User_Already_Present;
import com.map.exception.User_Not_Found;
import com.map.service.UserService;

@Service
public class User_Impl implements UserService {
	
	@Autowired
	private UserDao ud;
	
	@Autowired
	private PolicyDao pd;

	@Override
	public User saveUser(User user) {
		User dbUser=null;
		 dbUser=ud.findByUserId(user.getUserId());
		if(dbUser==null) {
			dbUser=ud.save(dbUser);
		}
		else {
			throw new User_Already_Present();
		}
		return dbUser; 
	}

	@Override
	public User getUser(Integer id) {
	User dbUser=ud.findByUserId(id);
		if(dbUser!=null) {
		
		}
		else {
			throw new User_Not_Found();
		}
		return dbUser;
	}
	
	

}
