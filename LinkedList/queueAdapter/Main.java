package queueAdapter;

/*
" Any code of your own that you haven't looked at for 6 or more months might as well have been written by someone else."
                                                           ~Eagelson's Law
 */

/*
 * Linked List To Queue Adapter
Easy  Prev   Next
1. You are required to complete the code of our LLToQueueAdapter class. 
2. As data members, you've a linkedlist available in the class.
3. Here is the list of functions that you are supposed to complete
     3.1. add -> Should accept new data in FIFO manner
     3.2. remove -> Should remove and return data in FIFO manner. If not available, 
     print "Queue underflow" and return -1.
     3.3. peek -> Should return data in FIFO manner. If not available, print "Queue 
     underflow" and return -1.
     3.4. size -> Should return the number of elements available in the queue
4. Input and Output is managed for you.

Note -> The intention is to use linked list functions to achieve the purpose of a queue. All the functions should work in constant time.
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
add 50
add 60
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit
Sample Output
10
10
20
20
30
30
40
40
50
50
60
60
 */
/*
 *  Approch : 
 *      Queue : Work on FIFO :
 * Size() =>return size using list.size(); given by java
 * add() => use list.addLast(); method given by java (addLast bcz first element alway conatain head FIFO manner)
 * remove() => use removeFirst(); method given by java (bcz java first element comes first in line and follow FIFO)
 * peek()=> use getFirst(); method given by java (bcz in peak first element is located)
 */

import java.io.*;
import java.util.*;

public class Main {

    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            // write your code here
            return list.size();
            // System.out.println(list);
        }

        void add(int val) {
            // write your code here
            list.addLast(val);
        }

        int remove() {
            // write your code here
            if (list.size() == 0) {
                System.out.println("Queue underflow");
                return -1;

            } else {
                return list.removeFirst();
            }

        }

        int peek() {
            if (list.size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            } else {
                return list.getFirst();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToQueueAdapter qu = new LLToQueueAdapter();

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