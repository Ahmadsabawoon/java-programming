package day19_class_vs_object_string;

public class LengthOfString {
    public static void main(String[] args) {
        String name = "Ahmad";
        System.out.println(name.length());
        System.out.println(name.length());
        System.out.println("Ahmadisagreatguy".length());
        System.out.println("count: " + name.length());

        String lastName = "Sabawoon";
        System.out.println(lastName + " - " + lastName.length() + " characters");

       int count =lastName.length();
        System.out.println("count = " + count);

        String password = "abc12";
        if( password.length() >= 6){
            System.out.println("Valid Amazon Password");
        } else{
            System.out.println("password must be at least 6 character.");
        }

        String country = "Belize";
        System.out.println(country.length());

        String text = "java";
        System.out.println("please enter the text:");
        System.out.println("Length is: " + text.length());

























    }
}
