package com.wangHello;

public class gouzhao {
	private int  age;
	private String name;
	
	public gouzhao(){
		System.out.println("�޲ι��캯��");
	}
	public gouzhao(String name){
		
	}
	public gouzhao(String name,int age){  //���췽������������ʵ����
		this.age=age;
		this.name=name;
	}
	public gouzhao(int age){
		
	}

	public static void main(String[] args) {
		gouzhao gou1= new gouzhao("wnagxiang",12);
		System.out.println(gou1.age+gou1.name);//���캯�����������������
		

	}

}
