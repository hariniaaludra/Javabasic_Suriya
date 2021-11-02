package program2;// use standard package name

public class Polymorphism {
	    static int multiply(int a, int b)
	    {
	        return a * b;
	    }
	  
	    static int multiply(int a, int b, int c)
	    {
	        return a * b * c;
	    }
	}
	  
	class Main {
	    public static void main(String[] args)
	    {
	        System.out.println(Polymorphism.multiply(2, 4));
	  
	        System.out.println(Polymorphism.multiply(2, 7, 3));
	    }
	}
