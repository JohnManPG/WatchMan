package com.wangHello;

public class putThread implements Runnable {
	private wareHouse wh;
	public putThread(wareHouse wh) {//ʵ��Runnble�ӿڣ���дrun����
		
		this.wh = wh;//���캯������Ҫ����
	}
	@Override
	public void run() {
		while(true){
		wh.put();	
		}
	}

}
