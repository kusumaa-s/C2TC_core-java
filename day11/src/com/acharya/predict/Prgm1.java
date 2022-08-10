package com.acharya.predict;

public class Prgm1 {

	public static void main(String[] args) {
		String str = "hello";
		String str1 = "hello";
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(str==str1);
		System.out.println(str==s1);
		System.out.println(s1==s2);

	}

}
