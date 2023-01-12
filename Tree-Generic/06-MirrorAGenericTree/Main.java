/* 
"The only thing that can keep a fire from dying and give it more power, is wind.
~ Naruto Uzumaki"

 * Mirror A Generic Tree
 * Medium Prev Next
 * 1. You are given a partially written GenericTree class.
 * 2. You are required to complete the body of mirror function. The function is
 * expected to create a mirror image of the tree. For more details, check out
 * the question video.
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
 * Sample Output
 * 10 -> 20, 30, 40, .
 * 20 -> 50, 60, .
 * 50 -> .
 * 60 -> .
 * 30 -> 70, 80, 90, .
 * 70 -> .
 * 80 -> 110, 120, .
 * 110 -> .
 * 120 -> .
 * 90 -> .
 * 40 -> 100, .
 * 100 -> .
 * 10 -> 40, 30, 20, .
 * 40 -> 100, .
 * 100 -> .
 * 30 -> 90, 80, 70, .
 * 90 -> .
 * 80 -> 120, 110, .
 * 120 -> .
 * 110 -> .
 * 70 -> .
 * 20 -> 60, 50, .
 * 60 -> .
 * 50 -> .
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

    public static void traversals(Node node) {
        System.out.println("Node Pre " + node.data);

        for (Node child : node.children) {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }

        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderLinewiseZZ(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.add(node);

        Stack<Node> cstack = new Stack<>();
        int level = 0;

        while (stack.size() > 0) {
            node = stack.pop();
            System.out.print(node.data + " ");

            if (level % 2 == 0) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    cstack.push(child);
                }
            } else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node child = node.children.get(i);
                    cstack.push(child);
                }
            }

            if (stack.size() == 0) {
                stack = cstack;
                cstack = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }

    public static void mirror(Node node) {
        // write your code here
        for(Node child : node.children){
              mirror(child);
        }
        int  i=0;
        int j= node.children.size() -1;

        while(i<j){
            Node v1 = node.children.get(i);
            Node v2 = node.children.get(j);

            /// now set the value =>
              node.children.set(i, v2);
              node.children.set(j, v1);
              i++;
              j--;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        display(root);
        mirror(root);
        display(root);
    }

}

