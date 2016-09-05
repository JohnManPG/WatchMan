package com.wangHello;

public class Ason extends Afather {
	
//	public void eat(){
//		System.out.println("吃son");
//	}   //重写这个方法，同一种行为的不同表现形式
	
	public void go(){
		System.out.println("Hello 儿子");
	}
	public void eat(){
		System.out.println("吃son");
      //通过继承实现多态，同一种行为的不同表现形式，如果抽象类和子类有共同的实例方法
     //那么在使用父类的引用指向子类的对象时，创建对象后，在引用该方法时，那么先调用子类的方法，再调用父类的该方法
		}

	public static void main(String[] args) {
		Afather Af = new Ason();//通过父类的引用指向子类的对象,动态绑定
		Af.eat();
//		Af.go();
	}

}
