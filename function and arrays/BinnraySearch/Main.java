import java.util.Scanner;
// Binary Search


public class Main {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         // array of n size
        int a[] = new int[n];
         // taking elements of array
        for(int i=0; i<n ; i++)
        {
            a[i] = scn.nextInt();
        }
         // element of an array
         int val = scn.nextInt();
         BinarySearch(a , val);

    }
    public static void BinarySearch(int a[] , int val)
    {
        int j = a.length-1;
        int i = 0 ;
        int mid =0;
        while(i<=j)
        {
            mid = (i + j)/2;
            if(a[mid] == val)
            {
                System.out.println(mid);
                break;
            }
            else if(a[mid] < val)
            {
                i = mid +1;
            }
            else if(a[mid] > val)
            {
                j = mid -1;
            }
        }
    }

}