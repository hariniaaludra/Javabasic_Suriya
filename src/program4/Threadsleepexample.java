package program4;

	public class Threadsleepexample extends Thread  
	{    
	    public void run()  
	    {    
	        for(int i=1;i<5;i++)  
	        {    
	            try  
	            {  
	                Thread.sleep(500);  
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }    
	    public static void main(String args[])  
	    {    
	    	Threadsleepexample t1=new Threadsleepexample();    
	    	Threadsleepexample t2=new Threadsleepexample();
	    	t1.start();
	    	try {
	    		t1.join(1500);
	    	}
	    	catch(Exception e)
	    	{ System.out.println(e);}   
	    	t2.setPriority(Thread.MAX_PRIORITY);
	        System.out.println("thread priority:"  + t2.getPriority());
	        t2.start();
	    }    
	}  

