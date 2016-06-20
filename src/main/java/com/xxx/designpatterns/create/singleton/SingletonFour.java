package com.xxx.designpatterns.create.singleton;

/**
 * 预先初始化static变量（饿汉）
 * 
 * 预先初始化static变量 的单例模式  非Lazy  线程安全
 * 优点：
 * 1、线程安全 
 * 缺点：
 * 1、非懒加载，如果构造的单例很大，构造完又迟迟不使用，会导致资源浪费。
 * 
 * @author laichendong
 * @since 2011-12-5
 */
public class SingletonFour {

	/** 单例变量 ,static的，在类加载时进行初始化一次，保证线程安全 */
	private static SingletonFour instance = new SingletonFour();

	/**
	 * 私有化的构造方法，保证外部的类不能通过构造器来实例化。
	 */
	private SingletonFour() {

	}

	/**
	 * 获取单例对象实例
	 * 
	 * @return 单例对象
	 */
	public static SingletonFour getInstance() {
		return instance;
	}

}
