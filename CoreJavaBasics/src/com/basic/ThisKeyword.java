package com.basic;
class A{
	int id;
	String name;
	A(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	A(){
		this(1,"naveen");
		System.out.println("This is default cons");
	}
	
	void display() {
		System.out.println(id + "" + name);
	}
	
	void m1() {
		System.out.println("hello m1");
	}
	
}


public class ThisKeyword {

	public static void main(String[] args) {
		
//		A a = new A(123, "nav");
		A a1 = new A();
		a1.display();


	}

}
