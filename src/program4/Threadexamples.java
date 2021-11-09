package program4;

public class Threadexamples implements Runnable {
	public void run() {
		System.out.println("now the thread is running");
	}
	public static void main(String []args) {
		Runnable r=new Threadexamples();
		Thread th=new Thread(r,"this is thread");
		th.start();
		String st=th.getName();
		System.out.println(st);
		
	}

}
