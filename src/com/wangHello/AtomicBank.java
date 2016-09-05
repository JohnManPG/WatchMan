package com.wangHello;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicBank {
  private AtomicLong balance = null;//前提是：单个共享变量
  public AtomicBank(int money){                  //写一个构造方法为共享变量赋值
	  balance = new AtomicLong(money);      //通过原子类的对象为共享变量赋值，创建具有给定初始值的新 AtomicLong。
	  System.out.println("总账:"+money);
  }
  //取钱
  public void getMoney(int money){   //使用原子实现了线程安全
	  Long curMoney = balance.get();
	              //System.out.println(curMoney);//添加测试的语句
	  if (curMoney>0){
		  try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  if(this.balance.compareAndSet(curMoney, curMoney-money)){//期望值和新值，如果期望值和Atomic的值一样，则将新值赋给Atomic
	   System.out.println(Thread.currentThread().getName()+"->"+curMoney);
	   }
	  }	  
  }
}
