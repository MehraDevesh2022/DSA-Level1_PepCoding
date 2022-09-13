package AddAt;
                            /*
    "I don't care if it works on your machine! We are not shipping your machine!"
                            ~ Vidiu Platon
                             */

 
/*Add At Index In Linked List
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
   2.1 addLast - adds a new element with given value to the end of Linked List
   2.2. display - Prints the elements of linked list from front to end in a single line. All 
   elements are separated by space
  2.3. size - Returns the number of elements in the linked list.
  2.4. removeFirst - Removes the first element from Linked List. 
  2.5. getFirst - Returns the data of first element. 
  2.6. getLast - Returns the data of last element. 
  2.7. getAt - Returns the data of element available at the index passed. 
  2.8. addFirst - adds a new element with given value in front of linked list.
3. You are required to complete the body of addAt function. This function should add the element at the index mentioned as parameter. If the idx is inappropriate print "Invalid arguments".
4. Input and Output is managed for you.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

addFirst 10
getFirst
addAt 0 20
getFirst
getLast
display
size
addAt 2 40
getLast
addAt 1 50
addFirst 30
removeFirst
getFirst
removeFirst
removeFirst
addAt 2 60
display
size
removeFirst
removeFirst
getFirst
quit

Sample Output
10
20
10
20 10 
2
40
20
10 40 60 
3
60
*/
/*
 * Approch :
 *   when idx ==0 call addFirst function 
 *   when idx ==size call addLast function
 *   when idx <0 || idx >0 print invalid
 *   when idx under 0 to size -1 :
 *     make New node and add data = val on it
 *     make ref Node temp  and point it to head
 *     move the ref temp = temp.next in loop till idx-1 position (before where new node need to be added)
 *     Now point node.next to temp.next
 *     and temp.next = node.next (node is added into given idx)
 *     now increase the size++ 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() { // we need to return first node of list here
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {   // we need to return last node of list here 
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
             
                }
        }

        public int getAt(int idx) {
            // wirte code here
            if (size == 0) { // if when size =0
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments"); // when index is not valid mean when index less than zero or
                                                         // greater than size
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) { // let say idx =3 and size 5 so we need to iteration to get idx number
                                                // node
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            // crate a new node
            Node node = new Node();
            // assign the given data to new node
            node.data = val;
            // create a node for reference
            Node temp;
            if (idx == 0) {
                if (size == 0) // if link list empty
                {
                    head = node;
                    tail = node;
                    size++;
                } else {
                    temp = head;
                    head = node;
                    head.next = temp;
                    size++; // adding new element therefore size++
                }
            } else if (idx == size) // when idx is equal size then as per our zero base indexing tail in size-1 then
                                    // we add new element after tail
            {
                if (size == 0) // maybe link list is empty then
                {

                    head = node;
                    tail = node;
                    size++;
                } else {
                    temp = tail;
                    temp.next = node;
                    tail = node;
                    size++;
                }
            } else if (idx < 0 || idx > size) // when idx is inappropriate
            {
                System.out.println("Invalid arguments");
            } else {
                temp = head;
                for (int i = 0; i < idx - 1; i++) // this is zero base index therefore we use loop i < idx-1 if idx 1
                                                  // base type then we use loop i<idx time
                {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("removeFirst")) {
                list.removeFirst();
            } else if (str.startsWith("getFirst")) {
                int val = list.getFirst();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getLast")) {
                int val = list.getLast();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = list.getAt(idx);
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("addFirst")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);
            } else if (str.startsWith("addAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                list.addAt(idx, val);
            }
            str = br.readLine();
        }
    }
}