package com.barrier;
//这是一个屏障，四个线程需要互相等待
public class Count {
	public void totalCount(){                    //国家人口统计就是一个屏障           
		System.out.println("国家人口统计开始执行");
	}
	public void cityCount(String city){          //这是省会人口统计，只有这四个人口统计都完成了，那么才会执行国家人口统计
		System.out.println(city+"完成人口统计");
		
	}

}
