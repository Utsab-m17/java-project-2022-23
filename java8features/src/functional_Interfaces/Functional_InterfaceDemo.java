package functional_Interfaces;

public class Functional_InterfaceDemo {

	public static void main(String[] args) {
//		Functional_Interface fi = num1 -> num1 + 10;
//		int result = fi.fun(12);
//		System.out.println(result);

//		Functional_Interface fi = (num1,num2) -> num1 + num2;
//		int result = fi.fun(12,10);
//		System.out.println(result);

//		Functional_Interface fi = ()-> "Hello world";
//		System.out.println(fi.fun());

//		Functional_Interface fi = () -> {
//			System.out.println("Hello Bro");
////			System.out.println("I'm fine");
////			System.out.println(123);
////			for (int i = 0; i < 10; i++) {
////				System.out.print(i + " ");
////			}
//		};
//		fi.fun();

		Functional_Interface fi = (s)-> s.length();
		System.out.println(fi.fun("Utsab Mukherjee"));
		
		PrintInformation pi = (m) -> {};
	}

}
