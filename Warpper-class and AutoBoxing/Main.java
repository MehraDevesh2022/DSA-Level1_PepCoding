// Wrapper-class ==> for obtain pure oops beaviour java create wrapper class.
//  Intger , Float , Character , String  , Float etc
// Wrapper class store => either value or by default null.
 // eg : int x= 3; int x; // x=0 by default.
 //      Integer x =3; and Integer x ; where   x is null bydefault
 
 
 // Autoboxing eg :

 public class Main{
    public static void main(String[] args) {
        int arr[] =new int[5]; // primtive array store 0 by default
        Integer WraperArr[] = new Integer[5]; // wrapper class null stores by default


        // Wrapper array print :
        for(Integer ele : WraperArr){
            System.out.print(ele + " ");  // output : null null null null null
        }
    
        // primtive Array print :
        for(int ele : arr){
            System.out.print(ele + " "); // output : 0 0 0 0 0
        }
           
 
        

         for(int ele : WraperArr) {
             System.out.print(ele + " "); // output : error , NullPointerException (because int only store int type value but WrappeArr have null value by defalut)
         }


         // Now Autoboxing Eg :==> jab koi data type automatically dusre data type main change ho jaye use autboxing kehete hai
         for(Integer ele : arr) {    //This is exapmle of Autoboxing here Integer class data type storing primtive type arr data
             System.out.print(ele + " "); // output : 0 0 0 0 0
         }


    }
 }


