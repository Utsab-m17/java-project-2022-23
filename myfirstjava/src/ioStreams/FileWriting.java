package ioStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String word = "Good Morning";
			FileOutputStream fout = new FileOutputStream("C:\\Users\\UTMUKHER\\Documents\\Example.txt");
			fout.write(68);
			fout.write(65);

			byte bArr[] = word.getBytes();
			fout.write(bArr);
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
