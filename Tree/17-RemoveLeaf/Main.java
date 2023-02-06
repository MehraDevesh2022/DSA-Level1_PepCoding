/*
 * Remove Leaves In Binary Tree
 * Easy Prev Next
 * 1. You are given a partially written BinaryTree class.
 * 2. You are required to complete the body of removeLeaves function. The
 * function is expected to remove all leaf nodes from the tree.
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
 * 25 <- 50 -> 75
 * . <- 25 -> 37
 * . <- 37 -> .
 * 62 <- 75 -> .
 * . <- 62 -> .
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

    public static Node removeLeaves(Node node) {
        // write your code here

        if(node == null){
            return null;
        }
        if(node.left ==null && node.right ==null){
            return null;
        }
      node.left =  removeLeaves(node.left);
      node.right =  removeLeaves(node.right);
        return node;
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
        root = removeLeaves(root);
        display(root);
    }

}