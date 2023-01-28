/*
 * Perfect Friends
 * Easy Prev Next
 * 1. You are given a number n (representing the number of students). Each
 * student will have an id
 * from 0 to n - 1.
 * 2. You are given a number k (representing the number of clubs)
 * 3. In the next k lines, two numbers are given separated by a space. The
 * numbers are ids of
 * students belonging to same club.
 * 4. You have to find in how many ways can we select a pair of students such
 * that both students are
 * from different clubs.
 * Input Format
 * Input has been managed for you
 * Output Format
 * Check the sample output
 * Question Video
 * 
 * COMMENTConstraints
 * None
 * Sample Input
 * 7
 * 5
 * 0 1
 * 2 3
 * 4 5
 * 5 6
 * 4 6
 * Sample Output
 * 16
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here

        // create a graph
        // find component using getConnected
        // count length of each arrayList and add them
    }

}