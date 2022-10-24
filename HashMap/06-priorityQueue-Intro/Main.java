// print  element in assedning order using PriortyQueue

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // by default minimum pq build in java 
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int elm : arr){
        pq.add(elm);
      }
    // pq.size() returns the size of PriorityQueue
      while(pq.size() !=0){
        // pq.peek() return peek elem frm the Queue
        System.out.println(pq.peek());
        // remove() removes top elem from the queue
        pq.remove();
      }
                  
    }

}