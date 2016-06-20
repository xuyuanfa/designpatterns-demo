package com.xxx.designpatterns.create.singleton;

/**
 * 同步方法（加锁懒汉）
 * 
 * 同步方法 的单例模式，Lazy模式，线程安全
 * 优点：
 * 1、lazy，初次使用时实例化单例，避免资源浪费
 * 2、线程安全
 * 缺点：
 * 1、lazy，如果实例初始化非常耗时，初始使用时，可能造成性能问题
 * 2、每次调用getInstance()都要获得同步锁，性能消耗。
 * 
 * @author laichendong
 * @since 2011-12-5
 */
public class SingletonTwo {

	/** 单例实例变量 */
	private static SingletonTwo instance = null;

	/**
	 * 私有化的构造方法，保证外部的类不能通过构造器来实例化。
	 */
	private SingletonTwo() {

	}

	/**
	 * 获取单例对象实例 同步方法，实现线程互斥访问，保证线程安全。
	 * 
	 * @return 单例对象
	 */
	public static synchronized SingletonTwo getInstance() {
		if (instance == null) { // 1
			instance = new SingletonTwo(); // 2
		}
		return instance;
	}

}