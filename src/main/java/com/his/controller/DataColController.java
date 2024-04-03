package com.his.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.his.dto.EducationDTO;
import com.his.dto.IncomeDTO;
import com.his.dto.KidsDTO;
import com.his.dto.SummaryDTO;
import com.his.service.DataColService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DataColController {
	
	private final DataColService dataColService;
	
	@PostMapping("/income")
	public ResponseEntity<String> saveIncome(@RequestBody IncomeDTO incomeDto){
		
		boolean status = dataColService.saveIncome(incomeDto);
		if(status)
			return new ResponseEntity<>("Income data saved successfully", HttpStatus.CREATED);
		else
			return new ResponseEntity<>("Failed to save income data", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	

	@PostMapping("/education")
	public ResponseEntity<String> saveIncome(@RequestBody EducationDTO educationDto){		
		
		boolean status = dataColService.saveEducation(educationDto);
		if(status)
			return new ResponseEntity<>("Education data saved successfully", HttpStatus.CREATED);
		else
			return new ResponseEntity<>("Failed to save education data", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/kids")
	public ResponseEntity<String> saveKids(@RequestBody KidsDTO kidsDto){	
		
		boolean status = dataColService.saveKids(kidsDto);
		if(status)
			return new ResponseEntity<>("Kids data saved successfully", HttpStatus.CREATED);
		else
			return new ResponseEntity<>("Failed to save Kids data", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@GetMapping("/summary/{appNumber}")
	public ResponseEntity<SummaryDTO> getSummary(@PathVariable("appNumber") Integer appNumber){	
		SummaryDTO summary = dataColService.getSummary(appNumber);
		return new ResponseEntity<>(summary, HttpStatus.OK);
	}
}
