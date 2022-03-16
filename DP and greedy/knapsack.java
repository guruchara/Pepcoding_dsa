public class knapsack {

//Function to return max value that can be put in knapsack of capacity W.
    public static int dp[][]=new int[1001][1001];
    public static int knapsackk(int W,int wt[],int val[],int n)
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
        // bag jyada bda he
        if(wt[n-1]<=W)
        {
          return  dp[n][W]=Math.max(val[n-1]+knapsackk(W-wt[n-1],wt,val,n-1),knapsackk(W,wt,val,n-1));
        }
        // bag choota reh gya he
        else 
        {
            return dp[n][W]=knapsackk(W,wt,val,n-1);
        }
    }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        
        
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        int x= knapsackk(W,wt,val,n);
        return x;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 

    }
}
