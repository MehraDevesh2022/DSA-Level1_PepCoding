import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n  = scn.nextInt();
        int val  = scn.nextInt();
        int result = DigitFrequency(n,val);
        System.out.println(result);

    }
    public static int DigitFrequency(int n , int val)
    {  int num=0;
        while(n !=0)
        {
            int rem =n%10;
            n=n/10;
            if(rem==val)
            {
                num++;
            }
        }
        return num;
    }
}