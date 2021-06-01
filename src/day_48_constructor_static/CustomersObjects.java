package day_48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomersObjects {
    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); // print with default values that are set in no-args constructor
        cs1.setName("Khan");
        cs1.setId(1);
        System.out.println(cs1);

        Customer cs2 = new Customer("Ahmad", 2); // creat objects and assign values in same statement
        Customer cs3 = new Customer("Erfan Khan Sabawoon", 852);
        System.out.println(cs2);
        System.out.println(cs3);

        // array of customers
        Customer[] todayCustomer = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        // arrayList of customer object

        List<Customer> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("Ahmad", 877));
        customersList.add(new Customer("Khan", 876));
        customersList.add(new Customer("Nasim Abbas",  780));

        // Print info of first customer object in array and arrayList
        System.out.println(todayCustomer[0].toString());
        System.out.println(customersList.get(0));

        System.out.println(customersList); // print toString() info of all customer object

        for (int i = 0; i < customersList.size(); i++) {
            System.out.println("customersList = " + customersList.get(i));
        }

        for (Customer customer: customersList) {
            System.out.println("customer = " + customer);
        }

        // print all name of customers in the list

        System.out.println("-----Names of the customer-------");
        customersList.forEach(each -> System.out.println(each.getName()));
        for(int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i).getName());

            for (Customer eachCustomer : customersList) {
                System.out.println(eachCustomer.getName());
            }
        }




    }
}
