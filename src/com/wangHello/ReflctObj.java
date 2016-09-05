package com.wangHello;

public class ReflctObj {
	private int age;
	private String name = "wangxiang";
	public ReflctObj(){
		
	}
	public ReflctObj(String name,int age){
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {//这是访问器和构造器
		this.age = age;
	}
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
