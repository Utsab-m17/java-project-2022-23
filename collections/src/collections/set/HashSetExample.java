package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("Hello");
		set.add("World");
		set.add(23);
		set.add(15.6);
		set.add("Hello");

		System.out.println(set);
	}

}
