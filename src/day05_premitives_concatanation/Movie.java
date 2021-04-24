package day05_premitives_concatanation;

public class Movie {
    public static void main(String[] args) {
        String Name = "Titanic movie";
        String Genre = "Romantic Movie";
        String Duration = " 3 Hours";
        String ReleaseDate = "December 19,1997";
        char Rating = 'R';
        boolean isASequelsOrNot = true;
        String Writer = "James Cameron";



        System.out.println("------------- Welcome to Cinema ------------" );
        System.out.print("Tonight we are streaming " + Name+ "  which was released on " + ReleaseDate+".");
        System.out.println("This "+ Genre+" got a "+Rating+" Rating  in rotten tomatoes.");
        System.out.println("The ratting is 90 out of 100 rating on Rottent tomatoes.");
        System.out.println("This is a sequel " +isASequelsOrNot+" and is on DVD player.");
        System.out.println("The duration of this movies is"+Duration+".");
        System.out.println("The writer of this movie is "+Writer+".");











    }
}
