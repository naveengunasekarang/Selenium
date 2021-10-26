package com.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("1", "rollno");
		lhm.put("2", "name");
		lhm.put("3", "dob");
		lhm.put("1", "dept");
		for(Map.Entry<String, String> m : lhm.entrySet()) {
			System.out.println(m.getKey() + " " +m.getValue());
		}

	}

}
