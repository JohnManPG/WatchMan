package com.wangHello;

public class putThread implements Runnable {
	private wareHouse wh;
	public putThread(wareHouse wh) {//实现Runnble接口，重写run方法
		
		this.wh = wh;//构造函数就是要传参
	}
	@Override
	public void run() {
		while(true){
		wh.put();	
		}
	}

}
