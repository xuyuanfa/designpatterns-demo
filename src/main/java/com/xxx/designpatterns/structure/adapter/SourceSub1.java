package com.xxx.designpatterns.structure.adapter;

/**
 * 接口的适配器模式
 * 
 * @author Douglas.Hsu
 *
 */
public class SourceSub1 extends Wrapper2 {
	public void method1() {
		System.out.println("the sourceable interface's first Sub1!");
	}
	
	public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();
        
        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
