package com.String;

public class StringMethods {

	public static void main(String[] args) {
		
		String n = "  Naveen  ";
		String n1 = "kumar";
		int i=10; 
		String s1 = "Naveen is good";
		System.out.println(s1.replace("Naveen", "class"));
		String s=String.valueOf(i);
		System.out.println(n);
		System.out.println(n.toUpperCase());
		System.out.println(n.toLowerCase());
		System.out.println(n.trim());
		System.out.println(n.startsWith("Na")); //false
		System.out.println(n.endsWith("n")); //false 
		System.out.println(n1.charAt(4));
		System.out.println(n1.length());
		System.out.println(s +10); //converting int to string

	}

}
