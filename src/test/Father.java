package test;

public class Father {
	private static final String MESSAGE="taobao";
	public static void main(String[] args){
		String a="tao"+"bao";
		String b="tao";
		String c="bao";
		System.out.println(a==MESSAGE);
		System.out.println((b+c)==MESSAGE);//b+c相当于new了一个新对象
	        //1.字符串在Java中存储在字符串常量区中
	}

}
