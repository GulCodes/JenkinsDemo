package com.training.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@Autowired
	CalculatorService serviceObj;
	
	@GetMapping("/calculator/add")
	public long getResult(@RequestParam int operandOne, @RequestParam int operandTwo) {
		return serviceObj.add(operandOne,operandTwo);
	}
	
}
