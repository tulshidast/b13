package javapractices;

public class StringClassProgram {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		// reverse given String
		// Welcome to codemind
		// dnimedoc ot emocleW

		for (int i = (s.length() - 1); i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println();
		System.out.println("#######################################################");

		// reverse given String words
		// Welcome to codemind
		// emocleW ot dnimedoc

		String a[] = s.split(" ");

		for (int j = 0; j < a.length; j++) {
			String ss = a[j];

			for (int i = (ss.length() - 1); i >= 0; i--) {
				System.out.print(ss.charAt(i));
			}

			System.out.print(" ");
		}

		System.out.println();
		System.out.println("##############################################");

		String str = "Welcome To Pune";
		// print capital letters of given String
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}

		System.out.println();
		System.out.println("################################################");
		// print all small letters
		// print capital letters of given String
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}

		System.out.println();
		System.out.println("############################################");

		String s1 = "1223@#$#@$dfWERWE23ERF43#$%vfvf";

		// print only digits
		// 12232343
		System.out.println(s1.replaceAll("[^0-9]", ""));

		// remove only digits
		// @#$#@$dfWERWEERF#$%vfvf
		System.out.println(s1.replaceAll("[0-9]", ""));

		// remove only special characters
		System.out.println(s1.replaceAll("[^0-9A-Za-z]", ""));

		// remove all thing except letters
		System.out.println(s1.replaceAll("[^A-Za-z]", ""));

		// retain only small letters
		System.out.println(s1.replaceAll("[^a-z]", ""));

		System.out.println(s1.length());
	}

}
