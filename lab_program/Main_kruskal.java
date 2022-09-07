//---kruskal---//
import java.util.*;
class Main_kruskal{
    public static int find(int i,int[] parent)
    {
        while(parent[i]!=i)
            i=parent[i];
        return i;
    }
    public static void union(int i,int j,int[] parent)
    {
        parent[j]=i;
    }
    //-------main---------//
    public static void main (String[] args) {
        int graph[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n=sc.nextInt();
        
        System.out.println("Enter the coast metrix");
        for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++)
        {
            graph[i][j]=sc.nextInt();
            if(graph[i][j]==0)
                graph[i][j]=999;
        }
        
        int parent[]=new int[n+1];
        for(int i=1;i<=n;i++)
            parent[i]=i;
        
        int ne=1;
        int min,mincoast=0,a=0,b=0,u=0,v=0;
        while(ne<n)
        {
            min=999;
            for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                if(graph[i][j]<min)
                {
                    min=graph[i][j];
                    a=i;
                    b=j;
                }
            u=find(a,parent);
            v=find(b,parent);
            if(u!=v)
            {
                union(a,b,parent);
                System.out.println(ne++ +" edge "+a+" --- "+b+" min = "+min);
                mincoast+=min;
            }
            graph[a][b]=graph[b][a]=999;
        }
        System.out.println("mincoast = "+mincoast);
    }
}