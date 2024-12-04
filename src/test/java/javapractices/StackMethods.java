package javapractices;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();

		// add elements or object
		stack1.add(10);

		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.add(20);
		stack2.add(15);
		stack2.add(20);
		stack2.add(100);
		stack2.add(50);
		stack2.add(60);
		stack2.add(10);

		// adding all elements from stack2 to arrayList
		stack1.addAll(stack2);

		for (Integer i : stack1) {
			System.out.println(i);
		}

		System.out.println("####################################################");

		System.out.println("Linked List contains 50 = " + stack1.contains(50));
		System.out.println("Linked List contains 500 = " + stack1.contains(500));

		System.out.println("######################################################");

		System.out.println("Linked list1 conatins arrayList 2 = " + stack1.containsAll(stack2));

		System.out.println("######################################################");

		System.out.println(stack2.get(3));

		System.out.println("#######################################################");

		System.out.println("Index of 60 = " + stack2.indexOf(60));

		System.out.println("#######################################################");

		System.out.println("stack2 is empty = " + stack2.isEmpty());

		// stack2.clear();

		System.out.println("stack2 is empty = " + stack2.isEmpty());

		System.out.println("#########################################################");

		System.out.println("stack2 size = " + stack2.size());

		System.out.println("#########################################################");

		List<Integer> stack3 = stack2.subList(3, 6);

		for (Integer a : stack3) {
			System.out.println(a);
		}

		System.out.println("############################################################");

		stack2.set(3, 200);
		stack2.remove(6);

		for (Integer a : stack2) {
			System.out.println(a);
		}

		System.out.println("########################################################");

		Iterator<Integer> it = stack2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("######################################################");

	}

}
