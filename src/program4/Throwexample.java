package program4;

public class Throwexample {  
	    public static void validate(int age) {  
	        if(age<18) {   
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	    public static void main(String args[]){  
	        validate(14);  
	        System.out.println("rest of the code...");    
	  }    
	}    


