package serializationexample;
import java.io.*;

public class Serializable1 {
	public static void main(String []args) {
		try {
			Serializationsample obj=new Serializationsample(11,"suriya");
			FileOutputStream fout=new FileOutputStream("f.txt");   
			  ObjectOutputStream out=new ObjectOutputStream(fout); 
			  out.writeObject(obj);
			  out.flush();
			  out.close();
			  System.out.println("Success");
		}catch (Exception e) {
			System.out.println(e);
			
		}
		
	}

}
