package com.test.niukewan;

public class test3 {
	public void first(){
		int i=5;
		Value v= new Value();
		v.i=25;   //����v�����е�i,�ͷ����е�i��һ�������Լ�ʹ���¸�ֵ��Ҳ����ı䷽����i��ֵ
		System.out.println(i);
		second(v,i);
		System.out.println(v.i);
	}
	
	public void second(Value v,int i){
		i=0;
		v.i=20;
		Value val=new Value();
		v=val;
		System.out.println(v.i+" "+i);
		
	}       
	public static void main(String[] args) {   /*��һ�����еı���Ϊ�������еķ���������ʱ��
	��ÿһ�������д����ù������ʵ�������ñ������޸�ʱ����Ӱ�����б��������ֵ������ͼֽ��ʵ�ʸǷ��ӣ���ʵ�ʸ�ʱ�����˲���������ͼֽ�ϵĲ�������Զ��������*/
		test3 test= new test3();
		test.first();
	}
}