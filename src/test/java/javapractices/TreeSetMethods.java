package javapractices;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();

		// add elements or object
		treeSet1.add(10);

		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		treeSet2.add(20);
		treeSet2.add(15);
		treeSet2.add(20);
		treeSet2.add(100);
		treeSet2.add(50);
		treeSet2.add(60);
		treeSet2.add(10);
		treeSet2.add(6);

		// adding all elements from treeSet2 to treeSet
		treeSet1.addAll(treeSet2);

		for (Integer i : treeSet1) {
			System.out.println(i);
		}

		System.out.println("####################################################");

		System.out.println("Linked List contains 50 = " + treeSet1.contains(50));
		System.out.println("Linked List contains 500 = " + treeSet1.contains(500));

		System.out.println("######################################################");

		System.out.println("Linked list1 conatins treeSet 2 = " + treeSet1.containsAll(treeSet2));

		System.out.println("#######################################################");

		System.out.println("treeSet2 is empty = " + treeSet2.isEmpty());

		// treeSet2.clear();

		System.out.println("treeSet2 is empty = " + treeSet2.isEmpty());

		System.out.println("#########################################################");

		System.out.println("treeSet2 size = " + treeSet2.size());

		System.out.println("############################################################");

		treeSet2.remove(6);

		for (Integer a : treeSet2) {
			System.out.println(a);
		}

		System.out.println("########################################################");

		Iterator<Integer> it = treeSet2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("######################################################");

	}

}
