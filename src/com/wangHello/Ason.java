package com.wangHello;

public class Ason extends Afather {
	
//	public void eat(){
//		System.out.println("��son");
//	}   //��д���������ͬһ����Ϊ�Ĳ�ͬ������ʽ
	
	public void go(){
		System.out.println("Hello ����");
	}
	public void eat(){
		System.out.println("��son");
      //ͨ���̳�ʵ�ֶ�̬��ͬһ����Ϊ�Ĳ�ͬ������ʽ�����������������й�ͬ��ʵ������
     //��ô��ʹ�ø��������ָ������Ķ���ʱ����������������ø÷���ʱ����ô�ȵ�������ķ������ٵ��ø���ĸ÷���
		}

	public static void main(String[] args) {
		Afather Af = new Ason();//ͨ�����������ָ������Ķ���,��̬��
		Af.eat();
//		Af.go();
	}

}
