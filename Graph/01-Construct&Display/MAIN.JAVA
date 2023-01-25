import java.util.*;
// construct the graph 
public class Main{
    
   // create a Edge class =>
    // Edge has three value => src vertix , neabhour vertix , weight vertix 
     public static class Edge{

        int src;
        int nbr;
        int weight;

        Edge(){

        }
        Edge(int src , int nbr , int weight){
            this.src = src;
            this.nbr = nbr;
            this.weight = weight;
        }
    }

  public static void addEdge (ArrayList<Edge> graph [] ,  int src , int nbr , int weight) {
                //   adding 2 times because of this undirectional graph . its travel both way src to nbr and nbr to src. like school se ghr ghr se school both time destintion becomes vice versa 
              graph[src].add(new Edge(src , nbr , weight));
              graph[nbr].add(new Edge(nbr , src , weight));
  }

    public static void  constructor(){
          // create an array of arrayList type => why arrayList type because if we create an array of array in that case we don't know one vertix how much space will consume because one vertix may connect with one or more nbr vertixes using Edge we no that ArrayList size is dynamaic
            int N = 7; // its number of vertix in Graph
            ArrayList<Edge> graph [] = new ArrayList[N];
             
            // now make array of arrayList
            for(int i=0; i<graph.length; i++){
              graph[i] = new ArrayList<>(); // why asigning empty arrayList : because without provding memory we can not asign any value inside arrayList .
            }
          // add add value inside of arrayList
        // addEdge(graph , src , nbr , weight);
           addEdge(graph , 0 , 3, 10);
           addEdge(graph , 0 , 1, 10);
           addEdge(graph , 1 , 2, 10);
           addEdge(graph , 2 , 3, 40);
           addEdge(graph , 3 , 4, 4);
           addEdge(graph , 4 , 5, 2);
           addEdge(graph , 5 , 6, 3);
           addEdge(graph , 4 , 6, 8);
       
                 display(graph);
    } 

    public static void display(ArrayList<Edge> graph []){
            // we have  => ArrayList Type Array Graph each idx of a ArrayList stored Edge type of data
             for(int i=0; i<graph.length ; i++){
                  System.out.print(i + " " + "->");
                for(Edge e : graph[i]){
                    int src =   e.src;
                    int nbr  = e.nbr;
                    int weight = e.weight;
                    System.out.print(src + " " + nbr + " " + " " + "@" + " " + weight + " " );
                }
                System.out.println();
             }

    }

    public static void main(String[] args) {
            
        constructor();

    }
}