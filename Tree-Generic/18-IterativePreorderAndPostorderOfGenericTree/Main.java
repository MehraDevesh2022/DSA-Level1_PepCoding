/*

"A problem is a chance for you to do your best.
~Duke Ellington"
 * Iterative Preorder And Postorder Of Generic Tree
Medium  Prev   Next
1. You are given a partially written GenericTree class.
2. You are require to complete the body of function IterativePreandPostOrder. The function does not use recursion and prints preorder and postorder of the tree. Both orders are printed in separate lines (preorder first, followed by post order in next line). Elements in an order are separated by space.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Elements in preorder separated by a space
Elements in postorder separated by a space
Question Video

  COMMENTConstraints
None
Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
Sample Output
10 20 -50 60 30 70 -80 110 -120 90 40 -100 
-50 60 20 70 110 -120 -80 90 30 -100 40 10 


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

 // make pari class for string nodes and there state
static class Pair{
    int state; // for tracking nodes children state || idx
    Node node ; 

    Pair(){}

    Pair(int state , Node node){
        this.state = state;
        this.node  = node;
    } 
 }

  public static void IterativePreandPostOrder(Node node) {
    // write your code here
    // crate a stack pair type =>
    Stack<Pair> st = new Stack<>();
    // create a pair and add root and inital state of root-1,
Pair initialNode = new Pair(-1 , node);
st.push(initialNode);
StringBuilder pre = new StringBuilder();
StringBuilder post = new StringBuilder();
while(st.size() !=0){
    Pair peekPair = st.peek();
    // when node in initail state then do work of pre
    if(peekPair.state == -1){
        // add data of currNode in preorder string from peek of the stack 
      pre.append(peekPair.node.data + " ");
      // now state increase
      peekPair.state++;
    }
    else if(peekPair.state == peekPair.node.children.size()){
            // that currNode is visted his all children now do work for post order
            post.append(peekPair.node.data + " " );
            // now pop that pair from stack bceause its visted for all his child and also done work for his slef in post order
            st.pop();
            // now increase to state of parent node. 
      
    }else{
        // when state is in between 0th children node to size()
        //get the child state postion and add to the stack
        Node childNode = peekPair.node.children.get(peekPair.state);
        // child node is root for his children and intial state for child is -1
        st.push(new Pair(-1 , childNode));
        peekPair.state++;
    }
}
System.out.println(pre);
System.out.println(post);
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
    IterativePreandPostOrder(root);
  }

}