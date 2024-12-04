package javapractices;

public class InterfaceImpl {

	public static void main(String[] args) {

		int c = 10;
		MyInterfeImpl myInterfeImpl = new MyInterfeImpl();
		myInterfeImpl.test();
		myInterfeImpl.testing();
	}

}

interface MyInterface {

	public static final int b = 20;
	int c = 30;

	public abstract void test();

	/**
	 * This method is used for testing.
	 */
	void testing();
}

interface MyInterface2 {
	public abstract int addition(int a, int b);

}

class MyInterfeImpl implements MyInterface, MyInterface2 {

	@Override
	public void test() {

		System.out.println("test method from interface");
	}

	@Override
	public void testing() {

		System.out.println("testing method from interface");
	}

	@Override
	public int addition(int a, int b) {

		return a + b;
	}

}
