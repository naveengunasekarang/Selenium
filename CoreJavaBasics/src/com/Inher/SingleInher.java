package com.Inher;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}

class cat extends Animal{
	void voice() {
		System.out.println("voice");
	}
}
	
	class Smallcat extends cat{
		void slep() {
			System.out.println("sleeping");
		}
		
	}
	
public class SingleInher {

	public static void main(String[] args) {
		Smallcat s = new Smallcat();
		s.eat();
		s.voice();
		s.slep();
		

	}

}
