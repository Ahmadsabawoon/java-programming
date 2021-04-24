package day19_class_vs_object_string;

public class practice {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String userName = "CYBERTEEK";
        String password = "abc123";

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("pass - user successfully logged in");
        }else{
            if(!expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
                System.out.println("Incorrect username");
            }else{
                System.out.println("Incorrect password");
            }
        }














    }

}
