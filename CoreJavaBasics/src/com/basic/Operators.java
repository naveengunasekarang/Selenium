package com.basic;

public class Operators {

	public static void main(String[] args) {

		// Unary -- expr ++ expr -- & ++expr --expr

		int x = 10;
		int y = 20;
		int z =50;

		//System.out.println(x++ + ++x);
		//System.out.println(y++ + y++);
		
		// Unary operator ~ and !

		boolean c = true;
		boolean d= false;
		
//		System.out.println(~x);
//		System.out.println(~y);
//		System.out.println(!c);
//		System.out.println(!d);
		
//		System.out.println(x%y);
//
//		System.out.println(10<<2); //10*2^2 = 10*4 = 40; 
//		System.out.println(10<<3); //10*2^3=10*8 = 80;
//		
//		System.out.println(10>>2); // 10/2^2 = 10/4 = ?
		
		
		//&&-Logical
		
		System.out.println(x<y && z<x); // true&false = false
	}

}
