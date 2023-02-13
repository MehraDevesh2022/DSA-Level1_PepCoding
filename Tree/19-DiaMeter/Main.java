/*
"There is only one corner of the universe you can be certain of improving, and that's your own self.
~Aldous Huxely"

 * Diameter Of A Binary Tree
 * Easy Prev Next
 * 1. You are given a partially written BinaryTree class.
 * 2. You are required to complete the body of diameter1 function. The function
 * is expected to return the number of edges between two nodes which are
 * farthest from each other in terms of edges.
 * 3. Input and Output is managed for you.
 * 
 * Input Format
 * Input is managed for you.
 * Output Format
 * Output is managed for you.
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 19
 * 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
 * Sample Output
 * 6
 */

import java.io.*;
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }

    // find left height and right height and add them and add 2 for root node and
    // return max of all three 
    ic static int diameter1
    // writ your c

    o
        ode ==nul
     

    
    int ld = diameter1(node.left);

     
    int leftHeight  = height(node.left);

     

    int diameter = M

    
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        int diameter = 0;
        diameter = diameter1(root);
        System.out.println(diameter);
    }

}