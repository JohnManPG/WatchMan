package com.wangHello;
import java.lang.String;

//public String (data[] str1)(){
//	return bytes;
//}

public class apitest{   //ʵ�ֽӿڣ�����ʵ�ֽӿ������еķ���
	public static void main(String[] args) {
		char []data = {'a','b','c'};
		String str1 = new String(data);
		String str2 ="wangxiang";
		String str3 =str2.replace('a', 'z');//�������ŵĶ��Ǳ���
		str3.matches(str2);
		System.out.println(str3);
	}
}
