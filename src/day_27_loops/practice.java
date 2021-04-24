package day_27_loops;

public class practice {
    public static void main(String[] args) {
        //String s1 = "abcdefg";
       // String s2 = "" + s1.charAt(0) + s1.charAt(s1.length()-1);
        //System.out.println(s2);
        /*
        String word = "github";
        char letter = 'u';
        int index = -1;
       for (int i = 0; i< word.length()-1; i++){
           if(word.charAt(i) == letter){
               index = i;
               System.out.println(letter + " is found at index " + index);
           }
        }
       if(index == -1){
           System.out.println(letter + " is not present");
       }
         */
            /*
        String word = "jaaavvaa";

if 2 side by side characters match: signal beep - a
aa -> beep - a
vv -> beep - v
aa -> beep - a
         */

        String word = "jaaavvaa";
        for(int index = 0; index< word.length()-1; index++){
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
            if(word.charAt(index) == word.charAt(index+1)){
                System.out.println("beep - " + word.charAt(index));
            }
        }




    }

}
