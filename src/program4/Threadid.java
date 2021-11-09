package program4;

	public class  Threadid extends Thread  
	{    
	    public void run()  
	    {    
	        System.out.println("running...");    
	    }    
	    public static void main(String args[])  
	    {     
	    	 Threadid t1=new  Threadid();    
	        System.out.println("Name of t1: "+t1.getName());  
	        System.out.println("Id of t1: "+t1.getId());      
	        t1.start();  
	    }    
	}   
