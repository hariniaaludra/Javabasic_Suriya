package program4;
class Tablevalue {
	synchronized void printtable(int n) {
		for(int i=0;i<=5;i++) {
			
		System.out.println(n*i);
		try {
			Thread.sleep(400);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
}
class Mythread extends Thread{
	Tablevalue t;
	Mythread(Tablevalue t){
		this.t=t;
	}
	public void run() {
		t.printtable(3);
	}
}
class Childthread extends Thread{
	Tablevalue t;
	Childthread(Tablevalue t){
		this.t=t;
	}
	public void run() {
		t.printtable(100);
	}
}
public class Withsync {
public static void main(String[]args) {
	Tablevalue obj=new Tablevalue();
Mythread t1=new Mythread(obj);
Childthread t2=new Childthread(obj);
t1.start();
t2.start();
}
}
