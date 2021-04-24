package day_24_loops;

public class whileLoopsReverse {
    public static void main(String[] args) {


      int count = 5;
      while (count >= 0) {
          System.out.println("count = " + count);
          count--;
      }
        System.out.println("Finished the count");


       // Read each message 1 by 1 until you have 0 unread sms

      int unreadSMS = 10;
        System.out.println("I have totoal " + unreadSMS + " unread sms left");
              while(unreadSMS >= 0){
                  System.out.println("Reading SMS: "+ unreadSMS );
                  unreadSMS--;
              }
        System.out.println("No more unread SMS messages");




















    }
}
