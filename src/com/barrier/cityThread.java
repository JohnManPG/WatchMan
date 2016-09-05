package com.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class cityThread implements Runnable{
    private Count count= null;
	private CyclicBarrier barrier = null;
	String city = null;
	public cityThread(CyclicBarrier barrier,Count count,String city){
		this.barrier=barrier;
		this.count=count;
		this.city=city;
	}
	@Override
	public void run() {
		try {
			this.barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		this.count.cityCount(city);
		
	}

}
