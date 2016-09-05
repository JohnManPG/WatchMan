package com.wangHello;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {

	public static void main(String[] args) {
		 Set set = Collections.synchronizedSet(new TreeSet());//现在是线程安全的集合
		 set.add("wangxiang");
		 set.add("11");
		 set.add("11");
		 set.add("wangxiang");
		 set.add("22");	
		 for (Object object : set) {
			System.out.println(object.toString());
		}

	}//hashset,treeset

}
