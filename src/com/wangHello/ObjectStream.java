package com.wangHello;
/**�ⲿ�ֶ����쳣�ʹ���Ľ�������Լ�˼�������ģ���ʾ�кܴ�ĳɾ͸�**/

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
public class ObjectStream {
	public static void test() throws IOException{
		try {
			wangxiang wx1 = new wangxiang("wangxiang",28);//��ס������
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("zengrui1.txt"));
			oo.writeObject(wx1);
			oo.close();	
			
			
			ObjectInputStream os = new ObjectInputStream(new FileInputStream("zengrui1.txt"));
			wangxiang  wx = (wangxiang)os.readObject();  //����������Object����,��Ҫ��������ǿ��ת��
			System.out.println(wx.getName()+"+"+wx.getAge());			
		} catch (Exception e) {			
			System.out.println("�������������쳣");
			e.printStackTrace();
	
		}
	}

	public static void main(String[] args)  throws IOException {
		  ObjectStream.test();
		  System.out.println("�����쳣�󣬼���ִ�д����");
	}
}
