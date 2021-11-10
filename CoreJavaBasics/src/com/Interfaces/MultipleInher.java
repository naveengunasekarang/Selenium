package com.Interfaces;

interface Print1 {
	void print();
}

interface show1 {
	void show();
}

public class MultipleInher implements Print1, show1 {

	public void print() {
		System.out.println("print");
	}

	public void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		MultipleInher m = new MultipleInher();
		m.print();
		m.show();

	}

}
