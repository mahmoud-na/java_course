package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.banking_app_challenge_113_114_115;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchesList = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) >= 0) {
            System.out.println("Branch is already defined.");
            return false;
        }
        Branch branch = new Branch(branchName);
        this.branchesList.add(branch);
        System.out.println("Branch with name: " + branchName + " is successfully added.");
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        int branchPosition = findBranch(branchName);
        if (branchPosition >= 0) {
            if (this.branchesList.get(branchPosition).newCustomer(customerName, transaction)) {
                return true;
            }
            return false;
        }
        System.out.println("Cannot find branch with that name: " + branchName + "error to adding new customer.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customer, double transaction) {
        int branchPosition = findBranch(branchName);
        if (branchPosition < 0) {
            System.out.println("Error in transaction, cannot find this branch " + branchName + " in files.");
            return false;
        } else {
            Branch branch = this.branchesList.get(findBranch(branchName));
            if (branch.queryCustomer(customer) == null) {
                System.out.println("Cannot find customer with name: " + customer + " in this branch: " + branchName);
                return false;
            }
            branch.queryCustomer(customer).setTransactions(transaction);
            System.out.println("transaction with amount: " + transaction + "is added to the customer with name: " + customer + "successfully.");
            return true;
        }

    }

    public void printCustomerList(Branch branch, boolean listOfTransaction) {
        ArrayList<Customer> customerList = branch.getCustomers();
        System.out.println("Customer List of " + branch.getName() + " branch:");
        for (int i = 0; i <= customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i).getName());
            if (listOfTransaction) {
                for (int j = 0; j <= customerList.get(i).getTransactions().size(); j++) {
                    System.out.println("\t" + (j + 1) + "-> " + customerList.get(i).getTransactions().get(j));
                }
            }
        }
    }

    private int findBranch(String branchName) {
        for (int i = 0; i <= this.branchesList.size(); i++) {
            if (this.branchesList.get(i).getName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

//
//    public Branch queryBranch(String branchName) {
//        int position = findBranch(branchName);
//        if (position >= 0) {
//            return this.branchesList.get(position);
//        }
//        System.out.println("Error, cannot find this branch " + branchName + " in files.");
//        return null;
//    }

}
