package com.xxx.designpatterns.create.abstractfactory;

public class SendMailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}
}
