package com.wangHello;


public class threadDemo implements Runnable {//线程就是代码块，线程就是一个类，这是一个名字叫threadDemo的线程
	private int apple = 100; //直接赋值
	public void run(){		
		while(true){
			test();
	}                              
	}                                //1.synchronized修饰的是具体描述线程的代码块
	public synchronized void test(){ //2.用synchronized修饰方法来避免线程中出现不正确的数据
		
			if(apple>0){				
				try {
					Thread.sleep(100);  //Thread就是当前线程，让当前线程休眠
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"->"+apple--);
			}
		}	

	public static void main(String[] args) throws InterruptedException {//现在这里面有两个线程
		threadDemo thread = new threadDemo();
	    Thread xc1=new Thread(thread); //由于继承是单继承，所以不利于代码的扩展，一般实现线程使用接口，Runnable //当用户线程执行完毕后，退出虚拟机，就不会执行后台线程了	     
	    Thread xc2=new Thread(thread);//共享一个对象，就是共享一个变量，就像火车票，许多个线程共享一个对象，共享一个变量
	    Thread xc3=new Thread(thread);//每一个线程又是一个线程
	    Thread xc4=new Thread(thread);//单线程不会出现线程安全的问题
	    Thread xc5=new Thread(thread);
	    xc1.start();            //这些都是用户级线程，可以设置成守护线程或者后台线程
	    xc2.start();
	    xc3.start();           //线程调度采用独占的方式
	    xc4.start();
	    xc5.start();
	    
	}

}
