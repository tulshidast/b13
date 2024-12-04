package javapractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(5);
		hashSet.add(20);
		hashSet.add(100);
		hashSet.add(10);
		hashSet.add(null);

		Iterator<Integer> it = hashSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
