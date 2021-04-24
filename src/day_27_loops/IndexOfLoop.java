package day_27_loops;

public class IndexOfLoop {
    public static void main(String[] args) {
        String word = "github";
        char letter = 't';
        int index = -1;
        for(int n = 0; n < word.length()-1; n++){
            if(word.charAt(n) == letter){
                index = word.indexOf(letter);   // index = n;
                System.out.println("letter (t) at " + word + " is in index = " + index);
            }

        }
        if (index == -1) {
            System.out.println(letter + " is not present");
        }






    }
}
