package com.xxx.designpatterns.create.abstractfactory;

public class MailSender implements Sender {
	public void Send() {
		System.out.println("this is mailsender!");
	}
}
