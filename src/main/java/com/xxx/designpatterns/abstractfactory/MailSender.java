package com.xxx.designpatterns.abstractfactory;

public class MailSender implements Sender {
	public void Send() {
		System.out.println("this is mailsender!");
	}
}
