/*  
  "You can either experience the pain of discipline or the pain of regret. The choice is yours."
~ Eleanor Roosevelt           

 * Infix Conversions
 * Easy Prev Next
 * 1. You are given an infix expression.
 * 2. You are required to convert it to postfix and print it.
 * 3. You are required to convert it to prefix and print it.
 * Input Format
 * Input is managed for you
 * Output Format
 * postfix
 * prefix
 * Question Video
 * 
 * COMMENTConstraints
 * 1. Expression is balanced
 * 2. The only operators used are +, -, *, /
 * 3. Opening and closing brackets - () - are used to impact precedence of
 * operations
 * 4. + and - have equal precedence which is less than * and /. * and / also
 * have equal precedence.
 * 5. In two operators of equal precedence give preference to the one on left.
 * 6. All operands are single digit numbers.
 * Sample Input
 * a*(b-c+d)/e
 */

 import java.io.*;
import java.util.*;



public class Main {

   public static int precedence(char optr){
      if(optr =='+' || optr =='-'){
        return 1;
      }else{   
        return 2;     
      }
   }

   public static boolean isOptr(char ch){
     if(ch == '*' || ch == '+' || ch =='-' || ch=='/'){
        return true;
     }else{
       return false;
     }
   }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
            Stack<Character> Optr = new Stack<>();
            Stack<String> postFix = new Stack<>();  // works => v1v2 + optr
            Stack<String> priFix = new Stack<>();   // wroks => optr + v1v2
            for(int i=0; i<exp.length(); i++){
                 char ch = exp.charAt(i);
                 if(ch =='('){
                    Optr.push(ch);
                 }
                 else if(!isOptr(ch) && ch !='(' && ch !=')'){
                      postFix.push(Character.toString(ch)); // value is char type and stack is String type
                      priFix.push(Character.toString(ch));
                   }
                   else if(isOptr(ch)){
                     while(Optr.size() != 0 && Optr.peek() !='(' && precedence(Optr.peek()) >= precedence(ch)){
                               String postFixV2 = postFix.pop();
                               String postFixV1 = postFix.pop();

                               String priFixV2 = priFix.pop();
                               String priFixV1 = priFix.pop();

                               char currOptr = Optr.pop();
                               // post fix => v1v2 + optr
                               String postExprAns =  postFixV1 + postFixV2 + currOptr;
                              // prefix ==> optr +  v1v2
                               String priExprAns =   currOptr + priFixV1 + priFixV2;
                                
                               postFix.push(postExprAns);
                               priFix.push(priExprAns);


                     }
                        Optr.push(ch);
                   }
                   else if(ch ==')'){
                        while(Optr.peek() !='('){
                             String postFixV2 = postFix.pop();
                            String postFixV1 = postFix.pop();

                            String priFixV2 = priFix.pop();
                            String priFixV1 = priFix.pop();

                            char currOptr = Optr.pop();

                            String postExprAns = postFixV1 + postFixV2 + currOptr;
                            String priExprAns = currOptr + priFixV1 + priFixV2;

                            postFix.push(postExprAns);
                            priFix.push(priExprAns);
                        }
                        Optr.pop();
                   }
            }

            while(Optr.size() !=0){
                String postFixV2 = postFix.pop();
                String postFixV1 = postFix.pop();

                String priFixV2 = priFix.pop();
                String priFixV1 = priFix.pop();

                char currOptr = Optr.pop();

                String postExprAns = postFixV1 + postFixV2 + currOptr;
                String priExprAns = currOptr + priFixV1 + priFixV2;

                postFix.push(postExprAns);
                priFix.push(priExprAns);
            }
            System.out.println(postFix.peek());
            System.out.println(priFix.peek());
    }
}