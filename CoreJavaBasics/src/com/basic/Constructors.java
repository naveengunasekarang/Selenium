package com.basic;

public class Constructors {
	int id; // 0
	String name; // null
	int age;

	Constructors() {
		System.out.println("Hiii");

	}

	Constructors(int i, String n) {
		id = i; // 0 =i
		name = n; // null = n
	}
	
	Constructors(int i,String n, int a){ //cons overloaded 
		id=i;
		name=n;
		age=a;
	}

	void display() {
		System.out.println(id + " " + name+ " "+ age); // 0 null
	}

	public static void main(String[] args) {

//		Constructors con1 = new Constructors(1212, "naveen"); // Para.C
//		Constructors con2 = new Constructors(123,"kumar");
		Constructors con3 = new Constructors(2323,"siva", 12);

//		con1.display();
//		con2.display();
		con3.display();

	}

}
