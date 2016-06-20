package com.xxx.designpatterns.create.factorymethod;

public class SmsSender implements Sender {

	public void Send() {
		System.out.println("this is sms sender!");
	}
}
