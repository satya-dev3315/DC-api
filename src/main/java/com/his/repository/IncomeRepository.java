package com.his.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.his.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Integer>{
	
	public Income findByAppNumber(Integer appNumber);
}
