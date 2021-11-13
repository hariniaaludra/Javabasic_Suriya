package program4;

class Tablesyn{
	synchronized void printtable(int n) {
		for(int i=0;i<=5;i++) {
			
		System.out.println(n*i);
		try {
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
}
public class Syncexample {

	public static void main(String[] args) {
		Tablesyn obj=new Tablesyn();
		Thread t1=new Thread() {
		public void run() {
			obj.printtable(5);
		}
		};
		Thread t2=new Thread() {
			public void run() {
				obj.printtable(100);
			}
			};
			t1.start();
			t2.start();

	}
	}
