package program4;
	import java.util.Vector;  
	public class Vectorexample { 
	    public static void main(String arg[]) {         
	          Vector<Integer> vc = new Vector<Integer>(4);  
	          Vector<Integer> vecclone = new Vector<Integer>(4);  
	          vc.add(4);  
	          vc.add(3);  
	          vc.add(2);  
	          vc.add(1);    
	          System.out.println("Elements in vector are: ");           
	          for (Integer num : vc) {           
	             System.out.println("Number= " +num);  
	          }            
	          vecclone = (Vector) vc.clone(); 
	          System.out.println("Elements in vecclone vector are: ");                  
	          for (Integer num : vecclone) {           
	             System.out.println("Number = " + num);  
	          }  
	    }              
	}  


