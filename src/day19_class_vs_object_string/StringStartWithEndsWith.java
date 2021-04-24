package day19_class_vs_object_string;

public class StringStartWithEndsWith {
    public static void main(String[] args) {
      // its is case sensitive comparison
        // startWith
        String word = "Love";
        System.out.println(word.startsWith(("Lov")));  // true
        System.out.println(word.startsWith("Love idea"));
        System.out.println(word.startsWith("L"));
        System.out.println(word.startsWith("Lo"));


        // endsWith
        String country = "Afghanistan";
        System.out.println(country.endsWith("tan"));
        System.out.println(country.endsWith("Afghanistan idea "));

        String name = "Irina";
        if (name.endsWith("a")) {
            System.out.println("Maybe, it is a female name");
        }
        /**
         * Mr.  -> Man
         * Dr. ->  Doctor
         * Mrs. -> Married woman
         * Ms. -> Single woman
         * Sr -> senior
         */

        String firstname = "Dr.Ahmad";
        if(firstname.startsWith("Mr.")) {
            System.out.println("Man");
        } else  if(firstname.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if(firstname.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if(firstname.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if(firstname.startsWith("Sr.")) {
            System.out.println("Senior");

        } else{
            System.out.println("Correct information not selected yet");
        }

        /**
         * String url = "https://www.stackoverflow.com
         * .com"commercial website
         * .ru " russian website
         * .gov " governemt
         * edu "  eduction website
         */


        String url = "https://www.stackoverflow.com" ;

        if(url.endsWith(".com")) {
            System.out.println("commercial website");
        } else  if(url.endsWith(".ru")) {
            System.out.println("russian website");
        } else if(url.endsWith(".gov ")) {
            System.out.println("Mrs.");
        } else if(url.endsWith(".edu ")) {
            System.out.println("eduction website ");
        } else if(url.endsWith(".org")) {
            System.out.println("organization website");

        } else{
            System.out.println("Correct information not selected yet");
        }


    }
}
