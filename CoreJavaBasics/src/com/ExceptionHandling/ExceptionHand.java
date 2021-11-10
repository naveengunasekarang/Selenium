package com.ExceptionHandling;

public class ExceptionHand {

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 3, 5, 7 };
			System.out.println(arr[2]);// code that may raise an exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
		
		try {
			
		}
		finally {
			
		}

	}

}
