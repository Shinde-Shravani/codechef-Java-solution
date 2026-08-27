import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++){
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    int sum=A+B;
		    if(C==sum){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}

	}
}
