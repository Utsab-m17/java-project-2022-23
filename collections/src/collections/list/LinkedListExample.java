package collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(45);
		li.add(2);
		li.add(9);
		li.add(-98);
		li.add(0);
		li.add(2);
		
		Iterator<Integer> iter = li.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+ " ");
		}
		System.out.println(li);
		
		li.set(5, 17);
		System.out.println(li);
		
		Collections.replaceAll(li, 2 , 16);
		System.out.println(li);
		
		
	}

}
