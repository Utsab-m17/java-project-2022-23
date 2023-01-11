package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Key, String> map =  new HashMap<Key, String>();
		map.put(new Key(1,"NY"), "New York City");
		map.put(new Key(2,"TC"), "Tokyo City");
		map.put(new Key(3,"HWH"), "Howrah");
		map.put(new Key(4,"BNG"), "Bangaluru");
		Key key5 = new Key(5,"KOL");
		map.put(key5, "Kolkata");
		
		System.out.println(map.size());
		
		System.out.println(map.get(key5));
		
		System.out.println(map.keySet());

	}

}
