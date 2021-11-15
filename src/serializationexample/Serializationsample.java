package serializationexample;
import java.io.*;

public class Serializationsample implements Serializable {
	int i;
	String name;
	public Serializationsample(int id,String name) {
		this.i=id;
		this.name=name;
	}
	

}
