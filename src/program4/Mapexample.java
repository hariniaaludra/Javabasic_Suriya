package program4;

	import java.util.*;  
	class Mapexample{  
	 public static void main(String args[]){  
	Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");    
	      map.entrySet()   
	      .stream()   
	      .sorted(Map.Entry.comparingByValue())  
	      .forEach(System.out::println);  
	 }  
	}  
