package com.Array;

public class TestAray {

	public static void main(String[] args) {
		int a[] = new int[5]; // declaration and instantiation
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int b[] = { 22, 33, 42 };
		for (int r : b) {
			System.out.println(r);
		}
		for (int i : a) {
			System.out.println(i);
		}

	}

}
