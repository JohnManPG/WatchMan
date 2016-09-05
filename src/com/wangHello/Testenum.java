package com.wangHello;

public class Testenum {

	public static void main(String[] args) {
	color red = color.RED;
	color black= color.BLACK;
	color white = color.WHITE;
	int d = red.ordinal();
	int c = black.ordinal();
	int a = red.compareTo(black);
	int b = white.compareTo(red);
	System.out.println(d+","+c+","+a+","+b);
	}
}
