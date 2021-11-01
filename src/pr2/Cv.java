package pr2;

public class Cv { 
	    int id;  
	    String name; //  null value
	    int age;  
	    Cv(int i){  
	    id = i;    
	    }   
	    Cv(int i,int a){  
	    id = i;   
	    age=a;  
	    }  
	    void display(){System.out.println(id+"  "+age);}  
	   
	    public static void main(String args[]){  
	    Cv ob= new Cv(101);  
	    Cv obj= new Cv(222,25);  
	    ob.display();  
	    obj.display();  
	   }  
	}  
