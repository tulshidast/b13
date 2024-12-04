package javapractices;

public class ExceptionHandling {

	public static void main(String[] args) {

		ExceptionHandling exceptionHandling = new ExceptionHandling();
		int returnResult = exceptionHandling.division(10, 0);
		System.out.println(returnResult);

	}

	// this method is used for divide number
	public int division(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Please do not devide by zero");
		} finally {
			System.out.println("Always Finally block executed");
		}

		System.out.println("After handling exception");

		return result;
	}

}
