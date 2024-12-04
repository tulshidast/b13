package javapractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet<Integer> hashSet1 = new HashSet<Integer>();

		// add elements or object
		hashSet1.add(10);

		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(20);
		hashSet2.add(15);
		hashSet2.add(20);
		hashSet2.add(100);
		hashSet2.add(50);
		hashSet2.add(60);
		hashSet2.add(10);

		// adding all elements from hashSet2 to hashSet
		hashSet1.addAll(hashSet2);

		for (Integer i : hashSet1) {
			System.out.println(i);
		}

		System.out.println("####################################################");

		System.out.println("Linked List contains 50 = " + hashSet1.contains(50));
		System.out.println("Linked List contains 500 = " + hashSet1.contains(500));

		System.out.println("######################################################");

		System.out.println("Linked list1 conatins hashSet 2 = " + hashSet1.containsAll(hashSet2));

		System.out.println("#######################################################");

		System.out.println("hashSet2 is empty = " + hashSet2.isEmpty());

		// hashSet2.clear();

		System.out.println("hashSet2 is empty = " + hashSet2.isEmpty());

		System.out.println("#########################################################");

		System.out.println("hashSet2 size = " + hashSet2.size());

		System.out.println("############################################################");

		hashSet2.remove(6);

		for (Integer a : hashSet2) {
			System.out.println(a);
		}

		System.out.println("########################################################");

		Iterator<Integer> it = hashSet2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("######################################################");

	}

}
