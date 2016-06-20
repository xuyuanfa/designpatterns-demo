package com.xxx.designpatterns.factorymethod.methods;

import com.xxx.designpatterns.factorymethod.MailSender;
import com.xxx.designpatterns.factorymethod.Sender;
import com.xxx.designpatterns.factorymethod.SmsSender;

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
