package com.map.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String city;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private Set<Policy> policy;

}
