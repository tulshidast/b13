package javapractices;

import java.util.Iterator;
import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(20);
		vector.add(100);
		vector.add(200);
		vector.add(null);

		Iterator<Integer> it = vector.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
