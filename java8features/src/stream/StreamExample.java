package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10,20,30);
		System.out.println(stream);
//		System.out.println(stream.collect(Collectors.toList()));
		
		List<Integer> listOfIntegers = stream.filter(x -> x<30).collect(Collectors.toList());

		System.out.println(listOfIntegers);
		
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("Hello");
		listOfStrings.add("World");
		listOfStrings.add("Good");
		listOfStrings.add("Morning");
	}

}
