package com.condition;

public class getThread extends Thread {
	private warehouse wh;//有私有变量就有构造函数或者访问器和变量设置器
	public getThread(warehouse wh) {//继承Thread实现继承，重写run方法，直接调用
		this.wh = wh;
	}
	public void run(){
		while(true){
		wh.get();
		}
	}
}
