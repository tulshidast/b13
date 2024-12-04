package javapractices;

public class FullyEncapsulatedClass {

	public static void main(String args[]) {
		Test t = new Test();
		t.setA(30);
		int c = t.getA();
		System.out.println(c);
	}

}

class Test {

	private int a;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return this.a;
	}

}
