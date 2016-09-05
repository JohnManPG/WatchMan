package com.wangHello;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {        //接下来要深入学习什么时候用Hash函数，什么时候用红黑树

	public static void main(String[] args) {
		//Map map = new HashMap();
		//Map map = new TreeMap();
		Map map = new ConcurrentHashMap();//使用并发类实现线程安全
	    map.put(1, "wangxiang1");
	    map.put(2, "wangxiang2");
	    map.put(3, "wangxiang3");
	    map.put(4, "wangxiang4");
	    map.put(5, "wangxiang5");
	    Iterator iterator = map.entrySet().iterator();//Java中的方法如果返回的是类，那么在这个返回的基础上可以继续调用该类的方法，一定要学会用API文档，解决问题
	    while(iterator.hasNext()){
	    	System.out.println(iterator.next());
	    }			
		} //Map独立于collection，是单独的一个数据结构的接口，可以用来单独学习
	     // map.entrySet().iterator();
         // System.out.println(map.entrySet().iterator());
	}

