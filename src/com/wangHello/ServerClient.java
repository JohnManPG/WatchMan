package com.wangHello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClient {                      //不能够重新启动线程，因为端口已被占，启动发生异常

	public static void main(String[] args) {     //不明白的应该多看看书，理解理解，现在就碰到你不会的
		Socket client = null;
		ServerSocket clientserver = null;
		OutputStream os = null;
		BufferedReader in = null;
		try {
			
			clientserver = new ServerSocket(8018);
			System.out.println(clientserver);
			String strs = "";
			int c;
			boolean flag = true;
			while (flag){
				client = clientserver.accept();   //通过accept()方法，返回客户端的socket对象
				os = client.getOutputStream();
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			   while ((strs=in.readLine())!=null){
				   if(strs.equals("stop")){
					   flag=false;
					   break;
				   }else{
					   System.out.println(strs);
					   while((c=System.in.read())!=-1){
						   os.write(c);
						   if(c=='\n'){
							   os.flush();
							   break;
						   }
					   }
					   Thread.sleep(1);
				   }
			   }
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
				os.close();
				clientserver.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		

	}

}
