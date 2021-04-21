package com.github.lofi.client;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class CalculatorNoExport {

	private static Logger logger = Logger.getLogger(CalculatorNoExport.class.getName());

	private Float value;

	public CalculatorNoExport() {
		logger.info("CalculatorNoExport...");
	}

	public double calculateSum(Double[] values) {
		if (values != null) {
			List<Double> doubles = Arrays.asList(values);
			logger.info("Values size: " + doubles.size());
			Double sum = doubles.stream().mapToDouble(Double::doubleValue).sum();
			return sum;
		} else {
			logger.info("Values: null");
			return 0.0;
		}
	}

	public void setValue(Float value) {
		logger.info("set Float: " + value);
		this.value = value;
	}

	// Overloading works because we don't export the class with @JsType
	public void setValue(Integer value) {
		logger.info("set Integer: " + value);
		this.value = value.floatValue();
	}

}