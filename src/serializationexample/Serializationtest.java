package serializationexample;
import java.io.*;
class Person implements Serializable{
	
	transient int id;
	transient String name;
public  Person(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
}
	class Student extends Person{
		int roll;
		String course;
		public Student(int id,String name,String course,int roll) {
		super(id,name);
		this.roll=roll;
		this.course=course;
		
	}
}
public class Serializationtest {
	public static void main(String[]args) {
		try {	
		Student ob1=new Student(10,"Cithra","group2",289);
		FileOutputStream f=new FileOutputStream("f.txt");
		ObjectOutputStream obj=new ObjectOutputStream(f);
		obj.writeObject(ob1);
		obj.flush();
		obj.close();
		System.out.println("sucess");
		}catch( Exception e ) {
			System.out.println(e);
		}
		
	try{       
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));    
		  Student s=(Student)in.readObject();       
		  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.roll);       
		  in.close();    
		  }catch(Exception e){System.out.println(e);}
	}
}




	
