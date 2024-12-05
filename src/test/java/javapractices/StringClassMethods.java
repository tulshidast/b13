package javapractices;

public class StringClassMethods {

	public static void main(String[] args) {

		String s = "Welcome To Codemind";

		// Returns the char value at the specified index.
		char c = s.charAt(8);
		System.out.println(c);

		// if both string are equal it will return 0, if first String is greater than
		// second String it will return + integer
		// if second String is greater it will return -Ve integer

		System.out.println(s.compareTo("Welcome to pune"));

		System.out.println(s.compareTo("Welcome To Codemind"));

		System.out.println(s.compareTo("welcome To Codemind"));

		System.out.println("##############################################");

		System.out.println(s.concat(" Technology"));

		System.out.println("###############################################");
		System.out.println(s.contains("come"));
		System.out.println(s.contains("codemind"));

		System.out.println("#################################################");

		System.out.println(s.endsWith("demind"));
		System.out.println(s.endsWith("Welcome To"));

		System.out.println("#################################################");

		System.out.println(s.equals("Welcome To Codemind"));
		System.out.println(s.equals("Welcome To"));

		System.out.println("###############################################");

		System.out.println(s.equalsIgnoreCase("welcome to codemind"));
		System.out.println(s.equalsIgnoreCase("Welcome To Codemind"));

		System.out.println("##################################################");

		System.out.println(s.indexOf('l'));

		System.out.println(s.indexOf("Cod"));

		System.out.println(s.indexOf("To"));

		System.out.println(s.indexOf('m', 7));

		System.out.println(s.indexOf("mind", 5));

		System.out.println("######################Welcome To Codemind############################");

		System.out.println(s.lastIndexOf('m'));
		System.out.println(s.lastIndexOf("co"));
		System.out.println(s.lastIndexOf('m', 9));
		System.out.println(s.lastIndexOf("co", 9));

		System.out.println("###########################################################################");

		System.out.println(s.isBlank());

		System.out.println(" ".isBlank());

		System.out.println("############################################################################");

		System.out.println(s.isEmpty());
		System.out.println("".isEmpty());

		System.out.println("#############################################################################");
		// Returns the length of this string.
		System.out.println(s.length());

		System.out.println("############################Welcome To Codemind##################################");

//		String price = "₹1,612";
//
//		System.out.println(price.replace('₹', ' ').replace(',', ' '));
//
//		System.out.println(price.replace("₹1,", ""));
//
//		System.out.println(s.replaceAll("o", "O"));
//
//		System.out.println(s.replaceFirst("o", "O"));

		System.out.println("###############################################################");

		String arr[] = s.split(" ");

		for (String sp : arr) {
			System.out.println(sp);
		}

		System.out.println("################################################");

		arr = s.split(" ", 2);

		for (String sp : arr) {
			System.out.println(sp);
		}

		System.out.println("##################Welcome To Codemind###################");

		System.out.println(s.startsWith("Welcome"));
		System.out.println(s.startsWith("to"));
		System.out.println(s.startsWith("Welcome to C"));

		System.out.println(s.startsWith("come", 3));

		System.out.println("##################################################");

		System.out.println(s.substring(11));

		System.out.println(s.substring(0, 7));

		System.out.println("###################################");

		char[] a = s.toCharArray();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("#########################Welcome To Codemind##############################");

		System.out.println(s.toLowerCase());

		System.out.println(s.toUpperCase());

		System.out.println("########################################################");

		String str = "   welcome to     pune   ";
		System.out.println(str.trim());

	}

}
