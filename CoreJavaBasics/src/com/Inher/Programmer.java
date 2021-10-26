package com.Inher;

class emp{
	
	float sal = 40000;
}

public class Programmer extends emp {
	
	int payout= 10000;

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		System.out.println("sal for emp " + p.sal);
		System.out.println("payout for emp"+p.payout);
	

	}

}
