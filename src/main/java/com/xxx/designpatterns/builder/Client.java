package com.xxx.designpatterns.builder;

/**
 * 建造者模式
 * 
 * @author Douglas.Hsu
 *
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Product product1 = director.getAProduct();
		product1.showProduct();

		Product product2 = director.getBProduct();
		product2.showProduct();
	}
}
