package com.wrapperclass;

//Autoboxing
public class WrapperTest {

	public static void main(String[] args) {
//		int i = 20;
//		Integer a = Integer.valueOf(i); // converting int into integer
//		Integer j = a; // complier will write the valuof(a) internally
//		System.out.println(i + " " + a + " " + j + " ");
		
		//Unboxing 
		
		@SuppressWarnings("removal")
		Integer a = new Integer(4); //converting integer to int
		int i= a.intValue(); //integer to int explicitly
		System.out.println(i + " "+a);

	}

}
