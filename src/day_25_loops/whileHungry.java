package day_25_loops;

public class whileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int banana = 0;
        int countToFull = 3;
        while(isHungry){                     // isHungry = bananas == countToFull? false : true;   Ternary
            banana++;
            System.out.println("Eating banana: " + banana);

            if(banana == countToFull){
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, lets get back to studies");













    }
}
