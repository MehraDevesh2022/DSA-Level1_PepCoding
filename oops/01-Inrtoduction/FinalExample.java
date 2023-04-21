public class FinalExample {
    public static void main(String[] args) {
        // wraper class => use primtive as object like int as Integer

        int a = 10;
        int b = 4;
        Integer x = 10;
        Integer y = 20; // this is the obejct of it
        // now we can use x as an obejct and we can also use all object methos as well.

        swap2(a, b); // not effected with originals

        swap(x, y); // these are also not modified even after pass by refence bcz of obj just bcz
                    // inside wrapper classes define with final =>[public final class Integer
                    // extends Number]

        final int bonus = 2;
        // bonus = 3; // error : cannot assign a value to final variable bonus

        // awlways initialized while declare
        final int bonus2; // error: variable bonus2 might not have been initialized

        final Student devesh = new Student("dev");
        devesh.name = "other name"; // value can modifeid with obj with final

        Student mehra = new Student("x");
        // reasign not allowed
        // devesh = mehra; // error : cannot assign a value to final variable devesh

        // exmaple for finlized() methdod whiel value garbej collcted by jvm

        Student obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new Student("hello world");
        }

    }

    // java with obejct alway passes reference despite it value will not swap here .
    // bcz all wraper class decalred using final keyword. final works like same as
    // const in js. for primtvie types its totaly imutable. but obj value can change
    // but not reasigned with other object or ther reference
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    // value will not swap in orirginal args bcz java not works on pointer
    static void swap2(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    class Student {
        final int num = 10;
        String name;

        public Student(String name) {
            // System.out.println("object created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
}