/*
"You cannot swim for new horizons until you have courage to lose sight of the shore.
~William Faulkner"

 * Node To Root Path In Generic Tree
Easy  Prev   Next
1. You are given a partially written GenericTree class.
2. You are required to complete the body of nodeToRootPath function. The function is expected to return in form of linked list the path from element to root, if the element with data is found.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
None
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120
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

 public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node.data == data){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(node.data);
        return ans;
}

   for(Node child : node.children){
    ArrayList<Integer>  myAns  = nodeToRootPath(child, data);
        if(myAns.size() > 0){
            myAns.add(node.data);
            return myAns;
        }else{
            continue;
        }
   }
   return new ArrayList<Integer>();
 }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    ArrayList<Integer> path = nodeToRootPath(root, data);
    System.out.println(path);
    // display(root);
  }

}