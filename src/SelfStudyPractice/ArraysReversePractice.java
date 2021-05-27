package SelfStudyPractice;

public class ArraysReversePractice {
    public static void main(String[] args) {

        int[] arrays = new int[]{1, 2, 3, 4, 5,};
        System.out.println("The original Arrays is : ");
        for(int i = 0; i < arrays.length; i++){
            System.out.print(arrays[i]);
        }
        System.out.println();
        System.out.print("The reverse Arrays is :");
        for (int i = arrays.length-1; i >=0; i--){
            System.out.print(arrays[i]);
        }

    }
}
