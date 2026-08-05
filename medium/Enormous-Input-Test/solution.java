import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();

            if (A % K == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
