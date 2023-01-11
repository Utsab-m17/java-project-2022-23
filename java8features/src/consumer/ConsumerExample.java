package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("Apple");
		
		List<Integer> listOfInteger = Arrays.asList(11,22,33,44,55);
		
		Consumer<Integer> consumers = (x) -> System.out.println(x);
		for (Integer n : listOfInteger) {
			consumers.accept(n);
		}
		System.out.println("**************Higher Order function is -- displayInfo********************");
		displayInfo(listOfInteger, consumers);
		
		System.out.println("*************Higher Order function is -- forEach*********************");
		listOfInteger.forEach(consumers);
		System.out.println("**********************************");
		listOfInteger.forEach((Integer x)->System.out.println(x));
		System.out.println("**********************************");
		displayInfo(listOfInteger, (Integer x)->System.out.println(x));
	}

	// Custom higher order function
	public static <T> void displayInfo(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}
}
