package day17_ternary_nested_condition;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 88;

        String result = (score > 60) ? "pass" : "fail";
        System.out.println("result = " + result);
        
        String quality = "good";
        System.out.println(quality.equals("good") ? 100 : 0);
        int rating = quality.equals("good") ? 100 : 0;
        System.out.println("rating = " + rating);
        
        int score3 = 100;
       
       // if(score > 90) {
        //    grade = 'A';
     //   }else{
            //grade = 'B';
      //  }





         char grade = (score3 > 100) ? 'A' : 'B';
        System.out.println("grade = " + grade);
         



































    }
}
