package day_43_list_custom_classes;
// firstName, age

public class Person {
    char gender;
    String firsName;
    int age;
    // behavior -> method
    public void speak(){
        System.out.println("person is speaking");
    }
}


class people { // class for running with main method
    public static void main(String[] args) {
        // creat object of person class - Instantiate person class
      Person person1 = new Person();
      person1.firsName = "Bob";
      person1.age = 33;
      person1.gender = 'M';
      System.out.println(person1.firsName);
      System.out.println(person1.age);
      System.out.println(person1.gender);
      person1.speak();



        Person person2 = new Person();
        person2.firsName = "Ahmad";
        person2.age =  29;
        person2.gender ='F';
        System.out.println(person2.firsName);
        System.out.println(person2.age);
        System.out.println(person2.gender);
        person2.speak();
        System.out.println("person1 = " + person1);

    }
}