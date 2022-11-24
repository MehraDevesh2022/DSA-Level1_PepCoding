import java.util.Stack;

/*
 * 20. Valid Parentheses
 * Easy
 * 
 * 16752
 * 
 * 862
 * 
 * Add to List
 * 
 * Share
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "()"
 * Output: true
 * Example 2:
 * 
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * 
 * Input: s = "(]"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 * 
 * 
 */


 class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
         for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            //add all opening brakets into the stack 
            if(ch == '(' || ch == '{' || ch =='['){
                 st.push(ch);
            }else{
               // if check is size zero of the stack only closing brakets remains or order is notproper so return false
         if(st.size() ==0){
            return false;
         }
         // check  when closing brakets arive then stack top elm must be the opening brakets if not that mean order is proper return false
         else if(ch ==')' && st.peek() != '('){
            return false;
         }
         // same for squre braket and curly brakets as well
         else if(ch == ']' && st.peek() != '['){
            return false;
         }
         else if(ch == '}' && st.peek() != '{'){
            return false;
         }    
         // if those all are condtion false that mean open and closing braktes are same and also order is also proper as well so rmove stack top elm check for next elm from String and stack 
              else{
                st.pop();
              }   

            }

         }
         // check all brakets are remove that mean order are proper for all brakets 
         return st.size()==0;
    }
}