import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int S=N%10;
		if(S==0){
		    System.out.println("10");
		}else{
		    System.out.println(10-S);
		}

	}
}
