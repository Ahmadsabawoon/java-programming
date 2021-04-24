package SelfStudyPractice;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        String [][] names = {{"Ahamd", "Sabawoon", "Seyarkhan", "Erfan Khan"},
                             {"Lima Rhamani", "Masih jan", "Aarash jan"}
        };

       for (String [] Rows : names){
           for (String Column : Rows){
               System.out.println(Column + " ");
               System.out.println(Arrays.deepToString(names));
           }
       }



















    }
}
