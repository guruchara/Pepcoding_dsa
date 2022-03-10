import java.util.Scanner;

public class fibt {
 
    public static int fibt(int n,int dp[])
    {
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            int x=dp[i-1];
            int y=dp[i-2];
            dp[i]=(x+y);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        int dp[]=new int[n+1];
        int k=fibt(n,dp);

        System.out.println(k);
    }
}
