package com.micro.lern.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@Autowired
	public Environment environment;
	
	@Autowired(required = false)
	public CurrencyExchangeProxy proxy;

	@GetMapping("/currency-conversion/from/{ind}/to/{usd}/quantity/{quantity}")
	public CurrencyConversionBean retrive(@PathVariable String ind, @PathVariable String usd,
			@PathVariable Long quantity) {
		CurrencyConversionBean ex = new CurrencyConversionBean(1000L, ind, usd,quantity, 100, 2L);

		String port = environment.getProperty("local.server.port");
		// environment.getProperty("local.server.port");
		ex.setEnvironment(port);
		return ex;

	}
	
	/*@GetMapping("/currency-conversion-feign/from/{ind}/to/{usd}/quantity/{quantity}")
	public CurrencyConversionBean1 retriveExchangeValue(@PathVariable String ind, @PathVariable String usd,
			@PathVariable Long quantity) {
		
		CurrencyConversionBean1 currencyConversion=proxy.retriveExchangeValue(ind, usd);
		
	
		
		
	
		return new CurrencyConversionBean1(
				currencyConversion.getId(),
				ind,
				usd,
				quantity,
				currencyConversion.getConversionMultiple(),
				10L,
				currencyConversion.getEnvironment()
				
				);

	}*/
	
	
	@GetMapping("/currency-conversion-feign/from/{ind}/to/{usd}/quantity/{quantity}")
	public CurrencyConversionBean1 retriveExchangeValueform(@PathVariable String ind, @PathVariable String usd,
			@PathVariable Long quantity) {
		
		CurrencyConversionBean1 currencyConversion=proxy.retriveExchangeValue(ind, usd);
		
	
		
		
	
		return new CurrencyConversionBean1(currencyConversion.getId(),
				ind,
				usd,
				quantity,
				currencyConversion.getConversionMultiple(),
				10L,
				currencyConversion.getEnvironment()) ;

	}

}
