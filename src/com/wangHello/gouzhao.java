package com.wangHello;

public class gouzhao {
	private int  age;
	private String name;
	
	public gouzhao(){
		System.out.println("无参构造函数");
	}
	public gouzhao(String name){
		
	}
	public gouzhao(String name,int age){  //构造方法就是来创建实例的
		this.age=age;
		this.name=name;
	}
	public gouzhao(int age){
		
	}

	public static void main(String[] args) {
		gouzhao gou1= new gouzhao("wnagxiang",12);
		System.out.println(gou1.age+gou1.name);//构造函数是用来创建对象的
		

	}

}
