package com.condition;

public class testThread {
	public static void main(String[] args) {
		warehouse wh = new warehouse();
		putThread put = new putThread(wh);//共用这样一个对象，传进自己的对象中
		getThread get = new getThread(wh);//都是线程创建对象后，将共享对象传进去
		get.start();
	    new Thread(put).start();
	}

}
