package com.barrier;

import java.util.concurrent.CyclicBarrier;

public class barrierTest {

	public static void main(String[] args) {  /** 创建一个新的 CyclicBarrier，它将在给定数量的参与者（线程）处于等待状态时启动，	                                                                                                               并在启动 barrier 时执行给定的屏障操作，该操作由最后一个进入 barrier 的线程执行。*/
		Count count = new Count();	
		totalCity tc = new totalCity(count);
		CyclicBarrier barrier = new CyclicBarrier(4,tc);   //国家统计是一个屏障操作，是一个任务，当四个线程都到达屏障（barrier）时，开始执行屏障操作
		cityThread  ct1 = new cityThread(barrier, count, "四川");
		cityThread  ct2 = new cityThread(barrier, count, "河南");
		cityThread  ct3 = new cityThread(barrier, count, "北京");
		cityThread  ct4 = new cityThread(barrier, count, "上海");
		new Thread(ct1).start();
		new Thread(ct2).start();
		new Thread(ct3).start();
		new Thread(ct4).start();		  //现在的barrier是可以了
	}
}
