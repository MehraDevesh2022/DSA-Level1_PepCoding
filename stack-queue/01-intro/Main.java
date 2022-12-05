// stack is work on LIFO
// its stack like data structure ( call stack implment using stack ds)
// it returns array of element 
// operation =>
  // add elm => st.push()  
  // remove elm => st.pop()
  // get elm => st.peek()
  // size  => st.size()


  import java.util.*;
  
  public  class Main{
   public static void main(String[] args){
       Stack<Integer> st = new Stack<>();
       // add elm =>
        st.push(20);

        // get =>
      System.out.println(  st.peek());

        // remove =>

       System.out.println( st.size());
      
      // stack-overflow
      //    while(true){
      //   st.push(10);  // java.lang.OutOfMemoryError: Java heap space
      // }


      // stack under flow => when no elm to get
      System.out.println(st.pop()); 
      System.out.println(st.peek());  // java.util.EmptyStackException
   }

  }
