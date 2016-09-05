package com.wangHello;

public enum color {
    RED("红色",0),BLACK("黑色",1),WHITE("白色",2);  //有其他属性必须有分号,生成对象时，记得注意构造函数中的参数，否则会出错，说什么变量没有被声明
	private String name;//这些都是枚举的对象
	private int ordinal;
	public void disp(){	
    	System.out.println("disp()");
	}
	private color(String name,int ordinal){  //这个是形参，需要去传参
		this.name=name;   //成员中的变量
		this.ordinal=ordinal;
	}
}
