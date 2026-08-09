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
		    int W=sc.nextInt();
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int Z=sc.nextInt();
		    
		    int finalBalance = W + (X - Y) * Z;

            System.out.println(finalBalance);
		    
		}

	}
}
