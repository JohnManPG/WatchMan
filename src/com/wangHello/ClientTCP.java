package com.wangHello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTCP {
	public static void main(String[] args){//输入输出流没有深入的理解，在这遇到了问题，网络编程没问题，主要是Java IO这方面没有熟悉的掌握。
		Socket clientsockt=null;
		OutputStream os=null;
		BufferedReader in=null;
		try {
			clientsockt = new Socket("localhost", 8018);
			os = clientsockt.getOutputStream();
			in = new BufferedReader(new InputStreamReader(clientsockt.getInputStream()));
			int c;                                
			String strresponse = "";     //定义一个字符串接收输入流
			while (true){
				while ((c=System.in.read())!=-1){
					os.write(c);   //读完输入流后，将字节写入到输出缓冲流中
					if(c=='\n'){
						os.flush();  //网络也是一种外部设备
					    break;
					}					
				}
				strresponse=in.readLine();
				System.out.println("客户端接收到："+strresponse);
			}
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
		  try {
			os.close();
			in.close();
			clientsockt.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
						
		}
		     //这一个客户端的程序完成了		
		
		//建立了连接，接下来需要客户端和服务器端进行交流沟通，也就是要写输入输出流
		//抽象类不能实例化，使用socket对象获得OutputStream的实例对象，所以这些输出流以及包含了IP地址和端口
		//肯定是要获得输出流的，因为服务器要得到客户端的IP地址和端口才能通信，客户端要打包好自己的详细信息
		//InputStream in = clientsockt.getInputStream();
		//获得输入流，是从服务器获得得，需要读出来
		
		//创建一个缓冲流对象，使用InputStreamReader将字节转换成字符,传进去一个输入流对象					
	}

}
