package com.xxx.designpatterns.factorymethod;

public class SmsSender implements Sender {

	public void Send() {
		System.out.println("this is sms sender!");
	}
}
