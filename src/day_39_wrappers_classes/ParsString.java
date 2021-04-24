package day_39_wrappers_classes;

public class ParsString {
    public static void main(String[] args) {
        String setPrice = "345";
        int price = Integer.parseInt(setPrice);
        System.out.println(price);

        String count = "345.56";
        double counting = Double.parseDouble(count);
        System.out.println(counting);

        String strPrice = "123.5";
        double price1 = Double.parseDouble(strPrice);
         if (price1 > 100) {
             System.out.println("expensive");
         }
         String sentence = "I wrote 100 lines of code";
         // split by space , parse index 2 to int
       String[] arr =  sentence.split(" ");
       int linesOfCode = Integer.parseInt(arr[2]);
        System.out.println(linesOfCode);




    }


}
