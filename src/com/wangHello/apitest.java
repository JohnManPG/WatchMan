package com.wangHello;
import java.lang.String;

//public String (data[] str1)(){
//	return bytes;
//}

public class apitest{   //实现接口，必须实现接口里所有的方法
	public static void main(String[] args) {
		char []data = {'a','b','c'};
		String str1 = new String(data);
		String str2 ="wangxiang";
		String str3 =str2.replace('a', 'z');//不加引号的都是变量
		str3.matches(str2);
		System.out.println(str3);
	}
}
