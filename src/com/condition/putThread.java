package com.condition;

public class putThread implements Runnable {
	private warehouse wh;
	public putThread(warehouse wh) {//实现Runnble接口，重写run方法
		
		this.wh = wh;//构造函数就是要传参
	}
	@Override
	public void run() {
		while(true){
		wh.put();	
		}
	}

}
