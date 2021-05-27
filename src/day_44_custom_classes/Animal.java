package day_44_custom_classes;

public class Animal {

    String type = "some animal";           // this is variable

    public void eat() {                 // this is behavior

        System.out.println("eating");
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    public void speak () {
        System.out.println("speaking");
    }

    public void speak(String speaking) {
        System.out.println("speaking " + speaking);
    }
    public void drink() {
        System.out.println("drink");
    }
    public void drink(String drinking) {
        System.out.println("Cheetah drinking " + drinking);
    }
}

