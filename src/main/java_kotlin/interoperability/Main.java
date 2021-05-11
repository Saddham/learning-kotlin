package interoperability;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer phil = new Customer(5, "Phil");

        System.out.println(phil);

        CustomerDatabase db = new CustomerDatabase();

        CustomerDatabase.describe();

        try {
            db.addCustomer(phil);
        } catch (IllegalAccessException exception) {
            System.out.println("Caught exception");
        }

        List<Customer> customers = db.getCustomers();
        customers.add(phil);
    }
}
