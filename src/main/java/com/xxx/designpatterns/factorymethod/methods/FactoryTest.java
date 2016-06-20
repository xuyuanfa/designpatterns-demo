package com.xxx.designpatterns.factorymethod.methods;

import com.xxx.designpatterns.factorymethod.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}