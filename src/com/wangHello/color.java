package com.wangHello;

public enum color {
    RED("��ɫ",0),BLACK("��ɫ",1),WHITE("��ɫ",2);  //���������Ա����зֺ�,���ɶ���ʱ���ǵ�ע�⹹�캯���еĲ�������������˵ʲô����û�б�����
	private String name;//��Щ����ö�ٵĶ���
	private int ordinal;
	public void disp(){	
    	System.out.println("disp()");
	}
	private color(String name,int ordinal){  //������βΣ���Ҫȥ����
		this.name=name;   //��Ա�еı���
		this.ordinal=ordinal;
	}
}
