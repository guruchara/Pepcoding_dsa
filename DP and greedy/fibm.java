// using memoiozation 
import java.util.Scanner;
import java.util.*;
public class fibm {

    public static int fibm(int n,int dp[])
    {
        if(n==0)
        {
            dp[n]=n;
            return dp[n];
        }
        if(n==1)
        {
            return dp[n]=n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }

        int x=fibm(n-1,dp);
        int y=fibm(n-2,dp);

        return dp[n]=(x+y);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int dp[]=new int[n+1];
    System.out.println(fibm(n,dp));
}    
}
