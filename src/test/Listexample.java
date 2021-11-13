package test;
import java.util.*;
public class Listexample {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nume = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0;i < nume;i++){
            numList.add(sc.nextInt());
        }
        int numQueries = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < numQueries;i++){
            String queryType = sc.nextLine();
            if(queryType.equals("Insert")){
                String[] queryArray = sc.nextLine().split(" ");
                numList.add(Integer.parseInt(queryArray[0]),Integer.parseInt(queryArray[1]));
            }else{
                int removeIndex = Integer.parseInt(sc.nextLine());
                numList.remove(removeIndex);
            }  
        }
        for(Integer num : numList){
            System.out.print(num+" ");
        }
}}
