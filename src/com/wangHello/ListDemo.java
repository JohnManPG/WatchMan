package com.wangHello;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {

	public static void main(String[] args) {
    List list = new CopyOnWriteArrayList();   //父类的引用指向子类的对象
	list.add("wangxiang");
	list.add("11");    //每在集合里存储一个数据，就是存储一个对象，一条数据就是一个对象
	list.add("22");    //通过add()方法，向集合里添加对象
	list.add("22");    //有异常就不会执行下面的语句了
	list.add("aa");      //
	list.add("zengrui");
	list.add( "haha");
	for (Object object : list) {//冒号前面是实例对象，冒号后面是需要迭代的集合对象
		list.remove("wangxiang");
		System.out.println(object.toString());
	}
	}//arraylist,linkedlist,vector

}
