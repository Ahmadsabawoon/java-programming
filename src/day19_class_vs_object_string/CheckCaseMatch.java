package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";
        //"usa"            ==                  "USA"
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("pass - case is correct");
        } else{
            System.out.println("fail - case is incorrect");
        }


        String word = "JAVA";
        String uWord = word.toUpperCase();

        System.out.println(word);
        System.out.println(uWord);

        if(word.equals(uWord)) {
            System.out.println("case match");
        }else{
            System.out.println("case mismatch");
        }














    }
}
