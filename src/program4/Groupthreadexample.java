package program4;

import java.lang.*;

class Threadnew extends Thread {
	Threadnew(String name, ThreadGroup tg) {
		super(tg, name);
		start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("The exception has been encountered " + e);
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread has finished executing");
	}
}

public class Groupthreadexample {
	public static void main(String argvs[]) throws SecurityException, InterruptedException {
		ThreadGroup tg = new ThreadGroup("the parent group");
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");
		Threadnew th1 = new Threadnew("the first", tg);
		System.out.println("Starting the first");
		Threadnew th2 = new Threadnew("the second", tg);
		System.out.println("Starting the second");
		th1.join();
		th2.join();
		tg1.destroy();
		System.out.println(tg1.getName() + " is destroyed.");
		tg.destroy();
		System.out.println(tg.getName() + " is destroyed.");
	}
}
