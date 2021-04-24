package day18_condition_practice_strings_intro;

public class SeasonFinder {
    public static void main(String[] args) {
        // winter = 12;   // 1,2
        // Spring = 3; // 3,
        int month = 2;

        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Winter");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("summer");
            case 8:
            case 9:
            case 10:
                System.out.println("fall");
                break;
            case 11:
            case 12:
                System.out.println("Spring");
            default:
                System.out.println("Invalid month" + month);
                /*
                 * Winter: 12,1,2
                 * Spring: 3,4,5
                 * Summer: 6,7,8
                 * Fall:   9,10,11
                 */
//                public static void main(String[] args){
//                int month = 7;
//                if (month == 12 month == 1 month == 2){
//                    System.out.println("Winter");
//                }else if (month == 3 month == 4 month == 5){
//                    System.out.println("Spring");
//                }
//
//                switch (month) {
//                    case 12:
//                        System.out.println("Winter");
//                        break;
//                    case 1:
//                        System.out.println("Winter");
//                        break;
//                    case 2:
//                        System.out.println("Winter");
//                        break;
//                }
//                //OR LOGIC WITH SWITCH



            }


}




    }

