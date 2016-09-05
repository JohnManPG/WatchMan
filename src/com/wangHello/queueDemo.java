package com.wangHello;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queueDemo {

	public static void main(String[] args) {
	  Queue queue = new ArrayBlockingQueue(7);//用并发中的类实现线程安全,这是线程安全的
	  queue.add("wangxiang1");
	  queue.add("wangxiang2");
	  queue.add("wangxiang3");
	  queue.add("wangxiang4");
	  queue.add("wangxiang5");
	  queue.offer("wangxiang6");
	  queue.add("wangxiang7");	  
	  for (Object object : queue) {
		  System.out.println(object.toString());
		
	}	 	 
	}//list,set,queue都是collection的子接口，对应的有其实现类

}
