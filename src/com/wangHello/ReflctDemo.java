package com.wangHello;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflctDemo {

	public static void main(String[] args) throws Exception {//��ȡClass���������ַ���
	//��һ��:ͨ����������������ֵ���Class�Ķ���
		 Class clazz1 = ReflctObj.class;//Java�еĹؼ��ֲ�����Ϊ������һ��Ҫ�μǣ�OK
    //�ڶ���:ͨ��ʵ�����������Class����
	// Class clazz2 = new ReflctObj().getClass();
    //�����֣�ͨ��Class�����forName()������ȡClass����
	//Class clazz3 = Class.forName("com.wangHello.ReflctObj");//����Ҫ��˫���ţ��ǹ���Ŀ�Ķ���ĵ�ַ		 
//		 System.out.println("clazz2="+clazz2.getName());
//		 System.out.println("clazz3="+clazz3.getName());
//		 System.out.println("����="+clazz1.getName());
//		 System.out.println("����="+clazz1.getPackage());
//		 System.out.println("���������="+clazz1.getSuperclass());
//		 System.out.println("�򵥵�����="+clazz1.getSimpleName());
//		 System.out.println("δ֪="+clazz1.getModifiers());
//		   Constructor []cons = clazz1.getConstructors();
//		   ReflctObj res  = (ReflctObj) cons[0].newInstance();
//		   ReflctObj res1 = (ReflctObj) cons[1].newInstance("wangxiang",24);
//		   System.out.println(res.getAge()+"��"+res1.getName());//λ��ָ�룬һ��Ҫ��ϸ��API�ĵ�
		 //�ܽ�:ֱ��ȥAPI�в��Ҹ���ķ���,���û�д��Σ��򷵻ص���0
		 Method met = clazz1.getMethod("getName", String.class);//��ȡ�������,��������б���Class���͵�
	     //������+�����б�Class����
		 Object ooo=met.invoke(clazz1.newInstance(), "wangxiang");	
		 System.out.println(ooo);
		 }		 
	}

