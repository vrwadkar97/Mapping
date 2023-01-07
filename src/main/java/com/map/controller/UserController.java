package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.map.entity.User;
import com.map.service_impl.User_Impl;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	private User_Impl impl;
	
	@PostMapping("/add")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		impl.saveUser(user);
		return new ResponseEntity<>("User added Successfully...", HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getUser(@RequestParam Integer id){
		return new ResponseEntity<>(null, null);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllUser(){
		return new ResponseEntity<>(null, null);
	}
	
	@PatchMapping("/update")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		return new ResponseEntity<>(null, null);
	}
	

}
