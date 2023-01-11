package collections.list;

import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		List stack = new Stack();
		Stack<Double> doubleNums = new Stack<Double>();
		doubleNums.push(12.0);
		doubleNums.push(9.98);
		doubleNums.push(3.6);
		doubleNums.push(7.2);
		doubleNums.push(18.1);
		
		
		for(Double num : doubleNums) {
			System.out.print(num+ " ");
		}
		System.out.println();
		System.out.println(doubleNums);
		doubleNums.pop();
		System.out.println(doubleNums);
		
		
		Stack stackOfNums = new Stack();
		Double[] arrDoubleNums = {6.72, 17.10, 1.8};
		stackOfNums.push(arrDoubleNums);
		stackOfNums.push("Hello Dhamna");
		stackOfNums.push(123);
		
		System.out.println();
		for(int i=0; i< ((Double[]) stackOfNums.get(0)).length; i++) {
			System.out.print(((Double[])stackOfNums.get(0))[i]+ " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("**************************************");
		Double[] aDNum = (Double[]) stackOfNums.get(0);
		for(int i=0; i<aDNum.length; i++) {
			System.out.print(aDNum[i]+" ");
		}
		System.out.println();
		stackOfNums.forEach(System.out :: println);
	}

}
