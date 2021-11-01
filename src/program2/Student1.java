package program2;// use standard package name

public class Student1 {
		int num;
		public Student1() {
			num=100;
		}
	public  Student1(int n) {
		num=n;
	}

	public void mark() {
		System.out.println(num);
	}}
	class S{//add full name
		public static void main(String[]args) {
			Student1 ob1=new Student1();
			ob1.mark();
			
		}
	} 
