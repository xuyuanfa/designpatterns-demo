package com.xxx.designpatterns.behavior.templatemethod;

/**
 * 模板方法模式
 * 
 * @author Douglas.Hsu
 *
 */
public class StrategyTest {
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}
