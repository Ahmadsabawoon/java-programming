package day14_multi_brach_if_statement;

public class DayActivity {
    public static void main(String[] args) {
        System.out.println("Lets decide what we are going to done in different weathers");
        String weather = "snowy";
        if (weather.equals("sunny")) {
            System.out.println(weather +" - Go to park and hiking and coding java");
        }else if(weather.equals("rainy")) {
            System.out.println(weather +" - stay home, drink tea, code java");
        } else if(weather.equals("snowy")) {
            System.out.println(weather +"- clean the car and than build snow man, drink hot chocolate and code java");
        } else if (weather.equals(weather +"windy")) {
            System.out.println("- get ready for power loss and code java");
        }
        System.out.println("just keep coding java");

    }
}
