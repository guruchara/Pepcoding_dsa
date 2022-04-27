import java.io.*;
import java.util.*;
class Diksha
{	
	static int countDer(int n)
	{		
		if (n == 1) return 0;
		if (n == 2) return 1;
		
		return (n - 1) * (countDer(n - 1) +
						countDer(n - 2));
	}
		
	public static void main (String[] args)
	{
	    
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();

		 System.out.println(countDer(n));
	}
}