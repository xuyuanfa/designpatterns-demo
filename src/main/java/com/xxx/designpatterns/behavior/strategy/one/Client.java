package com.xxx.designpatterns.behavior.strategy.one;

/**
 * 策略模式
 * 
 * @author Douglas.Hsu
 *
 */
public class Client {
	public static void main(String[] args) {
		Context context;
		System.out.println("-----执行策略1-----");
		context = new Context(new ConcreteStrategy1());
		context.execute();

		System.out.println("-----执行策略2-----");
		context = new Context(new ConcreteStrategy2());
		context.execute();
	}
}