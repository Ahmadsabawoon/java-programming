package day14_multi_brach_if_statement;

public class YesOrNo {
    public static void main(String[] args) {
    System.out.println("Are you sure you want to delete this file");
    char selection = 'y';
    boolean answer;
    String result;

    if (selection == 'y'){
        System.out.println("your file will be deleted");
        answer = true;
        result = "deleted";
    } else {
        System.out.println("file deletion canceled");
        answer = false;
        result = "not deleted";
    }
        System.out.println("Did the file deleted? - " + answer );
        System.out.println("Did the file deleted? - " + result );





    }
}
