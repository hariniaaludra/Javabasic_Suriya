package program2;
interface inter{
	void print();
	static int cube(int X) {
		return X*X*X;
	}
}

public class Interface implements inter {
	public void print ()
	{System.out.println("this is interface");}

	
	public static void main(String[] args) {
		inter ob=new Interface();
		ob.print();
		System.out.println(inter.cube(5));
		
	}

}
