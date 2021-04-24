package day_35_methods_with_param;

public class Email {
    public static void main(String[] args) {
buildEmail("seyarkhan143", "gmail");
    }
    public static void buildEmail(String name, String domain){
        // String email = name + "@" + domain + ".com";
        //System.out.print(email);
        System.out.println("My Email Adress is : " + name+ "@"+ domain + ".com");
        // name = name.replace(" ","_").toLowerCase();
    }
}
