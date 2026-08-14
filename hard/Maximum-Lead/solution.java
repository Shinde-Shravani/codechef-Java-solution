import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int score1 = 0;
        int score2 = 0;

        int maxLead = 0;
        int winner = 0;

        while (N-- > 0) {
            int P1 = sc.nextInt();
            int P2 = sc.nextInt();

            score1 += P1;
            score2 += P2;

            int lead = Math.abs(score1 - score2);

            if (lead > maxLead) {
                maxLead = lead;

                if (score1 > score2) {
                    winner = 1;
                } else {
                    winner = 2;
                }
            }
        }

        System.out.println(winner + " " + maxLead);
    }
}
