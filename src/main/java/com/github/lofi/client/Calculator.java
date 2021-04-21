package com.github.lofi.client;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL)
public class Calculator {

	private static Logger logger = Logger.getLogger(Calculator.class.getName());

	private Float value;

	public Calculator() {
		logger.info("Calculator...");
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

	// Overloading does not work because we export the class with @JsType
	// Use @JsIgnore to not export this
	@JsIgnore
	public void setValue(Integer value) {
		logger.info("set Integer: " + value);
		this.value = value.floatValue();
	}

}