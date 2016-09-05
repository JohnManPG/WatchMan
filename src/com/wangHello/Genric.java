package com.wangHello;

import java.util.ArrayList;
import java.util.List;

public class Genric {

	public static void main(String[] args) {
	 List<? super Apple> list=new ArrayList<Food>();//存放的是Apple以及Apple的父类
	 list.add((Apple) new Fruit());//泛型里用的都是引用对象，集合就是容器，用来盛装对象，说明这个以及是Apple类型了
	 list.add(new Apple());
	 list.add((Apple) new Food());//强制转换本身就不是实例的子类，所以会报异常，不能进行数据的访问
	 //List<? extends Food> listf=list;//?是通配符，代表的是Food的所有子类，这是一个父类和子类的列表	 
	 //listf.add(new Apple());//由于子类不确定，所以父类也不确定，所以类型也不确定，所以就不能添加元素，但是可以访问数据
	 System.out.println(list.get(2));
	}
}

//大总结来说：泛型的错误总归是参数类型的不确定性
