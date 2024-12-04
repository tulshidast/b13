package javapractices;

public class UseOfThowAndThrowsKeyword {

	public static void main(String[] args) {
		UseOfThowAndThrowsKeyword useOfThowAndThrowsKeyword = new UseOfThowAndThrowsKeyword();
		useOfThowAndThrowsKeyword.divide(10, 5, null);
	}

	public void divide(int num1, int num2, String userName) throws ArithmeticException, NullPointerException {
		if (num2 == 0) {
			throw new ArithmeticException("Please provide non zero number for divide");
		}
		int result = num1 / num2;
		System.out.println(result);

		System.out.println(userName.length());

	}

}
