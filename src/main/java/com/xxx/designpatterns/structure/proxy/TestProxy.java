package com.xxx.designpatterns.structure.proxy;

/**
 * JDK动态代理
 * 
 * @author Douglas.Hsu
 *
 */
public class TestProxy {
	public static void main(String[] args) {
		BookFacadeProxy proxy = new BookFacadeProxy();
		BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
		bookProxy.addBook();
	}
}
