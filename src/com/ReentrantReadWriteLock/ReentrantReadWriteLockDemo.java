package com.ReentrantReadWriteLock;
import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class ReentrantReadWriteLockDemo {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();//����һ����д����ʵ����ͨ�����ʵ���ֱ��ö�����д��
    private ReadLock readlock = lock.readLock();//��ö���
    private WriteLock writelock = lock.writeLock();//���д��
    
    private String common="��������";
   
    
   //�������֤���˶��߳̿���ͬʱ���ʲ�����һ�����ݣ���д�߳��ǻ���� ��ÿһ��ִ��ֻ����һ���߳� 
    public void write(String msg){    //д���߳�
    	String res="";
    	writelock.lock();//�̻߳����
    	try{
    		res=common+"->"+msg;
    		System.out.println(Thread.currentThread().getName()+"�޸�����Ϊ��"+res);
    	   Thread.sleep(1);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}finally{
    		writelock.unlock();   //�߳��ͷ���
    	}
    }
    
    
    
    public void read(){
    	readlock.lock();
    	try{
    		System.out.println(Thread.currentThread().getName()+"��������"+common);
         Thread.sleep(1);    	
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		readlock.unlock();
    	}
    }
	public static void main(String[] args) {
		
   final  ReentrantReadWriteLockDemo demo = new ReentrantReadWriteLockDemo();
     for(int i=0;i<50;i++){
    	 new Thread(new Runnable() {    //ÿһ��ѭ��������һ���̵߳�ʵ����������50�������߳�
			                          //�����ڲ���
    		 /**ʵ����:��һ����̳�Runnable�ӿڣ�ʵ����run()�����������ڲ�������ⲿ��ķ������ٽ��������Thread���캯���У�ʵ���̵߳�����*/
			@Override
			public void run() {
			    demo.read();
				
			}
		},"���߳�->"+i).start();
     }
     for (int i=0;i<5;i++){     //ÿһ��ѭ��������һ��д���̣߳�����5��д���߳�
    	 new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.write(new Random().nextLong()+"");
				
			}
		},"д�߳�->"+i).start();
     }
	}

}
