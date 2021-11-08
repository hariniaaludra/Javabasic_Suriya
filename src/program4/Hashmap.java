package program4;
	import java.util.*;  
	public class Hashmap{  
	 public static void main(String args[]){  
	   HashMap<Integer,String> map=new HashMap<Integer,String>();   
	   map.put(1,"grapes");  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(1,"mango");
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	}  
	}  
