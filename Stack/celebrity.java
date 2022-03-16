import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;
import java.util.*;
public class celebrity {

    public static void findcelebrity(int a[][])
    {
         Stack<Integer>st=new Stack<Integer>();

          int i=0;
         for(i=0;i<a.length;i++)
         {
             st.push(i);
         }

         while(st.size()>1)
         {
              i=st.pop();
              int j=st.pop();
              
              if(a[i][j]==1)
              {
                  st.push(j);
              }
              else
              {
                  st.push(i);
              }
         }

         int pot=st.pop();

         boolean flag=true;

         for(i=0;i<a.length;i++)
         {
             if(i!=pot)
             {
                 if(a[i][pot]==0 || a[pot][i]==1)
                 {
                     flag=false;                     
                     break;
                 }
             }
         }

         if(flag)
         {
             System.out.println(pot);
         }
         else
         {
             System.out.println("none");
         }
    }
    public static void main(String[] args) throws Exception  {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       int n=Integer.parseInt(br.readLine());

       int a[][]=new int[n][n];

       for(int i=0;i<n;i++)
       {
           String Line=br.readLine();

           for(int j=0;j<a[0].length;j++)
           {
               a[i][j]=Line.charAt(j)-'0';
           }
       }
          findcelebrity(a);
    }
}
