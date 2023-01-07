package com.map.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Policy {
	
	@Id
	private Integer policyId;
	private String policyName;
	private String category;
	private Long premium;
	private Integer tenure;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

}
