/*
 * Get Connected Components Of A Graph
 * Easy Prev Next
 * 1. You are given a graph.
 * 2. You are required to find and print all connected components of the graph.
 * Input Format
 * Input has been managed for you
 * Output Format
 * Check the sample output
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 7
 * 5
 * 0 1 10
 * 2 3 10
 * 4 5 10
 * 5 6 10
 * 4 6 10
 * Sample Output
 * [[0, 1], [2, 3], [4, 5, 6]]
 */

 import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }


    public static void getConnected(ArrayList<Edge> graph [] , boolean visited[] , int src , ArrayList<Integer> single){
          // add curr src to the single ArrayList
          single.add(src);
          // mark as visited to src
          visited[src] = true;
          // now check all connected neighbors for adding them to single array if available
          for(Edge e : graph[src]){
              // check for it if not visited then  call getConected funation and add to single array and mark to visted then check for its neighbors if avialble
              int nbr = e.nbr;
              if(!visited[nbr]){

              getConnected(graph, visited, nbr, single);
            }
          }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        // write your code here
        // make a boolean array for check is vertix vixted or not ->
        boolean visted [] = new boolean[vtces];
        // now make a loop  i =0 to graph.length for all vtces in array of arrayList
        for(int i =0; i< graph.length; i++){
            // now make array list for adding comonent from  graph =>
            ArrayList<Integer>  single  = new ArrayList<>();
            // i will treated as src here
            if(!visted[i]){ // agar src visted nhi hai to
             getConnected(graph , visted , i , single);
             // add single arrayList stored with single component add to comps ArrayList of ArrayList
                  comps.add(single); 

            }
        } 

        System.out.println(comps);
    }
}