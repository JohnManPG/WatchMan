package com.wangHello;
import java.io.File;
import java.io.FileInputStream;
/**���Java����ʵ�����ļ��ĸ��ƣ���ʵ����ϴ������أ�
���ǵ�ԭ����һ���ģ�ֻ�Ǹ����Ǵӱ��ص����أ��ϴ������ش�Զ�̷����������أ��м�Ĵ���ý�鲻һ��**/
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public void copyFile(String src,String dest){
       File file = new File(dest);   //�ǲ��������ļ��ģ����漰����ľ�������
       if(!file.exists()){    //���ʽ�����ʱ���ִ���������䣬�� false������
    	   try {
			file.createNewFile();
		} catch (IOException e) {			
			e.printStackTrace();
		}//����
       }
      
		try {
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(file); //˭�տ�ʼ��Ŀ���ַ������File��Ķ�����ʹ�����������ʱ�Ϳ���ʹ�øö�����Ϊ����
			   byte []buffer=new byte[1024];
		       int c;
		       while((c=in.read(buffer))!=-1){
		    	   out.write(buffer);
		       };
		} catch (Exception e1) {
			e1.printStackTrace();
		}     	
           
	}	
	public static void main(String[] args) {
		FileDemo demo = new FileDemo();
		String src="F:\\EJavaWorkspce/WatchMan/wangxiang.txt";
		String dest="F:\\EJavaWorkspce/WatchMan/wangxiang1.txt";
		demo.copyFile(src, dest);
	}
}
