package com.xxx.designpatterns.create.singleton;

/**
 * 双重校验锁
 *
 */
public class SingletonThree {
	/** 单例实例变量 */
	private static SingletonThree instance = null;

	private SingletonThree() {

	}

	/**
	 * 双重校验锁
	 * 
	 * @return
	 */
	public static SingletonThree getInstance() {
		if (instance == null) { // 1
			synchronized (SingletonThree.class) {
				if (instance == null) {
					instance = new SingletonThree(); // 2
				}
			}
		}
		return instance;
	}

	/**
	 * 双重校验锁，解决由“无序写”带来的问题
	 * 
	 * 解释一下执行步骤。
		1、线程A进入getInstance()方法。
		2、因为instance是空的 ，所以线程A进入位置//1的第一个synchronized块。
		3、线程A执行位置//2的代码，把instance赋值给本地变量temp。instance为空，所以temp也为空。 
		4、因为temp为空，所以线程A进入位置//3的第二个synchronized块。
		5、线程A执行位置//4的代码，把temp设置成非空，但还没有调用构造方法！（“无序写”问题） 
		6、线程A阻塞，线程B进入getInstance()方法。
		7、因为instance为空，所以线程B试图进入第一个synchronized块。但由于线程A已经在里面了。所以无法进入。线程B阻塞。
		8、线程A激活，继续执行位置//4的代码。调用构造方法。生成实例。
		9、将temp的实例引用赋值给instance。退出两个synchronized块。返回实例。
		10、线程B激活，进入第一个synchronized块。
		11、线程B执行位置//2的代码，把instance实例赋值给temp本地变量。
		12、线程B判断本地变量temp不为空，所以跳过if块。返回instance实例。
	 * @return
	 */
	public static SingletonThree getInstance2() {
		if (instance == null) {
			synchronized (SingletonThree.class) { // 1
				SingletonThree temp = instance; // 2
				if (temp == null) {
					synchronized (SingletonThree.class) { // 3
						temp = new SingletonThree(); // 4
					}
					instance = temp; // 5
				}
			}
		}
		return instance;
	}
}
