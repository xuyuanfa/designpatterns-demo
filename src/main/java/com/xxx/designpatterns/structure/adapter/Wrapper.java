package com.xxx.designpatterns.structure.adapter;

/**
 * 对象的适配器模式
 * 
 * @author Douglas.Hsu
 *
 */
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	public void method2() {
		System.out.println("this is the targetable method!");
	}

	public void method1() {
		source.method1();
	}

	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
