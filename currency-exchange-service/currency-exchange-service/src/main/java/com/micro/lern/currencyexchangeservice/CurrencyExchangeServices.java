package com.micro.lern.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CurrencyExchangeServices {

	@Autowired
	public CurrencyExchangeRepository  repository;
	
	
	public void add(CurrencyExchanngeBean bean) {
		// TODO Auto-generated method stub
		repository.save(bean);
		
	}
}
