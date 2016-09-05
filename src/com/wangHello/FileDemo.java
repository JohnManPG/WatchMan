package com.wangHello;
import java.io.File;
import java.io.FileInputStream;
/**这段Java代码实现了文件的复制，其实类比上传和下载，
他们的原理是一样的，只是复制是从本地到本地，上传和下载从远程服务器到本地，中间的传输媒介不一样**/
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public void copyFile(String src,String dest){
       File file = new File(dest);   //是操作整个文件的，不涉及里面的具体内容
       if(!file.exists()){    //表达式是真的时候才执行下面的语句，非 false就是真
    	   try {
			file.createNewFile();
		} catch (IOException e) {			
			e.printStackTrace();
		}//创建
       }
      
		try {
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(file); //谁刚开始把目标地址传给了File类的对象，在使用输入输出流时就可以使用该对象作为参数
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
