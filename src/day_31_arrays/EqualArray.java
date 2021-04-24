package day_31_arrays;

import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {
        // if the method is same and also the length , we can use Arrays.equals
        int [] nums1 = {4, 12, 53};
        int [] nums2 = {4, 12, 53};
        System.out.println("num1 == num2 : " + Arrays.equals(nums1, nums2));

        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        System.out.println("num1 == num2 : " + Arrays.equals(nums1, nums2));



        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("car1 == car4 : " + Arrays.equals(cars1, cars4));
        System.out.println("car3 == car2 : " + Arrays.equals(cars3, cars2));
        System.out.println("car1 == car2 : " + Arrays.equals(cars1, cars2));


        if (Arrays.equals(cars3, cars2)) {
            System.out.println("car3 and car2 not matched");
        } else {
            System.out.println("car3 and car2 matched");
        }

        if(Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))) {
            System.out.println("cars2 == cars3 match - ignorecase");


        }


    }
}
