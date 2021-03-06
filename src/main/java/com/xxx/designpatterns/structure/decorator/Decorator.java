package com.xxx.designpatterns.structure.decorator;

/**
 * 装饰模式
 * 
 * @author Douglas.Hsu
 *
 */
public class Decorator implements Sourceable {
	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}