package com.test.niukewan;

public class test1 {
      String str = new String("good");
      char []ch=new char[]{'a','b','c'};//test����ĳ�Ա�������������¸�ֵ
      
	public static void main(String[] args) {
		test1 test= new test1();
		test.change(test.str,test.ch);//ʵ�δ��β�
		System.out.println(test.str+"and");
		System.out.println(test.ch);
	}
	  public void change(String str,char ch[]){
		  str="test ok";
		  ch[0]='g';//Ϊ����ĵ�һ��λ�����¸�ֵ
	  }

}
