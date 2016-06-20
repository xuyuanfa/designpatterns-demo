package com.xxx.designpatterns.create.singleton;

 /**
  * 基础单例（懒汉）
  * 
 * 基础的单例模式，Lazy模式，非线程安全
 * 优点：lazy，初次使用时实例化单例，避免资源浪费
 * 缺点：1、lazy，如果实例初始化非常耗时，初始使用时，可能造成性能问题
 * 2、非线程安全。多线程下可能会有多个实例被初始化。
 * 
 * @author laichendong
 * @since 2011-12-5
 */
public class SingletonOne {
	/** 单例实例变量 */
	private static SingletonOne instance = null;

	/**
	 * 私有化的构造方法，保证外部的类不能通过构造器来实例化。
	 */
	private SingletonOne() {

	}

	/**
	 * 获取单例对象实例
	 * 
	 * @return 单例对象
	 */
	public static SingletonOne getInstance() {
		if (instance == null) { // 1
			instance = new SingletonOne(); // 2
		}
		return instance;
	}
}
