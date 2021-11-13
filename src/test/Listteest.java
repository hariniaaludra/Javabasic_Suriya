package test;
import java.util.*;
public class Listteest {
	public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	       ArrayList<Integer> list=new ArrayList<Integer>();
	        for(int i=0;i<n;i++)
	            {list.add(scan.nextInt());}
	        n=scan.nextInt();
	        for(int i=0;i<n;i++)
	        {String q=scan.next();
	         if(q.compareTo("Insert")==0)
	         {list.add(scan.nextInt(),scan.nextInt());
	         }
	         else
	             {list.remove(scan.nextInt());}
	        }
	        for(int i:list)
	            System.out.print(i+ " ");
	    }
	}
