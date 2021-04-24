package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if(grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Passed with the grade - " + grade);
        } else if(grade == 'D') {
            System.out.println("Qualify for retake" + grade);
        } else if(grade == 'E') {
            System.out.println("fail .grade - " + grade );
        } else {
            System.out.println("Invalid Grade" + grade);
        }
        if(grade == 'A'|| grade == 'a'|| grade == 'B'|| grade == 'b'|| grade == 'C' || grade == 'c') {
            System.out.println("Passed with the grade - " + grade);
        } else if(grade == 'D' || grade == 'd') {
            System.out.println("Qualify for retake" + grade);
        } else if(grade == 'E' || grade == 'e') {
            System.out.println("fail .grade - " + grade );
        } else {
            System.out.println("Invalid Grade" + grade);
        }































    }
}
