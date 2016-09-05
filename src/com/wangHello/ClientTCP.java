package com.wangHello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTCP {
	public static void main(String[] args){//���������û���������⣬�������������⣬������û���⣬��Ҫ��Java IO�ⷽ��û����Ϥ�����ա�
		Socket clientsockt=null;
		OutputStream os=null;
		BufferedReader in=null;
		try {
			clientsockt = new Socket("localhost", 8018);
			os = clientsockt.getOutputStream();
			in = new BufferedReader(new InputStreamReader(clientsockt.getInputStream()));
			int c;                                
			String strresponse = "";     //����һ���ַ�������������
			while (true){
				while ((c=System.in.read())!=-1){
					os.write(c);   //�����������󣬽��ֽ�д�뵽�����������
					if(c=='\n'){
						os.flush();  //����Ҳ��һ���ⲿ�豸
					    break;
					}					
				}
				strresponse=in.readLine();
				System.out.println("�ͻ��˽��յ���"+strresponse);
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
		     //��һ���ͻ��˵ĳ��������		
		
		//���������ӣ���������Ҫ�ͻ��˺ͷ������˽��н�����ͨ��Ҳ����Ҫд���������
		//�����಻��ʵ������ʹ��socket������OutputStream��ʵ������������Щ������Լ�������IP��ַ�Ͷ˿�
		//�϶���Ҫ���������ģ���Ϊ������Ҫ�õ��ͻ��˵�IP��ַ�Ͷ˿ڲ���ͨ�ţ��ͻ���Ҫ������Լ�����ϸ��Ϣ
		//InputStream in = clientsockt.getInputStream();
		//������������Ǵӷ�������õã���Ҫ������
		
		//����һ������������ʹ��InputStreamReader���ֽ�ת�����ַ�,����ȥһ������������					
	}

}
