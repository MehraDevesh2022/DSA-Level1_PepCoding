package stackAadapter;

// Linked List To Stack Adapter
// Easy

// 1. You are required to complete the code of our LLToStackAdapter class. 
// 2. As data members, you've a linkedlist available in the class.
// 3. Here is the list of functions that you are supposed to complete
//     3.1. push -> Should accept new data in LIFO manner
//     3.2. pop -> Should remove and return data in LIFO manner. If not 
//      available, print "Stack underflow" and return -1.
//     3.3. top -> Should return data in LIFO manner. If not available, print 
//     "Stack underflow" and return -1.
//     3.4. size -> Should return the number of elements available in the 
//     stack
// 4. Input and Output is managed for you.

// Note -> The intention is to use linked list functions to achieve the purpose of a stack. All the functions should work in constant time.

// Constraints
// None

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// push 10
// push 20
// push 5
// push 8
// push 2
// push 4
// push 11
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// quit

// Sample Output
// 11
// 7
// 11
// 4
// 6
// 4
// 2
// 5
// 2
// 8
// 4
// 8
// 5
// 3
// 5
// 20
// 2
// 20
// 10
// 1
// 10
/*
 * Approch :
 *  in stack LIFO system works
 *  size() :
 *  use size method of list
 *  push() :
 *  use addFirst()  method of list
 * pop()  :
 *  if size ==0 print and return -1
 *   else use removeFirst() function of list given by Java itshelf
 *  top() :
 * if size ==0 print and return -1
 *  else use getFirst() method from list of Java
 */

import java.io.*;
import java.util.*;

public class Main {

  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      // write your code here
      return list.size();
    }

    void push(int val) {
      // write your code here
          list.addFirst(val);
    }

    int pop() {
      // write your code here
      if(  list.size() == 0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
      else
      {
           int val =  list.removeFirst();
           return val;
      }
    }

    int top() {
      // write your code
      if( list.size() == 0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
      else
      {
             int val = list.getFirst();
             return val;
      } 

    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}