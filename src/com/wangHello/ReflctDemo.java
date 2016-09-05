package com.wangHello;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflctDemo {

	public static void main(String[] args) throws Exception {//获取Class对象有三种方法
	//第一种:通过类名，即类字面值获得Class的对象
		 Class clazz1 = ReflctObj.class;//Java中的关键字不能作为变量，一定要牢记，OK
    //第二种:通过实例对象来获得Class对象
	// Class clazz2 = new ReflctObj().getClass();
    //第三种：通过Class本身的forName()方法获取Class对象
	//Class clazz3 = Class.forName("com.wangHello.ReflctObj");//传参要加双引号，是关于目的对象的地址		 
//		 System.out.println("clazz2="+clazz2.getName());
//		 System.out.println("clazz3="+clazz3.getName());
//		 System.out.println("类名="+clazz1.getName());
//		 System.out.println("包名="+clazz1.getPackage());
//		 System.out.println("父类的名称="+clazz1.getSuperclass());
//		 System.out.println("简单的类名="+clazz1.getSimpleName());
//		 System.out.println("未知="+clazz1.getModifiers());
//		   Constructor []cons = clazz1.getConstructors();
//		   ReflctObj res  = (ReflctObj) cons[0].newInstance();
//		   ReflctObj res1 = (ReflctObj) cons[1].newInstance("wangxiang",24);
//		   System.out.println(res.getAge()+"和"+res1.getName());//位置指针，一定要仔细看API文档
		 //总结:直接去API中查找该类的方法,如果没有传参，则返回的是0
		 Method met = clazz1.getMethod("getName", String.class);//获取这个方法,这个参数列表是Class类型的
	     //方法名+参数列表Class类型
		 Object ooo=met.invoke(clazz1.newInstance(), "wangxiang");	
		 System.out.println(ooo);
		 }		 
	}

