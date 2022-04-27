import java.util.*;
import java.io.*;
public class Simple
{
	public static void main(String[]args) throws Exception
	{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s=br.readLine();
        String a[]=s.split(" ");

        for(int i=0;i<a.length;i++)
        {
        	 int x=Integer.parseInt(a[i]);
        	System.out.println(x);
        }
	}
}