package com.xxx.designpatterns.structure.proxy;

/**
 * 静态代理模式
 * 
 * @author Douglas.Hsu
 *
 */
public class CountProxy implements Count {
	private CountImpl countImpl;

	public CountProxy(CountImpl countImpl) {
		this.countImpl = countImpl;
	}

	public void queryCount() {
		System.out.println("事务处理之前");
		// 调用委托类的方法;
		countImpl.queryCount();
		System.out.println("事务处理之后");
	}

	public void updateCount() {
		System.out.println("事务处理之前");
		// 调用委托类的方法;
		countImpl.updateCount();
		System.out.println("事务处理之后");
	}
}
