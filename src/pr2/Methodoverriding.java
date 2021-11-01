package pr2;// use standard package name
 class Methodoverriding {
	
void method()
{System.out.println("this is methodoverriding");}}

class Riding extends Methodoverriding{
	
	void method()
	{System.out.println("this is an polymorphism");}

	public static void main(String[]args) {// main function should be in main class
		Riding ob=new Riding();
		ob.method();
	}
	}
