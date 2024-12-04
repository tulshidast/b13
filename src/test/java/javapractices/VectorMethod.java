package javapractices;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorMethod {

	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<Integer>();

		// add elements or object
		vector1.add(10);

		Vector<Integer> vector2 = new Vector<Integer>();
		vector2.add(20);
		vector2.add(15);
		vector2.add(20);
		vector2.add(100);
		vector2.add(50);
		vector2.add(60);
		vector2.add(10);

		// adding all elements from vector2 to arrayList
		vector1.addAll(vector2);

		for (Integer i : vector1) {
			System.out.println(i);
		}

		System.out.println("####################################################");

		System.out.println("Linked List contains 50 = " + vector1.contains(50));
		System.out.println("Linked List contains 500 = " + vector1.contains(500));

		System.out.println("######################################################");

		System.out.println("Linked list1 conatins arrayList 2 = " + vector1.containsAll(vector2));

		System.out.println("######################################################");

		System.out.println(vector2.get(3));

		System.out.println("#######################################################");

		System.out.println("Index of 60 = " + vector2.indexOf(60));

		System.out.println("#######################################################");

		System.out.println("vector2 is empty = " + vector2.isEmpty());

		// vector2.clear();

		System.out.println("vector2 is empty = " + vector2.isEmpty());

		System.out.println("#########################################################");

		System.out.println("vector2 size = " + vector2.size());

		System.out.println("#########################################################");

		List<Integer> vector3 = vector2.subList(3, 6);

		for (Integer a : vector3) {
			System.out.println(a);
		}

		System.out.println("############################################################");

		vector2.set(3, 200);
		vector2.remove(6);

		for (Integer a : vector2) {
			System.out.println(a);
		}

		System.out.println("########################################################");

		Iterator<Integer> it = vector2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("######################################################");

	}

}
