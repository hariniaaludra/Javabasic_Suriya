package test;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> r = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                r.add(in.nextInt());
                }
            ar.add(r);
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(ar.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}

