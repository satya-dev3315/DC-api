package com.his.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="HIS_DC_KID")
public class Kid {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer kidId;
	private String kidName;	
	private LocalDate dob;
	private Long kidSsn;	 
	private Integer appNumber;
	public Integer getKidId() {
		return kidId;
	}
	public void setKidId(Integer kidId) {
		this.kidId = kidId;
	}
	public String getKidName() {
		return kidName;
	}
	public void setKidName(String kidName) {
		this.kidName = kidName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Long getKidSsn() {
		return kidSsn;
	}
	public void setKidSsn(Long kidSsn) {
		this.kidSsn = kidSsn;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}
	
	

}
