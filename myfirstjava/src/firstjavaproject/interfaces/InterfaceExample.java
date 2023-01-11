package firstjavaproject.interfaces;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroCycle cycle = new HeroCycle();
		cycle.applyBrake(1);
		System.out.println(cycle.a);
	}

}

interface Bicycle{
	int a =45;
	void applyBrake(int decrement);
	void speedUp(int increment);
}

class HeroCycle implements Bicycle{

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		System.out.println("Slowing down");
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		System.out.println("Speeding up");
	}
	
	void blowHorn() {
		System.out.println("Applying horn");
	}
	
}
