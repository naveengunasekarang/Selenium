package com.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Amit");
		map.put(2, "Naveen");
		map.put(3, "naveen");
		map.put(4, "kumar");
		
	System.out.println(map);
	map.remove(4);
	System.out.println(map);
	
//		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//map.putIfAbsent(5, "kim");

	
}
		}

	


