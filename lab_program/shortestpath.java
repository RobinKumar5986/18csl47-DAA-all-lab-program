//------Dijkstra agorithm-------//
class shortestpath {
    
    public static void dij(int[][] graph,int src,int V) {
        boolean[] visited=new boolean[V];
        int[] dist=new int [V];
        for(int i=0;i<V;i++) 
        {
            visited[i]=false;
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        for(int i=0;i<V-1;i++)
        {
            int u=mindistance(visited,dist,V);
            visited[u]=true;
            for(int v=0;v<V;v++)
            {
                if(!visited[v] && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v] && graph[u][v]!=0)
                {
                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }
        show(dist,src,V);
    }
    public static int mindistance(boolean[] visited,int[] dist,int V)
    {
        int min=Integer.MAX_VALUE;
        int min_ind=-1;
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false && dist[i]<=min)
            {
                min=dist[i];
                min_ind=i;
            }
        }
        return min_ind;
    }
    public static void show(int[] dist,int src,int V)
    {
        System.out.println("Distance from Source "+src+"is:");
        for(int i=0;i<V;i++)
        System.out.println(i+" --> "+dist[i]);
    }
    public static void main(String[] args)
    {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        shortestpath t = new shortestpath();
        int V=9;
        t.dij(graph, 0,V);
    }
}