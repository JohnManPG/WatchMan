package com.condition;

public class testThread {
	public static void main(String[] args) {
		warehouse wh = new warehouse();
		putThread put = new putThread(wh);//��������һ�����󣬴����Լ��Ķ�����
		getThread get = new getThread(wh);//�����̴߳�������󣬽�������󴫽�ȥ
		get.start();
	    new Thread(put).start();
	}

}
