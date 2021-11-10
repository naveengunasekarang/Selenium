package com.polymorphism;

class Animal {
	String color = "white";

	void eat() {
		System.out.println("eating");
	}

	Animal() {
		System.out.println("animal");
	}
}

class cat extends Animal {
	String color = "black";

	void eat() {
		System.out.println("eating bread");
	}

	void princolor() {
		System.out.println(color);
		System.out.println(super.color); // calling the immediate parent class variable
		super.eat(); // calling the parent immediate class method
		eat();

	}

	cat() {
		super(); // call the immediate parent class cons
		System.out.println("cat is here");
	}

}

public class SuperKeyword {

	public static void main(String[] args) {
		cat c = new cat();
		c.princolor();

	}

}
