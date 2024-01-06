package com.micro.lern.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange",url="localhost:8000")
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy  {
	
	@GetMapping("/currency-exchange/from/{ind}/to/{usd}")
	public CurrencyConversionBean1 retriveExchangeValue(@PathVariable("ind") String ind, @PathVariable("usd") String usd);

}
