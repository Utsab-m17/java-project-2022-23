package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String args[]) {
		
		List list = new ArrayList();
		list.add("Hello");
		list.add(12);
		list.add(30.0);
		list.add(list);
		list.add(87l);
		System.out.println(list);
		list.add(2,"Blow");
		System.out.println(list);
		list.add(null);
		System.out.println(list);
		list.add(1,30);
		
		System.out.println(list);
		
		System.out.println("*******Acessing arraylist using get method*********");
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		
		System.out.println("*******Accessing whole arraylist using for loop********");
		
		int size = list.size();	
		for(int i=0; i<size; i++) {
			System.out.print(" "+list.get(i));
		}
		
		System.out.println();
		System.out.println();
		System.out.println("*******Accessing whole arraylist using foreach loop********");
		for(Object objList : list) {
			System.out.print(" "+objList);
		}
		
		
		//Lists with specific types
		List<String> lt = new ArrayList<String>();
		lt.add("Haaland");
		lt.add(null);
		lt.add("KDB");
		lt.add("Leo");
		lt.add("");
		lt.add("Gavi");
		int[] n = {10,1,2,3,10};
		lt.add(n.toString());
		
		System.out.println();
		System.out.println();
		System.out.println("*******Accessing whole arraylist of specific type********");
		for(String s : lt) {
			System.out.print(s+", ");
		}
	}

}
