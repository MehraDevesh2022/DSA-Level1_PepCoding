// Pythagorean Triplet
// Easy

// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.

// Constraints
// 1 <= a <= 10^9
// 1 <= b <= 10^9
// 1 <= c <= 10^9

// Format
// Input
// a, an integer
// b, an integer
// c, an integer

// Output
// true if the numbers form a pythagorean triplet and false otherwise

// Example
// Sample Input

// 5 3 4

// Sample Output
// true



import java.util.*;
  
  public class Main {
  
  	  public static void main(String[] args) {
  	  	Scanner scn = new Scanner(System.in);
			int a= scn.nextInt();
			int b= scn.nextInt();
			int c= scn.nextInt();
			if(a>b && a>c)
			{
				if(a*a == b*b + c*c)
				{
					System.out.println(true);
				}
				else{
					System.out.println(false);
				}
			}
			else if(b>a && b>c)
			{
				if(b*b == a*a + c*c)
				{
					System.out.println(true);
				}
				else{
					System.out.println(false);
				}

			}
			else{
				if(c*c == b*b + a*a)
				{
					System.out.println(true);
				}
				else{
					System.out.println(false);
				}
			}
			
  	  }
  }
