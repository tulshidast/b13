package javapractices;

import java.util.Iterator;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(20);
		stack.add(100);
		stack.add(200);
		stack.add(null);

		Iterator<Integer> it = stack.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
