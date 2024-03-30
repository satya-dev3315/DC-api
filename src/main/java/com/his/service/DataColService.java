package com.his.service;

import com.his.dto.EducationDTO;
import com.his.dto.IncomeDTO;
import com.his.dto.KidsDTO;
import com.his.dto.SummaryDTO;


public interface DataColService {
	
	public boolean saveEducation(EducationDTO educationDto);
	public boolean saveIncome(IncomeDTO incomeDto);
	public boolean saveKids(KidsDTO kidsDto);
	SummaryDTO getSummary(Integer appNumber);
	


}
