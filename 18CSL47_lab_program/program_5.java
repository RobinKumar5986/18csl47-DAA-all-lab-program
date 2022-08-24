import java.util.*;
public class program_5 {
    public static void merg(long[] arr,int lb,int up)
    {
        if(lb>=up){return;}
        int mid=(lb+up)/2;
        merg(arr, lb,mid);
        merg(arr, mid+1, up);
        joining(arr,lb,mid,up);
    }
    public static void joining(long[] arr,int lb,int mid,int up)
    {
        int i=lb;
        int j=mid+1;
        int k=0;
        long[] b=new long[up-lb+1];
        while(i<=mid && j<=up)
        {
            if(arr[i]<=arr[j]){
                b[k++]=arr[i++];
            }
            else{
                b[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            b[k++]=arr[i++];
        }
        while(j<=up)
        {
            b[k++]=arr[j++];
        }
        //----------------------------//
        for(i=0,k=lb;i<b.length;i++,k++){
            arr[k]=b[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=r.nextInt(5000);
        }
        long startTime=System.currentTimeMillis();
        merg(arr,0,n-1);
        long endTime=System.currentTimeMillis();
        
        // for(int i=0;i<arr.length;i++)
        // System.out.println(arr[i]);
        System.out.println("Total time taken:"+(endTime-startTime));
    }
}
