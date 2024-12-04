package javapractices;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(50);

		for (Integer i : arrayList) {
			System.out.println(i);
		}

	}

}
