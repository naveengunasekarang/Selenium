package com.JavaCollection;

import java.util.ArrayList;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
}

public class UserDefindArrayList {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Naveen", 12);
		Student s2 = new Student(2, "siva", 15);
		Student s3 = new Student(3, "kavin", 10);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		for (Student fr : al) {
			System.out.println(fr.rollno + " "+ fr.name + " "+fr.age);

		}

	}

}
