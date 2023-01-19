/*
"Pop out the negatives from your life's stack and add in all the positives to the queue of your thoughts."

 * Are Trees Similar In Shape
 * Easy Prev Next
 * 1. You are given a partially written GenericTree class.
 * 2. You are required to complete the body of areSimilar function. The function
 * is expected to check if the two trees passed to it are similar in shape or
 * not.
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
 * 24
 * 1 2 5 -1 6 -1 -1 3 7 -1 8 11 -1 12 -1 -1 9 -1 -1 4 10 -1 -1 -1
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

    // public static boolean areSimilar(Node n1, Node n2) {
    //     // write your code here
    //     int i=0 ,j=0; 
    //    for(; i<n1.children.size() && j<n2.children.size(); j++ ,i++){
    //        Node c1 = n1.children.get(i);
    //        Node c2 = n2.children.get(j);
    //        if(c1.children.size() ==c2.children.size()){
    //           boolean ans =areSimilar(c1, c2);
    //           if(ans ==false){
    //             return false;
    //           }
    //         }
    //           else{
    //             return false;
    //           }
           
    //    }
    //    if (i != j) {
    //        return false;
    //    } else {
    //        return true;
    //    }
      

    //     }

    //>>>>>>>>>>>>>>>>>>>other way to write code>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

      public static boolean areSimilar(Node n1, Node n2) {
        // write your code here
             if(n1.children.size() != n2.children.size()){
                return false;
             }
             // now make any one in both because both children will same after this line for curr Nodes
             for(int i=0; i<n1.children.size(); i++ ){
                Node child1 = n1.children.get(i);
                Node child2 = n2.children.get(i);
                if(!(areSimilar(child1, child2))){ // agar value false return aayi baki nodes ke liye to return false
                     return false;
                     }
             }
             // when all children are checked for curr node and condtion so far not false . it means both curr nodes children size are equal
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

        boolean similar = areSimilar(root1, root2);
        System.out.println(similar);
    }

}