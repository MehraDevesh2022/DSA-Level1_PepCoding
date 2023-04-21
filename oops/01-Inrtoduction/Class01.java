import java.util.*;

public class Class01 {
    public static void main(String[] args) {

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // instaed of this just make Student class own data type or you can say templet
        // for student
        Student[] students = new Student[5]; // student type array whre student has all propties name , rno , marks for
                                             // state and function for state change

        // just declaring
        // Student devesh; // memory created at stack not in heap
        // devesh = new Student(); //memory created at heap using new Keyword

        // ! we can use access inatnce variables and functionusing . dot operator
        // devesh.changeName("Shoe lover");
        // devesh.greeting();

        Student devesh = new Student(15, "devesh", 85.4f);

        System.out.println(devesh.rno);
        System.out.println(devesh.name);
        System.out.println(devesh.marks);

        // this is how we can use other student data with new student
        Student random = new Student(devesh); // (Student other) will acess in calss
        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);

        // call one constructor to other
        Student one = new Student();
        System.out.println(one.name);
        System.out.println(one.rno);
        System.out.println(one.marks);

        // ! out put for this =>
        // default person
        // 13
        // 100.0
        Student two = one; // two is pointing to the same obejct as like one

    }

    // create a class
    // for every single student
    public static class Student {
        int rno;
        String name;
        float marks = 90;

        // this keyword => this keyword refering to intsance of Student class or you can
        // say its behave like refernce variable of object that is created using Student
        // class. in our case devesh is a student and thsi referes to devesh
        void greeting() {
            System.out.println("Hello! My name is " + this.name);
        }

        void changeName(String name) {
            this.name = name;
        }

        // Student arpit = new Student(17, "Arpit", 89.7f);
        // here, this will be replaced with arpit
        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;

        }

        // this how we can use other object data with new object. other is object passed
        // witj constructor while called
        Student(Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        // default constructor
        // this is how you call a constructor from another constructor
        Student() {
            // internally: new Student (13, "default person", 100.0f);
            // here this is pointing a constructor who takes three paramtere as args
            this(13, "default person", 100.0f); // these are the deafult value passed from here
        }
    }
}