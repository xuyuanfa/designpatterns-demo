package com.xxx.designpatterns.behavior.interpreter;

public class Minus implements Expression {
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}
}
