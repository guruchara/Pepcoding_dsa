import java.util.ArrayList;

public class Main
{
    public static class Edges
    {
        int src;
        int nbr;
        int wt;

    Edges(int src,int nbr,int wt)
    {
        this.src=src;
        this.nbr=nbr;
        this.wt=wt;
    }
}
 

    public void AddEdges(ArrayList<Edges>graph, int u, int v , int wt) 
    {
        graph[u].add(new Edges(u, v, wt));
        graph[v].add(new Edges(v,u,wt));
    }

    public static void construct()
    {
        int N=7;

        ArrayList<Edges>graph[]=new ArrayList[N];

        // first assign empty al to Arrays of Edges
        for(int i=0;i<N;i++)
        {
            graph[i]=new ArrayList<>();
        }

        // First Cyclic Rectangle
        AddEdges(graph,0,3,10)
        AddEdges(graph,0,1,20);
        AddEdges(graph,1,2,30);
        AddEdges(graph,2,3,40);

        // triangle part here start from here
        AddEdges(graph,3,4,50);
        AddEdges(graph,4,5,60);
        AddEdges(graph,5,6,70);
        AddEdges(graph,6,3,80);
    }
    public static void main(String[] args) {
        
    }
}