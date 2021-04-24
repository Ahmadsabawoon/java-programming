package day_23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {

       // String message  = "Sender: [Nadir] from number <+12223334444>";
       // String sender, mobile, text;
        // message:{Hello, lets code some java}";

        String message = "Sender: [ Saim ] From Number<1112223366> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end).trim());
        String sender = message.substring(start+1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring( message.indexOf("<")+1, message.indexOf(">") );
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        // next statement

        System.out.println(" Fikret ".trim());

        // next statement

        sender = sender.trim();
        if(sender.equals("Saim")) {
            System.out.println("Message from Saim about quiz");
        }else{
            System.out.println("Someone else message");
        }



    }
}
