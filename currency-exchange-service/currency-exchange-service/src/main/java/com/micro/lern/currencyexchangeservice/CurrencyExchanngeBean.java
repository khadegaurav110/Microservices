package com.micro.lern.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchanngeBean {
	
	@Id
	public long id;
	
	public String ind;
	
	public String usd;
	public int conversionMultiple;
	public String environment;
	
	public CurrencyExchanngeBean() {
		super();
	}
	
	public CurrencyExchanngeBean(long id, String ind, String usd, int conversionMultiple) {
		super();
		this.id = id;
		this.ind = ind;
		this.usd = usd;
		this.conversionMultiple = conversionMultiple;
	}
	
	public CurrencyExchanngeBean(long id, String ind, String usd, int conversionMultiple,String environment) {
		super();
		this.id = id;
		this.ind = ind;
		this.usd = usd;
		this.conversionMultiple = conversionMultiple;
		this.environment=environment;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getInd() {
		return ind;
	}
	public void setInd(String ind) {
		this.ind = ind;
	}
	public String getUsd() {
		return usd;
	}
	public void setUsd(String usd) {
		this.usd = usd;
	}
	public int getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(int conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	

}
