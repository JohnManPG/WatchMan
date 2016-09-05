package com.ReentrantReadWriteLock;
import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class ReentrantReadWriteLockDemo {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();//创建一个读写锁的实例，通过这个实例分别获得读锁和写锁
    private ReadLock readlock = lock.readLock();//获得读锁
    private WriteLock writelock = lock.writeLock();//获得写锁
    
    private String common="共享数据";
   
    
   //这个例子证明了读线程可以同时访问并共享一个数据，而写线程是互斥的 ，每一次执行只能是一个线程 
    public void write(String msg){    //写的线程
    	String res="";
    	writelock.lock();//线程获得锁
    	try{
    		res=common+"->"+msg;
    		System.out.println(Thread.currentThread().getName()+"修改数据为："+res);
    	   Thread.sleep(1);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}finally{
    		writelock.unlock();   //线程释放锁
    	}
    }
    
    
    
    public void read(){
    	readlock.lock();
    	try{
    		System.out.println(Thread.currentThread().getName()+"读到数据"+common);
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
    	 new Thread(new Runnable() {    //每一次循环都创建一个线程的实例，所以有50个读的线程
			                          //匿名内部类
    		 /**实际上:找一个类继承Runnable接口，实现其run()方法，匿名内部类调用外部类的方法，再将其对象传入Thread构造函数中，实现线程的启动*/
			@Override
			public void run() {
			    demo.read();
				
			}
		},"读线程->"+i).start();
     }
     for (int i=0;i<5;i++){     //每一次循环都创建一个写的线程，共有5个写的线程
    	 new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.write(new Random().nextLong()+"");
				
			}
		},"写线程->"+i).start();
     }
	}

}
