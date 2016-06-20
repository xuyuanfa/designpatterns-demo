package com.xxx.designpatterns.facade;

/**
 * 外观模式
 * 
 * @author Douglas.Hsu
 *
 */
public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
