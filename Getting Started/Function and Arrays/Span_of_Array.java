import java.io.*;
import java.util.*;

public class Span_of_Array{

public static int span(int a[])
{
    int max=a[0];
    int min=a[0];

    for(int i=1;i<a.length;i++)
    {
         max=(int)Math.max(a[i],max);
         min=(int)Math.min(a[i],min);
    }
    return max-min;
}
public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];

      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      System.out.println(span(a));
 }

}