
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Sample {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int x=sc.nextInt();
	        LinkedList<Integer> list=new LinkedList<>();
	        for(int i=0;i<=x;i++){
	            int value=sc.nextInt();
	            list.add (value);
	        }
	        int d=sc.nextInt();
	        for(int j=0;j<=d;j++){
	            list.remove(d);
	            
	        }
	        for(Integer num: list){
	            System.out.println(num);
	        }
	    }
	}

