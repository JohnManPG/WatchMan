package com.Inner;

public class jubuinner {
private String name = "wangxiang";
public Thread  disp(final int num){//����һ�����͵�����
	Thread th=new Thread(new Runnable() {  //�����ڲ��������java API�ṩ��
		@Override
		public void run() {
		System.out.println(num);
			
		}
	});//�߳�������ִ��run()����
	
	 return th;
   //  	class inner{   //�ֲ��ڲ��಻�������η���ֻ����Ĭ�ϵģ��������ⲿ������ڲ�����һ���ģ������������η�
   // 		
   //	}	
}
	public static void main(String[] args) {		
		jubuinner nim = new jubuinner();
		nim.disp(1);
	}
}
