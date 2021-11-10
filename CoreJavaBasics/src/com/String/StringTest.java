package com.String;

public class StringTest {
//
//	static String s1 = "Welcome"; // string literals
//	static String s2 = "All";

	 // memory space more

	public static void main(String[] args) {
//		System.out.println(s1 + s2);
//		String s = "Sachin";// String literal 
//		String s3 = new String("Sachin");
//		String s4=s3.concat("Tendulkar"); // concat method the string at the end
//		System.out.println(s4);
//		System.out.println(s3);
//		String s5 = "Naveen";
//		s5=s5.concat("kumar");
//		System.out.println(s5);
		
		String s1 = "sachin"; // s1 ? 
		String s2 = "sachin"; //s2 ? 
		String s3 = new String("sachin"); 
		String s7 = new String("sachin"); 
		String s4 = "naveen";
		String s5 = "sachin";
		String s6 = "SACHIN";
		System.out.println(s1.equals(s2)); //true 
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // false
		System.out.println(s2.equals(s3)); // true
		System.out.println(s5.equals(s6)); // ??
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //?? //false //new it will create in non pool area
		System.out.println(s3==s7);
		System.out.println(s1==s6);
		System.out.println(s1==s4);
		
		System.out.println(s1.substring(0,2)); //substring (start index)
		System.out.println(s1.substring(3, 5)); //substring (start index and end index)
	}

}
