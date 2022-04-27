import java.io.BufferedReader;
import java.util.ArrayList;

public class Main
{

    public static class Edge{
        int src;
        int nbr;

        Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }

    }
  
    public static void main(String[] args)
    {
        
        BufferedReader br =new BufferedReader(new InputStreaReader(System.in));

        int vertex=Integer.parseInt(br.readLine());
     
         ArrayList<Edge>graph[]=new ArrayList[vertex];

         for(int i=0;i<vertex;i++)
         {
             graph[i]=new ArrayList<>();
         }
 
        int edges=Integer.parseInt(br.readLine());

        for(int i=0;i<vertex;i++)
        {
            String part[]=br.readLine().split(" ");

            int v1=part[0];
            int v2=part[1];
            int wt=part[2];
          
            graph[v1].add(new Edge(v1, v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));            
        }

        for(int v=0;v<vertex;v++)
        {
            
        }

    }
}