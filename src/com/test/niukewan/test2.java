package com.test.niukewan;

public class test2 {

	public static void main(String[] args) {
		String s="hello";
		String t="hello";
		char []c=new char[]{'h','e','l','l','o'};
     System.out.println(s.equals(t));
     System.out.println(t.equals(c));
     System.out.println(s==t);
     System.out.println(t.equals(new String("hello")));//equals()方法比的仅仅是内容
	}

}
