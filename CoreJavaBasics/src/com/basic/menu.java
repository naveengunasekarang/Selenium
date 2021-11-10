package com.basic;

public class menu {
	
	//Why main method is static ??
	/*becoz the obj is not req to call a static method 
	 * If it were a non static method , jvm create an obj 1st and then 
	 * call the main method that will lead the prob of extra memory
	 * allocation.
	 * 
	 */
	
	static { // used initialize the static data member & executed before main
     	System.out.println("This is static method");
	}
	
	

}
