package com.test.niukewan;

public class test3 {
	public void first(){
		int i=5;
		Value v= new Value();
		v.i=25;   //这是v对象中的i,和方法中的i不一样，所以即使重新赋值，也不会改变方法中i的值
		System.out.println(i);
		second(v,i);
		System.out.println(v.i);
	}
	
	public void second(Value v,int i){
		i=0;
		v.i=20;
		Value val=new Value();
		v=val;
		System.out.println(v.i+" "+i);
		
	}       
	public static void main(String[] args) {   /*当一个类中的变量为其他类中的方法所共享时，
	在每一个方法中创建该共享类的实例来调用变量并修改时，不影响类中变量本身的值，就想图纸和实际盖房子，当实际盖时，改了参数，但是图纸上的参数是永远都不会变的*/
		test3 test= new test3();
		test.first();
	}
}