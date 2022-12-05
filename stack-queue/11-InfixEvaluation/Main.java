/*
 * Infix Evaluation
 * Easy Prev Next
 * 1. You are given an infix expression.
 * 2. You are required to evaluate and print it's value.
 * Input Format
 * Input is managed for you
 * Output Format
 * Value of infix expression
 * Question Video         
 * 
 * COMMENTConstraints
 * 1. Expression is balanced
 * 2. The only operatorss used are +, -, *, /
 * 3. Opening and closing brackets - () - are used to impact precedence of
 * operations
 * 4. + and - have equal precedence which is less than * and /. * and / also
 * have equal precedence.
 * 5. In two operatorss of equal precedence give preference to the one on left.
 * 6. All operands are single digit numbers.
 * Sample Input
 * 2 + 6 * 4 / 8 - 3
 * Sample Output
 * 2
 */
import java.io.*;
import java.util.*;

public class Main {

    // is character function
    public static boolean isOptr(char ch) {
        if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
            return true;
        } else {
            return false;
        }
    }

    // check precedence :
    public static int precedence(char opr) {
        if (opr == '+' || opr == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    // calucation of airthmatic operation
    public static int calculateValue(int v1, int v2, char optr) {
        if (optr == '+') {
            return (v1 + v2);
        } else if (optr == '-') {
            return v1 - v2;
        } else if (optr == '*') {
            return v1 * v2;
        } else if (optr == '/') {
            return v1 / v2;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        // code

        Stack<Character> operators = new Stack<>();
        Stack<Integer> operends = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (ch >= '0' && ch <= '9') {
                operends.push(ch - '0');
            }

            else if (ch == ')') {
                while (operators.peek() != '(') {
                    char operaTor = operators.pop();
                    int v2 = operends.pop();
                    int v1 = operends.pop();
                    int ans = calculateValue(v1, v2, operaTor);
                    operends.push(ans);
                }
                operators.pop();
            }

            else if (isOptr(ch)) {
                while (operators.size() != 0 && operators.peek() != '('
                        && precedence(operators.peek()) >= precedence(ch)) {
                    char operaTor = operators.pop();
                    int v2 = operends.pop();
                    int v1 = operends.pop();
                    int ans = calculateValue(v1, v2, operaTor);
                    operends.push(ans);
                }
                operators.push(ch);
            }

        }
        while (operators.size() != 0) {
            char operaTor = operators.pop();
            int v2 = operends.pop();
            int v1 = operends.pop();
            int ans = calculateValue(v1, v2, operaTor);
            operends.push(ans);
        }
        System.out.println(operends.peek());
    }
}