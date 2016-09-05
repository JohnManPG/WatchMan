package com.wangHello;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class serverUDP {

	public static void main(String[] args) {		
		//接收
		DatagramSocket server = null;
		try {
		 server = new DatagramSocket(8018);
		 byte []senddata = new byte[1024];
		 byte []receivedata = new byte[1024];
		 System.out.println("服务端监听...");
		 
		 while (true){          //死循环，一直活着,服务端要一直监听客户端的请求
			 DatagramPacket receivePacket = new DatagramPacket(receivedata,receivedata.length);
			 server.receive(receivePacket);
			 
			 String receiveLine = new String(receivePacket.getData());
			 System.out.println("server:"+receiveLine);
			 
			 InetAddress clientIp = receivePacket.getAddress();
			 int port = receivePacket.getPort();
			 String sendLine = "wangxiang:"+receiveLine;
			 
			 senddata=sendLine.getBytes();
			 //发送
			 DatagramPacket sendpacket= new DatagramPacket(senddata, senddata.length, clientIp, port);
			 server.send(sendpacket);
		 }
		  
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
		  if(server!=null){
			server.close();
			}
			
		}

	}

}
