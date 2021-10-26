package com.Abstract;

abstract class Man {
	abstract void walk(); // no method body
}

class person extends Man {
	void walk() { //Normal method 
		System.out.println("walking");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Man m = new person(); //upcasting
		m.walk();

	}

}
