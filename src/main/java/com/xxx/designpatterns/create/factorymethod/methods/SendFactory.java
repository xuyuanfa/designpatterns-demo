package com.xxx.designpatterns.create.factorymethod.methods;

import com.xxx.designpatterns.create.factorymethod.MailSender;
import com.xxx.designpatterns.create.factorymethod.Sender;
import com.xxx.designpatterns.create.factorymethod.SmsSender;

/**
 * 多工厂方法模式
 * 
 * @author Douglas.Hsu
 *
 */
public class SendFactory {

	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
