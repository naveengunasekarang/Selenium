package com.basic;

class Stud1 {

	int id; // 0 //90349
	String name;// null //jdj
	
	 protected void insertRec(int r, String n) {
		id=r; // 0 //90349
		name=n; //null //jdj
		return;
	}
	
	 void displayInfo() {
		System.out.println(id+""+name);
	}

}

public class Student {

	public static void main(String[] args) {

		Stud1 s1 = new Stud1(); // creating with help of cons
		
		s1.insertRec(90349, "jdjfjd"); //3 
	
		s1.insertRec(233, "naveen");
//		System.out.println(s1.id+""+s1.name);
		s1.displayInfo();
//		Stud1 s2 = new Stud1();
//		
//		s1.id=100;
//		s1.name="Nav"; //2 
//		
//		s2.id=200;
//		
//		s2.name="kumar";
//
//		System.out.println(s1.id); //1
//		System.out.println(s1.name);

	}

}
