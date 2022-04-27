import java.util.*;

public class Diksha1 {
	
	public static int jumpcount(int x, int y, int n,
								int height[])
	{
		int jumps = 0;
	
		for (int i = 0; i < n; i++) {
			if (height[i] <= x) {
				jumps++;
				continue;
			}
	
			int h = height[i];
			while (h > x)
			{
				jumps++;
				h = h - (x - y);
			}
			jumps++;
		}
		return jumps;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();
		int y=sc.nextInt();
		// int x = 10, y = 1;
		
		int n=sc.nextInt();

		int a[]=new int[n];

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}		

		System.out.println(jumpcount(x, y, n,a));
	}
}


