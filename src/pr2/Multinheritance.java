package pr2;

 class Multi{ 
	 void mul () 
	 {System.out.println("this is multilevel inheritance");
	 }
	 }
	class Subj extends Multi  {
		
		void base()
		{System.out.println("this is extends from multilevel inheritance");
		}
		}
		class Sub1 extends Subj{
		void sub1()
		{System.out.println("this is extends from multilevel inheritances");
		}
	}
	public class Multinheritance {
		public static void main(String[]args) {
			Sub1 ob1=new Sub1();
			ob1.sub1();
			ob1.base();
			ob1.mul();
		
			
			
}}
