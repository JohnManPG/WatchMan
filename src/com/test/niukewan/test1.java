package com.test.niukewan;

public class test1 {
      String str = new String("good");
      char []ch=new char[]{'a','b','c'};//test对象的成员变量，可以重新赋值
      
	public static void main(String[] args) {
		test1 test= new test1();
		test.change(test.str,test.ch);//实参传形参
		System.out.println(test.str+"and");
		System.out.println(test.ch);
	}
	  public void change(String str,char ch[]){
		  str="test ok";
		  ch[0]='g';//为数组的第一个位置重新赋值
	  }

}
