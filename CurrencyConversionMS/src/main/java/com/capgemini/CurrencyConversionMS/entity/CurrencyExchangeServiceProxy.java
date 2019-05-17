package com.capgemini.CurrencyConversionMS.entity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="forex-service" url="localhost:8100") 
public interface CurrencyExchangeServiceProxy {

	 @GetMapping("/currency-exchange/from/{from}/to/{to}")
	  public CurrencyConversion retrieveExchangeValue
	    (@PathVariable("from") String from, @PathVariable("to") String to);
	}