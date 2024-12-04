package javapractices;

public class AbsClass {

	public static void main(String[] args) {

		// we cannot create object of abstract class
		// new MyClass();

		ImplementationOfAbs implementationOfAbs = new ImplementationOfAbs();
		implementationOfAbs.test();
		int a = implementationOfAbs.addition(10, 5);
		System.out.println(a);
	}

}

abstract class MyClass {

	// instance member variables
	int a = 10;
	int b = 20;

	// abstract class can have constructor
	public MyClass() {

	}

	// non abstract method
	public void test() {
		System.out.println("non abstract method");
	}

	/**
	 * This method is used for addition of two integer numbers.
	 * 
	 * @param a pass a as int.
	 * @param b pass b as int
	 * @return this method returns addition of two numbers.
	 */
	public abstract int addition(int a, int b);

}

class ImplementationOfAbs extends MyClass {

	public int addition(int a, int b) {
		return a + b;
	}

}