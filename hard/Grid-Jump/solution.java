import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int A = sc.nextInt();
            int B = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();

            int ans = Integer.MAX_VALUE;

            for (int k = 0; k <= Math.min(A, B); k++) {

                int remainingA = A - k;
                int remainingB = B - k;

                int diagonalCost = k * R;

                int rightCost = ((remainingA + 1) / 2) * P;

                int upCost = ((remainingB + 1) / 2) * Q;

                int totalCost = diagonalCost + rightCost + upCost;

                ans = Math.min(ans, totalCost);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
