import java.util.Scanner;

public class fib
{
    public static int fibr(int n)
    {
        if(n<=0)
        {
            return 0;
        }

         if(n==1)
         {
             return 1;
         }
        int x=fibr(n-1);
        int y=fibr(n-2);

        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        
        System.out.println(fibr(n));
    }
}