package com.xxx.designpatterns.behavior.visitor;

import java.util.List;

/**
 * 访问者模式
 * 
 * @author Douglas.Hsu
 *
 */
public class Client {
	public static void main(String[] args) {
		List<Element> list = ObjectStruture.getList();
		for (Element e : list) {
			e.accept(new Visitor());
		}
	}
}
