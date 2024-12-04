package javapractices;

public class SuperKeywordInJava {

	public static void main(String[] args) {

		SuperChild superChild = new SuperChild();
		superChild.add();

	}

}

class SuperParent {

	Integer a = 10;

	public void add(Integer a) {
		System.out.println(this.a + a);
	}
}

class SuperChild extends SuperParent {

	Integer a = 20;

	public void add() {
		super.add(30);
		System.out.println(a + super.a);
	}
}
