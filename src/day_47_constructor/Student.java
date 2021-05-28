package day_47_constructor;


public class Student {
    // No_args constructor
    private String name;
    private int age;

    public Student() {
        System.out.println("No_ Args constructor");
    }


    // constructor with 1 param: String name

    public Student(String name) {
        System.out.println("name param constructor | name = " + name);
    }
        // Constructor with age
        public Student(int age) {
            System.out.println("age param constructor | age =  " + age);
        }
        // Constructor with name and age

        public Student(String name, int age) {
            System.out.println("name/age param constructor | name  =  " +name  + "-" + age);
        }
    }

