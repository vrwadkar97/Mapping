package com.map.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.User;

public interface UserDao extends JpaRepository<User	, Integer> {
	
	public User findByUserId(Integer userId);

}
