package SelfStudyPractice;

public class PracticeRecursiveMethod {
    public static void main(String[] args) {
        // IQ : how to print 100 without loop
        printNums(66);
    }
    public static void printNums(int num){
        System.out.println(num + " ");
        num++;

        if(num <= 100){
            printNums(num);


        }
    }

}
