package com.wangHello;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;


public class wangxiang implements Externalizable {   //ֻ��ʵ��Serializable�ӿڵĲ��ܱ�д������
	private String name;//��������л�������Ҫ���������Ķ���
	private int age;
	private  static String address="�ɶ�";//˽�еı���ͨ����������ѡ��

	
public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		wangxiang.address = address;
	}
	public wangxiang() {		
	}		
	public wangxiang(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
//		 out.writeObject(other);
		 out.writeObject(this.name);
		 out.writeInt(age);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {		    
		    this.name=(String) in.readObject();
		    this.age=in.readInt();
//		    this.other=(Otherxuliehua)in.readObject();
		
	}
}
