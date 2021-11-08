package program4;

	import java.util.*;  
	class Hashsetexample{  
	 public static void main(String args[]){  
	   ArrayList<String> list=new ArrayList<String>();  
	           list.add("Ravi");  
	           list.add("Vijay");  
	           list.add("Ajay");  
	             
	           HashSet<String> set=new HashSet(list);  
	           set.add("Geethansashtik");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  
	}  
