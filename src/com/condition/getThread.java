package com.condition;

public class getThread extends Thread {
	private warehouse wh;//��˽�б������й��캯�����߷������ͱ���������
	public getThread(warehouse wh) {//�̳�Threadʵ�ּ̳У���дrun������ֱ�ӵ���
		this.wh = wh;
	}
	public void run(){
		while(true){
		wh.get();
		}
	}
}
