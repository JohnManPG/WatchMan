package com.wangHello;
/**这部分对于异常和错误的解决是我自己思考出来的，表示有很大的成就感**/

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
public class ObjectStream {
	public static void test() throws IOException{
		try {
			wangxiang wx1 = new wangxiang("wangxiang",28);//记住就行了
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("zengrui1.txt"));
			oo.writeObject(wx1);
			oo.close();	
			
			
			ObjectInputStream os = new ObjectInputStream(new FileInputStream("zengrui1.txt"));
			wangxiang  wx = (wangxiang)os.readObject();  //读出来的是Object类型,需要进行类型强制转换
			System.out.println(wx.getName()+"+"+wx.getAge());			
		} catch (Exception e) {			
			System.out.println("对象输入流有异常");
			e.printStackTrace();
	
		}
	}

	public static void main(String[] args)  throws IOException {
		  ObjectStream.test();
		  System.out.println("捕获异常后，继续执行此语句");
	}
}
