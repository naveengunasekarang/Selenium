package com.JavaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Banana");
//		System.out.print(list1);
		//sorting order 
		Collections.sort(list1);
		for(String fr : list1) {
			System.out.println(fr);
		}
		

	}

}
