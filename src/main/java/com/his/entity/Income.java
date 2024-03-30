package com.his.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="HIS_DC_INCOME")
public class Income {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;
	private Integer salIncome;
	private Integer propIncome;	 
	private Integer appNumber;
	
	public Integer getIncomeId() {
		return incomeId;
	}
	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}
	public Integer getSalIncome() {
		return salIncome;
	}
	public void setSalIncome(Integer salIncome) {
		this.salIncome = salIncome;
	}
	public Integer getPropIncome() {
		return propIncome;
	}
	public void setPropIncome(Integer propIncome) {
		this.propIncome = propIncome;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}

}
