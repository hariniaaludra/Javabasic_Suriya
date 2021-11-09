package program4;
	public class Threadsuspend extends Thread  
	{    
	    public void run()  
	    {    
	        for(int i=1; i<5; i++)  
	        {    
	            try  
	            {  
	                 sleep(500);  
	                 System.out.println(Thread.currentThread().getName());    
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }    
	    public static void main(String args[])  
	    {      
	    	Threadsuspend t1=new Threadsuspend ();    
	    	Threadsuspend t2=new Threadsuspend ();   
	    	Threadsuspend t3=new Threadsuspend ();      
	        t1.start();  
	        t2.start();  
	        t2.suspend();
	        t3.start();  
	    }    
	}  
