package com.condition;

public class putThread implements Runnable {
	private warehouse wh;
	public putThread(warehouse wh) {//ʵ��Runnble�ӿڣ���дrun����
		
		this.wh = wh;//���캯������Ҫ����
	}
	@Override
	public void run() {
		while(true){
		wh.put();	
		}
	}

}
