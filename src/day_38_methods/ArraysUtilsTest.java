package day_38_methods;

public class ArraysUtilsTest {
    public static void main(String[] args) {
    int [] nums = {5, 23, 1, 543,  90};

        ArraysUtils.printArrays(nums);
        ArraysUtils.printArrays(new int[]{23, 65, 44, 66, 90, 9987});
        System.out.println("Sum = " + ArraysUtils.sum(nums));
        System.out.println("Sum = " + ArraysUtils.sum(new int[]{23, 65, 44, 66, 90, 9987}));
        System.out.println("Results = " + ArraysUtils.contains(nums,5));

        int [] nums2 = {4, 1, 8, 7};
        System.out.println("8 - found = " + ArraysUtils.contains(nums2, 8));
        System.out.println("10 - found = " + ArraysUtils.contains(nums2, 10));

    }
}
