package com.xxx.designpatterns.proxy;

/**
 * Cglib动态代理
 * 
 * @author Douglas.Hsu
 *
 */
public class TestCglib {
	public static void main(String[] args) {
		BookFacadeCglib cglib = new BookFacadeCglib();
		BookFacadeImpl bookCglib = (BookFacadeImpl) cglib
				.getInstance(new BookFacadeImpl());
		bookCglib.addBook();
	}
}
