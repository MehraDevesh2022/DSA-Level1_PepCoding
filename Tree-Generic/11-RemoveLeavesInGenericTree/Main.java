
/*

"Don't Let Yesterday Take Up Too Much Of Today.
~Will Rogers"


 * Remove Leaves In Generic Tree
Easy  Prev   Next
1. You are given a partially written GenericTree class.
2. You are required to complete the body of removeLeaves function. The function is expected to remove all leaves from the tree. For more details, check out the question video.
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
Sample Output
10 -> 20, 30, 40, .
20 -> .
30 -> 80, .
80 -> .
40 -> .


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
    for (Node child : node.children) {
      mirror(child);
    }
    Collections.reverse(node.children);
  }

  public static void removeLeaves(Node node) {
    // write your code here
    /* Approch =>
      we are using pre order here . Q ki post order main pehle leafs ke liye kaam hota hai.. agr hum sare leafs ke liye pehle kaam kr le or unko delete kr le to contole jb return hooga none leaf node main to wo apna kaam krega or cheack krega kya wo leaf hai . qki hum sb leaf pehle hi delete kr chuke honge to cindtion true hogi or aise sare nodes delete ho jainge or value bchegi null. 
       pre order main suru se leaf check kringe eventualy jb leaf milega to sare nodes ke kaam ho chuka hoga and we will remove leaf only.
           > start loop from nodes children arrayList last value because. we cant remove first value from arrayList so start from last.
           > get the child node from last node of children arrayList of root node.
           > now cheak if child children  array list size  ==0 to wo leaf node because there is no nodes further after that node. 
           > once condtion true remove that node chilren from i th position from array list. we are removing from last to 0 so there is no effcet on arrayList
           > check for all child .. if may child.chldren value is greater then 0 that mean that child node is not leaf. 
           > now call for nodes child .. now child become root node and check if that node childe.children size ==0 .
            eveantually all leaf nodes are gone. and return 

     * 
     */
     for(int i = node.children.size()-1; i>=0 ; i-- ){ // start from last node bcz we cant remove value from staring of array list so remove from last

        // get the child 
        Node child  = node.children.get(i); // get i th postion child . if there any
        if(child.children.size() ==0){  // now check is that childs has children. if not that mean that child i self is leaf and remove that from children array . and check for another once
            node.children.remove(i);
        }

     }
     // if may some nodes has children availble so call those child and they will check for there childern eventually all leafs will founded and removed
     for(Node child : node.children){
        removeLeaves(child);
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
    removeLeaves(root);
    display(root);
  }

}