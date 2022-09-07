//-----program 11 subset sum-----//
import java.util.*;
class program11{
    int w[]=new int[20],x[]=new int[20],d;
    void subset(int cs,int k,int r)
    {
        int i;
        x[k]=1;
        if(cs+w[k]==d)
        {
            for(i=0;i<=k;i++)
            {
                if(x[i]==1)
                System.out.println(w[i]);
            }
            System.out.println("");
        }
        else{
            if(cs+w[k]+w[k+1]<=d)
            subset(cs+w[k],k+1,r-w[k]);
            if((cs+r-w[k]>=d)&&(cs+w[k+1]<=d))
            {
                x[k]=0;
                subset(cs, k+1, r-w[k]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=0;
        program11 s=new program11();
        System.out.println("Enter the number of element:");
        n=sc.nextInt();
        System.out.println("Enter the elements in increasing order");
        for(i=1;i<=n;i++)
        s.w[i]=sc.nextInt();
        System.out.println("Enter the sum(d)");
        s.d=sc.nextInt();
        for(i=1;i<=n;i++)
        sum+=s.w[i];
        if(sum<s.d||s.w[0]>s.d)
        {
            System.out.println("Subset not possible:");
        }
        else{
            System.out.println("The Possible subsets are:\n");
            s.subset(0,1,sum);
        }
    }
}