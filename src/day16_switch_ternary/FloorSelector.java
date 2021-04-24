package day16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {
       int floorNum = 1;

        if(floorNum == 1) {
            System.out.println("Floor 1 selected. comanies: Lobby, Verzion, Starbucks");
        }else if (floorNum == 2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");

        } else if(floorNum == 3){
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }


        System.out.println("================== Switch Statement Version ========================");

        floorNum =1;
        switch(floorNum) {
            case 1:
                System.out.println("Floor 1 selected. comanies: Lobby, Verzion, Starbucks");
               break;  // Exit the switch statement
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            break;
            default:
                System.out.println("Invalid floor - " + floorNum);







        }



































    }
}
