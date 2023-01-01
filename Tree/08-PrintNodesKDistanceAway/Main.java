/*" Act as if what you do makes a difference. It does.
~ William James"
 * 
 * Print Nodes K Distance Away
 * Easy Prev Next
 * 1. You are given a partially written BinaryTree class.
 * 2. You are given a data data and a data k.
 * 3. You are required to complete the body of printKNodesFar function. The
 * function is expected to print all nodes which are k distance away in any
 * direction from node with data equal to data.
 * 4. Input is managed for you.
 * Input Format
 * Input is managed for you
 * Output Format
 * All nodes which are k distance away in any direction from node with data
 * equal to data, each in a separate line
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 19
 * 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
 * 37
 * 2
 * Sample Output
 * 12
 * 50
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
        Node node = new Node(arr[0], null, null);
        Pair rtp = new Pair(node, 1);

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

        return node;
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


    // find path from given data to node 
    public static ArrayList<Node> findPath(Node node , int data){
        
        // base case
        if(node ==null){
            return new ArrayList<>();
        }
      // when node datas  == given data
       if(node.data ==data){
        ArrayList<Node> ans = new ArrayList<>();
        ans.add(node);
        return ans;
       }
       // left node call
       ArrayList<Node> leftAns = findPath(node.left, data);
       // agar leftans ka size 0 se jyada that means target node mill chuka hai or ab path add kro array main
       if(leftAns.size() > 0){
        leftAns.add(node);
        return leftAns;
       }
       ArrayList<Node> rigthAns = findPath(node.right, data);
       // agar rightAns ka size 0 se jyada that means target node mill chuka hai or ab path add kro array main
       if(rigthAns.size() >0){
        rigthAns.add(node);
        return rigthAns;
       }
      // when taregt node not find
       return new ArrayList<Node>();
    } 


public static void kNodesFarAway(Node node , int k , Node blocker){
    if(k<0 || node ==null || blocker ==node){
            return;
    }
        
    if(k ==0){
        System.out.println(node.data);
    }
    kNodesFarAway(node.left, k-1, blocker);
    kNodesFarAway(node.right, k-1, blocker);
    return ;
}

    public static void printKNodesFar(Node node, int data, int k) {
        // write your code here

        // find the given data path :
        ArrayList<Node> path  = findPath(node , data);
        Node blocker = null;

        for(int i=0; i<path.size(); i++){
            Node pathNode = path.get(i);
            kNodesFarAway(pathNode , k-i , blocker);
            blocker = pathNode;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] datas = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (datas[i].equals("n") == false) {
                arr[i] = Integer.parseInt(datas[i]);
            } else {
                arr[i] = null;
            }
        }

        int data = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        Node node = construct(arr);
        printKNodesFar(node, data, k);
    }

}