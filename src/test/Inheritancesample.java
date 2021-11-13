package test;
class Arithmetic{
    public int add(int c,int d){
       int sum=c+d;
       return sum;
    }
}
class Adder extends Arithmetic{
    public int calladd(int a,int b){
        return add(a,b);
        
    }
}
public class Inheritancesample{
    public static void main(String []args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
