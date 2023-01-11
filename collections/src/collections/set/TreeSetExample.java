package collections.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		
		System.out.println(treeSet);
		
		
		System.out.println("*************************************");
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		
		treeSet2.add(3);
		treeSet2.add(4);
		treeSet2.add(2);
		treeSet2.add(5);
		treeSet2.add(1);
		
		System.out.println(treeSet2);
		
		System.out.println("*************************************");
        TreeSet<Integer> descTreeSet = (TreeSet<Integer>) treeSet2.descendingSet();
		
		System.out.println(descTreeSet);

	}

}
