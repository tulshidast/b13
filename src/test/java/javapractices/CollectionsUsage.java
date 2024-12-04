package javapractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsUsage {

	public static void main(String[] args) {

		ArrayList<Integer> empIds = new ArrayList<Integer>();
		empIds.add(4546);
		empIds.add(4545);
		empIds.add(4540);
		empIds.add(4549);
		empIds.add(4550);
		empIds.add(4536);
		empIds.add(4526);

		Iterator<Integer> empIdsIterator = empIds.iterator();

		while (empIdsIterator.hasNext()) {
			System.out.println(empIdsIterator.next());
		}

		System.out.println("####################################################");

		Collections.sort(empIds);

		Iterator<Integer> empIdsIterator1 = empIds.iterator();

		while (empIdsIterator1.hasNext()) {
			System.out.println(empIdsIterator1.next());
		}

		System.out.println("####################################################");

		Collections.reverse(empIds);
		Iterator<Integer> empIdsIterator2 = empIds.iterator();

		while (empIdsIterator2.hasNext()) {
			System.out.println(empIdsIterator2.next());
		}

		System.out.println("####################################################");

		System.out.println(Collections.min(empIds));

		System.out.println(Collections.max(empIds));

	}

}
