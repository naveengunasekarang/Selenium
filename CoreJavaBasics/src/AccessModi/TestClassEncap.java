package AccessModi;

class A{
	 int a =100;
	 protected void msg() { 
		System.out.println("helo");
	}
}

public class TestClassEncap {
	public static void main(String[] args) {
		A ob = new A();
		ob.msg();
	}

}
