package com.xxx.designpatterns.singleton;

/**
 * 使用内部类
 * 
 * 基于内部类的单例模式  Lazy  线程安全
 * 优点：
 * 1、线程安全
 * 2、lazy
 * 缺点：
 * 1、待发现
 * 
 * @author laichendong
 * @since 2011-12-5
 */
public class SingletonFive {

	/**
	 * 内部类，用于实现lzay机制
	 */
	private static class SingletonHolder {
		/** 单例变量 */
		private static SingletonFive instance = new SingletonFive();
	}

	/**
	 * 私有化的构造方法，保证外部的类不能通过构造器来实例化。
	 */
	private SingletonFive() {

	}

	/**
	 * 获取单例对象实例
	 * 
	 * @return 单例对象
	 */
	public static SingletonFive getInstance() {
		return SingletonHolder.instance;
	}

}