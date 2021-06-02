package day_49_static;

public class StaticTest {
    static String word = "java";

    public static void main(String[] args) {
        //1) Static method can only be called class name
        StaticMethod.displayMessage("Ahmad Sabawoon");
        // instance method needs an object to be called
       // StaticMethod.instanceMethod(); // ERROR and need object

        StaticMethod stm = new StaticMethod();
        stm.instanceMethod();

        //2) static method can only access other static variables and methods
        System.out.println(word);










    }
}
