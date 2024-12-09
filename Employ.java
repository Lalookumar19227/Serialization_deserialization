package serialization_deserialization;
import java.io.*;
public class Employ implements Serializable{
	String uid;
	transient String pwd;
	String name;
	int eid;
	double salary;
	Employ(){
		
	}
	Employ(String uid, String pwd, String name, int eid, double salary){
		this.uid=uid;
		this.pwd=pwd;
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}

}
