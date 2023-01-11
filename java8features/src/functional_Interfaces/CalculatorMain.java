package functional_Interfaces;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c1 = (num1, num2) -> num1 + num2;
		System.out.println(c1.calculate(12, 18));
		
		Calculator c2 = (num1, num2) -> num1>num2 ? num1-num2 : num2-num1;
		System.out.println(c2.calculate(12, 18));
		
	}

}