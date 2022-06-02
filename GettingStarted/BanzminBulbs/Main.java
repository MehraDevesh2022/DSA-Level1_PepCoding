/*
The Curious Case Of Benjamin Bulbs
Easy  Prev   Next
1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
2. Take as input a number n, representing the number of bulbs.
3. Print all the bulbs that will be on after the nth fluctuation in voltage.
Input Format
n, an integer
Output Format
b1 b2 b3 b4 .. all bulbs that will be on after nth wave
Question Video

  COMMENTConstraints
2 <= n < 10^9
Sample Input
6
Sample Output
1
4

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        
        for(int i=1; i*i<=n; i++ ) // for perfect sqr number only
        {
            System.out.println(i*i); // all perfect sqr  has odd number of factor others have even number factor in this qustion every odd time of travel bulb is on and even factor number is off 
        }
    }
    
}
