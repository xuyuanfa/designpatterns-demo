package com.xxx.designpatterns.structure.adapter;

/**
 * 类的适配器模式
 * 
 * @author Douglas.Hsu
 *
 */
public class Adapter extends Source implements Targetable {
	public void method2() {
		System.out.println("this is the targetable method!");
	}

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
