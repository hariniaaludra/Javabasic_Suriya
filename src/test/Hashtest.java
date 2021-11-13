package test;
	import java.util.*;

	public class Hashtest {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] left = new String[t];
	        String [] right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            left[i] = s.next();
	            right[i] = s.next();
	        }
	HashSet<String> pairs = new HashSet<String>(t);

	    for(int i = 0; i < t; i++)
	    {
	        pairs.add("("+ left[i] + ", " + right[i] + ")" );
	        System.out.println(pairs.size());        
	    }

	   }
}
