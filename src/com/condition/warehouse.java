package com.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
//这是Java中的条件变量，condition替换了notify、notifyAll,使用自带的方法signal()达到线程之间的通信
/*现在也就是说线程之间的通信有两种：
 * 第一种：使用Object对象中的notify或者notifyAll，让线程之间通信，合用的是 synchronized 
 * 第二种：使用Java中的条件变量Condition对象中的signl()方法使线程之间通信，一块合用的是重入锁*/
public class warehouse {
    private boolean isFull=false;
   private ReentrantLock lock = new ReentrantLock();
   private Condition notfull = lock.newCondition();
   private Condition notempty = lock.newCondition();
   public void put(){
	   lock.lock();
	   if(!this.isFull){   //不是满的    非，那就是满的
		   try{
		   System.out.println("放满了，来取");
		   isFull=!isFull;
		   notempty.signal();//唤醒一个等待线程
		   }catch(Exception e){
			   e.printStackTrace();   
		   }finally{
			   lock.unlock();
		   }
	   }else{
		  try {
			notfull.await();//让这个线程在接到信号和被中断之前，一直处于等待状态
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	   }
   }              //重入锁就是要先获得锁再释放锁
   
   public void get(){
	   lock.lock();
	   if(this.isFull){
		   try{			   
			   System.out.println("空了，你来放");
			   isFull=!isFull;
			   this.notfull.signal();
		   }catch(Exception e){
			   e.printStackTrace();
		   }finally{
			   lock.unlock();			   
		   }
	   }else{
		   try {
			notempty.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   }
   }  
}
