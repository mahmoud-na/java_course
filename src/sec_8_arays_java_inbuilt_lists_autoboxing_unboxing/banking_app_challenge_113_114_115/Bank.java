package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.banking_app_challenge_113_114_115;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            // System.out.println("Branch is already defined.");
            return false;
        }
        Branch branch = new Branch(branchName);
        this.branches.add(branch);
        // System.out.println("Branch with name: " + branchName + " is successfully added.");
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, transaction);
        }
        // System.out.println("Cannot find branch with that name: " + branchName + "error to adding new customer.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customer, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            // System.out.println("Error in transaction, cannot find this branch " + branchName + " in files.");
            return false;
        } else {
            return branch.addCustomerTransaction(customer, transaction);
        }
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customerList = branch.getCustomers();
            for (int i = 0; i < customerList.size(); i++) {
                Customer branchCustomer = customerList.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
}

