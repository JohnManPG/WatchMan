package com.CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class mokuai implements Runnable{
	private CountDownLatch count;               //����ģ�������
	private String name;
	private String time;
	public mokuai(CountDownLatch count,String name,String time){
		this.count=count;
		this.name=name;
		this.time=time;		
	}
	@Override
	public void run() {
		this.work();
		this.count.countDown();		
	}
	public void work(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"->"+name+"����"+time+"������");
	}
}
