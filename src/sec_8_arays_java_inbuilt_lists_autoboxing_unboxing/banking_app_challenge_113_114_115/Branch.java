package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.banking_app_challenge_113_114_115;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            // System.out.println("This customer is already added.");
            return false;
        }
        Customer customer = new Customer(customerName, initialTransaction);
        this.customers.add(customer);
        // System.out.println("Customer with name: " + customerName + " added successfully");
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            // System.out.println("Customer cannot be found in files.");
            return false;
        }
        customer.addTransaction(transaction);
        // System.out.println("The transaction is successfully added with amount: " + transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}

