package practice_03_02_2021;
/*
Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information

    - Challenge : print your name in a cool way (unicode)
    - challenge : char star
 */
public class PersonInfo {
    public static void main(String[] args) {
        // variables

        String name;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasonsInYourArea;
        double birthDate;
        int year;
        String fullBirthdayDateWithYear;
        String favoriteQuotes;

        // assigment for data
        name = "Ahmad Sabawoon";
        age = 28;
        gender = 'M';
        student = true;
        numberOfSiblings = 0;
        favoriteNumber = 13;
        numberOfSeasonsInYourArea = 4;
        birthDate = 09.28;
        year = 1993;
       // fullBirthdayDateWithYear ="09.28.1993";
        fullBirthdayDateWithYear = "" + birthDate + "." +year;
        favoriteQuotes = "I love You";
        System.out.println("Name = " + name);
        System.out.println("age= " + age);
        System.out.println("favoriteQuotes = " + favoriteQuotes);
        System.out.println("gender = " + gender);
        System.out.println("student = " + true);
        System.out.println("Number Of Siblings = " + numberOfSiblings);
        System.out.println("Number of seasons in your area = " + numberOfSeasonsInYourArea);
        System.out.println("Birthdate = " + birthDate);
        System.out.println("Year = " + year);
        System.out.println("full birth date with year" + fullBirthdayDateWithYear);









    }
}
