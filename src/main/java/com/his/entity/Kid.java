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
public class Kid {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kid_id")
	private Integer kidId;
	
	@Column(name = "kid_name")
	private String kidName;
	
	private LocalDate dob;
	
	private Long ssn;
	
	@Column(name = "app_number")
	private Integer appNumber;   
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "updated_date")
	private LocalDate updatedDate;
	

}
