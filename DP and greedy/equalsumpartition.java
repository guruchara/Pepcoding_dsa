import java.util.*;
public class equalsumpartition {

    public static boolean subset(int arr[], boolean dp[][])
    {
        for(int i = 0; i<dp.length; i++){
            for(int j = 0; j<dp[0].length; j++){
                if(j == 0)
                    dp[i][j] = true;
                else if(i == 0)
                    dp[i][j] = false;
                else{
                    //real game
                    boolean notPlayed = dp[i-1][j];

                    boolean played = false;
                    if(j - arr[i-1] >= 0){
                        played = dp[i-1][j-arr[i-1]];
                    }

                    dp[i][j] = played || notPlayed;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static boolean equalsum(int a[])
    {
        int sum=0;
        int n=a.length;

        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }

        if(sum%2!=0)
        {
            return false;
        }
        else
        {
            int tar=sum/2;
            boolean dp[][]=new boolean[n+1][tar+1];

            return subset(a,dp);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        int a[]=new  int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println(equalsum(a)); 

    }    
}
