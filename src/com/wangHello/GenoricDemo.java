package com.wangHello;

public class GenoricDemo<T>{
	public  <T> T  disp(T t){    //�������η��� ��ʹ�÷��͵ĸ�ʽ��<����>
	      return t;
	}

	public static void main(String[] args) {
		GenoricDemo<String> ff = new GenoricDemo<String>();//�����ǿ����ж�������ģ��������ڼ�����		
		System.out.println(ff.disp("wangxiang"));
		
	}
}
