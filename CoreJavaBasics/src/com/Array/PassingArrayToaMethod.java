package com.Array;

//How to pass an array to a method ?

public class PassingArrayToaMethod {

	static void min(int a[]) {
		int m = a[0]; //4
		for (int i = 1; i < a.length; i++) {
			if (m > a[i]) {
				m = a[i];
			}
		}
		System.out.println("Min of the array" + m);
	}

	public static void main(String[] args) {
		int a[] = {4}; // declare and array
		min(a);

	}

}
