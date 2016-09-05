package com.wangHello;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class wareHouse {
	private boolean isFull = false;
	private Semaphore sem =new Semaphore(1);     //一次只能获得一个许可，这样的话达到了互斥的效果
	public  void put(){    //这是一个公共类，定义了两个方法，分别用两个线程来执行，线程是CPU执行的最小单位				
			try{		   
		    if(!isFull){       //信号量semaphore许可减到0是说明没有许可了，信号量可以有多个许可，控制有多少线程访问，线程执行完等释放了以后，就可以有许可，继续为线程分配许可
		    sem.acquire();   //获得和释放都是在资源项的边界，一个在最前面，一个在最后面，通过acquire()获得许可，通过release()释放许可
			System.out.println("空的，放东西！！！");        // try里面是要执行的该项
			isFull=!isFull;  //变量isFull是false	
			sem.release();
			}
				}catch(Exception e){
				e.printStackTrace();
			}
					
		}								
	public void get(){	  
		try{            //这些基本的运算符要运用熟练			
		    if(isFull){	
		    sem.acquire();
			System.out.println("满的，拿东西！！！");
			isFull=!isFull;   //变量isFull是true	
			sem.release();
			}
		}catch(Exception e){
				e.printStackTrace();
			}
		}
	 }
	
	
	
	
	/**
	 * 使用重入锁达到线程安全，，是一个阻塞的方式
	 * private ReentrantLock lock = new ReentrantLock(); 
	private boolean isFull = false;
	public  void put(){    //这是一个公共类，定义了两个方法，分别用两个线程来执行，线程是CPU执行的最小单位		
		if(!isFull){
			try{
			lock.lock();
			System.out.println("空的，放东西！！！");
			isFull=!isFull;  //变量isFull是false			   
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				lock.unlock();//最后一定要干什么的，一般放在finally里
			}		
		}
						
	}		
	public void get(){	          //这些基本的运算符要运用熟练	
		if(isFull){
			try{
			lock.lock();
			System.out.println("满的，拿东西！！！");
			isFull=!isFull;   //变量isFull是true					  
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
	 }**/

	
