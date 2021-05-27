package day_44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.type); // some animals

        animal.eat("grass");
        animal.speak("speak");
        // create new Animal object cheetahObj

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";  // change value to cheetah and we are reassign
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
        cheetahObj.drink("juise");





    }
}
