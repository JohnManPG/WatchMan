package com.wangHello;

public class person {
	private String name;//修饰符+类型+变量名
	private int age;
	public String getInfo(){
		return name+"_"+age;		
	}
	
	public person(String name,int age){     //构造函数，修饰符+类名（参数列表）
		System.out.println("有参构造函数");
		this.name=name;
		this.age=age;
	}
	
	public person (){
		System.out.println("无参构造函数");
	}
	public static void main(String[] args){
	person p = new person("wangxiang",23);
//	p=null;           //释放对象所占用的内存空间
	p.getInfo();
	System.out.println(p.getInfo());
	}	
}
