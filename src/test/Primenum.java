package test;
import java.io.IOException;
import java.util.*;
	public class Primenum {
	    public static void main(String[] args) throws IOException {

	        try (Scanner scanner = new Scanner(System.in);)
	        {
	            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
	        }
	    }
	}

