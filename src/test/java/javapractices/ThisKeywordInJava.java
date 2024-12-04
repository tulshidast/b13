package javapractices;

public class ThisKeywordInJava {

	// instance member variables
	int a = 10;
	int b = 20;

	// static variable
	static int c = 30;

	public static void main(String[] args) {

		ThisKeywordInJava thisKeywordInJava = new ThisKeywordInJava();

		int sum = thisKeywordInJava.add(thisKeywordInJava.a, thisKeywordInJava.b);

		System.out.println(sum);

		System.out.println(thisKeywordInJava.hashCode());

	}

	public int add(int a, int b) {

		this.sub(100, 50);

		System.out.println(this.hashCode());
		this.a = a;
		this.b = b;
		return a + b;
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

}
