package com.MapInterface;

import java.util.HashMap;
import java.util.Map;

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

public class MapUserDef {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Naveen", 23);
		Student s2 = new Student(2, "tara", 22);
		Student s3 = new Student(3, "kavin", 24);
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		//traversing map 
		for(Map.Entry<Integer, Student> enty : map.entrySet()) {
			int key= enty.getKey();
			Student s4=enty.getValue();
			System.out.println(key +" "+ s4.rollno + " "+s4.name+ ""+s4.age);
		}
	}

}
