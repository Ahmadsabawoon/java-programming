package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "kabul";
        System.out.println(city.equals("kabul")); // true
        System.out.println(city.equals("Kabul")); // false
        System.out.println(city.equals("KABUL")); // false

        // Equals Ignore Case - method case insensitive comparison.
        System.out.println(city.equalsIgnoreCase("kabul")); // true
        System.out.println(city.equalsIgnoreCase("KABUL")); // true
        System.out.println(city.equalsIgnoreCase("Kabul")); // true
        System.out.println(city.equalsIgnoreCase("Kabuul")); // false
        System.out.println(city.equalsIgnoreCase("K a bul")); // false
        System.out.println(city.equalsIgnoreCase("Afghanistan"));

        if(city.equals("kabul")){
            System.out.println("equal() true");
        } else{
            System.out.println("equal() false");
        }
        if(city.equalsIgnoreCase("KABUL")) {
            System.out.println("equalIgnoreCase() true");
        }else{
            System.out.println("equalIgnoreCase () false");
        }

    }
}
