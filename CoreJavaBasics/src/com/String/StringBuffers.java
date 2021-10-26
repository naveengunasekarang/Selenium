package com.String;

public class StringBuffers {

	static String s1 = "hello"; //
	static String s2 = "Hii"; //

	static String s3 = "Class"; 
//	1.i need append the string  . o/p : classroom
//	2. i need concat . o/p classdesk

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(s3);
		sb.append("room");
		System.out.println(sb);
		String s4 = s3.concat("desk");
		System.out.println(s4);
	}

}
