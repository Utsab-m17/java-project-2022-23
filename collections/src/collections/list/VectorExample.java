package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {


		List<Integer> v = new Vector<Integer>();
		System.out.println(v.size());
		
		v.add(2);
		v.add(3);
		v.add(7);
		v.add(8);
		v.add(0);
		v.add(1);

		for(Integer fruits : v) {
			System.out.println(fruits);
		}
	}

}
