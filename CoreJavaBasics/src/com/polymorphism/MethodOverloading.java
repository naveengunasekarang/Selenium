package com.polymorphism;

//Change in no.of arguments
class Addition {
	static int add(int a, int b) { // m1 - 2 argu
		return a + b;
	}

	static int add(int a, int b, int c) { // m2 - 3 argu with same method name
		return a + b + c;
	}

	// Method overloading : changing data type of arguments
	static int addd(int a, int b) {
		return a + b;

	}

	static double addd(double a, double b, double c) {
		return a + b + c;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println(Addition.add(1, 3));
		System.out.println(Addition.add(1, 3, 4));
		System.out.println(Addition.addd(2, 4));
		System.out.println(Addition.addd(12, 44, 34));
	}
	
	public static void main(String name) {
		System.out.println("Main method");
		}
	public static void main() {
		System.out.println("Main method without args");
	}
	

}
