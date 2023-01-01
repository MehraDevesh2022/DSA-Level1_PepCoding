/* "Life is really simple, but we insist on making it complicated.
~ Confucius"


 * Path To Leaf From Root In Range
 * Easy Prev Next
 * 1. You are given a partially written BinaryTree class.
 * 2. You are given a value lo and a value hi
 * 3. You are required to complete the body of pathToLeafFromRoot function. The
 * function is expected to print all paths from root to leaves which have sum of
 * nodes in range from lo to hi (both inclusive). The elements in path should be
 * separated by spaces. Each path should be in a separate line.
 * 4. Input is managed for you.
 * Input Format
 * Input is managed for you
 * Output Format
 * The elements in path should be separated by spaces. Each path should be in a
 * separate line.
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 23
 * 50 25 12 n n 37 30 n n 40 n n 75 62 60 n n 70 n n 87 n n
 * 150
 * 250
 * Sample Output
 * 50 25 37 40
 * 50 75 62 60
 * 50 75 87
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

    public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi) {
        // write your code here
             if(node ==null){
                return;
             }
        if(node.left == null && node.right ==null){
            sum +=node.data;
            if(lo <=sum && sum <=hi){
                 path = path +node.data;
                  System.out.println(path);
                
            }
            return;
        }
            // left call
            pathToLeafFromRoot(node.left, path + node.data+ " ", sum + node.data, lo, hi);
            pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, lo, hi);
        
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

        int lo = Integer.parseInt(br.readLine());
        int hi = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        pathToLeafFromRoot(root, "", 0, lo, hi);
    }

}