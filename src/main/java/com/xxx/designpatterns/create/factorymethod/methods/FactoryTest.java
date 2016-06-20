package com.xxx.designpatterns.create.factorymethod.methods;

import com.xxx.designpatterns.create.factorymethod.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}