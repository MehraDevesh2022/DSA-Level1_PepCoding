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
