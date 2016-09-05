package com.wangHello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {

	public static void main(String[] args) {	//发送给服务端的数据前提是在客户端进行读取  
		BufferedReader in = null;
		DatagramSocket client = null;
		try {
		  in = new BufferedReader(new InputStreamReader(System.in));//使用标准的输入流，这句话使用输入缓冲流，使用字节到字符的转换，使用标准输入流
		  client = new DatagramSocket();  //DatagramSocket此类用来发送和接收数据报包的套接字
		  InetAddress ipaddress = InetAddress.getByName("localhost");
		  byte  []send = new byte[1024];//定义两个数组，一个盛装发送的数据，一个盛装接收的数据
		  byte  []received = new byte[1024];    //敲多了，看多了，自然就明白了
		  String sendLine=in.readLine();//通过缓冲流中的readLine()方法，读取字符串
		  send=sendLine.getBytes();//通过字符串的getBytes()方法，存储在数组中
		  //UDP发送数据报包
		  DatagramPacket sendPacket = new DatagramPacket(send, send.length, ipaddress, 8018);
		  client.send(sendPacket);
		  //UDP接收数据报包
		  DatagramPacket receivedPacket = new DatagramPacket(received,received.length);
		  client.receive(receivedPacket);
		  String receiveLine = new String(receivedPacket.getData());//将数组作为参数通过String构造函数生成实例，可以将数组变成字符串打印出来
		  System.out.println("receive:"+receiveLine);
		  
	} catch (Exception e) {
		e.printStackTrace();
	} finally{//用来关闭我们的一些资源
		try {
			in.close();//关闭输入流
			client.close();//关闭连接
		} catch (IOException e) {			
			e.printStackTrace();
		}				
	}	  
	}
}
