package day_38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
start();
continues();
end();
// call a method from other method
        // IQ : how to print 100 without loop

    }
    public static void start() {
        System.out.println("start");
        continues();
    }
    public static void continues(){
        System.out.println("continues");
        end();
    }
    public static void end(){
        System.out.println("ends");

    }
}
