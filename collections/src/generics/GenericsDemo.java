package generics;

public class GenericsDemo {

	public static void main(String[] args) {
		
		Sender<String> stringSender = new Sender<String>();
		stringSender.setMessage("String type message");
		stringSender.sendMessage();
		System.out.println(stringSender.getMessage());

	}

}
