/*
 * Write Priority Queue Using Heap
Easy  Prev   Next
1. You are required to complete the code of our Priority Queue class using the heap data structure. Please watch the question video carefully. The theoretical details of required functionality is explained in detail there. Implement the functions to achieve what is explained in the theoretical discussion in question video.
2. Here is the list of functions that you are supposed to complete:
    2.1. add -> Should accept new data.
    2.2. remove -> Should remove and return smallest value, if available or print 
     "Underflow" otherwise and return -1.
     2.3. peek -> Should return smallest value, if available or print "Underflow" 
     otherwise and return -1.
     2.4. size -> Should return the number of elements available.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
None
Sample Input
add 10
add 20
add 30
add 40
peek
add 50
peek
remove
peek
remove
peek
remove
peek
remove
peek
quit
Sample Output
10
10
10
20
20
30
30
 */
import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // write your code here
       data.add(val);
       upHeapyfy(data.size()-1);

    }
    public void upHeapyfy(int idx){
      if(idx ==0){
        return; //that case only one node so need to compare
      }
      // find parent idx of that child idx
       int pi = (idx -1)/2; // formula writen in txt file
       if(data.get(pi) > data.get(idx)) // if parent elm value greater than child then swap bcz this is min heap all roots should be min
       {
        swap(idx , pi);
        // call until all root are not fixed it will gone max log(n) height mean idx==0
        // tak ja sakta hai
        upHeapyfy(pi);
       }
     
    }
    public void swap(int i , int j){
     int v1  = data.get(i);
     int v2  = data.get(j);
     // now use set for swap value this is array list how it works
     data.set(i, v2);
     data.set(j, v1);
    }

    public int remove() {
      // write your code here
      //  get peak for check either elm available or not
      int val = peek();
      if(val ==-1){
        return val; // if there is no elm then peek return -1
      }
      // swap first last and first elm then remove last one bcz of time complexcity 
      swap(0, data.size()-1);
      data.remove(data.size()-1);
      // now check if  0th elm greater then child then use downheapy and swap root to child for maintain hop
       downHeapify(0);
       return val;
    }

    public void downHeapify(int pi){
      int minIdx = pi;
      int lci = 2 * pi + 1;
      int rci = 2* pi + 2; // formula described in .txt file check it out
 // check agar lfet child idx chota hai array list ke size se or child ki value parent elm se choti hai to minIdx update kr do same for right child idx
      if( lci < data.size() && data.get(lci)  < data.get(minIdx)){
        minIdx =lci;
      }
      if  ( rci < data.size() && data.get(rci) < data.get(minIdx)) {
        minIdx = rci;
      }
      // agar minIdx pi ke brabar nhi to minIdx update hua hoga or parent elm ki value bdi hogi child elm se to swap kro or dubara call kro fun ko untill idx==0 automatically will return
      if(minIdx !=pi){
        swap(minIdx, pi);
        downHeapify(minIdx);
      }
     }

    public int peek() {
      // write your code here
      if(data.size() ==0){ // when there is elm
        System.out.println("Underflow");
        return -1;
      }
         int val = data.get(0);
         return val;
    }

    public int size() {
      // write your code here
      return data.size(); // array lsit size
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}