package com.wangHello;

import java.util.ArrayList;
import java.util.List;

public class GenricFanx {

	public static void main(String[] args) {
	  List<String> list = new ArrayList<String>();
	  list.add("zengrui");
	  list.add("wangxiang");	 //���;���ͳһ���ݵ����� 
	  for (String string : list) {
		System.out.println(string.toString());
	}
	}
}
