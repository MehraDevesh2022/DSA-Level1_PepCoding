import java.util.Stack;

public class Main{
    
    public static class Pair{
        Node node;
        int state;
       Pair(){

       }

        Pair(Node node , int state){
            this.state = state;
            this.node = node;
        }


    }
        public static class Node{
            int val;
            Node leftNode;
            Node rightNode;

            Node(){}
            Node(int val){
                this.val = val;
            }
            

            Node(int val , Node lefNode , Node rightNode){
                 this.val = val;
                 this.leftNode = lefNode;
                 this.rightNode = rightNode;
            }
        }


      
    

       public static void main(String[] args) {
           Integer []arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                   null };

           Node rootNode = new Node(arr[0]);
           Pair rootPair = new Pair(rootNode , 1);
           Stack<Pair> st = new Stack<>();
           st.push(rootPair);
           int idx=1;
           while(st.size() !=0){
            Pair peekPair = st.peek();
            if(peekPair.state ==1){
                peekPair.state++;
                if(arr[idx] !=null){
                      Node leftchild = new Node(arr[idx]);
                     peekPair.node.leftNode =  leftchild;
                      st.push(new Pair(leftchild ,1));
                }
                idx++;
            }
           else if(peekPair.state ==2){
                peekPair.state++;
                if(arr[idx] !=null){
                      Node rightchild = new Node(arr[idx]);
                      peekPair.node.rightNode = rightchild;
    
                      st.push(new Pair(rightchild , 1));
                }
                idx++;
            }else{
                st.pop();
            }

           }  
           
           display(rootNode);
    }


    public static void display(Node root) {
          if(root ==null){
            return;
          }

          if(root.leftNode !=null){
            System.out.print(root.leftNode.val + "");
          }else{
            System.out.print(".");
          }
          System.out.print("<-- " + root.val + "-->");
        
          if(root.rightNode !=null){
            System.out.print(root.rightNode.val + "");
          }else{
            System.out.print(".");
          }

        System.out.println();
        display(root.leftNode);
        display(root.rightNode);

    }
}