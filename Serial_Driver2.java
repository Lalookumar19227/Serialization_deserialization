package serialization_deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial_Driver2 {
	public static void main(String[] args) {
		Employ e1=new Employ("Mohan123", "abc121@","Mohan Singh", 123, 354665.56);
		Employ e2=new Employ("Sohan123", "acc121@","Sohan Singh", 128, 344665.56);
		Employ e3=new Employ("Rohan123", "adc121@","Rohan Singh", 303, 304665.56);
		Employ e4=new Employ("ManMohan123", "akc121@","ManMohan Singh", 333, 384665.56);
		Employ e5=new Employ("PyareMohan123", "apc121@","PyareMohan Singh", 723, 454665.56);
		//Employ[] e= {e1,e2,e3,e4,e5};
		Employ[] emp_array=new Employ[5];
		emp_array[0]=e1;	emp_array[1]=e2;	emp_array[2]=e3;	
		emp_array[3]=e4;	emp_array[4]=e5;	
		try {
			FileOutputStream fis=new FileOutputStream("f:\\serial2.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fis);
			
			oos.writeObject(emp_array);
			System.out.println("Serialization is completed!!");
			
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("File Not Found!");
		}
		System.out.println("program Ends!!");
		
	}

}
