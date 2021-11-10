package com.basic;

public class Basic {

	public void m1() {
		int b = 20; // local variable
	}
	
	private void m2() {
		
	}

	static int m = 100; // static variable

	public static void main(String args[]) {

		int a = 10; // data variable (instance)

		int c = 20; // instance variable
		int d = c + a; // instance variable
		
		// Data types
		//primitive datatype - boolean,char,byte,short,int,long,float and double 
		//non-primitive datatype - classes,interfaces and arrays .
		
		//boolean - false , 1 bit
		//char - '\u0000', 2 byte
		//byte - 0 , 1 byte
		//short - 0, 2 byte
		//int - 0, 4byte
		//long - 0L , 8 byte
		//float - 0.0f 4 byte 
		// double - 0.0d 8 byte
		
		
		Boolean one = false;
		
		Boolean two = true;
		
		byte t =10 ; byte p =-9; // -128 to 127
		
		short s =  10000 ; short r = -5000;     // -32,768 to 32,767 
		
		int e = 10000000; int rz= -2000000; //int = -2^31 to 2^31-1
		
		float f1 = 234.5f; //32bit
		
		double d1 = 12.4; //64bit 
		
		char alpha = 'r'; // unicode system

		System.out.println(d);
		System.out.println("Welcome" + a);
		
	}

}
