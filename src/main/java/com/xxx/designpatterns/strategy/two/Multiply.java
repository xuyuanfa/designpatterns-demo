package com.xxx.designpatterns.strategy.two;

public class Multiply extends AbstractCalculator implements ICalculator {
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}
}