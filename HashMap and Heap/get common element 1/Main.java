import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    HashMap<Integer,Integer>hm=new HashMap<>();

    Scanner sc=new Scanner(System.in);

    int n1=sc.nextInt();
    int a[]=new int[n1];

    for(int i=0;i<n1;i++)
    {
      a[i]=sc.nextInt();
    }

    int n2=sc.nextInt();
    int b[]=new int[n2];
    
    for(int i=0;i<n2;i++)
    {
       b[i]=sc.nextInt();
    }

    hm.put(a[0],1);

    for(int i=1;i<n1;i++)
    {
       if(!hm.containsKey(a[i]))
       {
          hm.put(a[i],1);
       }
       else
       {
         int c=hm.get(a[i]);
         hm.put(a[i],c+1);
       }
    }
   

    for(int i=0;i<n2;i++)
    {
      if(hm.containsKey(b[i]))
      {
          System.out.println(b[i]);
          hm.remove(b[i]);
      }
      else{
        continue;
      }
    }
 }

}