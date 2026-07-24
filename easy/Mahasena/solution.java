import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int [] A= new int [N];
	    int even =0;
	    int odd =0;
	    for(int i =0; i<A.length; i++){
	        A[i] = sc.nextInt();
	        if(A[i]%2==0){
	            even += A[i];
	        }else{
	            odd += A[i];
	        }
	    }
	    if(even>odd){
	        System.out.println("READY FOR BATTLE");
	    }else{
	        System.out.println("NOT READY");
	    }
	    

	}
}
