package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
	//Here example takes <T> String and returns the length of the string as <R> Integer
		
		Function<String,Integer> func= x->x.length();
		Integer apply = func.apply("Prabhat");
		System.out.println(apply);
		
		System.out.println("************************************");
		
		Function<Integer,Integer> func2 = x->x*2;
		Integer result = func.andThen(func2).apply("Hello world");
		System.out.println(result);
		
		System.out.println("******************X******************");
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		Function<Integer,Integer> f =x->x*2 ;
		Function<Integer,Integer> f2=x->x+5;
			
		for (Integer integer : listOfInteger) {
			Integer r = f.apply(integer);
			System.out.print(r+" ");
		}
		System.out.println();
		System.out.println("******************************************");
		for (Integer integer : listOfInteger) {
			Integer r = f2.apply(integer);
			System.out.print(r+" ");
		}
			
		
	}

}

