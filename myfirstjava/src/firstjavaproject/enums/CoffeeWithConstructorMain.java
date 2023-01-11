package firstjavaproject.enums;

public class CoffeeWithConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CoffieSize.valueOf("BIG"));
		//System.out.println(CoffieSize.values());
		
		if(CoffieSize.valueOf("BIG").equals(CoffieSize.BIG)) {
			CoffieSize cs = CoffieSize.BIG;
			System.out.println(cs.ounces);
		}
	}

}
