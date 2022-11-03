/*
 * Merge K Sorted Lists
 * Hard Prev Next
 * 1. You are given a list of lists, where each list is sorted.
 * 2. You are required to complete the body of mergeKSortedLists function. The
 * function is expected to merge k sorted lists to create one sorted list.
 * Input Format
 * Input is managed for you
 * Output Format
 * Output is managed for you
 * Question Video
 * 
 * COMMENTConstraints
 * Space complextiy = O(k)
 * Time complexity = nlogk
 * where k is the number of lists and n is number of elements across all lists.
 * Sample Input
 * 4
 * 5
 * 10 20 30 40 50
 * 7
 * 5 7 9 11 19 55 57
 * 3
 * 1 2 3
 * 2
 * 32 39
 * Sample Output
 * 1 2 3 5 7 9 10 11 19 20 30 32 39 40 50 55 57
 */
/*
 * approch : 
 *  we have given arraylist of lists just like 2d array little bit
 *  first make triplet class interface
 *  triplet data type contains 3 things int type list , idx of list and val of list
 *  make a comparateble function at tripelet class for priority queue shake of  value comparision among list idx and val which one use in min priority queue
 *    Solution in main function =>  
 *       now : make ans Array list
 *           : make priority queue
 *           : add all lists 0 idx value in pq (with => list-no_idx_val)
 *           : now remove elm of priority queue untill it not empty and store refence inside temp triplet data type 
 *           :  add temp.val in ans array list
 *           : now make newLi =temp.li for next value
 *           :  make newidx  = temp.idx for next value
 *           :  make newVal = temp.val
 *           now add make new triplet temdata  and use (newList , newidx , newVal) for finding new value from all list 
 *            add then tempData into pq
 *     repeat untill all list elm not added into ans arrayList
 *     return ans arrayLiast
 *  
 *            
 */
import java.io.*;
import java.util.*;

public class Main {

    public  static class triplet implements Comparable<triplet>{ //  this interface bcz using implements here 
       int li; // which list is from lists
       int idx; // which elm from list
       int val; // value from list at idx

       triplet(){

       }
       triplet(int li , int idx , int val){
         this.li = li;
         this.idx = idx;
         this.val  = val;
       }
    public int compareTo(triplet o){ // o => others use anything
     return this.val -o.val; // this will return min value for priority queue (o.val -this.val => it will return max value || also use idx and li then compare happen based on these in priority queue)
    }
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) { // lists are list of k array list
        // write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        for(int i=0; i<lists.size(); i++){ // get all list 0 idx value and store them into pq using triplet object
           triplet temp = new triplet(i, 0 , lists.get(i).get(0));
           pq.add(temp);
        }
         // now empty pq and store each list value with shorting order and add ans list all of them
         while(pq.size()>0){
            triplet top = pq.remove();
            ans.add(top.val);


            // now for next we need refrence of list , idx , and value 
            int newLi = top.li;
            int newIdx = top.idx+1;
            // check if list empty
            if(newIdx < lists.get(top.li).size()){
                 int newVal  = lists.get(newLi).get(newIdx); // lists.get(newLi).get(newIdx) (girst getting list from all list) then getting value of that list using idx
                 // now make new triplet obj  with list , idx, and value then add to pq
                 triplet temp = new triplet(newLi , newIdx , newVal);  // making temp triplet obj where this will store refrence list=>i from k lists , idx =0 of list , value of getting int newVal = // lists.get(newLi).get(newIdx);
                 pq.add(temp);
            }
         }  

        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for (int val : mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}