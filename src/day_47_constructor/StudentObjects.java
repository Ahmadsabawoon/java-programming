package day_47_constructor;

public class StudentObjects {
    public static void main(String[] args) {

        Student st1 = new Student(); // runs no-args constructor
        Student st2 = new Student(); // runs no-args constructor

        Student st3 = new Student("Ahmad");
        Student st4 = new Student("Abbass");


        Student st5 = new Student("Ahmad", 29);


    }
}
