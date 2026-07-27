import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int max = Integer.MIN_VALUE;
            int secmax = Integer.MIN_VALUE;

            int[] arr = new int[3];

            for(int j = 0; j < 3; j++){
                arr[j] = sc.nextInt();

                if(arr[j] > max){
                    secmax = max;
                    max = arr[j];
                }
                else if(arr[j] > secmax){
                    secmax = arr[j];
                }
            }

            System.out.println(secmax);
        }
	}
}
