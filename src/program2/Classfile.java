package program2;
public class Classfile {
	public static void main(String args[]) {
		{
			Inherit d = new Inherit();
			d.num();
			d.num1(200);
			Inheritsub b = new Inheritsub();
			b.multi(7);

		}
		{
	        System.out.println(Polymorphism.multiply(2, 4));     //polymorphism
	        System.out.println(Polymorphism.multiply(2, 7, 3));
	    }
		{
		Methodoverriding obj=new Riding();             //run-time polymorphism
		obj.method();
		}
		
		{
			Abstract a;
		a= new Rect();                       //abstract
		a.shap();	
		}
}}
