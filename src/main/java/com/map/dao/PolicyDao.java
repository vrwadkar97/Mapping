package com.map.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Policy;

public interface PolicyDao extends JpaRepository<Policy, Integer> {

}
