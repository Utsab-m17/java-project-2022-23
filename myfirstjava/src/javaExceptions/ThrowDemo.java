package javaExceptions;

import java.io.FileNotFoundException;

public class ThrowDemo {
	static void proc() throws FileNotFoundException {
		try {
			throw new FileNotFoundException("From Exception");			
		}catch(FileNotFoundException e) {
			System.out.println("Caught exception inside proc");
		    throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo td = new ThrowDemo();
		try {
			td.proc();
		}catch(FileNotFoundException e) {
			System.out.println("Recaught "+ e);
		}
	}

}
