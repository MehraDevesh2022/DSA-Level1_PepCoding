/*
 * Print Encodings
 * Easy Prev Next
 * 1. You are given a string str of digits. (will never start with a 0)
 * 2. You are required to encode the str as per following rules
 * 1 -> a
 * 2 -> b
 * 3 -> c
 * ..
 * 25 -> y
 * 26 -> z
 * 3. Complete the body of printEncodings function - without changing signature
 * - to calculate and print all encodings of str.
 * Use the input-output below to get more understanding on what is required
 * 123 -> abc, aw, lc
 * 993 -> iic
 * 013 -> Invalid input. A string starting with 0 will not be passed.
 * 103 -> jc
 * 303 -> No output possible. But such a string maybe passed. In this case print
 * nothing.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A string str
 * Output Format
 * Permutations of str in order hinted by Sample output
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= str.length <= 10
 * Sample Input
 * 655196
 * 
 * Sample Output
 * feeaif
 * feesf
 */
import java.io.*;
import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//       Scanner scn = new Scanner(System.in);
//       String str = scn.nextLine();
//       printEncodings(str, "");
//     }

//     public static void printEncodings(String str ,String asf) { // asf => answer so far
//       if(str.length() ==0){
//           System.out.println(asf) ;
//           return;
//       }

//       // when only 1 element in str || str first element is zero
//       if(str.charAt(0) =='0'){
//          return; // 0 has no outcome as given in question
//       } 

//       char ch = str.charAt(0);
//       int idx  = ch -'0';
//       printEncodings(str.substring(1), asf + (char)(idx + 'a' -1)); // because we need charachter =>  eg for case  655196: ch=6 and ascci of a is 97 so 97+6-1 =>102 is f (6 + 97 -1) =102 ascci of that f   
//   // when call for 2 digit value those are less than 26
//       if(str.length()>1){
//          char ch2 = str.charAt(1);
//          int idx2 = ch2 -'0';
//          int val =  idx *10 + idx2; // idx = 6  and idx2 =5  6*10 +5= 65  we need two digit number for >10 and less than 26
//          if(val<=26){
//           printEncodings(str.substring(2), asf + (char)(val + 'a' -1)); // eg :val = 19 => (char)(19 +97-1) => s
//          }

//       }



//     }

// }


public class Main {

  public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
    int ans =  numDecodings(str);
    System.out.println(ans);
    }
    public static int numDecodings(String str) {
        if(str.length() ==0){
            return 1;
        }
        
        int myAns =0;
        if(str.charAt(0) =='0'){
            return 0;
        }
        
        char ch = str.charAt(0);
        int idx = ch -'0';
        int recAns = numDecodings(str.substring(1));
        if(recAns <1)
          myAns +=recAns;
          else
            myAns += recAns +1;
         
        if(str.length() >1){
             char ch2 = str.charAt(1);

            int idx2 =  ch2 - '0';
            int val = idx *10 + idx2;
          
              if(val <=26){
                   int recAns2 = numDecodings(str.substring(2));
                   if (recAns < 1)
                     myAns += recAns2;
                   else
                     myAns += recAns2 + 1;
                  
              }
                              
         
        }
        if(myAns !=0)
        return myAns -1;
        else
        return myAns;
        
    }
  }