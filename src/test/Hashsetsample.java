package test;
import java.util.*;

public class Hashsetsample {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] left = new String[t];
        String [] right = new String[t];
        
        for (int i = 0; i < t; i++) {
            left[i] = s.next();
            right[i] = s.next();
        }
 HashSet<String> myhash = new HashSet<String>();
for (int i = 0; i < t; i++) {
    myhash.add(left[i]+""+right[i]);
    System.out.println(myhash.size());
}
    }
}
