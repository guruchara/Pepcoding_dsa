import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Simple {
    
    public static class Edges
    {
        int src;
        int nbr;
        int wt; // 

        Edges(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }

    public static void addEdge(ArrayList<Edges>[] graph, int u, int v, int w){
        graph[u].add(new Edges(u,v,w));
        graph[v].add(new Edges(v,u,w));
    }

    public static void display(ArrayList<Edges>graph[] ,int N)
    {
        for(int i=0;i<N;i++)
        {
            System.out.print(i + " -> ");
     
            for(Edges e:graph[i])
            {
                 int u=e.src;
                 int v=e.nbr;
                 int w=e.wt;
              System.out.print(u +" - " + v  + " @ " +  w + ", " );         
            }
            System.out.println();
        }
    }
    public static void construct()
    {
          int N=7;

          ArrayList<Edges>graph[]=new ArrayList[N];
          for(int i=0;i<N;i++)
          {
              // assign all empty arraylist in to list of arrays 
              graph[i]=new ArrayList<>();
          }

          addEdge(graph, 0 , 1, 10);
          addEdge(graph, 0 , 3, 10);
          addEdge(graph, 1 , 2, 10);
          addEdge(graph, 2 , 3, 40);
          addEdge(graph, 3 , 4, 2);
          addEdge(graph, 4 , 5, 2);
          addEdge(graph, 5 , 6, 3);
          addEdge(graph, 4 , 6, 8);

          display(graph,N);
    }
    
    public static void main(String[] args) {
         
        construct();
    }
}
