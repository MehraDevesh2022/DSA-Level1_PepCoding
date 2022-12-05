/*
 * 
 * Postfix Evaluation And Conversions
 * Easy Prev Next
 * 1. You are given a postfix expression.
 * 2. You are required to evaluate it and print it's value.
 * 3. You are required to convert it to infix and print it.
 * 4. You are required to convert it to prefix and print it.
 * 
 * Note -> Use brackets in infix expression for indicating precedence. Check
 * sample input output for more details.
 * Input Format
 * Input is managed for you
 * Output Format
 * value, a number
 * infix
 * prefix
 * Question Video
 * 
 * COMMENTConstraints
 * 1. Expression is a valid postfix expression
 * 2. The only operators used are +, -, *, /
 * 3. All operands are single digit numbers.
 * Sample Input
 * 264*8/+3-
 * Sample Output
 * 2
 * ((2+((6*4)/8))-3)
 * -+2/*6483
 */

 import java.io.*;
import java.util.*;



public class Main {
     public static boolean isOptr(char ch){
        if(ch =='-' || ch =='/' || ch == '*' || ch =='+'){
            return true;
        }else{
            return false;
        }
     }


     public static int evaluateValues(int v1 , int v2 , char optr){
         if(optr =='+'){
            return v1+v2;
         }else if(optr =='-'){
            return v1-v2;
         }else if(optr =='/'){
            return v1/v2;
         }else if(optr =='*'){
            return v1*v2;
         }else{
            return 0;
         }

     }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
       Stack<Integer> evaluate =  new Stack<>();
       Stack<String> infix = new Stack<>();
       Stack<String> preFix = new Stack<>();

       for(int i=0; i<exp.length(); i++){
                 char ch = exp.charAt(i);

                 if(!isOptr(ch)){
                    evaluate.push(ch -'0'); // covert to num
                    infix.push(ch + ""); // covert to string
                    preFix.push(Character.toString(ch)); // covert to string
                 }else if(isOptr(ch)){
                    int evaluateV2 = evaluate.pop();
                    int evaluateV1 = evaluate.pop();
                    int evaluateAns = evaluateValues(evaluateV1, evaluateV2, ch);
                    evaluate.push(evaluateAns);


                    String infixV2 = infix.pop();
                    String infixV1 = infix.pop();
                   String infixAns = ('(' + infixV1 + ch + infixV2 + ')');
                   infix.push(infixAns);

                    String preFixV2 = preFix.pop();
                    String preFixV1 = preFix.pop();
                    String preFixAns  = ch + preFixV1 + preFixV2;
                    preFix.push(preFixAns);
                    
                 }
       }
       System.out.println(evaluate.peek());
       System.out.println(infix.peek());
       System.out.println(preFix.peek());
    }
}