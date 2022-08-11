package ToggeleCase;

/*
 * Toggle Case
Easy  Prev   Next
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
Input Format
A String
Output Format
A String
Question Video

  COMMENTConstraints
1 <= length of string <= 1000
Sample Input
pepCODinG
Sample Output
PEPcodINg

 */


/*
1st approch =>
Formula for that => 
'CH' - 'A' == 'ch' - 'a'
if lowercase =>
'ch' = 'CH' - 'A' + 'a';
if upperCase =>
'CH' = 'ch' -'a' +'A';

*/
import java.io.*;
import java.util.*;
public class Main {

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
               ch = (char)(ch -'A' + 'a'); 
              sb.append(ch);
            } else {
                ch = (char) (ch - 'a' + 'A');
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}

// 2nd approch =>
// using with ASCII numbers +32 and -32. 

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static String toggleCase(String str) {
//         String s = "";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 65 && ch <= 95) {
//                 ch = (char) ((int) ch + 32); // WE using +32 and -32 gap differnce method between 65 ='A' to 'a' = 98
//                 s += ch;
//             } else {
//                 ch = (char) ((int) ch - 32);
//                 s += ch;
//             }
//         }
//         return s;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.next();
//         System.out.println(toggleCase(str));
//     }

// }



//3rd  approch =>
// // using toUpperCase() || toLowerCase();

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static String toggleCase(String str) {
//         String s = "";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 65 && ch <= 95) {
//                 ch = Character.toLowerCase(ch);
//                 s += ch;
//             } else {
//                 ch = Character.toUpperCase(ch);
//                 s += ch;
//             }
//         }
//         return s;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.next();
//         System.out.println(toggleCase(str));
//     }

// }