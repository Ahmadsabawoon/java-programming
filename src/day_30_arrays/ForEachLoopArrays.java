package day_30_arrays;

public class ForEachLoopArrays {
    public static void main(String[] args) {
        int[] data = {32, 532, 12, 5454, 33, 123, 543, 999, 321, 3};
        for(int each :data){
            System.out.println("Each Num: " + each);
        }

        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println("---------------For Loop-----------------------");
        // repeat above for loop
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        // print last in erray using length -1
        System.out.println("last value: " + data[data.length-1]);

        // loop erray reverse

        for (int i = data.length-1; i >=0; i-- ) {
            System.out.print(" " + data[i]);
        }
















    }
}
