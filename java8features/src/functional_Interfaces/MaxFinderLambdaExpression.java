package functional_Interfaces;

public class MaxFinderLambdaExpression {

	public static void main(String[] args) {
		MaxFinder maxfinder = (num1, num2) -> num1>num2 ? num1 : num2;
		int result = maxfinder.max(10, 17);
		System.out.println(result);

	}

}
