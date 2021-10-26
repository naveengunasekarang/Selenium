package com.JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Testcollection1 {

	/*
	 * Array List Used to store dynamic array to store duplicate elements of diff
	 * data types. ArrayList maintains the insertion order and its non synchronized
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // creating an arraylist
		list.add("Naveen");
		list.add("Naveen");
		list.add("Vijay");
		list.add("ravi");
// list through iterator
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*
		 * Linked List : doubly linked list used to store the duplicate elements it
		 * maintains the insertion order
		 */
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("kumar");
		llist.add("siva");
		Iterator<String> it1 = llist.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
