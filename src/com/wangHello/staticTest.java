package com.wangHello;

public class staticTest {	
	static {
		System.out.println("静态块");
	}
    //静态块在类接在过程中先于实例对象，独立于所有的实例对象，为所有的对象所共享，可以直接运行
	public static void main(String[] args) {
	}

}
