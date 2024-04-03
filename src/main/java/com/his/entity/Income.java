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
public class Income {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "income_id")
	private Integer incomeId;
	
	@Column(name = "salary_income")
	private Double salaryIncome;
	
	@Column(name = "property_income")
	private Double propertyIncome;
	
	@Column(name = "app_number")
	private Integer appNumber;
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "updated_date")
	private LocalDate updatedDate;
	
}
