package program4;
	import java.util.*;  
	public class Linkedexample {  
	  
	        public static void main(String [] args)  
	        {  
	           LinkedList<String> ll=new LinkedList<String>();  
	           ll.add("Ravi");  
	           ll.add("Vijay");  
	           ll.add("Ajay");  
	           ll.add("Anuj");  
	           ll.add("Gaurav");  
	           ll.add("Harsh");  
	           ll.add("Virat");  
	           ll.add("Gaurav");  
	           ll.add("Harsh");  
	           ll.add("Amit");    
	              ll.removeFirstOccurrence("Gaurav");  
	              System.out.println("After invoking removeFirstOccurrence() method: "+ll); 
	              ll.removeLastOccurrence("Harsh");  
	              System.out.println("After invoking removeLastOccurrence() method: "+ll);       
	              ll.clear();  
	              System.out.println("After invoking clear() method: "+ll);   
	       }  
	    }                   


