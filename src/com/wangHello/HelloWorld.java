package com.wangHello;

public class HelloWorld {
	public void disp(){
		System.out.println("wangxiang");
	}
	public void disp(int age){
		System.out.println(age);
		
	}
	public char disp(char name){
		return name;
	}
//	public String disp(){
//		
//	}

	public static void main(String[] args) {
	HelloWorld h = new HelloWorld();
	h.disp(12);
//	h.disp();
	}

}
