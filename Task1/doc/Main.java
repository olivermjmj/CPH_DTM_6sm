import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        Customer FirstCustomer = new Customer("Carl","ZeroSlayer");
        Customer secondCustomer = new Customer("Jeppe","NoFlick");
        Customer TherdCustomer = new Customer("Frank","RedEye");

        customers.add(FirstCustomer);
        customers.add(secondCustomer);
        customers.add(TherdCustomer);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {

        for(Customer e: customers) {

            System.out.println(e);
        }
    }
}
