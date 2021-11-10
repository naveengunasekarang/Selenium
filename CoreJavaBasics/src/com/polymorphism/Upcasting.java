package com.polymorphism;

class bike{
	void run1() {
		System.out.println("Running");
	}
}
class KTM extends bike{
	void run1() {
		super.run1();
		System.out.println("running safly");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		bike b = new KTM(); //upcasting
		b.run1();
		
		KTM k = new KTM();
		k.run1();
		

	}

}
