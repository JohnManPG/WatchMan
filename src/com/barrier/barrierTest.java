package com.barrier;

import java.util.concurrent.CyclicBarrier;

public class barrierTest {

	public static void main(String[] args) {  /** ����һ���µ� CyclicBarrier�������ڸ��������Ĳ����ߣ��̣߳����ڵȴ�״̬ʱ������	                                                                                                               �������� barrier ʱִ�и��������ϲ������ò��������һ������ barrier ���߳�ִ�С�*/
		Count count = new Count();	
		totalCity tc = new totalCity(count);
		CyclicBarrier barrier = new CyclicBarrier(4,tc);   //����ͳ����һ�����ϲ�������һ�����񣬵��ĸ��̶߳��������ϣ�barrier��ʱ����ʼִ�����ϲ���
		cityThread  ct1 = new cityThread(barrier, count, "�Ĵ�");
		cityThread  ct2 = new cityThread(barrier, count, "����");
		cityThread  ct3 = new cityThread(barrier, count, "����");
		cityThread  ct4 = new cityThread(barrier, count, "�Ϻ�");
		new Thread(ct1).start();
		new Thread(ct2).start();
		new Thread(ct3).start();
		new Thread(ct4).start();		  //���ڵ�barrier�ǿ�����
	}
}
