package javapractices;

public class CharacterOccurenaces {

	public static void main(String[] args) {

		String s = "abcdadcbre";

		String ss = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (ss.contains(String.valueOf(s.charAt(i)))) {
				continue;
			}
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println("Character count " + s.charAt(i) + " = " + count);
			}
			ss = ss + s.charAt(i);
			count = 1;
		}

	}

}
