import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        if (X % 5 == 0 && Y >= X + 0.50) {
            System.out.printf("%.2f", Y - X - 0.50);
        } else {
            System.out.printf("%.2f", Y);
        }

	}
}
