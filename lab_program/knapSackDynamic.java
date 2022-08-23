//----knapsack 0/1 using dunamic programming-----//
public class knapSackDynamic {
    
    public static int knap(int[] wt,int[] val,int W,int[][] dp,int n)
    {
    
        for(int i=0;i<=n;i++)
        for(int j=0;j<=W;j++)
        {
            if(i==0||j==0){
                 dp[i][j]=0;
            }
            else if(wt[i-1]<=j)
            {
                dp[i][j]=Math.max(dp[i-1][j], val[i-1]+dp[i-1][j-wt[i-1]]);
            }
            else
            {
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] wt={3,4,6,5};
        int[] val={2,3,1,4};
        int W=8;
        int n=wt.length;
        int[][] dp=new int[n+1][W+1];
        System.out.println("max profit:"+knap(wt,val,W,dp,n));
        for(int i=0;i<=n;i++){
        for(int j=0;j<=W;j++)
        {
            System.out.printf("%d  ",dp[i][j]);
        }
        System.out.println("");
    }
    }
}
