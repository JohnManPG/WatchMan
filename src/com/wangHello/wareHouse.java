package com.wangHello;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class wareHouse {
	private boolean isFull = false;
	private Semaphore sem =new Semaphore(1);     //һ��ֻ�ܻ��һ����ɣ������Ļ��ﵽ�˻����Ч��
	public  void put(){    //����һ�������࣬�����������������ֱ��������߳���ִ�У��߳���CPUִ�е���С��λ				
			try{		   
		    if(!isFull){       //�ź���semaphore��ɼ���0��˵��û������ˣ��ź��������ж����ɣ������ж����̷߳��ʣ��߳�ִ������ͷ����Ժ󣬾Ϳ�������ɣ�����Ϊ�̷߳������
		    sem.acquire();   //��ú��ͷŶ�������Դ��ı߽磬һ������ǰ�棬һ��������棬ͨ��acquire()�����ɣ�ͨ��release()�ͷ����
			System.out.println("�յģ��Ŷ���������");        // try������Ҫִ�еĸ���
			isFull=!isFull;  //����isFull��false	
			sem.release();
			}
				}catch(Exception e){
				e.printStackTrace();
			}
					
		}								
	public void get(){	  
		try{            //��Щ�����������Ҫ��������			
		    if(isFull){	
		    sem.acquire();
			System.out.println("���ģ��ö���������");
			isFull=!isFull;   //����isFull��true	
			sem.release();
			}
		}catch(Exception e){
				e.printStackTrace();
			}
		}
	 }
	
	
	
	
	/**
	 * ʹ���������ﵽ�̰߳�ȫ������һ�������ķ�ʽ
	 * private ReentrantLock lock = new ReentrantLock(); 
	private boolean isFull = false;
	public  void put(){    //����һ�������࣬�����������������ֱ��������߳���ִ�У��߳���CPUִ�е���С��λ		
		if(!isFull){
			try{
			lock.lock();
			System.out.println("�յģ��Ŷ���������");
			isFull=!isFull;  //����isFull��false			   
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				lock.unlock();//���һ��Ҫ��ʲô�ģ�һ�����finally��
			}		
		}
						
	}		
	public void get(){	          //��Щ�����������Ҫ��������	
		if(isFull){
			try{
			lock.lock();
			System.out.println("���ģ��ö���������");
			isFull=!isFull;   //����isFull��true					  
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
	 }**/

	
