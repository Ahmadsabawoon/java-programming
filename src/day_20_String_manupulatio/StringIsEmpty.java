package day_20_String_manupulatio;

public class StringIsEmpty {
    public static void main(String[] args) {

       String JobTitle = "";
        System.out.println(JobTitle.isEmpty());
        System.out.println(JobTitle.equals(""));
        System.out.println(JobTitle.length());
        System.out.println(JobTitle.length() == 0);


      if(JobTitle.isEmpty()) {
          System.out.println("Job title is missing, please resend");
      }else {
          System.out.println("Jon title is looks good");
      }


      if(JobTitle.length() == 0) {
          System.out.println("job title is empty");
      }else {
          System.out.println("job title is not empty");
      }
        System.out.println(JobTitle.equals(" "));

      if("".equals(JobTitle)) {
          System.out.println("");
      }

      String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());




        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        System.out.println(veggie.length());
        // if veggie is not empty , print we have carrots
        if(!veggie.isEmpty());
        System.out.println("We have " + veggie);


        String word2;
        // System.out.println(word2.isEmpty()); // not initialized and string not assigned and declared




















    }
}
