package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Tampa";

        if (city.equals("Moscow") || city.equals("Tampa") ) {
            System.out.println("Willing to relocate to - " + city);
        } else {
            System.out.println("Not considering - " + city);
        }
        String teacher = "saim";
        // saim,Murodi -> it is a java class with saim
        // otehrwise -> soft skills class with nadir
        if(teacher.equals("saim") || teacher.equals("Murodil")) {
            System.out.println(" It is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

        // 1- teacher saim or murodil -> it is a java class
        // 2- teacher Nadir -> soft skills class with
        // an other teacher -> some class with Gurhan/Akbar

        if (teacher.equals("saim") || teacher.equals("murodil")) {
            System.out.println("it is java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println(" Some other class with " + teacher);
        }

        // company - "Google", salary >= 100k
        String company = "Google";
        double salary = 85-000.0;
        if(company.equals("Google") || salary >= 100-00) {
            System.out.println("Accepting offer from company");
        } else {
            System.out.println("Rejecting offer from company");
        }




























    }
}
