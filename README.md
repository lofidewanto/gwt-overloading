# gwt-overloading

- Overloading Java method only works if you don't export the method / class to JS like this class [CalculatorNoExport.java](https://github.com/lofidewanto/gwt-overloading/blob/main/src/main/java/com/github/lofi/client/CalculatorNoExport.java).
- If you want to export it you cannot use Java overloading method since JS doesn't support method / function overloading like this class [Calculator.java](https://github.com/lofidewanto/gwt-overloading/blob/main/src/main/java/com/github/lofi/client/Calculator.java). Adding @JsIgnore makes this class transpilable but the method won't be available on JS.
- Here is where CalculatorNoExport and Calculator are used: [AppEntryPoint.java](https://github.com/lofidewanto/gwt-overloading/blob/main/src/main/java/com/github/lofi/client/AppEntryPoint.java)
