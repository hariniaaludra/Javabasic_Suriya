package program2;

public class Cv { // use proper class name
	    int id;  
	    String name; //  null value
	    int age;  
	    Cv(int i){  
	    id = i;    
	    }   
	    Cv(int i,int a ,String n){  
	    id = i;   
	    age=a;
	    name=n;
	    }  
	    void display(){System.out.println(id+"  "+age);}  
	   
	    public static void main(String args[]){  
	    Cv ob= new Cv(101);  
	    Cv obj= new Cv(222,25,"suriya");  
	    ob.display();  
	    obj.display();  
	   }  
	}  
