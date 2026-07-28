import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();

            int max = sc.nextInt();
            int index = 1;

            for (int i = 2; i <= N; i++) {
                int current = sc.nextInt();

                if (current > max) {
                    max = current;
                    index = i;
                }
            }

            System.out.println(index);
        }
    }
}
