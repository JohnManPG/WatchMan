package com.wangHello;

public class getThread extends Thread {
	private wareHouse wh;//��˽�б������й��캯�����߷������ͱ���������
	public getThread(wareHouse wh) {//�̳�Threadʵ�ּ̳У���дrun������ֱ�ӵ���
		this.wh = wh;
	}
	public void run(){
		while(true){
		wh.get();
		}
	}
}
