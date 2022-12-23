package com.training.junit;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public long add(long first, long second) {
		return first + second;
	}

	public long subtract(long first, long second) {
		return first - second;
	}

	public long multiply(long first, long second) {
		return first * second;
	}

	public long divide(long first, long second) {
		return first / second;
	}
}
