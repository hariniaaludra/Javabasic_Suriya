package pr2;

import java.util.Scanner;
interface Day{
	void num();
}
enum week implements Day{
	ONE{
	public void num() {
		
		System.out.println("1, Sunday");
	}       
},

	TWO{
		public void num(){
			System.out.println("2, MONDAY");
		}

	};

}
public class Senum{
		public static void main(String[]args) {
			  
			for(week d:week.values()) {
				Scanner sc=new Scanner(System.in);
				  String  a1=sc.nextLine();
					d.num();
			}
		}
}