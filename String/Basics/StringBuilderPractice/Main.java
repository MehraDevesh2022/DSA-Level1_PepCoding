package Level1.String.Basics.StringBuilderPractice;
// Various operation of StringBuilder => 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // taking input =>
        StringBuilder str = new StringBuilder(scn.nextLine());
        // output =>
        System.out.println(str);
        
        // get => String.charAt(idx) =>
          char ch = str.charAt(2); // getting value from index 2 to the string
          System.out.println(ch); // output : l from hello

         
           // String.length(); =>
          System.out.println(str.length()); // output : 5 from hello

          // upadte vaule => String.setCharAt(idx , value) =>
             str.setCharAt(0,'L');
            System.out.println(str); // output : Lello from hello
            
            // str.append(value); => adding new value into String.
            str.append(" world !");
            System.out.println(str); // hello world ! from hello
            
            // insert => String.insert(idx , value); => adding new character in the string
            str.insert(0, "hello ");  
            System.out.println(str);  // hello world! from world!

            // StingBuilder is much faster than String . Also less memory occupied.   

    }
}
