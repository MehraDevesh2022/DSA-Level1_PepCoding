import java.io.*;
import java.util.*;

public class Main5 {
    public static boolean isPalindrom(String str){
       int i =0;
       int j= str.length()-1;
       while(i<=j){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
        

    }

    public static void subString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                String Substr = str.substring(i , j+1);
               if(isPalindrom(Substr)){
                  System.out.println(Substr);
               }
            }
        }
    }
    public static void solution(String str) {
       subString(str);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}