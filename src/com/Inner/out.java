package com.Inner;

public class out {  //����һ���ⲿ��
	private static String name="wangxiang";   //�ֶ�����
	public void outmet(){
		System.out.println("zengrui");
	}
	class inner{    //�ڲ��࣬���ֶ���һ���ĵ�λ�������ԣ���Ա�ڲ���
		//private String name = "inner";
		public void disp(){//��̬���ڲ���ֻ�ܵ��þ�̬���ⲿ��Ա����
			//out.this.outmet();//out.this���ڲ���ָ���ⲿ������ã������ʱ���У����䱾��,���Կ���ֱ�ӵ��þ���
			System.out.println(name);   //�����ʱ���ⲿ����ڲ����Ƿֿ��ģ��������ļ��У������ⲿ�࣬�����ڲ���
		}        //���ڲ�����ⲿ������ͬ������ʱ��this.����  ���� ����   ���ʵ����ڲ�������ԣ�ʹ��out.this.���ԣ����ʵ����ⲿ�������
	}
	public inner getinner(){//inner���͵�
		out o = new out();
		out.inner inner =o.new inner();
		return inner;
	}
	public static void main(String[] args) {
		 out o = new out();//�ⲿ���ʵ���Ѿ�����
		 out.inner inner =o.new inner();//ʹ�þ�̬static�����ڲ���ʱ��Ҫ���������е�ʵ����������Ҫ���������ڲ��������з��ʾ�����
		 //û������������������Ǳ��������ˣ�ǰ��ʹ�õ����ⲿ�����ƣ�new��ʱ��ʹ�õ��ⲿ���ʵ��
         //ֱ�����ڲ���Ķ����޷������ⲿ���˽�����Ժͷ���
		 inner.disp();	
	}
}
