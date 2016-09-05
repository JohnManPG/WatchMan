package com.Inner;

public class out {  //这是一个外部类
	private static String name="wangxiang";   //字段属性
	public void outmet(){
		System.out.println("zengrui");
	}
	class inner{    //内部类，和字段是一样的地位，类属性，成员内部类
		//private String name = "inner";
		public void disp(){//静态的内部类只能调用静态的外部成员变量
			//out.this.outmet();//out.this是内部类指向外部类的引用，编译的时候有，是其本质,所以可以直接调用就行
			System.out.println(name);   //编译的时候，外部类和内部类是分开的，有两个文件夹，先有外部类，再有内部类
		}        //当内部类和外部类有相同的属性时，this.属性  或者 属性   访问的是内部类的属性，使用out.this.属性，访问的是外部类的属性
	}
	public inner getinner(){//inner类型的
		out o = new out();
		out.inner inner =o.new inner();
		return inner;
	}
	public static void main(String[] args) {
		 out o = new out();//外部类的实例已经有了
		 out.inner inner =o.new inner();//使用静态static修饰内部类时，要独立于所有的实例对象，所以要以完整的内部类名进行访问就行了
		 //没有这个变量，基本都是变量名错了，前面使用的是外部类名称，new的时候使用的外部类的实例
         //直接用内部类的对象无法访问外部类的私有属性和方法
		 inner.disp();	
	}
}
