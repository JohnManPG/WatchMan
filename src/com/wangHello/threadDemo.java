package com.wangHello;


public class threadDemo implements Runnable {//�߳̾��Ǵ���飬�߳̾���һ���࣬����һ�����ֽ�threadDemo���߳�
	private int apple = 100; //ֱ�Ӹ�ֵ
	public void run(){		
		while(true){
			test();
	}                              
	}                                //1.synchronized���ε��Ǿ��������̵߳Ĵ����
	public synchronized void test(){ //2.��synchronized���η����������߳��г��ֲ���ȷ������
		
			if(apple>0){				
				try {
					Thread.sleep(100);  //Thread���ǵ�ǰ�̣߳��õ�ǰ�߳�����
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"->"+apple--);
			}
		}	

	public static void main(String[] args) throws InterruptedException {//�����������������߳�
		threadDemo thread = new threadDemo();
	    Thread xc1=new Thread(thread); //���ڼ̳��ǵ��̳У����Բ����ڴ������չ��һ��ʵ���߳�ʹ�ýӿڣ�Runnable //���û��߳�ִ����Ϻ��˳���������Ͳ���ִ�к�̨�߳���	     
	    Thread xc2=new Thread(thread);//����һ�����󣬾��ǹ���һ�������������Ʊ�������̹߳���һ�����󣬹���һ������
	    Thread xc3=new Thread(thread);//ÿһ���߳�����һ���߳�
	    Thread xc4=new Thread(thread);//���̲߳�������̰߳�ȫ������
	    Thread xc5=new Thread(thread);
	    xc1.start();            //��Щ�����û����̣߳��������ó��ػ��̻߳��ߺ�̨�߳�
	    xc2.start();
	    xc3.start();           //�̵߳��Ȳ��ö�ռ�ķ�ʽ
	    xc4.start();
	    xc5.start();
	    
	}

}
