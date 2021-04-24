package day_24_loops;

public class pracatice {
    public static void main(String[] args) {
        String message  = "Sender: [Erfan Khan sabawoon] from number <+12223334444>, message:{Hello, lets code some java}";
        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println(text);

        String phoneNumber = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println(phoneNumber);


        int start = message.indexOf("]")+2;
        int end = message.indexOf("<")-1;
        String result = message.substring(start, end);
        System.out.println(result);










    }
}
