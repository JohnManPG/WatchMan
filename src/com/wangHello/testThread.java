package com.wangHello;

public class testThread {
	public static void main(String[] args) {
		wareHouse wh = new wareHouse();
		putThread put = new putThread(wh);//��������һ�����󣬴����Լ��Ķ�����
		getThread get = new getThread(wh);//�����̴߳�������󣬽�������󴫽�ȥ
		get.start();
	    new Thread(put).start();
	}

}
