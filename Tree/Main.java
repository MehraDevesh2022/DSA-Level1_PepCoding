import java.util.Stack;

public static class Main{
    
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

            Node(){

            }
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
                      Node leftNode = new Node(arr[idx]);
                      Pair leftPair  = new Pair(leftNode , 1);
                      st.push(leftPair);
                }
                idx++;
            }
           else if(peekPair.state ==2){
                peekPair.state++;
                if(arr[idx] !=null){
                      Node rightNode = new Node(arr[idx]);
                      Pair rightPair  = new Pair(rightNode , 2);
                      st.push(rightPair);
                }
                idx++;
            }else{
                st.pop();
            }

           }        
    }
}