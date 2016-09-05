package com.wangHello;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	
	
	public void copyFileTest(String src,String dest){
		File file = new File(dest);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		try {
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(file);
			byte []boss = new byte[1024];
			int c;
			while ((c=in.read(boss))!=-1){
				out.write(boss);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileTest co = new FileTest();
		String src ="d:\\wangxiang.txt";
		String dest ="d:\\wangxiang1.txt";
		co.copyFileTest(src, dest);
	}
}
