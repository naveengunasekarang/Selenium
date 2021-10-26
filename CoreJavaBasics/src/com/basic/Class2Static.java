package com.basic;

public class Class2Static {
	
	static int count=0; //will get memory only once and retain its value 
	
	Class2Static() {
		
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Class2Static c1 = new Class2Static();
		Class2Static c2 = new Class2Static();
		Class2Static c3 = new Class2Static();
		Class2Static c4 = new Class2Static();
	}

}
