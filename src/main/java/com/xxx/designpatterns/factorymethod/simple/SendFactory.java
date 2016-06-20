package com.xxx.designpatterns.factorymethod.simple;

import com.xxx.designpatterns.factorymethod.MailSender;
import com.xxx.designpatterns.factorymethod.Sender;
import com.xxx.designpatterns.factorymethod.SmsSender;

/**
 * 简单工厂模式
 * 
 * @author Douglas.Hsu
 *
 */
public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
