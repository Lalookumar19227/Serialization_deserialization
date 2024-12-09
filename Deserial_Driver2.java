package serialization_deserialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserial_Driver2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("f:\\serial2.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employ[] k=(Employ[])(Object[])ois.readObject();
			for(Employ p:k) {
				System.out.println("User ID is: "+p.uid);
				System.out.println("Password is: "+p.pwd);
				System.out.println("Name is: "+p.name);
				System.out.println("ID is: "+p.eid);
				System.out.println("Salary is: "+p.salary);
				System.out.println("========================");
			}
		} catch (Exception e) {
			System.out.println("File not found!");
		}
	}

}
