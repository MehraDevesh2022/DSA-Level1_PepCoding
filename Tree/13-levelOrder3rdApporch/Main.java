//  A positive attitude can really make dreams come true
// ~David Bailey

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Main {

    public static class Pair {
        Node node;
        int state;

        Pair() {

        }

        Pair(Node node, int state) {
            this.state = state;
            this.node = node;
        }

    }

    public static class Node {
        int val;
        Node leftNode;
        Node rightNode;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node lefNode, Node rightNode) {
            this.val = val;
            this.leftNode = lefNode;
            this.rightNode = rightNode;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node rootNode = new Node(arr[0]);
        Pair rootPair = new Pair(rootNode, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rootPair);
        int idx = 1;
        while (st.size() != 0) {
            Pair peekPair = st.peek();
            if (peekPair.state == 1) {
                peekPair.state++;
                if (arr[idx] != null) {
                    Node leftchild = new Node(arr[idx]);
                    peekPair.node.leftNode = leftchild;
                    st.push(new Pair(leftchild, 1));
                }
                idx++;
            } else if (peekPair.state == 2) {
                peekPair.state++;
                if (arr[idx] != null) {
                    Node rightchild = new Node(arr[idx]);
                    peekPair.node.rightNode = rightchild;

                    st.push(new Pair(rightchild, 1));
                }
                idx++;
            } else {
                st.pop();
            }
         }
         levelOrderTrversal3rdWay(rootNode);
       
    }

    public static void levelOrderTrversal3rdWay(Node root){
        if(root ==null){
            return;
        }
        Queue<Node>  qu = new LinkedList<>();
        qu.add(root);

        while(qu.size() >0){

            // get size queue
            // if size of queue is greater than  0 do work remove --print value --> add child of removing node and size -- as well;
            // once Size =0 then print new line and check queue size is > 0
            // if gretaer then again repeat
            int size = qu.size();
            while(size -->0){
                // remove peek;
                Node peek = qu.remove();

                // print value 
                System.out.print(peek.val + "  ");

                //add child
                if(peek.leftNode !=null){
                    qu.add(peek.leftNode);
                }
                if(peek.rightNode !=null){
                    qu.add(peek.rightNode);
                }   

            }
         

            // now break line
            System.out.println();
        }
    }
}

