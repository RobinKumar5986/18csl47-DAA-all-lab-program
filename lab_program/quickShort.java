import java .util.*;
public class quickShort {
    public static int  partation(long[] arr,int lb,int up)
    {
        int i=lb-1;
        long pv=arr[up];
        for(int j=lb;j<up;j++)
        {
            if(arr[j]<=pv){
                i++;
                long temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        long temp=arr[i+1];
        arr[i+1]=arr[up];
        arr[up]=temp;
        return i+1;
    }
    public static void quick(long[] arr,int lb,int up)
    {
        if(lb<up)
        {
            int part=partation(arr,lb,up);
            quick(arr, lb, part-1);
            quick(arr, part+1, up);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Element");
        int n=sc.nextInt();
        long arr[]=new long[n];
        Random r=new Random();
        for(int i=0;i<n;i++)
        {
            arr[i]=(long)r.nextInt(100);
        }
        long startTime=System.currentTimeMillis();
        quick(arr,0,arr.length-1);
        long endTime=System.currentTimeMillis();
        System.out.println("\nTOtal time taken:"+(endTime-startTime));
    }
}
