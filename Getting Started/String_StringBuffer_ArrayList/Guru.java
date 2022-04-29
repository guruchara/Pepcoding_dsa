import java.util.*;
public class Guru
{
	public static void main(String[] args)
	{
       StringBuffer sb=new StringBuffer();

      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       String s=br.readLine();

       for(int i=0;i<s.length();i++)
       {
       	 sb.apped(s.charAt(i));
       }

       System.out.println(sb.toString());
	}
}