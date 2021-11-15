package serializationexample;

import java.io.*;  
class Deserializationex {  
 public static void main(String args[]){  
  try{  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Serializationsample s=(Serializationsample)in.readObject();    
  System.out.println(s.i+" "+s.name);  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  }

