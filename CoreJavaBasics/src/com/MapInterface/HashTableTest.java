package com.MapInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "naveen");
		ht.put(4, "nansdn");
		ht.put(2, "na");
		ht.put(3, "jdfj");
		for(Map.Entry<Integer, String> m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}

	}

}
