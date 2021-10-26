package com.JavaCollection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hii");
		ll.add("kkl");
		ll.add("vij");
		ll.add("vijay");
		ll.add("virat");
		System.out.println(ll);
		ll.remove("vij");
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll.addAll(ll2);
		ll2.addAll(ll);
		System.out.println(ll2);
}

}
