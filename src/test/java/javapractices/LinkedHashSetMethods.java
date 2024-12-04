package javapractices;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMethods {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();

		// add elements or object
		linkedHashSet1.add(10);

		LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<Integer>();
		linkedHashSet2.add(20);
		linkedHashSet2.add(15);
		linkedHashSet2.add(20);
		linkedHashSet2.add(100);
		linkedHashSet2.add(50);
		linkedHashSet2.add(60);
		linkedHashSet2.add(10);
		linkedHashSet2.add(6);

		// adding all elements from linkedHashSet2 to linkedHashSet
		linkedHashSet1.addAll(linkedHashSet2);

		for (Integer i : linkedHashSet1) {
			System.out.println(i);
		}

		System.out.println("####################################################");

		System.out.println("Linked List contains 50 = " + linkedHashSet1.contains(50));
		System.out.println("Linked List contains 500 = " + linkedHashSet1.contains(500));

		System.out.println("######################################################");

		System.out.println("Linked list1 conatins linkedHashSet 2 = " + linkedHashSet1.containsAll(linkedHashSet2));

		System.out.println("#######################################################");

		System.out.println("linkedHashSet2 is empty = " + linkedHashSet2.isEmpty());

		// linkedHashSet2.clear();

		System.out.println("linkedHashSet2 is empty = " + linkedHashSet2.isEmpty());

		System.out.println("#########################################################");

		System.out.println("linkedHashSet2 size = " + linkedHashSet2.size());

		System.out.println("############################################################");

		linkedHashSet2.remove(6);

		for (Integer a : linkedHashSet2) {
			System.out.println(a);
		}

		System.out.println("########################################################");

		Iterator<Integer> it = linkedHashSet2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("######################################################");

	}

}
