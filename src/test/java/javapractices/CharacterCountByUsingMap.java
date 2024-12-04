package javapractices;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterCountByUsingMap {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		// this for loop is used to iterate String characters
		for (int i = 0; i < s.length(); i++) {

			if (hashMap.containsKey(s.charAt(i))) {
				hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
			} else {
				hashMap.put(s.charAt(i), 1);
			}
		}

		Set<Entry<Character, Integer>> charCountSet = hashMap.entrySet();

		for (Entry<Character, Integer> ent : charCountSet) {
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}

	}

}
