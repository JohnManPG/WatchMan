package test;

public class Father {
	private static final String MESSAGE="taobao";
	public static void main(String[] args){
		String a="tao"+"bao";
		String b="tao";
		String c="bao";
		System.out.println(a==MESSAGE);
		System.out.println((b+c)==MESSAGE);//b+c�൱��new��һ���¶���
	        //1.�ַ�����Java�д洢���ַ�����������
	}

}
