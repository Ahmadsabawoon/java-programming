package day_22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
       /*
       String technologies = "java, html, css, selenium, testng, maven, cucumber";
        */

        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));  // first comma
        System.out.println(technologies.lastIndexOf(",")); // last comma
        // for middle one , we need loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);
        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at the index " + idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at the index " + indexOfCucumber);

        int indexOfSQl = technologies.indexOf("SQL");

        System.out.println("SQL is at the index " + indexOfSQl);



        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

        if(technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }













    }
}
