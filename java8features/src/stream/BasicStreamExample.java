package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BasicStreamExample {

	public static void main(String[] args) {
		System.out.println("***********************List of order streams example******************");
        Order order1 = new Order("AUD",15000);
        Order order2 = new Order("INR",5000);
        Order order3 = new Order("USD",150000);
        Order order4 = new Order("EUR",25000);
        Order order5 = new Order("AUD",8000);
        Order order6 = new Order("EUR",50000);
        
        List<Order> orderList = new ArrayList<Order>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        
        orderList.stream()
                .filter(o -> o.getAmount()>5000)
                .sorted(Comparator.comparing((Order::getAmount)))
        		.forEach(System.out::println);

        
        System.out.println();
        System.out.println("**********************MIN*********************");
        System.out.println(orderList.stream()
        		.filter(o -> o.getCurrency().equals("EUR"))
                .min(Comparator.comparing(Order::getAmount)));
        
        System.out.println();
        System.out.println("**********************MAX*********************");
        System.out.println(orderList.stream()
        		.filter(o -> o.getCurrency().equals("EUR"))
                .max(Comparator.comparing(Order::getAmount)));
        
        System.out.println();
        System.out.println("**********************Count*********************");
        System.out.println(orderList.stream()
        		.filter(o -> o.getCurrency().equals("EUR"))
                .count());
	}

}
