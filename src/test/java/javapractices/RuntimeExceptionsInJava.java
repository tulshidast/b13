package javapractices;

public class RuntimeExceptionsInJava {

	public static void main(String[] args) {
		RuntimeExceptionsInJava runtimeExceptionsInJava = new RuntimeExceptionsInJava();
		// runtimeExceptionsInJava.add(20, 0);
		// runtimeExceptionsInJava.testNullPointer();
		// runtimeExceptionsInJava.testNumberFormat("1234hghg");
		// runtimeExceptionsInJava.testIndexOutOfBounds(9);
		runtimeExceptionsInJava.testArrayIndexOutOfBounds(7);
	}

	public void add(int a, int b) {
		System.out.println(a / b);
	}

	public void testNullPointer() {

		String s = null;

		System.out.println(s.length());
	}

	public void testNumberFormat(String s) {
		int a = Integer.parseInt(s);

		System.out.println(a + 10);
	}

	public void testIndexOutOfBounds(int index) {
		String s = "Codemind";

		System.out.println(s.charAt(index));
	}

	public void testArrayIndexOutOfBounds(int index) {
		int a[] = { 10, 20, 30, 5, 50, 33 };

		System.out.println(a[index]);

		System.out.println("after printing array element");
	}

}
