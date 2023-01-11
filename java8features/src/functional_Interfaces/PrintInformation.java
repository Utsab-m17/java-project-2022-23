package functional_Interfaces;

public interface PrintInformation {
	public void printMessage(String message);
	
	static void printMessage() {
		System.out.println("Ludo");
	}
}
