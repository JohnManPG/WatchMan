package com.wangHello;

public class yichang {

	public static void main(String[] args) {		
		try{
		int i =10;
		int d = i/0;
		System.out.println(d);
		}catch(Exception e)
		{
			e.printStackTrace();    //还是自己处理的异常好，打印出来后可以让我们修改
			System.out.println("捕获到异常自己处理的结果");
		}finally{
			System.out.println("finally不管有木有异常都是要执行的");						
		}
		System.out.println("继续执行后面的程序");
	}

}
