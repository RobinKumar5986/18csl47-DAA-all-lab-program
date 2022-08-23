import java.util.*;
 
class kruskal
{
    public static int find(int i,int parent[])
    {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }
    public static void union1(int i, int j,int[] parent)
    {
        int a = find(i,parent);
        int b = find(j,parent);
        parent[a] = b;
    }
    public static void kruskalMST(int cost[][],int V)
    {
        
        int[] parent = new int[V];
        int mincost = 0; 
        for (int i = 0; i < V; i++)
            parent[i] = i;
        int edge_count = 0;
        while (edge_count < V - 1)
        {
            int min = 999, a = -1, b = -1;
            for (int i = 0; i < V; i++)
            {
                for (int j = 0; j < V; j++)
                {
                    if (find(i,parent) != find(j,parent) && cost[i][j] < min)
                    {
                        min = cost[i][j];
                        a = i;
                        b = j;
                    }
                }
            }
    
            union1(a, b,parent);
            System.out.printf("Edge %d:(%d, %d) cost:%d \n",edge_count++, a, b, min);
            mincost += min;
        }
        System.out.printf("\nMinimum cost= %d \n", mincost);
    }
    
    // Driver code
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of nodes:");
            int V=sc.nextInt();
            int[][] cost=new int[V][V];
            System.out.println("enter edge coast and 999 for non connected edge:");
            for(int i=0;i<V;i++)
            for(int j=0;j<V;j++)
            cost[i][j]=sc.nextInt();
            kruskalMST(cost,V);
            }
}