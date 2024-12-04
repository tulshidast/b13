package javapractices;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		TreeMap<Integer, String> empDetails = new TreeMap<Integer, String>();

		empDetails.put(123, "sachin");
		empDetails.put(456, "virat");
		empDetails.put(789, "saurav");
		empDetails.put(1010, "hardik");
		empDetails.put(1011, "ravindra");

		Set<Entry<Integer, String>> empD = empDetails.entrySet();

//		Iterator<Entry<Integer, String>> it = empD.iterator();
//
//		while (it.hasNext()) {
//			Entry<Integer, String> e = it.next();
//			System.out.println(e.getKey() + " : " + e.getValue());
//		}

		for (Entry<Integer, String> e : empD) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("#########################putAll#####################################");

		TreeMap<Integer, String> empDetails2 = new TreeMap<Integer, String>();
		empDetails2.put(9999, "jasprit");

		empDetails2.putAll(empDetails);

		Set<Entry<Integer, String>> empD2 = empDetails2.entrySet();
		for (Entry<Integer, String> e2 : empD2) {
			System.out.println(e2.getKey() + " : " + e2.getValue());
		}

		System.out.println("############################################################");

		empDetails.clear();
		for (Entry<Integer, String> e : empD) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("#############################################################");

		System.out.println("Contains key = " + empDetails2.containsKey(9999));
		System.out.println("Contains key = " + empDetails2.containsKey(0202));

		System.out.println("#############################################################");

		System.out.println("Contain value = " + empDetails2.containsValue("jasprit"));
		System.out.println("Contain value = " + empDetails2.containsValue("nitin"));

		System.out.println("##############################################################");

		System.out.println("empDetails2 is empty = " + empDetails2.isEmpty());
		System.out.println("empDetails is empty = " + empDetails.isEmpty());

		System.out.println("################################################################");

		System.out.println(empDetails2.get(9999));

		System.out.println("#################################################################");

		Set<Integer> empIds = empDetails2.keySet();

		for (Integer empId : empIds) {
			System.out.println("emp id = " + empId);
		}

		System.out.println("#################################################################");

		System.out.println("size = " + empDetails2.size());

		System.out.println("#################################################################");

		empDetails2.remove(1010);
		empDetails2.remove(9999, "jasprit");

		System.out.println("##############################################################");
		empDetails2.replace(789, "yuvraj");
		System.out.println("##############################################################");

		Set<Entry<Integer, String>> empD22 = empDetails2.entrySet();
		for (Entry<Integer, String> empD33 : empD22) {
			System.out.println(empD33.getKey() + " : " + empD33.getValue());
		}

		System.out.println("##################################################################");

		Collection<String> col = empDetails2.values();

		for (String s : col) {
			System.out.println("emp name = " + s);
		}

		System.out.println("#######################################################################");

	}

}
