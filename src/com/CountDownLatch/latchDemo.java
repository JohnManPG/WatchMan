package com.CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.wangHello.testThread;

public class latchDemo {
	public static void main(String[] args) {
		Random r=new Random();
		ExecutorService service = Executors.newCachedThreadPool();
		CountDownLatch count = new CountDownLatch(20);//当count都归为0的时候，才开始运行
		service.execute(new threadTest(count));
		for(int i=0;i<20;i++){
			service.execute(new mokuai(count,"模块"+i,r.nextInt(2000)+""));	//数字+字符串就变成了字符串					
		}
		service.shutdown();		
	}
}
