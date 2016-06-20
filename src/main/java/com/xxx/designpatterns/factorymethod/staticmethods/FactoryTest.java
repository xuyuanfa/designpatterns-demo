package com.xxx.designpatterns.factorymethod.staticmethods;

import com.xxx.designpatterns.factorymethod.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}