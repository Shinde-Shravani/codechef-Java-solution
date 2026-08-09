import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int subscriptions= (N + 5) / 6;
            int totalCost = subscriptions * X;
            System.out.println(totalCost);
        }
    }
}
