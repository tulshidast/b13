package javapractices;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<Integer, String> empDetails = new TreeMap<Integer, String>();

		empDetails.put(1234, "sachin");
		empDetails.put(1254, "rohit");
		empDetails.put(9867, "hardik");
		empDetails.put(4757, "rohit");
		empDetails.put(1111, null);
		empDetails.put(8787, null);

		empDetails.put(9867, "sourav");

		Set<Entry<Integer, String>> set = empDetails.entrySet();

		for (Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
