package com.Inner;

public class jubuinner {
private String name = "wangxiang";
public Thread  disp(final int num){//就是一个类型的数据
	Thread th=new Thread(new Runnable() {  //匿名内部类必须是java API提供的
		@Override
		public void run() {
		System.out.println(num);
			
		}
	});//线程启动就执行run()方法
	
	 return th;
   //  	class inner{   //局部内部类不能有修饰符，只能是默认的，和其他外部类调用内部类是一样的，都不能有修饰符
   // 		
   //	}	
}
	public static void main(String[] args) {		
		jubuinner nim = new jubuinner();
		nim.disp(1);
	}
}
