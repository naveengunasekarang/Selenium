package com.objclone;

public class ObjClone implements Cloneable {
	int roll_no; // instence 
	String name;

	ObjClone(int roll_no, String name) { //cons para
		this.roll_no = roll_no;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			ObjClone ob1 = new ObjClone(12, "naveen"); //
			ObjClone ob2 = (ObjClone) ob1.clone(); //cloning
			
			System.out.println(ob1.roll_no + " " + ob1.name);
			System.out.println(ob2.roll_no + " " + ob2.name);

		} catch (CloneNotSupportedException e) {
			System.out.println("error try again !");
		}

	}

}
