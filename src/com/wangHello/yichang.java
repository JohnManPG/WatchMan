package com.wangHello;

public class yichang {

	public static void main(String[] args) {		
		try{
		int i =10;
		int d = i/0;
		System.out.println(d);
		}catch(Exception e)
		{
			e.printStackTrace();    //�����Լ�������쳣�ã���ӡ����������������޸�
			System.out.println("�����쳣�Լ�����Ľ��");
		}finally{
			System.out.println("finally������ľ���쳣����Ҫִ�е�");						
		}
		System.out.println("����ִ�к���ĳ���");
	}

}
