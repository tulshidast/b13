package javapractices;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(100);
		treeSet.add(5);
		treeSet.add(150);
		treeSet.add(100);
		treeSet.add(500);
		// treeSet.add(null);

		Iterator<Integer> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
