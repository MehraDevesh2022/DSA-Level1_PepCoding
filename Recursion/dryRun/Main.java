import java.util.Scanner;
// this question for dryRun 
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        dryRun(n);
    }
    public static void dryRun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        dryRun(n-1);
        System.out.println(n);
        dryRun(n - 1);
        System.out.println(n);
    }
}
