package javapractices;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapImpl {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> empDetails = new LinkedHashMap<Integer, String>();

		empDetails.put(1234, "sachin");
		empDetails.put(1254, "rohit");
		empDetails.put(9867, "hardik");
		empDetails.put(4757, "rohit");
		empDetails.put(null, null);
		empDetails.put(8787, null);

		empDetails.put(9867, "sourav");

		Set<Entry<Integer, String>> set = empDetails.entrySet();

		for (Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
