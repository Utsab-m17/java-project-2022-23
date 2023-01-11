package ioStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) {

		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\UTMUKHER\\Documents\\Writer.txt");
			fw.write("Hello everyone good morining");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\UTMUKHER\\Documents\\Writer.txt");
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
