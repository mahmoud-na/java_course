package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.banking_app_challenge_113_114_115;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction) {
        if (findCustomer(customerName) != -1) {
            System.out.println("This customer is already added.");
            return false;
        }
        Customer customer = new Customer(customerName, transaction);
        this.customers.add(customer);
        System.out.println("Customer with name: " + customerName + " added successfully");
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        int position = findCustomer(customerName);
        if (position == -1) {
            System.out.println("Customer cannot be found in files.");
            return false;
        }
        Customer customer = this.customers.get(position);
        customer.setTransactions(transaction);
        System.out.println("The transaction is successfully added with amount: " + transaction);
        return true;
    }

    private int findCustomer(String name) {
        for (int i = 0; i <= this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Customer queryCustomer(String customerName) {
        int customerPosition = findCustomer(customerName);
        if (customerPosition >= 0) {
            return this.customers.get(customerPosition);
        }
        return null;
    }
}
