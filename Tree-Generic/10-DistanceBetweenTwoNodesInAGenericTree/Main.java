/*
 * "The function of good software is to make the complex appear to be simple.
 * ~ Grady Booch"
 * 
 * 
 * Distance Between Two Nodes In A Generic Tree
 * Easy Prev Next
 * 1. You are given a partially written GenericTree class.
 * 2. You are required to complete the body of distanceBetweenNodes function.
 * The function is expected to return the distance (in terms of number of edges)
 * between two nodes in a generic tree.
 * Please watch the question video to understand what lca is.
 * 3. Input and Output is managed for you.
 * 
 * Input Format
 * Input is managed for you
 * Output Format
 * Output is managed for you
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 24
 * 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
 * 100
 * 110
 * Sample Output
 * 5
 */

 import java.io.*;
import java.util.*;

public class Main {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        if (node.data == data) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(node.data);
            return path;
        }

        for (Node child : node.children) {
            ArrayList<Integer> ptc = nodeToRootPath(child, data);
            if (ptc.size() > 0) {
                ptc.add(node.data);
                return ptc;
            }
        }

        return new ArrayList<>();
    }

    public static int lca(Node node, int d1, int d2) {
        ArrayList<Integer> p1 = nodeToRootPath(node, d1);
        ArrayList<Integer> p2 = nodeToRootPath(node, d2);

        int i = p1.size() - 1;
        int j = p2.size() - 1;

        while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
            i--;
            j--;
        }

        return p1.get(i + 1);
    }

    public static int distanceBetweenNodes(Node node, int d1, int d2) {
        // write your code here
       // approch => find path of both node first
       // find lca then
       // from lca index add remain nodes idx => eg if for path1 lca in idx 3 and for path2  lca in idx 2 now add both idx  i + j => 5 is distance between both node based on edge

       ArrayList<Integer> path1 = nodeToRootPath(node, d1);
       ArrayList<Integer> path2 = nodeToRootPath(node, d2);

       // now lca => 
       int i= path1.size() -1;
       int j= path2.size() -1;

     int Lca =-1;
     while(i>=0 && j>=0){
        if(path1.get(i) != path2.get(j)){
            break;
        }
    Lca =path1.get(i);
    i--;
    j--;
        
     }
    //   now back to lca idx to both pointer 
    i++;
    j++;

    // add both pointers idx  thats total edges that is actual distance

    return(i+j);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        int dist = distanceBetweenNodes(root, d1, d2);
        System.out.println(dist);
        // display(root);
    }

}