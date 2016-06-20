package com.xxx.designpatterns.create.factorymethod.staticmethods;

import com.xxx.designpatterns.create.factorymethod.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}