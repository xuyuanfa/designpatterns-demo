package com.xxx.designpatterns.abstractfactory;

public class SmsSender implements Sender {

	public void Send() {
		System.out.println("this is sms sender!");
	}
}
