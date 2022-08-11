import java.io.*;
import java.util.*;

public class str {

	public static String compression1(String str){
	      StringBuilder sb = new StringBuilder();
          char curr = str.charAt(0);
	       sb.append(curr);
           for(int i=1; i<str.length(); i++){
            curr = str.charAt(i);
            char prv = str.charAt(i-1);
            if(curr != prv){
                sb.append(curr);
            }
           }

		return sb.toString();
	}

	public static String compression2(String str){
	 
        StringBuilder sb = new StringBuilder();
        char curr = str.charAt(0);
        sb.append(curr);
        int count =1;
        for (int i = 1; i < str.length(); i++) {
            curr = str.charAt(i);
            char prv = str.charAt(i -1);
             if(curr == prv){
                count++;
             }
             else{
                if(count > 1){
                    sb.append(count);
                }
                sb.append(curr);
                count =1;
             }
        }
          if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}