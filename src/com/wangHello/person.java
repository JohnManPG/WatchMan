package com.wangHello;

public class person {
	private String name;//���η�+����+������
	private int age;
	public String getInfo(){
		return name+"_"+age;		
	}
	
	public person(String name,int age){     //���캯�������η�+�����������б�
		System.out.println("�вι��캯��");
		this.name=name;
		this.age=age;
	}
	
	public person (){
		System.out.println("�޲ι��캯��");
	}
	public static void main(String[] args){
	person p = new person("wangxiang",23);
//	p=null;           //�ͷŶ�����ռ�õ��ڴ�ռ�
	p.getInfo();
	System.out.println(p.getInfo());
	}	
}
