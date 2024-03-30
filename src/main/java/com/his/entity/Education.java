package com.his.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="HIS_DC_EDUCATION")
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eduId;
	private String highestDegree;	
	private String universtyName;
	private Integer graduateYear;
	private Integer appNumber;
	
	
	public Integer getGraduateYear() {
		return graduateYear;
	}
	public void setGraduateYear(Integer graduateYear) {
		this.graduateYear = graduateYear;
	}
	public Integer getEduId() {
		return eduId;
	}
	public void setEduId(Integer eduId) {
		this.eduId = eduId;
	}
	public String getHighestDegree() {
		return highestDegree;
	}
	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	public String getUniverstyName() {
		return universtyName;
	}
	public void setUniverstyName(String universtyName) {
		this.universtyName = universtyName;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}

}
