package com.wangHello;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class yichangnew {
	
	public void  testyi() throws Exception {    //将可能的异常抛出，并不处理，如果有其他的方法调用此方法，也直接抛出异常，那么到最后main函数中必须要处理异常	
		FileInputStream oo = new FileInputStream(new File("wangxiang.txt"));
	}  //有异常
	
	
	

	public static void main(String[] args) throws Exception { 
		//throws是声明一个异常，有可能要抛出一个异常
		yichangnew yi = new yichangnew();  //main函数中也可以将异常抛出不处理
			yi.testyi();
			}
	}
	
