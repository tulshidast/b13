package javapractices;

import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(100);
		linkedHashSet.add(50);
		linkedHashSet.add(200);
		linkedHashSet.add(300);
		linkedHashSet.add(50);
		linkedHashSet.add(null);

		for (Integer i : linkedHashSet) {
			System.out.println(i);
		}

	}

}
