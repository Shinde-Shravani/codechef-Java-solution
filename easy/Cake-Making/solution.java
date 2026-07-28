import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=A*B;
		int min;
		if(A>B){
		    min=B;
		}else{
		    min=A;
		}
		System.out.println(C-min);

	}
}
