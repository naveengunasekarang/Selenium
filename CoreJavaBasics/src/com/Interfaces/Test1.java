package com.Interfaces;

interface printable{
	void print(); // abs method
}

public class Test1 implements printable{
	public void print() {
		System.out.println("Hiii");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.print();
	}

}
