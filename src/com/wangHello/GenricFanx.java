package com.wangHello;

import java.util.ArrayList;
import java.util.List;

public class GenricFanx {

	public static void main(String[] args) {
	  List<String> list = new ArrayList<String>();
	  list.add("zengrui");
	  list.add("wangxiang");	 //泛型就是统一数据的类型 
	  for (String string : list) {
		System.out.println(string.toString());
	}
	}
}
