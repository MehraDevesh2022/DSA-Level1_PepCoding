/*
 * Has Path?
 * Easy Prev Next
 * 1. You are given a graph, a src vertex and a destination vertex.
 * 2. You are required to find if a path exists between src and dest. If it
 * does, print true
 * otherwise print false.
 * Input Format
 * Input has been managed for you
 * Output Format
 * true if path exists, false otherwise
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 7
 * 8
 * 0 1 10
 * 1 2 10
 * 2 3 10
 * 0 3 10
 * 3 4 10
 * 4 5 10
 * 5 6 10
 * 4 6 10
 * 0
 * 6
 * Sample Output
 * true
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

    public static boolean hasPath(ArrayList<Edge>  graph [] , boolean visted[] ,int src , int dest ){
        if(visted[src] ==true){
            return  false;
        }      
        
        if(dest == src){
                return true;
              }


        
          
          
            for(Edge e : graph[src]){
                  visted[src] = true;
            
                boolean myAns =   hasPath(graph, visted, e.nbr, dest);
               if(myAns == true){
                return true;
               }
            }
          
           return false; 

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

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());
        boolean visted [] = new boolean[vtces];
         boolean ans  = hasPath(graph , visted , src , dest);
         System.out.println(ans);
        // write your code here
    }

}