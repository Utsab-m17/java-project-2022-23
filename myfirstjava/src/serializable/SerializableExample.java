package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmpId(01);
		emp1.setEmpName("Utsab");
		System.out.println(emp1);
		
		//Serialization
		File file = new File("C:\\Users\\UTMUKHER\\Documents\\serializedObject.txt");
		
		try(FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			oos.writeObject(emp1);
			
			//Deserialization
			Employee emp;
			emp = (Employee) ois.readObject();
			System.out.println("Deserialized --- "+ emp);
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getClass()+"--------"+e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getClass()+"--------"+e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
