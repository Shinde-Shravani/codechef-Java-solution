import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		   int N = sc.nextInt();
            int[] C= new int[N];
            for (int i=0; i<N; i++){
                C[i]= sc.nextInt();
            }    
             int answer = 0;

            for (int i=0; i < N; i++){
                if (C[i] > answer) {
                    answer= C[i];
                }
            }
            for(int i=0; i<N; i++){
                for(int j=i+1; j<N; j++){
                    if (C[i]<= C[j]){
                        int sum= C[i] + C[j];

                        if (sum> answer) {
                            answer= sum;
                        }
                    }
                }
            }
            System.out.println(answer);
            
		}
	}
}
