package serialization_deserialization;
import java.io.*;
public class Deserial1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("f:\\serial1.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employ p=(Employ)ois.readObject();
			System.out.println("User ID is: "+p.uid);
			System.out.println("Password is: "+p.pwd);
			System.out.println("Name is: "+p.name);
			System.out.println("ID is: "+p.eid);
			System.out.println("Salary is: "+p.salary);
			
		} catch (Exception e) {
			System.out.println("File not found!");
		}
	}

}
