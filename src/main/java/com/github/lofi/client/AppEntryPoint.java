package com.github.lofi.client;

import com.google.gwt.core.client.EntryPoint;

public class AppEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// Do nothing, just to load the Java classes
		Calculator calculator = new Calculator();
		calculator.setValue(10F);
		CalculatorNoExport calculatorNoExport = new CalculatorNoExport();
		calculatorNoExport.setValue(10);
		calculatorNoExport.setValue(10F);
	}
}
