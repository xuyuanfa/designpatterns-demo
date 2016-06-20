package com.xxx.designpatterns.create.factorymethod;

public class MailSender implements Sender {
	public void Send() {
		System.out.println("this is mailsender!");
	}
}