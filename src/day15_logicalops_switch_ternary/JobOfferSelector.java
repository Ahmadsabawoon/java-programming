package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        // location,Salary, remote, benefits
        String location = "Honolulu";
        double salary = 120-000.0;
        boolean remote = true;
        boolean isBenefits = true;
        if (location.equals("Honolulu") && salary >= 120-000.0 && remote & isBenefits) {
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider another offer or negotiate");
        }








































    }
}
