import java.util.Scanner;

public class Str1{
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      //1 strimg with new keyword
      String str = new String("hello String");
      System.out.println(str);
      //2 string with asignment operator
      String name = str;
      System.out.println(name);
     
    }
}