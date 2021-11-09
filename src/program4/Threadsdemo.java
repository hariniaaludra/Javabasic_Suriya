package program4;

public class Threadsdemo extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		Threadsdemo t1 = new Threadsdemo();
		Threadsdemo t2 = new Threadsdemo();
		Threadsdemo t3 = new Threadsdemo();

		t1.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();
	}
}
