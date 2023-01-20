/*
"Nobody who ever gave his best regretted it.
~George Halas"

 * Are Trees Mirror In Shape
 * Easy Prev Next
 * 1. You are given a partially written GenericTree class.
 * 2. You are required to complete the body of areMirror function. The function
 * is expected to check if the two trees passed to it are mirror images of each
 * other in shape (data not to be checked, just the shape of tree).
 * Note -> Watch the question video for clarity.
 * 3. Input and Output is managed for you.
 * Input Format
 * Input is managed for you
 * Output Format
 * Output is managed for you
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 12
 * 10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
 * 12
 * 100 200 -1 300 500 -1 600 -1 -1 400 -1 -1
 * Sample Output
 * true
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

    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        int m = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }

    public static int height(Node node) {
        int h = -1;

        for (Node child : node.children) {
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h += 1;

        return h;
    }

    public static boolean areMirror(Node n1, Node n2) {
        // write your code here
        // check both curr nodes are similar or not by cheaking their childrens size
           if(n1.children.size() != n2.children.size()){
            return false;
           }
           // if we are that mean nodes size are same so use loop any of them .. it will work for both tree nodes
           for(int i=0; i<n1.children.size()-1; i++){
            // now check for there child .. but remeber any objects mirror reflection is left is mirros right and right one is mirrors left.
            // so we are comparing n1 left to n2 right nodes , so for n1 we starting from 0 and for n2 we staring from last node
              Node child1 =  n1.children.get(i);
              Node child2 =  n2.children.get(n2.children.size()-i-1); // from last node to 0th node
              if(!areMirror(child1, child2)){ // if value false returns then return false
                return false;
              }
            
           }
        //    if nodes valuse are not false that mean nodes are mirror till now and return true
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(values1[i]);
        }
        Node root1 = construct(arr1);

        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        String[] values2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(values2[i]);
        }
        Node root2 = construct(arr2);

        boolean mirror = areMirror(root1, root2);
        System.out.println(mirror);
    }

}