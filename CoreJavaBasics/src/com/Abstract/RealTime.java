package com.Abstract;

//user 1 will set this
abstract class Shape {
	abstract void draw();
}

// implementation is provided by other user 2
class rect extends Shape {
	void draw() {
		System.out.println("Draw rect");
	}
}

class circle extends Shape {
	void draw() {
		System.out.println("circle drawing");
	}
}

//Method called by progrmmer or user
public class RealTime {

	public static void main(String[] args) {
		Shape s = new circle(); // obj is provided throu method . get shape method
		s.draw();
	}

}
