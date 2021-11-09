package program4;


public class Throwsexample {
public static int divide(int m,int n)throws ArithmeticException{
	int div=m/n;
	return div;
	
}
public static void main(String[]args) {
	Throwsexample obj=new Throwsexample();
	try {
		System.out.println(obj.divide(45,0));
	}
	catch(ArithmeticException e) {
		System.out.println("number cannot be divisible by zero");
		
	}
	System.out.println("Rest of code....");
}
}
