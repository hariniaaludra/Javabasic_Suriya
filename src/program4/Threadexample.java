package program4;

	class Threadexample extends Thread{  
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			Threadexample t1=new Threadexample();  
		t1.start();  
		 }  
		}  

