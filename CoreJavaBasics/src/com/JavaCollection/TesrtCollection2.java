package com.JavaCollection;

import java.util.HashSet;
import java.util.Iterator;

//Set Interface 
/*
 * Doesn't allow us to store the duplicate values
 * One null value in set allowed
 * implemented by hashset,linkedhashset,tree set classes 
 */

public class TesrtCollection2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("naveen");
		set.add("shiva");
		set.add("naveen");
		set.add("Naveen");
		System.out.println(set);
	Iterator<String> itr =set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

}
