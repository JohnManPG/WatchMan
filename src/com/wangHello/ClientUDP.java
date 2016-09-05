package com.wangHello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {

	public static void main(String[] args) {	//���͸�����˵�����ǰ�����ڿͻ��˽��ж�ȡ  
		BufferedReader in = null;
		DatagramSocket client = null;
		try {
		  in = new BufferedReader(new InputStreamReader(System.in));//ʹ�ñ�׼������������仰ʹ�����뻺������ʹ���ֽڵ��ַ���ת����ʹ�ñ�׼������
		  client = new DatagramSocket();  //DatagramSocket�����������ͺͽ������ݱ������׽���
		  InetAddress ipaddress = InetAddress.getByName("localhost");
		  byte  []send = new byte[1024];//�����������飬һ��ʢװ���͵����ݣ�һ��ʢװ���յ�����
		  byte  []received = new byte[1024];    //�ö��ˣ������ˣ���Ȼ��������
		  String sendLine=in.readLine();//ͨ���������е�readLine()��������ȡ�ַ���
		  send=sendLine.getBytes();//ͨ���ַ�����getBytes()�������洢��������
		  //UDP�������ݱ���
		  DatagramPacket sendPacket = new DatagramPacket(send, send.length, ipaddress, 8018);
		  client.send(sendPacket);
		  //UDP�������ݱ���
		  DatagramPacket receivedPacket = new DatagramPacket(received,received.length);
		  client.receive(receivedPacket);
		  String receiveLine = new String(receivedPacket.getData());//��������Ϊ����ͨ��String���캯������ʵ�������Խ��������ַ�����ӡ����
		  System.out.println("receive:"+receiveLine);
		  
	} catch (Exception e) {
		e.printStackTrace();
	} finally{//�����ر����ǵ�һЩ��Դ
		try {
			in.close();//�ر�������
			client.close();//�ر�����
		} catch (IOException e) {			
			e.printStackTrace();
		}				
	}	  
	}
}
