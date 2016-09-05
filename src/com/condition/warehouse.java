package com.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
//����Java�е�����������condition�滻��notify��notifyAll,ʹ���Դ��ķ���signal()�ﵽ�߳�֮���ͨ��
/*����Ҳ����˵�߳�֮���ͨ�������֣�
 * ��һ�֣�ʹ��Object�����е�notify����notifyAll�����߳�֮��ͨ�ţ����õ��� synchronized 
 * �ڶ��֣�ʹ��Java�е���������Condition�����е�signl()����ʹ�߳�֮��ͨ�ţ�һ����õ���������*/
public class warehouse {
    private boolean isFull=false;
   private ReentrantLock lock = new ReentrantLock();
   private Condition notfull = lock.newCondition();
   private Condition notempty = lock.newCondition();
   public void put(){
	   lock.lock();
	   if(!this.isFull){   //��������    �ǣ��Ǿ�������
		   try{
		   System.out.println("�����ˣ���ȡ");
		   isFull=!isFull;
		   notempty.signal();//����һ���ȴ��߳�
		   }catch(Exception e){
			   e.printStackTrace();   
		   }finally{
			   lock.unlock();
		   }
	   }else{
		  try {
			notfull.await();//������߳��ڽӵ��źźͱ��ж�֮ǰ��һֱ���ڵȴ�״̬
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	   }
   }              //����������Ҫ�Ȼ�������ͷ���
   
   public void get(){
	   lock.lock();
	   if(this.isFull){
		   try{			   
			   System.out.println("���ˣ�������");
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
