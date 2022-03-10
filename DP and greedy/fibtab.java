import java.util.Scanner;

public class fibtab {

    public static int fibtab_Aman(int N,int dp[])
    {

        for(int n=0;n<dp.length;n++)
        {
            if(n<=1)
            {
                dp[n]=n;
                continue;
            }        
            
            int x=dp[n-1];
            int y=dp[n-2];    

            dp[n]=x+y;
        }

        return dp[N];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();

       int dp[]=new int[n+1];

       int k=fibtab_Aman(n,dp);

       System.out.println(k);
    }
}
