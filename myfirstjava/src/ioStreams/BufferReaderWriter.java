package ioStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriter {
	public static void main(String args[]) {
		
		try {
			
			FileWriter fw = new FileWriter("C:\\Users\\UTMUKHER\\Documents\\WriterFile.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Using Buffer Writer method");
			bw.close();
			
			FileReader fr = new FileReader("C:\\Users\\UTMUKHER\\Documents\\WriterFile.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	
	}
}
