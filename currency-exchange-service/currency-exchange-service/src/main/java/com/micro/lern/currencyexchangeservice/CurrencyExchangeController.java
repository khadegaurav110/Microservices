package com.micro.lern.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class CurrencyExchangeController {
	
	@Autowired
	public Environment environment;
	
	/*@Autowired
	public CurrencyExchangeRepository repository;*/
	
	@Autowired
	public CurrencyExchangeServices service;
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchanngeBean currecyExchange(@PathVariable String from,@PathVariable String to )
	{
		
		CurrencyExchanngeBean EX=new CurrencyExchanngeBean(1000L,from,to,5);
		 
		String port = environment.getProperty("local.server.port"); 
		EX.setEnvironment(port);
		
		return EX;
		
	}
	
	
	/*@PostMapping("/hello")
	public ResponseEntity<?> addStudent(@RequestBody CurrencyExchanngeBean user)
	{
		CurrencyExchanngeBean save = repository.save(user);
		return ResponseEntity.ok(save);
	}*/
	
	@PostMapping("/save")
	public String  save(@ModelAttribute("bean")CurrencyExchanngeBean bean)
	{
		service.add(bean);
		return "pk";
		
	}
	
}
