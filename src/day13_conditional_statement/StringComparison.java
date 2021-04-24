package day13_conditional_statement;

public class StringComparison {
    public static void main(String[] args) {
        //1) using == operator, String city = "fairfax"; print "it is fairfax";   // 2) using equals() method /function, String city = "Los Angeles"; if(city.equals("Los Angeles')) {
        // print " it is LA".
        String city = "Los Angeles";
        if(city.equals("Los Angeles")){
            System.out.println("It is LA");
        } else {
            System.out.println("It is not LA");
        }

        String weather = "sunny";
        if(weather.equals("sunny")) {
            System.out.println("lets go out and drink some hot coffee");
        } else {
            System.out.println("Otherwise lets drive far away");
        }















































    }

}
