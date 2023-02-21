/*


 "
 Shoot for the moon, even if you fail, you'll land among the stars
~ Cecelia Ahern
 "


 * Iterative Pre, Post And Inorder Traversals Of Binary Tree
 * Easy Prev Next
 * 1. You are given a partially written BinaryTree class.
 * 2. You are required to complete the body of iterativePrePostInTraversal
 * function. The function is expected to print pre order, in order and post
 * order of the tree in separate lines (first pre, then in and finally post
 * order). All elements in an order must be separated by a space.
 * 3. Input is managed for you.
 * Input Format
 * Input is managed for you
 * Output Format
 * pre order (elements separated by space)
 * in order (elements separated by space)
 * post order (elements separated by space)
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 19
 * 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
 * Sample Output
 * 50 25 12 37 30 75 62 70 87
 * 12 25 30 37 50 62 70 75 87
 * 12 30 37 25 70 62 87 75 50
 */





//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Approch <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
/*
 We are going to solve this problem by using a Pair class which has 2 data members: node and state.
Here,
Crate three string Pre , post , in
Create a stack Pair type and add root first with initial state =1;
Now check if check stack size !=0
Remove top of pair from stack 
Then we check the "state" of top.
    State =1 means Pre order => add top pair node data to pre string & do state ++ also check if pair top node left node != null so push to left node to stack with pair and 1 is initial value
             
   State =2 means In order  => add top pair node data to in string & do state ++ also check if pair top node right node != null so push to right node to stack with pair and 1 is initial value

State =3 means Post order => that mean top pair nodes done all work now add to Pair node data into post string and pop from stack


To summarize,

State 1 -> add to "Pre", state++, left node

State 2 ->add to "In", state++, right node

State 3 ->add to "Post", pop
 
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

        int idx = 1;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                top.state++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
              
                idx++;

            } else if (top.state == 2) {
                    top.state++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                
                idx++;
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


 

    public static void iterativePrePostInTraversal(Node node) {
        // write your code here

        StringBuilder pre  = new StringBuilder();
        StringBuilder in  = new StringBuilder();
        StringBuilder post  = new StringBuilder();

             Stack<Pair> st = new Stack<>();
              Pair  root  = new Pair(node, 1);
                st.push(root);
              while(st.size() !=0){
                 
                Pair currPair = st.peek();
                if(currPair.state ==1){
                    pre.append(currPair.node.data + " ");
                    currPair.state++;
                    if(currPair.node.left !=null){
                        st.push(new Pair(currPair.node.left, 1));
                    }
                }else if(currPair.state ==2){
                    in.append(currPair.node.data + " ");
                       currPair.state++;
                       if(currPair.node.right !=null){
                        st.push(new Pair(currPair.node.right, 1));
                       }
                }else{
                      post.append(currPair.node.data + " ");
                      st.pop();
                }

              }
         System.out.println(pre);
         System.out.println(in);
         System.out.println(post);

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
        iterativePrePostInTraversal(root);
    }

}