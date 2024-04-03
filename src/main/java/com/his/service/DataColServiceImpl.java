package com.his.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.his.dto.EducationDTO;
import com.his.dto.IncomeDTO;
import com.his.dto.KidDTO;
import com.his.dto.KidsDTO;
import com.his.dto.SummaryDTO;
import com.his.entity.Education;
import com.his.entity.Income;
import com.his.entity.Kid;
import com.his.repository.EducationRepository;
import com.his.repository.IncomeRepository;
import com.his.repository.KidRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DataColServiceImpl implements DataColService {
	
	
	private final EducationRepository eduRepo;
	private final IncomeRepository incomeRepo;
	private final KidRepository kidRepo;
	
	@Override
	public boolean saveEducation(EducationDTO educationDto) {
		Education education= new Education();
		BeanUtils.copyProperties(educationDto, education);
		Education save = eduRepo.save(education);
		return save.getEducationId() != null; 
	}
	
	
	@Override
	public boolean saveIncome(IncomeDTO incomeDto) {
		Income income= new Income();
		BeanUtils.copyProperties(incomeDto, income);
		Income save = incomeRepo.save(income);
		return save.getIncomeId() != null;       //replacement for if else conditions.It means if getIncomeId() != null, return true.

	}
	
	@Override
	public boolean saveKids(KidsDTO kidsDto) {
		
		List<Kid> kids = new ArrayList<>();
		List<KidDTO> kidDtos = kidsDto.getKids();   // here we will get list of kids frm dto obj
		
		kidDtos.forEach(kidDto->{
			Kid kid=new Kid();
			BeanUtils.copyProperties(kidDto, kid);
			kids.add(kid);
		});
		List<Kid> saveAll = kidRepo.saveAll(kids);
		return saveAll != null;
	}
	
	@Override
	public SummaryDTO getSummary(Integer appNumber) {
		
		SummaryDTO summary=new SummaryDTO();
		
		//after storing all data , display summary screen with all info
		//get income details based on app num and set to Summary
		
		Income income = incomeRepo.findByAppNumber(appNumber);
		IncomeDTO incomeDto= new IncomeDTO();
		BeanUtils.copyProperties(income, incomeDto);
		summary.setIncomeDto(incomeDto);
				
		//get Education details based on app num and set to Summary
		Education education = eduRepo.findByAppNumber(appNumber);
		EducationDTO educationDto= new EducationDTO();
		if(education!=null)
		BeanUtils.copyProperties(education, educationDto);
		summary.setEduDto(educationDto);
		
		//get Kids info based on app num and set to Summary
		List<Kid> kids=kidRepo.findByAppNumber(appNumber);
		List<KidDTO> kidDtos=new ArrayList<>();
		
		if(kids!=null) {
			kids.forEach(kid->{
				
				KidDTO kidDto=new KidDTO();
				BeanUtils.copyProperties(kid, kidDto);
				kidDtos.add(kidDto);
				
			});
		}
		
		KidsDTO kidsDto= new KidsDTO();
		kidsDto.setAppNumber(appNumber);
		kidsDto.setKids(kidDtos);
		
		summary.setKidsDto(kidsDto);		
		return summary;
	}
	
	
	
	

}
