package day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Ahmad";
        emp1.jobTitle = "Automation Engineer";
        emp1.work();


        Employee emp2 = new Employee();
        emp2.name = "Mahmood";
        emp2.jobTitle = "Engineer";
        emp2.work();



        Employee emp3 = new Employee();
        emp3.name = "Ahmad Jan";
        emp3.jobTitle = "Computer Engineer";
        emp3.work();

    }
}
