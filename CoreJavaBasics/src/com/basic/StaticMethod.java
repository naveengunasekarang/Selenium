package com.basic;
class dep {
	int dp_no;
	static String dname="IT";
	String staffname;
	static String na;
	
	static void change() { //static method
		dname="Mech";
	}
	
	dep(int i,String n) { //parama cons
		dp_no=i;
		staffname = n;
		
	}
	
	void display() { //normal method to display
		System.out.println(dp_no+ " " + staffname + " "+dname);
	}
	
	void simple() {
		System.out.println("simple method");
	}
	
	static void menu() {
		System.out.println("Menu items");
	}
}


public class StaticMethod { //Test class

	public static void main(String[] args) {
		
		dep.change();
		dep d1 = new dep(1212, "naveen");
		d1.display();
		d1.simple();
		dep.menu();
		System.out.println("The value is"+dep.na);
		

	}

}
