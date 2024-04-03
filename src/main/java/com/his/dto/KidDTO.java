package com.his.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KidDTO {
	
	private Integer kidId;
	
	private String kidName;
	
	private Long ssn;
	
	private Integer appNumber;   
	
	private LocalDate dob;
	
}
