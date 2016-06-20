package com.xxx.designpatterns.create.abstractfactory;

/**
 * 抽象工厂模式
 * 
 * @author Douglas.Hsu
 *
 */
public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
