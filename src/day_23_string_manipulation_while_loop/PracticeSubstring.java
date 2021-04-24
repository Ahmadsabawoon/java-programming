package day_23_string_manipulation_while_loop;

public class PracticeSubstring {
    public static void main(String[] args) {
         String message  = "Sender: [Erfan Khan sabawoon] from number <+12223334444>, message:{Hello, lets code some java}";

       int start = message.indexOf("[");
       int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1,end);
        System.out.println("sender = " + sender);

       String phoneNumber = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("phoneNumber = " + phoneNumber);
        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);























    }


}
