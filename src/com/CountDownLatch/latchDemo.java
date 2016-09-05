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
		CountDownLatch count = new CountDownLatch(20);//��count����Ϊ0��ʱ�򣬲ſ�ʼ����
		service.execute(new threadTest(count));
		for(int i=0;i<20;i++){
			service.execute(new mokuai(count,"ģ��"+i,r.nextInt(2000)+""));	//����+�ַ����ͱ�����ַ���					
		}
		service.shutdown();		
	}
}
