package pr2;

abstract class Abstractconstruct {
	Abstractconstruct(){System.out.println("this is constructor");}
abstract void run();
void speed() {System.out.println("speed is 60 km/hr ");
}}
class Bike extends Abstractconstruct {
	void run() {System.out.println("running safely");
	
	}}
	class Abstractconstructor {
		public static void main(String[]args) {
			Abstractconstruct  a= new Bike();
			a.speed();
			a.run();	
		}}
		
	
