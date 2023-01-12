/*
 "The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty.
~Winston Churchill"
 */

import java.util.*;

public class Main {
  private static class Node {
    int data; // for storing the data
    ArrayList<Node> children = new ArrayList<>();// for storing the child nodes
  }
  }

  public static void display(Node node) {
    String str = node.data + " -> "; // for roots reach child
    for (Node child : node.children) {
      str += child.data + ", "; // all children of their respected root
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);  // only roots children 
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
  }

}