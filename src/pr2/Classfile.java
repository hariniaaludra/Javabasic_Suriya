package pr2;
import pr2.*;
public class Classfile {
	public static void main(String args[]) {
		{sub d = new sub();
		d.num();
		d.num1(200);
		Mul b = new Mul();   //inheritance
		b.multi(7);
		}
		{
	        System.out.println(Polymorphism.Multiply(2, 4));     //polymorphism
	  
	        System.out.println(Polymorphism.Multiply(2, 7, 3));
	    }
		{
		Methodoverriding ob=new Riding();             //run-time polymorphism
		ob.method();
		}
		
		{
			Abstract a;
		a= new Rect();                       //abstract
		a.shap();	
		}
}}
