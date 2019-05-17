package com.capgemini.CurrencyConversionMS.entity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	  private Logger logger = LoggerFactory.getLogger(this.getClass());

	  @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	  public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
	      @PathVariable BigDecimal quantity) {

	    Map<String, String> uriVariables = new HashMap<>();
	    uriVariables.put("from", from);
	    uriVariables.put("to", to);

	    ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
	        "http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class,
	        uriVariables);

	    CurrencyConversion response = responseEntity.getBody();

	    return new CurrencyConversion(response.getId(), from, to, response.getConversionMultiple(), quantity,
	        quantity.multiply(response.getConversionMultiple()), response.getPort());
	  }



}
