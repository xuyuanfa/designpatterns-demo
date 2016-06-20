package com.xxx.designpatterns.factorymethod;

public class MailSender implements Sender {
	public void Send() {
		System.out.println("this is mailsender!");
	}
}