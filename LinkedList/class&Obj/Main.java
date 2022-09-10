public class Main {

    // student class template :
    public static class student{
    
    // data member :
    String name; // deafult vaule is null
    int Class; // deafult 0
    int  rollNum; // deafult 0

    //default constructor : automatically declare by compiler if not write by us
        student() {

        }

        // parameterized constructor : which contructor have param as args. build by
        // user made one more in same class with diffrent param as the use case
        student(String name) {
            this.name = name; // this keyword refers to object who is using class tamplate for diff btwn
                              // parametre and data member
        }

        // parameterized constructor
        student(String name, int Class, int rollNum) {
            this.name = name;
            this.Class = Class;
            this.rollNum = rollNum;

        }

    }

  public static void main(String[] args) {
    // this called instance of student class : 
  student Mr_nobody = new student("Nobody" , 10 , 17); //object cretade with parameter value (used in paramterized contructor)
  student ravi = new student("Ravi shrivastava" , 10 , 33); // using new keyword memory alocated at heap for ravi as student type object 
  student class_Monitor  = ravi;  // class_Monitor is nothing but refrence variable for ravi. and class_Monitor not consiuming any momoey on the heap bcz ravi is monitor of the class its alreday reseverd the memory
  student mohan  = new student(); // with default constructor passing no ags.
// how to access and assign value =>
  
  mohan.name = "mohan";
  mohan.Class = 10;
  mohan.rollNum = 27;
 
  System.out.println(mohan.name);
  System.out.println(mohan.Class);
  System.out.println(mohan.rollNum);


  // class monitor
  System.out.println(class_Monitor.rollNum);
  System.out.println(class_Monitor.name);
  
  // Mr_nobody
  System.out.println(Mr_nobody.name);
  System.out.println(Mr_nobody.Class);
  Mr_nobody.Class =12; // he is promoted bcz he is like itachi  
  System.out.println(Mr_nobody.Class);




  }

}
