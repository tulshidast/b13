package javapractices;

public class FinalKeywordInJava {

	public static void main(String[] args) {

	}

}

class FinalUsage {

	int a = 10;
	final int b = 20;

	public final void testFinal() {
		a = 30;
		// b=50;
	}
}

final class ChildA extends FinalUsage {

//	public final void testFinal() {
//		
//	}
}

//class ChildB extends ChildA {
//
//}
