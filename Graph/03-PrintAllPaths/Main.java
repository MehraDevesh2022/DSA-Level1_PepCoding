/*
 * Print All Paths
 * Easy Prev Next
 * 1. You are given a graph, a source vertex and a destination vertex.
 * 2. You are required to find and print all paths between source and
 * destination. Print
 * them in lexicographical order.
 * 
 * E.g. Check the following paths
 * 012546
 * 01256
 * 032546
 * 03256
 * 
 * The lexicographically smaller path is printed first.
 * Input Format
 * Input has been managed for you
 * Output Format
 * Check sample output
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
 * 0123456
 * 012346
 * 03456
 * 0346
 */


import java.io.*;
import java.lang.annotation.Retention;
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

      public static void hasAllPath(ArrayList<Edge> graph[] , boolean[] visited , int src , int dest , String asf){

        if(visited[src] == true){
            return;
        }
        if(src == dest){
            System.out.println(asf + src);
            return;
        }

               for(Edge e : graph[src]){
                visited[src] = true;
                hasAllPath(graph, visited, e.nbr, dest, asf + src);
            }


            visited[src] = false;

            return;

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

        // write all your codes here
        String asf = new String();
        boolean visited[] = new boolean[vtces];
        hasAllPath(graph , visited , src , dest , asf);

    }

}