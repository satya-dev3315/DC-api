package com.his.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_id")
	private Integer educationId;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "graduation_year")
	private Integer graduationYear;
	
	@Column(name = "highest_degree")
	private String highestDegree;
	
	@Column(name = "app_number")
	private Integer appNumber;
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "updated_date")
	private LocalDate updatedDate;
	
}
