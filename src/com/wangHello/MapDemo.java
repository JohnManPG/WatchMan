package com.wangHello;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {        //������Ҫ����ѧϰʲôʱ����Hash������ʲôʱ���ú����

	public static void main(String[] args) {
		//Map map = new HashMap();
		//Map map = new TreeMap();
		Map map = new ConcurrentHashMap();//ʹ�ò�����ʵ���̰߳�ȫ
	    map.put(1, "wangxiang1");
	    map.put(2, "wangxiang2");
	    map.put(3, "wangxiang3");
	    map.put(4, "wangxiang4");
	    map.put(5, "wangxiang5");
	    Iterator iterator = map.entrySet().iterator();//Java�еķ���������ص����࣬��ô��������صĻ����Ͽ��Լ������ø���ķ�����һ��Ҫѧ����API�ĵ����������
	    while(iterator.hasNext()){
	    	System.out.println(iterator.next());
	    }			
		} //Map������collection���ǵ�����һ�����ݽṹ�Ľӿڣ�������������ѧϰ
	     // map.entrySet().iterator();
         // System.out.println(map.entrySet().iterator());
	}

