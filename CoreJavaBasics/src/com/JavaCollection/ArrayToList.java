package com.JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		String[] arr = { "Java", "c++", "C#", "DSA" }; // array
		// arrayList
		List<String> list = new ArrayList<String>();

		for (String lan : arr) {
			list.add(lan); // add the array elements in the arrayList
		}
		System.out.println(list);
		List<String> list1 = new ArrayList<String>();
		list.add("Naveen");
		list.add("kavin");
		list.add("chandu");
		String[] arr1 = list1.toArray(new String[list1.size()]);

		System.out.println(Arrays.toString(arr1));
	}
}
