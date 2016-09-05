package com.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class threadTest implements Runnable {
	private CountDownLatch count=null;
	
	public threadTest(CountDownLatch count) {
		this.count = count;
	}
	@Override
	public void run() {
		try {
			this.count.await();
			System.out.println("所有模块都完成了，现在开始总测试");
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	  
		
	}
	

}
