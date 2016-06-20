package com.xxx.designpatterns.factorymethod.simple;

import com.xxx.designpatterns.factorymethod.Sender;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
	}
}
