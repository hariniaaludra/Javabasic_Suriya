package program2;
import java.util.*;

public class Iterators {

	public static void main(String[] args) {
 ArrayList<String> car= new ArrayList<String> ();
 car.add("bmw");
 car.add("ford");
 car.add("honda");
 Iterator it =car.iterator(); 
 while(it.hasNext()){
	 System.out.println("after remove");
 System.out.println(it.next());
 if( it.next().equals("ford")) {
 it.remove();
 }
 System.out.println(it.next());
	}
}}
