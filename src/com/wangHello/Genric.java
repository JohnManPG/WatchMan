package com.wangHello;

import java.util.ArrayList;
import java.util.List;

public class Genric {

	public static void main(String[] args) {
	 List<? super Apple> list=new ArrayList<Food>();//��ŵ���Apple�Լ�Apple�ĸ���
	 list.add((Apple) new Fruit());//�������õĶ������ö��󣬼��Ͼ�������������ʢװ����˵������Լ���Apple������
	 list.add(new Apple());
	 list.add((Apple) new Food());//ǿ��ת������Ͳ���ʵ�������࣬���Իᱨ�쳣�����ܽ������ݵķ���
	 //List<? extends Food> listf=list;//?��ͨ������������Food���������࣬����һ�������������б�	 
	 //listf.add(new Apple());//�������಻ȷ�������Ը���Ҳ��ȷ������������Ҳ��ȷ�������ԾͲ������Ԫ�أ����ǿ��Է�������
	 System.out.println(list.get(2));
	}
}

//���ܽ���˵�����͵Ĵ����ܹ��ǲ������͵Ĳ�ȷ����
