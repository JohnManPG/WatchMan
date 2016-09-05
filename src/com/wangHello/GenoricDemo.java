package com.wangHello;

public class GenoricDemo<T>{
	public  <T> T  disp(T t){    //泛型修饰方法 ，使用泛型的格式：<类型>
	      return t;
	}

	public static void main(String[] args) {
		GenoricDemo<String> ff = new GenoricDemo<String>();//泛型是可以有多个参数的，可以用在集合里		
		System.out.println(ff.disp("wangxiang"));
		
	}
}
