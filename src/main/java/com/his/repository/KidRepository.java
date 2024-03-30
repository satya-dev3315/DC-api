package com.his.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.his.entity.Kid;

public interface KidRepository extends JpaRepository<Kid, Integer> {
	public List<Kid> findByAppNumber(Integer appNumber);
}
