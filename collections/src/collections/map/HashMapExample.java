package collections.map;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
	HashMap<String, Double> hm = new HashMap<String, Double>();
	
	hm.put("Ralph", 123.89);
	hm.put("Soham", 101.00);
	hm.put("Roger", 123.89);
	hm.put("Yagnik", 28.9);
	hm.put(null, 10.10);
	hm.put("Anderson", null);
	hm.put("Harry", 111.11);

	System.out.println(hm.size());
	System.out.println(hm);
	System.out.println(hm.values());
	
	
	}

}
