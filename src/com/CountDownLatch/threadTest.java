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
			System.out.println("����ģ�鶼����ˣ����ڿ�ʼ�ܲ���");
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	  
		
	}
	

}
