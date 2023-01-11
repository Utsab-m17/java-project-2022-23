package ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class FileInputStreamExample {

	public static void main(String[] args) throws FileSystemException {


		File file = new File("C:\\Users\\UTMUKHER\\Documents\\Example.txt");
		
		
		try {
			FileInputStream fis = new FileInputStream(file);
			System.out.println(fis.read());
			int i = fis.read();
			System.out.println(i);
			System.out.println((char) i);
			
//			Reading all characters
			/**int f=0;
			while((f=fis.read()) != -1) {
				System.out.print((char)f);
			}**/
			
			byte arr[] = fis.readAllBytes();
			int f=0;
			while(f<arr.length){
				System.out.print((char)arr[f]);
				f++;
			}
			fis.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally { //finally block always run whether or not there is an exception
			System.out.println("Finally");
		}

	}

}
