package com.wangHello;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {

	public static void main(String[] args) {
    List list = new CopyOnWriteArrayList();   //���������ָ������Ķ���
	list.add("wangxiang");
	list.add("11");    //ÿ�ڼ�����洢һ�����ݣ����Ǵ洢һ������һ�����ݾ���һ������
	list.add("22");    //ͨ��add()�������򼯺�����Ӷ���
	list.add("22");    //���쳣�Ͳ���ִ������������
	list.add("aa");      //
	list.add("zengrui");
	list.add( "haha");
	for (Object object : list) {//ð��ǰ����ʵ������ð�ź�������Ҫ�����ļ��϶���
		list.remove("wangxiang");
		System.out.println(object.toString());
	}
	}//arraylist,linkedlist,vector

}
