package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class son{
	 
	
    
	public static void main(String[] args) {
		String  str ="������(������)(������)(������)";//������Ҫƥ����ַ��������ն�ֵ̬���������һƪ���£��������й����⣬Ȼ����������
		String patStr = ".*?(?=\\()";//����������ʽ�ļ����ţ�ʹ���ַ�������洢
		Pattern pattern= Pattern.compile(patStr);
		/**������ʽ�ı����ʾ��ʽ, ָ��Ϊ�ַ�����������ʽ�������ȱ�����Ϊ�����ʵ��**/
		Matcher m= pattern.matcher(str);//�������������������ʽȥƥ��һ���ַ���
		if(m.find()){
			System.out.println(m.group(0));
		}else{
			System.out.println(m.group(0));
		}
      
	}

}
