package pr2;
 class Methodoverriding {
	
void method()
{System.out.println("this is methodoverriding");}}

class Riding extends Methodoverriding{
	
	void method()
	{System.out.println("this is an polymorphism");}

	public static void main(String[]args) {
		Methodoverriding ob=new Riding();
		ob.method();
	}
	}
