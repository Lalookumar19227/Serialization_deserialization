package serialization_deserialization;
import java.io.*;
public class Seria_Driver {
	public static void main(String[] args) {
		Employ e1=new Employ("Mohan123", "abc121@","Mohan Singh", 123, 354665.56);
		
		try {
			FileOutputStream fis=new FileOutputStream("f:\\serial1.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fis);
			
			oos.writeObject(e1);
			System.out.println("Serialization is completed!!");
			
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("File Not Found!");
		}
		System.out.println("program Ends!!");
		
	}
}
