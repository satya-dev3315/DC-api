package com.his.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.his.entity.Education;

public interface EducationRepository  extends JpaRepository<Education, Integer>{
	
	public Education findByAppNumber(Integer appNumber);

}
