package com.basic;
class Student1 {
	int rollno;
	String name;
	String dept;
    String college="KSR"; //static varibable
	
	Student1(int r,String n) { //cons
		rollno =r;
		name = n;
		
	}
	
	void display() {
		System.out.println(rollno + " "+name + college);
	}

}

public class StaticClass {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "Naveen");
		s1.display();
		
	}

}
