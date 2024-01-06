package com.micro.lern.currencyconversionservice;

public class CurrencyConversionBean {

	public Long id;
	public String ind;
	public String usd;
	public Long quantity;
	public int conversionMultiple;
	public Long totalCalculation;
	public String environment;

	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversionBean(Long id, String ind, String usd, Long quantity, int conversionMultiple,
			Long totalCalculation, String environment) {
		super();
		this.id = id;
		this.ind = ind;
		this.usd = usd;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculation = (long) totalCalculation;
		this.environment = environment;
	}
	public CurrencyConversionBean(Long id) {
		super();
		this.id = id;
		
	}
	public CurrencyConversionBean(Long id, String ind, String usd, Long quantity, int conversionMultiple,
			Long totalCalculation) {
		super();
		this.id = id;
		this.ind = ind;
		this.usd = usd;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculation = (long) totalCalculation;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public int getConversionmultiple() {
		return conversionMultiple;
	}

	public void setConversionmultiple(Long conversionMultiple) {
		conversionMultiple = conversionMultiple;
	}

	public double getTotalCalculation() {
		return totalCalculation;
	}

	public void setTotalCalculation(Long totalCalculation) {
		this.totalCalculation = totalCalculation;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
