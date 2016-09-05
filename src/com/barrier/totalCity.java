package com.barrier;

import java.util.concurrent.CyclicBarrier;

public class totalCity implements Runnable  {
	private Count count=null;
	public totalCity(Count count) {    
          this.count=count;
	}
	@Override
	public void run() {
	     this.count.totalCount();
	}

}
