package com.wangHello;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class yichangnew {
	
	public void  testyi() throws Exception {    //�����ܵ��쳣�׳���������������������ķ������ô˷�����Ҳֱ���׳��쳣����ô�����main�����б���Ҫ�����쳣	
		FileInputStream oo = new FileInputStream(new File("wangxiang.txt"));
	}  //���쳣
	
	
	

	public static void main(String[] args) throws Exception { 
		//throws������һ���쳣���п���Ҫ�׳�һ���쳣
		yichangnew yi = new yichangnew();  //main������Ҳ���Խ��쳣�׳�������
			yi.testyi();
			}
	}
	
