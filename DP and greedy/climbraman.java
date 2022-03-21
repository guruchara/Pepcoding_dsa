import java.nio.file.Path;
import java.util.*;
public class climbraman {
 
    public static void climb(int n,String Path)
    {
         if(n==0)
         {
             System.out.println(Path);
             return ;
         }

         if(n-1>0)
         {
             climb(n-1,"1");
         }
         

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(climb(n,"")); 
    }

}
