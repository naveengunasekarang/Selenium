package com.Abstract;
abstract class cycle{
	cycle() {
		System.out.println("cycle is created");
	}
	
	abstract void wheel(); // abs method
	void run34() { // non abs method
		System.out.println("The method name is 34");
	}
}
class g extends cycle{
	void wheel() {
		System.out.println("wheel");
	}
}
public class TestAbs {

	public static void main(String[] args) {
		cycle cy = new g();
		cy.run34();
		cy.wheel();

	}

}
