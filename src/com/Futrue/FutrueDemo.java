package com.Futrue;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutrueDemo {

	public static void main(String[] args) {
		/*Executor:ִ�����ύ�� Runnable ����Ķ���,��ExecutorService�ȵĳ����ӿڣ�ֻҪһ��execute()����*/
		ExecutorService service = Executors.newCachedThreadPool();//����һ���ɸ�����Ҫ�������̵߳��̳߳أ���������ǰ������߳̿���ʱ����������,����˵���Ǵ����̳߳�
		
		FutureTask<String> task = new FutureTask<String>(new Callable<String>() {   //task����ͨ��get()��������ȡ���
       //���ڼ������ʱ���ܻ�ȡ��������������δ��ɣ������� get ������һ��������ɣ��Ͳ��������¿�ʼ��ȡ�����㡣
			@Override
			public String call() throws Exception {
				
				return Thread.currentThread().getName();       //call()�����������̵߳�run()�����Ƚ�����
			}   
			
			//�߳��е�run()�������ص�������void�ģ����Ƿ��أ�call()������Ҫ���ؾ����ֵ��
			
		});
                  service.execute(task);               //��ʱ��task����һ���̣߳��������߳̾�ִ��call()����
                  try {                               //���غ��õ��ǲ�һ����
					String res=task.get();
					System.out.println("res="+res);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
                  service.shutdown();
	}
}
