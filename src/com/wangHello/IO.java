package com.wangHello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO {

	public static void main(String[] args) {
	   File file = new File("F:\\wangxiang.txt"); //需要传入参数才能使用构造函数进行实例化一个函数	
	   try {
		file.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
	   try {
		FileInputStream in = new FileInputStream(file);
		byte []test = new byte[1024];
		int c;
		while((c=in.read(test)) != -1){
		    System.out.println(c);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
//       System.out.println(file.getName());
//       System.out.println(file.getAbsolutePath());
//       System.out.println(file.getParent());
//       System.out.println(file.exists());
	  
	}

}
