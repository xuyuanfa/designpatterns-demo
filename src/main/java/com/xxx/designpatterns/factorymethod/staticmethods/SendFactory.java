package com.xxx.designpatterns.factorymethod.staticmethods;

import com.xxx.designpatterns.factorymethod.MailSender;
import com.xxx.designpatterns.factorymethod.Sender;
import com.xxx.designpatterns.factorymethod.SmsSender;

/**
 * 静态工厂
 * 
 * @author Douglas.Hsu
 *
 */
public class SendFactory {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}