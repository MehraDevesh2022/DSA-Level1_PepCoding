import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main(String[] args) {
    // Your code here
    Scanner scn = new Scanner(System.in);
    int side = scn.nextInt();
    side = side * side;
    System.out.println(side);

  }
}