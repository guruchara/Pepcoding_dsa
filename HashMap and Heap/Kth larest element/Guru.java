import java.util.*;
import java.io.*;
public class Guru
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        int a[]=new int[n];

        for(int i=0;i<a.length;i++)
        {
        	a[i]=Integer.parseInt(br.readLine());
        }

        int k=Integer.parseInt(br.readLine());

        PriorityQueue<Integer>pq=new PriorityQueue<>();

        // we are iterating loop from 0 to n
        for(int i=0;i<n;i++)
        {
        	if(i<k)
        	{
        		pq.add(a[i]);
        	}
        	else
        	{
        		if(a[i]>pq.peek())
        		{
        			pq.remove();
        			pq.add(a[i]);
        		}
        	}
        }

        while(pq.size()!=0)
        {
        	System.out.print(pq.remove() +" ");
        }
    }
}