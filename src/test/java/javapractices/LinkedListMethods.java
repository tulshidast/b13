package javapractices;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();

		// add elements or object
		linkedList1.add(10);

		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(20);
		linkedList2.add(15);
		linkedList2.add(20);
		linkedList2.add(100);
		linkedList2.add(50);
		linkedList2.add(60);
		linkedList2.add(10);

		// adding all elements from linkedList2 to arrayList
		linkedList1.addAll(linkedList2);

		for (Integer i : linkedList1) {
			System.out.println(i);
		}

		System.out.println("####################################################");

		System.out.println("Linked List contains 50 = " + linkedList1.contains(50));
		System.out.println("Linked List contains 500 = " + linkedList1.contains(500));

		System.out.println("######################################################");

		System.out.println("Linked list1 conatins arrayList 2 = " + linkedList1.containsAll(linkedList2));

		System.out.println("######################################################");

		System.out.println(linkedList2.get(3));

		System.out.println("#######################################################");

		System.out.println("Index of 60 = " + linkedList2.indexOf(60));

		System.out.println("#######################################################");

		System.out.println("linkedList2 is empty = " + linkedList2.isEmpty());

		// linkedList2.clear();

		System.out.println("linkedList2 is empty = " + linkedList2.isEmpty());

		System.out.println("#########################################################");

		System.out.println("linkedList2 size = " + linkedList2.size());

		System.out.println("#########################################################");

		List<Integer> linkedList3 = linkedList2.subList(3, 6);

		for (Integer a : linkedList3) {
			System.out.println(a);
		}

		System.out.println("############################################################");

		linkedList2.set(3, 200);
		linkedList2.remove(6);

		for (Integer a : linkedList2) {
			System.out.println(a);
		}

		System.out.println("########################################################");

		Iterator<Integer> it = linkedList2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("######################################################");

	}

}
