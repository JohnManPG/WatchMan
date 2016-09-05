package com.wangHello;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicBank {
  private AtomicLong balance = null;//ǰ���ǣ������������
  public AtomicBank(int money){                  //дһ�����췽��Ϊ���������ֵ
	  balance = new AtomicLong(money);      //ͨ��ԭ����Ķ���Ϊ���������ֵ���������и�����ʼֵ���� AtomicLong��
	  System.out.println("����:"+money);
  }
  //ȡǮ
  public void getMoney(int money){   //ʹ��ԭ��ʵ�����̰߳�ȫ
	  Long curMoney = balance.get();
	              //System.out.println(curMoney);//��Ӳ��Ե����
	  if (curMoney>0){
		  try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  if(this.balance.compareAndSet(curMoney, curMoney-money)){//����ֵ����ֵ���������ֵ��Atomic��ֵһ��������ֵ����Atomic
	   System.out.println(Thread.currentThread().getName()+"->"+curMoney);
	   }
	  }	  
  }
}
