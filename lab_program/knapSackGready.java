//------gready knpasck 0/1 without dyanamic programming-----//
import java.util.*;

public class knapSackGready {
    public static int knap(int[] wt,int[] val,int W,int n)
    {
        if(n==0||W==0){return 0;}
        else if(wt[n-1]>W)
        {
            return knap(wt, val, W, n-1);
        }
        else
        {
            return Math.max(knap(wt, val, W, n-1), val[n-1]+knap(wt, val, W-wt[n-1], n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements:");
        int n=sc.nextInt();
        System.out.println("Enter the Weight of the item:");
        int[] wt=new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
        }
        System.out.println("Enter the profit per item:");
        int[] val=new int[n];
        for(int i=0;i<n;i++)
        {
            val[i]=sc.nextInt();
        }
        System.out.println("Enter max Waight");
        int W=sc.nextInt();
        System.out.println("max value "+knap(wt,val,W,n));
    }
}
