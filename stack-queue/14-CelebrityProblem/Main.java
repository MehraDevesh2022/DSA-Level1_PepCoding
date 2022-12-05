/*
"A celebrity is a person who works hard all of their life to become well known, and then wears dark glasses to avoid being recognized.
~ Fred Allen"

 * Celebrity Problem
 * Easy Prev Next
 * 1. You are given a number n, representing the number of people in a party.
 * 2. You are given n strings of n length containing 0's and 1's
 * 3. If there is a '1' in ith row, jth spot, then person i knows about person
 * j.
 * 4. A celebrity is defined as somebody who knows no other person than himself
 * but everybody else knows him.
 * 5. If there is a celebrity print it's index otherwise print "none".
 * 
 * Note -> There can be only one celebrity. Think why?
 * 
 * 
 * Input Format
 * Input is managed for you
 * Output Format
 * Index of celebrity or none
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 10^4
 * e1, e2, .. n * n elements belongs to the set (0, 1)
 * Sample Input
 * 4
 * 0000
 * 1011
 * 1101
 * 1110
 * Sample Output
 * 0
 */


 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        // only one celeberty possible bcz of condition for celeb is : ek admi jisko sb jante ho or wo apne siva kisi ko nhi janta ho celb hoga.  that mean ek aadmi hi aisa ho skta hai

        Stack<Integer> celb = new Stack<>();
        // push all n people into stack
        for(int i=0; i<arr.length; i++){
               celb.push(i);
        }


        // check kro tab tag jab tak stack main 2 log hai
        while(celb.size() >=2){
              // remove 2 people from stack and check if they no each other or not 
            int person2 = celb.pop();
            int person1 = celb.pop();
              
            // agar person1 person2 ko janta hai to person2 ko add kr denge stack main q ki wo celb ho skata hai
            if(arr[person1][person2] ==1){
                celb.push(person2);
            }else{
                // agar person1 nhi janta person2 ko . to syd person1 celb ho skta hai
                celb.push(person1);
            }

        }
        // ab stack main ek candidate bcha hai jo celb ho skta hai
        int  celbCandidate = celb.pop();
        boolean ans = true;
        // check kro celbCandidate agar kisi ko janta hai. to row arr[celbCandidate][i] !=0 hoga .. agr !=0 true mtlv celbCandidate kisi ko jnata hai to wha celb nhi ho skta 
        // check  use kya sb jante hai ya nhi in clm arr[i][celbCandidate] !=1  agr 1 na ho sb nhi jante mtlv celb nhi ho skta
          for(int i=0; i<arr.length; i++){
          // celbCandidate !=i dont check your own self
            if(celbCandidate !=i && arr[i][celbCandidate] !=1 && arr[celbCandidate][i] !=0){
                  ans = false;
                  break;
            }
          }
          if(ans){
            System.out.println(celbCandidate);
          }else{
            System.out.println("none");
          }

    }

}